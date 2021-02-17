package ru.taximer.taxiandroid.network.usecases

import android.util.Log
import com.google.android.gms.maps.model.LatLng
import io.reactivex.Flowable
import org.json.JSONObject
import ru.taximer.taxiandroid.Prefs
import ru.taximer.taxiandroid.network.Config
import ru.taximer.taxiandroid.network.TaxiApi
import ru.taximer.taxiandroid.network.models.*


///////////////////////////////////////////////////////////////////////////
// User Usecases
///////////////////////////////////////////////////////////////////////////

interface UserUsecases {
    fun openApp(device_hash: String): Flowable<Unit>
    fun sendPush(token: String): Flowable<Unit>
    fun setNotifications(value: Boolean): Flowable<Boolean>
    fun askGeoposition(): Flowable<GeoResultModel>
    fun getGeoCodeResult(lat: Double, lng: Double, reason: String, timeSinceMapDrag: Long, timeSinceMapMove: Long): Flowable<HistoryModel>
    fun confirmPhone(code: String, number: Long): Flowable<Unit>
    fun sendConfirmationCode(code: String): Flowable<Unit>
    fun orderByPhone(taxopark_id: String, request_hash: String): Flowable<Order>
    fun refreshStatus(orderId: Int): Flowable<Order>
    fun cancelOrder(orderId: Int): Flowable<Any>
}


///////////////////////////////////////////////////////////////////////////
// User Usecases Impl
///////////////////////////////////////////////////////////////////////////

class UserUsecasesImpl(private val endpoints: TaxiApi) : UserUsecases {

    override fun askGeoposition(): Flowable<GeoResultModel> =
            endpoints.askGeoposition()
                    .map {
                        if (it.success) {
                        it.result!!
                    }
                    else {
                        throw ResponseException(it.errors[0])
                    }
                    }.applyDefaultNetSchedulers()


    override fun getGeoCodeResult(lat: Double, lng: Double, reason: String, timeSinceMapDrag: Long, timeSinceMapMove: Long): Flowable<HistoryModel> =
            endpoints.getGeoCode(lat, lng, reason, timeSinceMapDrag, timeSinceMapMove)
                    .map {
                        if (it.success) {
                            it.result!!.result
                        }
                        else {
                            throw ResponseException(it.errors[0])
                        }
                    }.applyDefaultNetSchedulers()

    override fun setNotifications(value: Boolean): Flowable<Boolean> =
            endpoints.changeNotifications(value)
                    .map {
                        value
                    }.applyDefaultNetSchedulers()

    override fun openApp(device_hash: String): Flowable<Unit> =
            endpoints.authUser(device_hash, Config.device_type)
                    .map {
                        if(it.success) {
                            Prefs.storeToken(it.result?.user?.api_token ?: "")
                            Prefs.storeAuth(it.result?.user?.auth_status ?:0, it.result?.user?.phone_number ?: 0)
                            Unit
                        }else{
                            throw ResponseException(it.errors[0])
                        }
                    }.applyDefaultNetSchedulers()

    override fun sendPush(token: String): Flowable<Unit> =
            endpoints.sendPush(token)
                    .map {
                        Unit
                    }
                    .applyDefaultNetSchedulers()
                    .retry()

    override fun confirmPhone(code: String, number: Long): Flowable<Unit> =
        endpoints.authUserPhone(code, number)
                .map {
                    if (it.success) {
                        Unit
                    }
                    else {
                        throw ResponseException(it.errors[0])
                    }
                }
                .applyDefaultNetSchedulers()

    override fun sendConfirmationCode(code: String): Flowable<Unit> =
        endpoints.confirmUserPhone(code).map {
            if (it.success) {
                Unit
            }
        }.applyDefaultNetSchedulers()

    override fun orderByPhone(taxopark_id: String, request_hash: String): Flowable<Order> =
        endpoints.orderTaxiByPhone(taxopark_id, request_hash)
                .map {
                    if (it.success) {
                        it.result!!
                    }
                    else {
                        throw ResponseException(it.errors[0])
                    }
        }.applyDefaultNetSchedulers()

    override fun refreshStatus(orderId: Int): Flowable<Order> =
            endpoints.refreshOrderStatus(orderId).map {
                if (it.success) {
                    it.result!!
                }
                else {
                    throw ResponseException(it.errors[0])
                }
            }.applyDefaultNetSchedulers()

    override fun cancelOrder(orderId: Int): Flowable<Any> =
            endpoints.cancelOrder(orderId).applyDefaultNetSchedulers()

}