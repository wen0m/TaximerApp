package ru.taximer.taxiandroid.network.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096\u0001J\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0001J\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096\u0001J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\t2\u0006\u0010\u0017\u001a\u00020\u0012H\u0096\u0001J7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0014H\u0096\u0001J%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190!0\t2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0096\u0001Jh\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\t2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\b\u0010,\u001a\u0004\u0018\u00010#2\b\u0010-\u001a\u0004\u0018\u00010#2\b\u0010.\u001a\u0004\u0018\u00010#2\u001a\u0010/\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u000100j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`1H\u0096\u0001\u00a2\u0006\u0002\u00102J\u001f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00160\t2\u0006\u00104\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0012H\u0096\u0001J\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u00106\u001a\u00020\u0012H\u0096\u0001J\u001f\u00107\u001a\b\u0012\u0004\u0012\u0002080\t2\u0006\u00109\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\u0012H\u0096\u0001J\u0017\u0010;\u001a\b\u0012\u0004\u0012\u0002080\t2\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0001J\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096\u0001J\u0019\u0010=\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u0012H\u0096\u0001J\u0019\u0010?\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u0012H\u0096\u0001J\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010A\u001a\u00020\u0012H\u0096\u0001J\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020#0\t2\u0006\u0010C\u001a\u00020#H\u0096\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006D"}, d2 = {"Lru/taximer/taxiandroid/network/usecases/BaseUsecases;", "Lru/taximer/taxiandroid/network/usecases/UserUsecases;", "Lru/taximer/taxiandroid/network/usecases/TaxiUsecases;", "endpoints", "Lru/taximer/taxiandroid/network/TaxiApi;", "(Lru/taximer/taxiandroid/network/TaxiApi;)V", "getEndpoints$app_debug", "()Lru/taximer/taxiandroid/network/TaxiApi;", "askGeoposition", "Lio/reactivex/Flowable;", "Lru/taximer/taxiandroid/network/models/GeoResultModel;", "cancelOrder", "", "orderId", "", "confirmPhone", "", "code", "", "number", "", "getBestTaxopark", "Lru/taximer/taxiandroid/network/models/SearchTaxiModel;", "hash", "getGeoCodeResult", "Lru/taximer/taxiandroid/network/models/HistoryModel;", "lat", "", "lng", "reason", "timeSinceMapDrag", "timeSinceMapMove", "getHistory", "", "isStart", "", "point", "Lcom/google/android/gms/maps/model/LatLng;", "getTaxoparcks", "Lru/taximer/taxiandroid/network/models/TaxoparkResultModel;", "start", "Lru/taximer/taxiandroid/network/models/PlaceLocationModel;", "end", "carType", "isChild", "isCard", "isCash", "apps", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Lru/taximer/taxiandroid/network/models/PlaceLocationModel;Lru/taximer/taxiandroid/network/models/PlaceLocationModel;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/ArrayList;)Lio/reactivex/Flowable;", "getTaxopark", "id", "openApp", "device_hash", "orderByPhone", "Lru/taximer/taxiandroid/network/models/Order;", "taxopark_id", "request_hash", "refreshStatus", "sendConfirmationCode", "sendInstallEvent", "pxoparkId", "sendOpenEvent", "sendPush", "token", "setNotifications", "value", "app_debug"})
public final class BaseUsecases implements ru.taximer.taxiandroid.network.usecases.UserUsecases, ru.taximer.taxiandroid.network.usecases.TaxiUsecases {
    @org.jetbrains.annotations.NotNull()
    private final ru.taximer.taxiandroid.network.TaxiApi endpoints = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.network.TaxiApi getEndpoints$app_debug() {
        return null;
    }
    
    public BaseUsecases(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.TaxiApi endpoints) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.GeoResultModel> askGeoposition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.lang.Object> cancelOrder(int orderId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> confirmPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String code, long number) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.HistoryModel> getGeoCodeResult(double lat, double lng, @org.jetbrains.annotations.NotNull()
    java.lang.String reason, long timeSinceMapDrag, long timeSinceMapMove) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> openApp(@org.jetbrains.annotations.NotNull()
    java.lang.String device_hash) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.Order> orderByPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String taxopark_id, @org.jetbrains.annotations.NotNull()
    java.lang.String request_hash) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.Order> refreshStatus(int orderId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> sendConfirmationCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> sendPush(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.lang.Boolean> setNotifications(boolean value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.SearchTaxiModel> getBestTaxopark(@org.jetbrains.annotations.NotNull()
    java.lang.String hash) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<ru.taximer.taxiandroid.network.models.HistoryModel>> getHistory(boolean isStart, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng point) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.TaxoparkResultModel> getTaxoparcks(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel start, @org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel end, @org.jetbrains.annotations.Nullable()
    java.lang.Integer carType, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isChild, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isCard, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isCash, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> apps) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.SearchTaxiModel> getTaxopark(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String hash) {
        return null;
    }
    
    @java.lang.Override()
    public void sendInstallEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String hash, @org.jetbrains.annotations.NotNull()
    java.lang.String pxoparkId) {
    }
    
    @java.lang.Override()
    public void sendOpenEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String hash, @org.jetbrains.annotations.NotNull()
    java.lang.String pxoparkId) {
    }
}