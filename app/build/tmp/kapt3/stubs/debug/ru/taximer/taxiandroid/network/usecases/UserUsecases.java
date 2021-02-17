package ru.taximer.taxiandroid.network.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH&J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0017\u001a\u00020\u000bH&J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bH&J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u001f\u001a\u00020\u000bH&J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\u0006\u0010\"\u001a\u00020!H&\u00a8\u0006#"}, d2 = {"Lru/taximer/taxiandroid/network/usecases/UserUsecases;", "", "askGeoposition", "Lio/reactivex/Flowable;", "Lru/taximer/taxiandroid/network/models/GeoResultModel;", "cancelOrder", "orderId", "", "confirmPhone", "", "code", "", "number", "", "getGeoCodeResult", "Lru/taximer/taxiandroid/network/models/HistoryModel;", "lat", "", "lng", "reason", "timeSinceMapDrag", "timeSinceMapMove", "openApp", "device_hash", "orderByPhone", "Lru/taximer/taxiandroid/network/models/Order;", "taxopark_id", "request_hash", "refreshStatus", "sendConfirmationCode", "sendPush", "token", "setNotifications", "", "value", "app_debug"})
public abstract interface UserUsecases {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<kotlin.Unit> openApp(@org.jetbrains.annotations.NotNull()
    java.lang.String device_hash);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<kotlin.Unit> sendPush(@org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.lang.Boolean> setNotifications(boolean value);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.GeoResultModel> askGeoposition();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.HistoryModel> getGeoCodeResult(double lat, double lng, @org.jetbrains.annotations.NotNull()
    java.lang.String reason, long timeSinceMapDrag, long timeSinceMapMove);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<kotlin.Unit> confirmPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String code, long number);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<kotlin.Unit> sendConfirmationCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.Order> orderByPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String taxopark_id, @org.jetbrains.annotations.NotNull()
    java.lang.String request_hash);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.Order> refreshStatus(int orderId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.lang.Object> cancelOrder(int orderId);
}