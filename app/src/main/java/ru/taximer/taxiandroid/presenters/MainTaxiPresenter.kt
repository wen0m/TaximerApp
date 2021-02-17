package ru.taximer.taxiandroid.presenters

import android.location.Address
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.arellomobile.mvp.MvpView
import com.google.android.gms.maps.model.LatLng
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import ru.taximer.taxiandroid.Prefs
import ru.taximer.taxiandroid.TaximerApp
import ru.taximer.taxiandroid.network.models.PlaceLocationModel
import ru.taximer.taxiandroid.network.usecases.UserUsecases
import ru.taximer.taxiandroid.ui.FallbackReverseGeocoderObservable
import ru.taximer.taxiandroid.utils.isNotNullOrEmpty


///////////////////////////////////////////////////////////////////////////
// Main Taxi View
///////////////////////////////////////////////////////////////////////////

interface MainTaxiView : MvpView {
    fun setStart(location: PlaceLocationModel?)
    fun setEnd(location: PlaceLocationModel?)
    fun setEditState(isStartEdit: Boolean, isBothLocationContaints: Boolean, position: LatLng?)
    fun startSearch(start: PlaceLocationModel, end: PlaceLocationModel)
    fun setBeginState(pos: PlaceLocationModel?)
    fun setManualSelectionState(isStart: Boolean, position: LatLng?)
    fun setReadyState()
    fun setManual()
}


///////////////////////////////////////////////////////////////////////////
// MainTaxi Presenter
///////////////////////////////////////////////////////////////////////////

@InjectViewState
class MainTaxiPresenter : MvpPresenter<MainTaxiView>() {
    private var startLocation: PlaceLocationModel? = null
    private var endLocation: PlaceLocationModel? = null

    var isStartEdit: Boolean = false
    var isEndEdit: Boolean = false

    private var addressDisposable: Disposable? = null
    val usecases: UserUsecases = TaximerApp.appComponent.baseUsecases()

    override fun attachView(view: MainTaxiView?) {
        super.attachView(view)
        viewState.setStart(startLocation)
        viewState.setEnd(endLocation)
//        setEditState()
    }

    override fun onDestroy() {
        super.onDestroy()
        addressDisposable?.dispose()
        addressDisposable = null
    }



    fun getSearchLocation(): LatLng {
        return if (isStartEdit) {
            LatLng(endLocation?.latitude ?: Prefs.readGeo().latitude, endLocation?.longitude ?: Prefs.readGeo().longitude)
        }
        else {
            LatLng(startLocation?.latitude ?: 0.0, startLocation?.longitude ?: 0.0)
        }
    }

    fun editStartFirst(coordinates: LatLng) {
        if(startLocation == null) {
            editStart()
            getGeoCodeResult(coordinates.latitude, coordinates.longitude, "StartApp", 0, 0)
            viewState.setBeginState(startLocation)
        }
    }

    fun editStart() {
        isEndEdit = false
        isStartEdit = true
        if (startLocation != null) {
            viewState.setManualSelectionState(true, LatLng(startLocation!!.latitude, startLocation!!.longitude))
        } else {
            viewState.setManualSelectionState(true, null)
        }
    }


    fun editEnd() {
        isStartEdit = false
        isEndEdit = true
        if (endLocation != null) {
            viewState.setManualSelectionState(false, LatLng(endLocation!!.latitude, endLocation!!.longitude))
        } else {
            viewState.setManualSelectionState(false, null)
        }
    }

    fun setLocation(location: PlaceLocationModel) {
        if (isStartEdit) {
            startLocation = location
            viewState.setStart(startLocation)
//            isStartEdit = false
//            isEndEdit = true
        }
        if (isEndEdit) {
            endLocation = location
            viewState.setEnd(endLocation)
        }
        if (isBothLocationSelected()) {
            setEditState()
        }
    }

    fun setReady() {
        viewState.setReadyState()
    }

    fun setManual() {
        viewState.setManual()
    }

    private fun setEditState() {
        viewState.setEditState(isStartEdit, startLocation != null && endLocation != null, null)
    }

    fun isBothLocationSelected() = startLocation != null && endLocation != null


    ///////////////////////////////////////////////////////////////////////////
    // search address stuff
    ///////////////////////////////////////////////////////////////////////////

    fun onSearch() {
        viewState?.startSearch(startLocation!!, endLocation!!)
    }

    fun getGeoCodeResult(lat: Double, lng: Double, reason: String, timeSinceMapDrag: Long, timeSinceMapMove: Long ) {
        usecases.getGeoCodeResult(lat, lng, reason, timeSinceMapDrag, timeSinceMapMove)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        {
                            val place = PlaceLocationModel(lat, lng, it.pin!!, "", 0, "")
                            setLocation(place)
                        },
                        {
                            it.printStackTrace()
                        }, {})
    }

     fun detectFallbackReverseGeocode(coordinates: LatLng) {
        addressDisposable?.dispose()

        addressDisposable = Observable.create(FallbackReverseGeocoderObservable(coordinates.latitude, coordinates.longitude))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        {
                            val place = getPlaceLocationModel(it.addresess, coordinates)
                            place.google_json = it.google_json
                            setLocation(place)
                        },
                        {
                            it.printStackTrace()
                            val place = PlaceLocationModel(coordinates.latitude, coordinates.longitude, "Адрес не обнаружен", "", 0, "")
                            setLocation(place)
                        })
    }

    fun getPlaceLocationModel(addresses: List<Address>, coordinates: LatLng): PlaceLocationModel {
        val fullAddress = StringBuffer()
//        var city: String = ""
        var fullResult: String = ""
        if (addresses.isNotNullOrEmpty()) {

            if (addresses[0].thoroughfare.isNotNullOrEmpty()) {
//                city = addresses[0].subAdminArea
                val result = addresses[0].thoroughfare
                fullAddress.append(result)

                if(addresses[0].featureName.isNotNullOrEmpty()) {
                    fullAddress.append(", ").append(addresses[0].featureName)
                }

            } else {
//                var i = 1
//                fullAddress.append(addresses[0].getAddressLine(0))
//                while (!addresses[0].getAddressLine(i)!!.contentEquals(city)) {
//                    fullAddress.append(", ").append(addresses[0].getAddressLine(i))
//                    i++
//                }
                fullAddress.append(addresses[0].getAddressLine(0)).append(", ").append(addresses[0].getAddressLine(1))
            }
        }

        return PlaceLocationModel(coordinates.latitude, coordinates.longitude, fullAddress.toString(), "google", 0, fullResult)
    }


    //region Refactoring

    fun setSearchingState() {
        if (isStartEdit) {

        }
        if (isEndEdit) {

        }
    }



    //endregionh


}