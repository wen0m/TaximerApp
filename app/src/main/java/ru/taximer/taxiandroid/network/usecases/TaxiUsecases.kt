package ru.taximer.taxiandroid.network.usecases

import com.google.android.gms.maps.model.LatLng
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import com.google.gson.JsonStreamParser
import io.reactivex.Flowable
import org.json.JSONObject
import org.json.JSONStringer
import ru.taximer.taxiandroid.network.TaxiApi
import ru.taximer.taxiandroid.network.models.HistoryModel
import ru.taximer.taxiandroid.network.models.PlaceLocationModel
import ru.taximer.taxiandroid.network.models.ResponseException
import ru.taximer.taxiandroid.network.models.SearchTaxiModel
import ru.taximer.taxiandroid.network.models.TaxoparkResultModel


///////////////////////////////////////////////////////////////////////////
// Taxi Usecases
///////////////////////////////////////////////////////////////////////////

interface TaxiUsecases {
    fun getTaxoparcks(
            start: PlaceLocationModel,
            end: PlaceLocationModel,
            carType: Int?,
            isChild: Boolean?,
            isCard: Boolean?,
            isCash: Boolean?,
            apps: ArrayList<String>?): Flowable<TaxoparkResultModel>

    fun getTaxopark(id: Long, hash: String): Flowable<SearchTaxiModel>
    fun getBestTaxopark(hash: String): Flowable<SearchTaxiModel>

    fun getHistory(isStart: Boolean, point: LatLng): Flowable<List<HistoryModel>>
    fun sendInstallEvent(hash: String, pxoparkId: String)
    fun sendOpenEvent(hash: String, pxoparkId: String)
}


///////////////////////////////////////////////////////////////////////////
// Taxi Usecases Impl
///////////////////////////////////////////////////////////////////////////

class TaxiUsecasesImpl(private val endpoints: TaxiApi) : TaxiUsecases {

    override fun getHistory(isStart: Boolean, point: LatLng): Flowable<List<HistoryModel>> =
            endpoints.getHistory(point.latitude.toString(), point.longitude.toString())
                    .map {
                        if (it.success) {
                            if (isStart) it.result!!.to else it.result!!.from
                        }
                        else {
                            throw ResponseException(it.errors[0])
                        }
                    }.applyDefaultNetSchedulers()


    override fun getTaxoparcks(
            start: PlaceLocationModel,
            end: PlaceLocationModel,
            carType: Int?,
            isChild: Boolean?,
            isCard: Boolean?,
            isCash: Boolean?,
            apps: ArrayList<String>?
    ): Flowable<TaxoparkResultModel> =
            endpoints.getTaxoparks(
                    start.latitude,
                    start.longitude,
                    if (!start.google_result.isEmpty()) { //TODO перенести отсюда
                        JSONObject(start.google_result)
                    } else {
                        JSONObject()
                    },
                    start.address_type,
                    end.latitude,
                    end.longitude,
                    if (!end.google_result.isEmpty()) {
                        JSONObject(end.google_result)
                    } else {
                        JSONObject()
                    },
                    end.address_type,
                    start.address,
                    end.address,
                    start.historyId,
                    end.historyId,
                    isChild,
                    isCash,
                    isCard,
                    carType,
                    apps
            ).map {
                if (it.success) {
                    it.result!!
                }
                else {
                    throw ResponseException(it.errors[0])
                }
            }.applyDefaultNetSchedulers()


    override fun getTaxopark(id: Long, hash: String): Flowable<SearchTaxiModel> =
            endpoints.searchCurrentTaxi(id, hash)
                    .map {
                        if (it.success) {
                            it.result!!.request
                        }
                        else {
                            throw ResponseException(it.errors[0])
                        }
                    }.applyDefaultNetSchedulers()


    override fun getBestTaxopark(hash: String): Flowable<SearchTaxiModel> =
            endpoints.searchBesttTaxi(hash)
                    .map {
                        if (it.success) {
                            it.result!!.request
                        }
                        else {
                            throw ResponseException(it.errors[0])
                        }
                    }.applyDefaultNetSchedulers()


    override fun sendInstallEvent(hash: String, pxoparkId: String) {
        endpoints.sendInstallEvent(hash, pxoparkId).applyDefaultNetSchedulers().subscribe({}, { it.printStackTrace() })
    }

    override fun sendOpenEvent(hash: String, pxoparkId: String) {
        endpoints.sendOpenEvent(hash, pxoparkId).applyDefaultNetSchedulers().subscribe({}, { it.printStackTrace() })
    }
}