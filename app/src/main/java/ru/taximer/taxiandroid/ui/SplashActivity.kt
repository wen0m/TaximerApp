package ru.taximer.taxiandroid.ui

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.provider.Settings
import android.support.design.widget.Snackbar
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.google.android.gms.location.*
import com.google.android.gms.maps.model.LatLng
import com.treebo.internetavailabilitychecker.InternetAvailabilityChecker
import com.treebo.internetavailabilitychecker.InternetConnectivityListener
import kotlinx.android.synthetic.main.activity_splash.gifImage
import kotlinx.android.synthetic.main.activity_splash.root_container
import pl.droidsonroids.gif.GifDrawable
import ru.taximer.taxiandroid.Prefs
import ru.taximer.taxiandroid.R
import ru.taximer.taxiandroid.presenters.SplashPresenter
import ru.taximer.taxiandroid.presenters.SplashView
import ru.taximer.taxiandroid.utils.PERMISSIONS_LOCATION
import ru.taximer.taxiandroid.utils.arePermissionsGranted
import ru.taximer.taxiandroid.utils.shouldShowRationale
import android.util.Log
import com.google.android.gms.common.api.ResolvableApiException
import io.branch.referral.Branch
import ru.taximer.taxiandroid.network.Config


private const val LOCATION_SETTINGS_REQUEST = 0x1

class SplashActivity : MvpAppCompatActivity(), SplashView, InternetConnectivityListener {


    @InjectPresenter(type = PresenterType.LOCAL)
    lateinit var presenter: SplashPresenter

    @ProvidePresenter(type = PresenterType.LOCAL)
    fun provideSplashPresenter(): SplashPresenter = SplashPresenter()

    var duration: Long = 0L
    private var locationProvider: FusedLocationProviderClient? = null
    private var mInternetAvailabilityChecker: InternetAvailabilityChecker? = null
    private lateinit var userLocationCallback: LocationCallback

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        mInternetAvailabilityChecker = InternetAvailabilityChecker.getInstance()

        val drawable = GifDrawable.createFromResource(resources, R.drawable.app_icon_final)
        duration = drawable?.duration?.toLong() ?: 0L
        gifImage.setImageDrawable(drawable)
        drawable?.start()


        // Branch init
        val branch = Branch.getInstance()
        branch.initSession({ referringParams, error ->
            if (error == null) {
                // params are the deep linked params associated with the link that the user clicked -> was re-directed to this app
                // params will be empty if no data found
                // ... insert custom logic here ...
                Log.i("BRANCH SDK", referringParams.toString())
            } else {
                Log.i("BRANCH SDK", error.message)
            }
        }, this.intent.data, this)

        checkLocationEnabled()

    }

    override fun onNewIntent(intent: Intent) {
        this.intent = intent
        super.onNewIntent(intent)
    }

    override fun onResume() {
        super.onResume()
        mInternetAvailabilityChecker?.addInternetConnectivityListener(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        mInternetAvailabilityChecker?.removeInternetConnectivityChangeListener(this)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            LOCATION_SETTINGS_REQUEST -> {
                when (resultCode) {
                    Activity.RESULT_OK -> {
//                        Prefs.clearSettings()
                        getCurrentLocation()
                    }
                    Activity.RESULT_CANCELED -> {
//                        showLocationRationale()
//                        checkLocationEnabled()
                        presenter.askGeoposition()
                        presenter.openApp(Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID))
                    }
                }
            }
        }
    }



    @SuppressLint("HardwareIds")
    private fun getCurrentLocation() {
        checkMyLocationPermission {
            locationProvider = LocationServices.getFusedLocationProviderClient(this)
            locationProvider?.lastLocation?.addOnSuccessListener {
                Prefs.storeGeo(LatLng(it?.latitude ?: Prefs.readGeo().latitude, it?.longitude ?: Prefs.readGeo().longitude))
                presenter.openApp(Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID))
            }
            locationProvider?.lastLocation?.addOnFailureListener {
                //тут делать запрос на авторизацию или на открытие, где в ответ придут координаты центра города, откуда был сделан запрос
                Prefs.storeGeo(LatLng(Prefs.readGeo().latitude, Prefs.readGeo().longitude))
                presenter.openApp(Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID))
            }
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // Location permission flow
    ///////////////////////////////////////////////////////////////////////////

    private fun checkLocationEnabled() {
        val locationRequest = LocationRequest.create()
        locationRequest.priority = LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY
        locationRequest.interval = Config.LOCATION_INTERVAL
        locationRequest.fastestInterval = Config.LOCATION_FASTEST_INTERVAL
        locationRequest.smallestDisplacement = Config.DISPLACEMENT

        val builder = LocationSettingsRequest.Builder().addLocationRequest(locationRequest)
        builder.setAlwaysShow(true)

        val task = LocationServices.getSettingsClient(this).checkLocationSettings(builder.build())
        task.addOnSuccessListener {
            getCurrentLocation()
        }

        task.addOnFailureListener {
            val resolvableApiException = it as ResolvableApiException
            resolvableApiException.startResolutionForResult(this@SplashActivity, LOCATION_SETTINGS_REQUEST)
        }
    }

    private fun checkMyLocationPermission(func: () -> Unit) {
        if (arePermissionsGranted(*PERMISSIONS_LOCATION)) func()
        else showLocationRationale()
    }

    private fun showLocationRationale() {
        if (shouldShowRationale(*PERMISSIONS_LOCATION)) {
            val snackbar = Snackbar.make(root_container, getText(R.string.rationale_location_permission), Snackbar.LENGTH_INDEFINITE)
                    snackbar.setAction(R.string.label_ok) {
                        requestLocationPermission()
                    }
            snackbar.show()
//            val dialog = FullScreenDialog()
//            val ft = supportFragmentManager.beginTransaction()
//            dialog.show(ft, "FullScreenDialog")
        }
        else requestLocationPermission()
    }

    private fun requestLocationPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(PERMISSIONS_LOCATION, PERMISSION_REQUEST_CODE_LOCATION)
        }
    }


    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        when (requestCode) {
            PERMISSION_REQUEST_CODE_LOCATION -> {
                if (arePermissionsGranted(*PERMISSIONS_LOCATION)) {
                    getCurrentLocation()
                }
                else {
                    val snackbar = Snackbar.make(root_container, getText(R.string.rationale_location_permission), Snackbar.LENGTH_INDEFINITE)
                    snackbar.setAction(R.string.label_ok) {
                                requestLocationPermission()
                            }
                    snackbar.show()
                }
            }
            else -> super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        }
    }

    override fun hideLoading() {
        //nope
    }

    override fun showLoading() {
        //nope
    }

    override fun goToMainScreen() {
        val handler = Handler()
        handler.postDelayed({
            MainTaxiScreen.launch(this)
            finish()
        }, 3000)
    }

    override fun onInternetConnectivityChanged(isConnected: Boolean) {
        val snackbar = Snackbar.make(root_container, getText(R.string.rationale_o_internet_off), Snackbar.LENGTH_INDEFINITE)

        if (isConnected) {
//            val snackbar = Snackbar.make(root_container, getText(R.string.rationale_o_internet_on), Snackbar.LENGTH_SHORT)
            snackbar.dismiss()
//            checkLocationEnabled()
        } else {
            snackbar.show()
        }
    }

    override fun showError(message: String) {
        val snackbar = Snackbar.make(root_container, getText(R.string.rationale_error), Snackbar.LENGTH_INDEFINITE)
        snackbar.setAction("OK") {}
        snackbar.show()
    }

    companion object {
        private const val PERMISSION_REQUEST_CODE_LOCATION = 7
    }
}
