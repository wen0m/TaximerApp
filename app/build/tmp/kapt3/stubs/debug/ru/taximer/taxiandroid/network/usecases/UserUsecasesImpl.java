package ru.taximer.taxiandroid.network.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000fH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010#\u001a\u00020\u000fH\u0016J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00062\u0006\u0010&\u001a\u00020%H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lru/taximer/taxiandroid/network/usecases/UserUsecasesImpl;", "Lru/taximer/taxiandroid/network/usecases/UserUsecases;", "endpoints", "Lru/taximer/taxiandroid/network/TaxiApi;", "(Lru/taximer/taxiandroid/network/TaxiApi;)V", "askGeoposition", "Lio/reactivex/Flowable;", "Lru/taximer/taxiandroid/network/models/GeoResultModel;", "cancelOrder", "", "orderId", "", "confirmPhone", "", "code", "", "number", "", "getGeoCodeResult", "Lru/taximer/taxiandroid/network/models/HistoryModel;", "lat", "", "lng", "reason", "timeSinceMapDrag", "timeSinceMapMove", "openApp", "device_hash", "orderByPhone", "Lru/taximer/taxiandroid/network/models/Order;", "taxopark_id", "request_hash", "refreshStatus", "sendConfirmationCode", "sendPush", "token", "setNotifications", "", "value", "app_debug"})
public final class UserUsecasesImpl implements ru.taximer.taxiandroid.network.usecases.UserUsecases {
    private final ru.taximer.taxiandroid.network.TaxiApi endpoints = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.GeoResultModel> askGeoposition() {
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
    public io.reactivex.Flowable<java.lang.Boolean> setNotifications(boolean value) {
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
    public io.reactivex.Flowable<kotlin.Unit> sendPush(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
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
    public io.reactivex.Flowable<kotlin.Unit> sendConfirmationCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
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
    public io.reactivex.Flowable<java.lang.Object> cancelOrder(int orderId) {
        return null;
    }
    
    public UserUsecasesImpl(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.TaxiApi endpoints) {
        super();
    }
}