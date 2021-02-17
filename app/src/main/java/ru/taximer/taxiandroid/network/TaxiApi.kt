package ru.taximer.taxiandroid.network

import io.reactivex.Flowable
import io.reactivex.Single
import okhttp3.ResponseBody
import org.json.JSONObject
import retrofit2.http.*
import ru.taximer.taxiandroid.network.models.*

interface TaxiApi {

    @FormUrlEncoded
    @POST("user/auth")
    fun authUser(
            @Field("device_hash") device_hash: String,
            @Field("device_type") device_type: String
    ): Flowable<BaseResponseModel<UserResponse>>

    @FormUrlEncoded
    @POST("user/register-push")
    fun sendPush(
            @Field("token") token: String
    ): Flowable<BaseResponseModel<Any?>>

    @FormUrlEncoded
    @POST("user/notification")
    fun changeNotifications(
            @Field("active") active: Boolean
    ): Flowable<BaseResponseModel<Any?>>

    @FormUrlEncoded
    @POST("taxopark/get")
    fun getTaxoparks(
            @Field("source_points[lat]") lat: Double,
            @Field("source_points[lng]") lng: Double,
            @Field("source_google_result") source_google_result: JSONObject,
            @Field("address_type_from") address_type_from: String,
            @Field("destination_points[lat]") dest_lng: Double,
            @Field("destination_points[lng]") dest_lat: Double,
            @Field("destination_google_result") destination_google_result: JSONObject,
            @Field("address_type_to") address_type_to: String,
            @Field("address_from") address_from: String,
            @Field("address_to") address_to: String,
            @Field("user_address_from_id") user_address_from_id: Int,
            @Field("user_address_to_id") user_address_to_id: Int,
            @Field("has_child") has_child: Boolean? = null,
            @Field("pay_cash") pay_cash: Boolean? = null,
            @Field("pay_card") pay_card: Boolean? = null,
            @Field("class_id") class_id: Int? = null,
            @Field("taxopar_installed_apps") taxopar_installed_apps: ArrayList<String>?
    ): Flowable<BaseResponseModel<TaxoparkResultModel>>

    @GET("taxopark/available")
    fun getAvailable(@Query("latitude") latitude: Long,
                     @Query("longitude") longitude: Long
    ): Single<List<AvailableTaxiResult>>


    @GET("user/addresses")
    fun getHistory(
            @Query("lat") lat: String,
            @Query("lng") lng: String
    ): Flowable<BaseResponseModel<HistoryResponseModel>>

    @GET("geo/reverse")
    fun getGeoCode(
            @Query("lat") lat: Double,
            @Query("lng") lng: Double,
            @Query("reason") reason: String,
            @Query("timeSinceMapDrag") timeSinceMapDrag: Long,
            @Query("timeSinceMapMove") timeSinceMapMove: Long
    ): Flowable<BaseResponseModel<HistoryResponseModel>>

    @GET("postback/new-install/{request_hash}")
    fun sendInstallEvent(
            @Path("request_hash") request_hash: String,
            @Query("taxopark_id") taxopark_id: String
    ): Flowable<Any?>

    @GET("postback/new-ride/{request_hash}")
    fun sendOpenEvent(
            @Path("request_hash") request_hash: String,
            @Query("taxopark_id") taxopark_id: String
    ): Flowable<Any?>

    @GET("search/request")
    fun searchCurrentTaxi(
            @Query("taxopark_id") taxopark_id: Long,
            @Query("request_hash") request_hash: String
    ): Flowable<BaseResponseModel<ResultSearchTaxi>>

    @GET("search/best/{request_hash}")
    fun searchBesttTaxi(
            @Path("request_hash") request_hash: String
    ): Flowable<BaseResponseModel<ResultSearchTaxi>>

    @FormUrlEncoded
    @POST("app/open")
    fun openApp(@Header("Authorization") authorization: String, @Field("device_hash") device_hash: String, @Field("device_type") device_type: String): Single<*>

    @FormUrlEncoded
    @POST("app/install")
    fun installApp(@Field("device_hash") device_hash: String, @Field("device_type") device_type: String): ResponseBody


    @FormUrlEncoded
    @POST("user/support")
    fun askSupport(
            @Field("text") text: String,
            @Field("email") email: String
    ): Flowable<BaseResponseModel<Any?>>

    @GET("user/geoposition")
    fun askGeoposition(): Flowable<BaseResponseModel<GeoResultModel>>


    @FormUrlEncoded
    @POST("user/auth-phone")
    fun authUserPhone(
            @Field("phone_code") phoneCode: String,
            @Field("phone_number") phoneNum: Long
    ): Flowable<BaseResponseModel<UserResponse>>


    @FormUrlEncoded
    @POST("user/auth-phone-confirm")
    fun confirmUserPhone(
            @Field("code") code: String
    ): Flowable<BaseResponseModel<UserResponse>>


    @FormUrlEncoded
    @POST("taxi-order/create/")
    fun orderTaxiByPhone(
            @Field("taxopark_id") taxopark_id: String,
            @Field("request_hash") request_hash: String
    ): Flowable<BaseResponseModel<OrderResponse>>

    @GET("taxi-order/status")
    fun refreshOrderStatus(
            @Query("order_id") order_id: Int
    ): Flowable<BaseResponseModel<OrderResponse>>

    @FormUrlEncoded
    @POST("taxi-order/cancel")
    fun cancelOrder(
            @Field("order_id") order_id: Int
    ): Flowable<Any>

}
