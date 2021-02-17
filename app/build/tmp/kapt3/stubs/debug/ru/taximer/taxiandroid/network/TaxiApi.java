package ru.taximer.taxiandroid.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J*\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\'J(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\bH\'J(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\'J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\'J \u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\'J\u001e\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\u0019\u001a\u00020\bH\'J(\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2\b\b\u0001\u0010\u001e\u001a\u00020\u00112\b\b\u0001\u0010\u001f\u001a\u00020\u0011H\'JF\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00040\u00032\b\b\u0001\u0010\"\u001a\u00020#2\b\b\u0001\u0010$\u001a\u00020#2\b\b\u0001\u0010%\u001a\u00020\b2\b\b\u0001\u0010&\u001a\u00020\u00112\b\b\u0001\u0010\'\u001a\u00020\u0011H\'J(\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00040\u00032\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010$\u001a\u00020\bH\'J\u00df\u0001\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00040\u00032\b\b\u0001\u0010\"\u001a\u00020#2\b\b\u0001\u0010$\u001a\u00020#2\b\b\u0001\u0010+\u001a\u00020,2\b\b\u0001\u0010-\u001a\u00020\b2\b\b\u0001\u0010.\u001a\u00020#2\b\b\u0001\u0010/\u001a\u00020#2\b\b\u0001\u00100\u001a\u00020,2\b\b\u0001\u00101\u001a\u00020\b2\b\b\u0001\u00102\u001a\u00020\b2\b\b\u0001\u00103\u001a\u00020\b2\b\b\u0001\u00104\u001a\u00020\u00142\b\b\u0001\u00105\u001a\u00020\u00142\n\b\u0003\u00106\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u00107\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u00108\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u00109\u001a\u0004\u0018\u00010\u00142\u001c\b\u0001\u0010:\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010;j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`<H\'\u00a2\u0006\u0002\u0010=J\u001c\u0010>\u001a\u00020?2\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\bH\'J*\u0010@\u001a\u0006\u0012\u0002\b\u00030\u001b2\b\b\u0001\u0010A\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\bH\'J(\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\u00040\u00032\b\b\u0001\u0010D\u001a\u00020\b2\b\b\u0001\u0010E\u001a\u00020\bH\'J\u001e\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\u00040\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\'J\u001e\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u00040\u00032\b\b\u0001\u0010E\u001a\u00020\bH\'J(\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u00040\u00032\b\b\u0001\u0010D\u001a\u00020\u00112\b\b\u0001\u0010E\u001a\u00020\bH\'J$\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\b\b\u0001\u0010E\u001a\u00020\b2\b\b\u0001\u0010D\u001a\u00020\bH\'J$\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\b\b\u0001\u0010E\u001a\u00020\b2\b\b\u0001\u0010D\u001a\u00020\bH\'J \u0010L\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u00032\b\b\u0001\u0010M\u001a\u00020\bH\'\u00a8\u0006N"}, d2 = {"Lru/taximer/taxiandroid/network/TaxiApi;", "", "askGeoposition", "Lio/reactivex/Flowable;", "Lru/taximer/taxiandroid/network/models/BaseResponseModel;", "Lru/taximer/taxiandroid/network/models/GeoResultModel;", "askSupport", "text", "", "email", "authUser", "Lru/taximer/taxiandroid/network/models/UserResponse;", "device_hash", "device_type", "authUserPhone", "phoneCode", "phoneNum", "", "cancelOrder", "order_id", "", "changeNotifications", "active", "", "confirmUserPhone", "code", "getAvailable", "Lio/reactivex/Single;", "", "Lru/taximer/taxiandroid/network/models/AvailableTaxiResult;", "latitude", "longitude", "getGeoCode", "Lru/taximer/taxiandroid/network/models/HistoryResponseModel;", "lat", "", "lng", "reason", "timeSinceMapDrag", "timeSinceMapMove", "getHistory", "getTaxoparks", "Lru/taximer/taxiandroid/network/models/TaxoparkResultModel;", "source_google_result", "Lorg/json/JSONObject;", "address_type_from", "dest_lng", "dest_lat", "destination_google_result", "address_type_to", "address_from", "address_to", "user_address_from_id", "user_address_to_id", "has_child", "pay_cash", "pay_card", "class_id", "taxopar_installed_apps", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(DDLorg/json/JSONObject;Ljava/lang/String;DDLorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/ArrayList;)Lio/reactivex/Flowable;", "installApp", "Lokhttp3/ResponseBody;", "openApp", "authorization", "orderTaxiByPhone", "Lru/taximer/taxiandroid/network/models/OrderResponse;", "taxopark_id", "request_hash", "refreshOrderStatus", "searchBesttTaxi", "Lru/taximer/taxiandroid/network/models/ResultSearchTaxi;", "searchCurrentTaxi", "sendInstallEvent", "sendOpenEvent", "sendPush", "token", "app_debug"})
public abstract interface TaxiApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/auth")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.BaseResponseModel<ru.taximer.taxiandroid.network.models.UserResponse>> authUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "device_hash")
    java.lang.String device_hash, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "device_type")
    java.lang.String device_type);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/register-push")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.BaseResponseModel<java.lang.Object>> sendPush(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/notification")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.BaseResponseModel<java.lang.Object>> changeNotifications(@retrofit2.http.Field(value = "active")
    boolean active);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "taxopark/get")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.BaseResponseModel<ru.taximer.taxiandroid.network.models.TaxoparkResultModel>> getTaxoparks(@retrofit2.http.Field(value = "source_points[lat]")
    double lat, @retrofit2.http.Field(value = "source_points[lng]")
    double lng, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "source_google_result")
    org.json.JSONObject source_google_result, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "address_type_from")
    java.lang.String address_type_from, @retrofit2.http.Field(value = "destination_points[lat]")
    double dest_lng, @retrofit2.http.Field(value = "destination_points[lng]")
    double dest_lat, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "destination_google_result")
    org.json.JSONObject destination_google_result, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "address_type_to")
    java.lang.String address_type_to, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "address_from")
    java.lang.String address_from, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "address_to")
    java.lang.String address_to, @retrofit2.http.Field(value = "user_address_from_id")
    int user_address_from_id, @retrofit2.http.Field(value = "user_address_to_id")
    int user_address_to_id, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "has_child")
    java.lang.Boolean has_child, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "pay_cash")
    java.lang.Boolean pay_cash, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "pay_card")
    java.lang.Boolean pay_card, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "class_id")
    java.lang.Integer class_id, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "taxopar_installed_apps")
    java.util.ArrayList<java.lang.String> taxopar_installed_apps);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "taxopark/available")
    public abstract io.reactivex.Single<java.util.List<ru.taximer.taxiandroid.network.models.AvailableTaxiResult>> getAvailable(@retrofit2.http.Query(value = "latitude")
    long latitude, @retrofit2.http.Query(value = "longitude")
    long longitude);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "user/addresses")
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.BaseResponseModel<ru.taximer.taxiandroid.network.models.HistoryResponseModel>> getHistory(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lat")
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lng")
    java.lang.String lng);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "geo/reverse")
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.BaseResponseModel<ru.taximer.taxiandroid.network.models.HistoryResponseModel>> getGeoCode(@retrofit2.http.Query(value = "lat")
    double lat, @retrofit2.http.Query(value = "lng")
    double lng, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "reason")
    java.lang.String reason, @retrofit2.http.Query(value = "timeSinceMapDrag")
    long timeSinceMapDrag, @retrofit2.http.Query(value = "timeSinceMapMove")
    long timeSinceMapMove);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "postback/new-install/{request_hash}")
    public abstract io.reactivex.Flowable<java.lang.Object> sendInstallEvent(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "request_hash")
    java.lang.String request_hash, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "taxopark_id")
    java.lang.String taxopark_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "postback/new-ride/{request_hash}")
    public abstract io.reactivex.Flowable<java.lang.Object> sendOpenEvent(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "request_hash")
    java.lang.String request_hash, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "taxopark_id")
    java.lang.String taxopark_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/request")
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.BaseResponseModel<ru.taximer.taxiandroid.network.models.ResultSearchTaxi>> searchCurrentTaxi(@retrofit2.http.Query(value = "taxopark_id")
    long taxopark_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "request_hash")
    java.lang.String request_hash);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/best/{request_hash}")
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.BaseResponseModel<ru.taximer.taxiandroid.network.models.ResultSearchTaxi>> searchBesttTaxi(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "request_hash")
    java.lang.String request_hash);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "app/open")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Single<?> openApp(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "device_hash")
    java.lang.String device_hash, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "device_type")
    java.lang.String device_type);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "app/install")
    @retrofit2.http.FormUrlEncoded()
    public abstract okhttp3.ResponseBody installApp(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "device_hash")
    java.lang.String device_hash, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "device_type")
    java.lang.String device_type);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/support")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.BaseResponseModel<java.lang.Object>> askSupport(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "text")
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "email")
    java.lang.String email);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "user/geoposition")
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.BaseResponseModel<ru.taximer.taxiandroid.network.models.GeoResultModel>> askGeoposition();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/auth-phone")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.BaseResponseModel<ru.taximer.taxiandroid.network.models.UserResponse>> authUserPhone(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "phone_code")
    java.lang.String phoneCode, @retrofit2.http.Field(value = "phone_number")
    long phoneNum);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/auth-phone-confirm")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.BaseResponseModel<ru.taximer.taxiandroid.network.models.UserResponse>> confirmUserPhone(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "code")
    java.lang.String code);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "taxi-order/create/")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.BaseResponseModel<ru.taximer.taxiandroid.network.models.OrderResponse>> orderTaxiByPhone(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "taxopark_id")
    java.lang.String taxopark_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "request_hash")
    java.lang.String request_hash);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "taxi-order/status")
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.BaseResponseModel<ru.taximer.taxiandroid.network.models.OrderResponse>> refreshOrderStatus(@retrofit2.http.Query(value = "order_id")
    int order_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "taxi-order/cancel")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Flowable<java.lang.Object> cancelOrder(@retrofit2.http.Field(value = "order_id")
    int order_id);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}