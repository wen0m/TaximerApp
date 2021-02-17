package ru.taximer.taxiandroid.ui.fragments

import android.annotation.SuppressLint
import android.graphics.Point
import android.location.Location
import android.os.Bundle
import android.os.Handler
import android.os.SystemClock
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.google.android.gms.location.*
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.*
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.maps.android.ui.IconGenerator
import kotlinx.android.synthetic.main.app_bar_main_taxi_screen.*
import kotlinx.android.synthetic.main.fragment_map.*
import ru.taximer.taxiandroid.Prefs
import ru.taximer.taxiandroid.R
import ru.taximer.taxiandroid.TaximerApp
import ru.taximer.taxiandroid.network.Config
import ru.taximer.taxiandroid.network.models.PlaceLocationModel
import ru.taximer.taxiandroid.network.usecases.UserUsecases
import ru.taximer.taxiandroid.presenters.MainTaxiPresenter
import ru.taximer.taxiandroid.presenters.MainTaxiView
import ru.taximer.taxiandroid.ui.MainTaxiScreen
import ru.taximer.taxiandroid.utils.PERMISSIONS_LOCATION
import ru.taximer.taxiandroid.utils.arePermissionsGranted
import ru.taximer.taxiandroid.utils.shouldShowRationale
import java.io.IOException
import java.lang.Exception
import java.util.*


private const val LOCATION_SETTINGS_REQUEST = 0x1


class MapFragment :
        MvpAppCompatFragment(),
        OnMapReadyCallback,
        LocationListener,
        MainTaxiView,
        GoogleMap.OnMarkerClickListener,
        GoogleMap.OnCameraIdleListener,
        GoogleMap.OnCameraMoveListener,
        GoogleMap.OnCameraMoveCanceledListener {


    @InjectPresenter(type = PresenterType.GLOBAL)
    lateinit var presenter: MainTaxiPresenter

    @ProvidePresenter(type = PresenterType.GLOBAL)
    fun provideMainTaxiPresenter(): MainTaxiPresenter = MainTaxiPresenter()

    val usecases: UserUsecases = TaximerApp.appComponent.baseUsecases()

    private var map: GoogleMap? = null
    var startMarker: Marker? = null
    var endMarker: Marker? = null
    var currentPoisition: LatLng? = null
    var cameraPoisition: LatLng? = null
    var projection: Projection? = null
    lateinit var icnGenerator: IconGenerator
    var width: Int = 0
    var height: Int = 0
    var mapFragment: MapView? = null
    var firstPos: PlaceLocationModel? = null
    var endPos: PlaceLocationModel? = null
    var ready: Boolean = false


    private var locationProvider: FusedLocationProviderClient? = null
    private lateinit var userLocationCallback: LocationCallback
    private var mFirebaseAnalytics: FirebaseAnalytics? = null

    companion object {
        private const val PERMISSION_REQUEST_CODE_LOCATION = 7
        private const val DEFAULT_ZOOM = 16f
    }

    val cameraHandler = Handler()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.fragment_map, container, false)
        mapFragment = view.findViewById(R.id.map)
        mapFragment?.onCreate(savedInstanceState)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this.context!!)

        mapFragment?.getMapAsync(this)

        icnGenerator = IconGenerator(activity)

        locationView.setOnClickListener {
            currentPoisition?.let {
                map?.animateCamera(CameraUpdateFactory.newLatLngZoom(currentPoisition, 17F))
                mFirebaseAnalytics?.logEvent("fa_click_map_from_geo", null )
            }
        }

        confirmWhere.setOnClickListener {
            presenter.setReady()
        }
    }

    override fun onPause() {
        locationProvider.let {
            it?.removeLocationUpdates(userLocationCallback)
        }
        if (mapFragment != null) {
            mapFragment?.onPause()
        }
        super.onPause()
    }

    override fun onResume() {
        if (mapFragment != null) {
            mapFragment?.onResume()
        }
        super.onResume()
    }

    override fun onDestroy() {
        if (mapFragment != null) {
            try {
                mapFragment?.onDestroy()
            } catch (e: NullPointerException) {
                //отловить
            }
        }
        super.onDestroy()
    }

    override fun onLowMemory() {
        if (mapFragment != null) {
            mapFragment?.onLowMemory()
        }
        super.onLowMemory()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        if (mapFragment != null) {
            mapFragment?.onSaveInstanceState(outState)
        }
        super.onSaveInstanceState(outState)
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mapFragment?.onResume()
        map = googleMap
        map ?: return
//        map?.setMapStyle(MapStyleOptions.loadRawResourceStyle(this.activity, R.raw.taximer_map_style))
        projection = googleMap.projection
        width = mapFragment!!.measuredWidth
        height = mapFragment!!.measuredHeight

        val settings = map!!.uiSettings
        with(settings) {
            setAllGesturesEnabled(true)
            isCompassEnabled = false
            isIndoorLevelPickerEnabled = true
            isMapToolbarEnabled = false
            isZoomControlsEnabled = false
        }

        checkMyLocationPermissionSilent {
            allowMyLocation()
        }
        getCurrentLocation()

        map?.moveCamera(CameraUpdateFactory.zoomTo(11f))
        map?.setOnMarkerClickListener(this)
        map?.setOnCameraMoveListener(this)
        map?.setOnCameraIdleListener(this)

        presenter.editStart()
    }

    //region Map stuff

    override fun onMarkerClick(marker: Marker?): Boolean {
        marker ?: return false
        return when (marker) {
            startMarker -> {
                map?.setOnCameraIdleListener(null)
                (activity as MainTaxiScreen).openStartSearch()
                mFirebaseAnalytics?.logEvent("fa_click_button_from", null )
                true
            }
            endMarker -> {
                map?.setOnCameraIdleListener(null)
                (activity as MainTaxiScreen).openEndSearch()
                mFirebaseAnalytics?.logEvent("fa_click_where_go", null )
                true
            }
            else -> {
                false
            }
        }
    }

    override fun onCameraIdle() {
        cameraHandler.removeCallbacksAndMessages(null)
        addressText.text = getString(R.string.finding_address)
        confirmWhere.visibility = View.GONE

        var currentTime = SystemClock.currentThreadTimeMillis()
        var endTime:Long = 0

        var reason: String = ""
        if (presenter.isEndEdit) {
            reason = "endMarker"
            mFirebaseAnalytics?.logEvent("fa_adjust_where_location_on_map", null)
        }
        if (presenter.isStartEdit) {
            reason = "startMArker"
            mFirebaseAnalytics?.logEvent("fa_adjust_from_location_on_map", null)
        }

        val task = Runnable {
            cameraPoisition = map?.projection?.fromScreenLocation(Point(mapFragment!!.measuredWidth / 2, (mapFragment!!.measuredHeight + imageView2.getHeight()) / 2))
            if (currentPoisition != null && currentPoisition != cameraPoisition) {
                presenter.getGeoCodeResult(cameraPoisition!!.latitude, cameraPoisition!!.longitude, reason,endTime - currentTime, currentTime )
            }
            map?.setOnCameraIdleListener(null)
        }
        cameraHandler.postDelayed({
            endTime = SystemClock.currentThreadTimeMillis()
            task.run()
        }, 800)
    }

    override fun onCameraMove () {
        map?.clear()
        map?.setOnCameraIdleListener(this)
        cameraHandler.removeCallbacksAndMessages(null)
    }

    override fun onCameraMoveCanceled() {
//        val task = Runnable {
//            cameraPoisition = map?.projection?.fromScreenLocation(Point(mapFragment!!.measuredWidth / 2, (mapFragment!!.measuredHeight + imageView2.getHeight()) / 2))
//            if (currentPoisition != null && currentPoisition != cameraPoisition) {
//                presenter.getGeoCodeResult(cameraPoisition!!.latitude, cameraPoisition!!.longitude, "",0, 0 )
//            }
//        }
//        cameraHandler.postDelayed({
////            endTime = SystemClock.currentThreadTimeMillis()
//            task.run()
//        }, 800)
    }

    //endregion


    //region states flow

    override fun startSearch(start: PlaceLocationModel, end: PlaceLocationModel) {
        //nope
    }

    override fun setBeginState(pos: PlaceLocationModel?) {
        map?.animateCamera(CameraUpdateFactory.newLatLngZoom(currentPoisition, 17F))
    }

    override fun setManual() {
        map?.setOnCameraMoveListener(this)
        map?.setOnCameraIdleListener(this)
    }

    override fun setManualSelectionState(isStart: Boolean, position: LatLng?) {
        imageView2.visibility = View.VISIBLE

//        map?.setOnCameraMoveListener(this)
//        map?.setOnCameraIdleListener(this)

        if (isStart) {
            imageView2.setImageResource(R.drawable.ic_pin_pickup)
            startMarker?.remove()
            whereGoingLbl.visibility = View.GONE
            confirmWhere.visibility = View.GONE
            changeAddress.visibility = View.VISIBLE
            addressText.visibility = View.VISIBLE


        } else {
            imageView2.setImageResource(R.drawable.ic_pin_dest)
            endMarker?.remove()
            whereGoingLbl.visibility = View.VISIBLE
            changeAddress.visibility = View.GONE
            addressText.visibility = View.VISIBLE
            mFirebaseAnalytics?.logEvent("fa_click_where_geo", null )
        }

        if (position != null) {
            map?.animateCamera(CameraUpdateFactory.newLatLngZoom(position, 17F))
        }

    }

    override fun setStart(location: PlaceLocationModel?) {
        location ?: return
        map?.setOnCameraIdleListener(null)
        addressText.text = location.address
        firstPos = location
    }

    override fun setEnd(location: PlaceLocationModel?) {
        location ?: return
        map?.setOnCameraIdleListener(null)
        addressText.text = location.address
        endPos = location
    }

    override fun setEditState(isStartEdit: Boolean, isBothLocationContaints: Boolean, position: LatLng?) {
        val handler = Handler()
        handler.removeCallbacksAndMessages(null)
        handler.postDelayed({
            confirmWhere.visibility = View.VISIBLE
        }, 1000)

        if (isStartEdit) {
            addressText.text = firstPos?.address
        } else {
            addressText.text = endPos?.address
        }

        if (position != null) {
            currentPoisition = position
            map?.animateCamera(CameraUpdateFactory.newLatLngZoom(currentPoisition, 17F))
        }
    }

    override fun setReadyState() {
        positionOnMap()
    }

    //endregion



    //region draw markers

    private fun positionOnMap() {
        if (presenter.isBothLocationSelected()) {
            confirmWhere.visibility = View.GONE
        }

        imageView2.visibility = View.GONE
        addressText.visibility = View.GONE
        whereGoingLbl.visibility = View.GONE
        changeAddress.visibility = View.GONE

        map?.setOnCameraMoveListener(null)
        map?.setOnCameraIdleListener(null)

        endMarker?.remove()
        startMarker?.remove()

        try {
            drawStartMarker(LatLng(firstPos!!.latitude, firstPos!!.longitude))

            drawEndMarker(LatLng(0.0,0.0))

        } catch (ex: Exception) {}

        val builder = LatLngBounds.Builder()
        val width = resources.displayMetrics.widthPixels
        val height = resources.displayMetrics.heightPixels

        if (presenter.isBothLocationSelected()) {
            try {
                builder.include(startMarker!!.position)
                builder.include(endMarker!!.position)
                val bounds = builder.build()

                map?.animateCamera(CameraUpdateFactory.newLatLngBounds(bounds, width, height, 300))
            } catch (ex: Exception) {
                map?.clear()
            }
        } else {
            map?.animateCamera(CameraUpdateFactory.newLatLngZoom(LatLng(firstPos!!.latitude, firstPos!!.longitude), 17F))
        }
    }

    @Throws(IOException::class)
    private fun drawStartMarker(gps: LatLng?) {
        gps ?: return
        map?.let {
            icnGenerator.setBackground(ContextCompat.getDrawable(context!!, R.drawable.ic_marker_pickup))
            icnGenerator.setTextAppearance(R.style.iconGenText)
            val iconBitmap = icnGenerator.makeIcon(firstPos!!.address)
            startMarker = it.addMarker(MarkerOptions()
                            .position(gps)
                            .icon(BitmapDescriptorFactory.fromBitmap(iconBitmap)))
        }
    }

    @Throws(IOException::class)
    private fun drawEndMarker(gps: LatLng?) {
        gps ?: return

        endMarker?.remove()

        map?.let {
            icnGenerator.setBackground(ContextCompat.getDrawable(context!!, R.drawable.ic_marker_destination))
            icnGenerator.setTextAppearance(R.style.iconGenText)
            val iconBitmap = icnGenerator.makeIcon(endPos!!.address)
            endMarker = it.addMarker(MarkerOptions()
                            .position(LatLng(endPos!!.latitude, endPos!!.longitude))
                            .icon(BitmapDescriptorFactory.fromBitmap(iconBitmap)))
        }
    }

    //endregion


    //region Location permission flow

    @SuppressLint("MissingPermission")
    private fun allowMyLocation() {
        map?.isMyLocationEnabled = true
        map?.uiSettings?.isMyLocationButtonEnabled = false
    }

    private fun getCurrentLocation() {
        checkMyLocationPermission {
            activity?.let { it ->
                locationProvider = LocationServices.getFusedLocationProviderClient(it)

                locationProvider?.lastLocation?.addOnSuccessListener {
                    if (it != null) {
                        onLocationChanged(it)
                    } else {
                        val tmp = Location("center")
                        tmp.latitude = Prefs.readGeo().latitude
                        tmp.longitude = Prefs.readGeo().longitude
                        onLocationChanged(tmp)
                    }
                }
                locationProvider?.lastLocation?.addOnFailureListener {
                    val tmp = Location("center")
                    tmp.latitude = Prefs.readGeo().latitude
                    tmp.longitude = Prefs.readGeo().longitude
                    onLocationChanged(tmp)
                }

                userLocationCallback = object : LocationCallback() {
                    override fun onLocationResult(locationResult: LocationResult?) {
                        locationResult ?: return
                        val position = locationResult.locations.firstOrNull()
                        position ?: return
                        onLocationChanged(position)
                        super.onLocationResult(locationResult)
                    }
                }
                locationProvider?.requestLocationUpdates(
                        LocationRequest.create()
                                .setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)
                                .setInterval(Config.LOCATION_INTERVAL)
                                .setFastestInterval(Config.LOCATION_FASTEST_INTERVAL)
                                .setSmallestDisplacement(Config.DISPLACEMENT),
                        userLocationCallback,
                        null)
            }
        }
    }


    override fun onLocationChanged(location: Location?) {
        location ?: return
        currentPoisition = LatLng(location.latitude, location.longitude)
        if (location.latitude != 0.0 || location.longitude != 0.0) {
            presenter.editStartFirst(LatLng(location.latitude, location.longitude))
        }
    }

    private fun checkMyLocationPermission(func: () -> Unit) {
        if (arePermissionsGranted(*PERMISSIONS_LOCATION)) func()
        else showLocationRationale()
    }

    private fun checkMyLocationPermissionSilent(func: () -> Unit) {
        if (arePermissionsGranted(*PERMISSIONS_LOCATION)) func()
    }

    private fun showLocationRationale() {
        if (shouldShowRationale(*PERMISSIONS_LOCATION)) {
            val snackbar = Snackbar.make(rootContainer, getText(R.string.rationale_location_permission), Snackbar.LENGTH_LONG)
            snackbar.setAction(R.string.label_ok) {
                requestLocationPermission()
            }
            snackbar.show()
        }
        else requestLocationPermission()
    }

    private fun requestLocationPermission() {
        requestPermissions(PERMISSIONS_LOCATION, PERMISSION_REQUEST_CODE_LOCATION)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        when (requestCode) {
            PERMISSION_REQUEST_CODE_LOCATION -> {
                if (arePermissionsGranted(*PERMISSIONS_LOCATION)) {
                    allowMyLocation()
                    getCurrentLocation()
                }
                else {
                    val snackbar = Snackbar.make(rootContainer, getText(R.string.rationale_location_permission), Snackbar.LENGTH_LONG)
                    snackbar.setAction(R.string.label_ok) {
                        requestLocationPermission()
                    }
                    snackbar.show()
                }
            }
            else -> super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        }
    }

    //endregion

}