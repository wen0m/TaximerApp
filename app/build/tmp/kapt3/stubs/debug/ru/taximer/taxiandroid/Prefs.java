package ru.taximer.taxiandroid;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0013\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012\u00a2\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0004J\u0013\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00170\u0017\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\n \u0013*\u0004\u0018\u00010\u00170\u0017\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u001a\u001a\n \u0013*\u0004\u0018\u00010\u00170\u0017\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u001b\u001a\n \u0013*\u0004\u0018\u00010\u00170\u0017\u00a2\u0006\u0002\u0010\u0018J\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0017J\u000e\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0017J\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0017J\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017J\u0016\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0012J\u000e\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u001dJ\u000e\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lru/taximer/taxiandroid/Prefs;", "", "()V", "CARD_PAY", "", "CAR_CLASS", "CASH_PAY", "GEO_LAT", "GEO_LON", "IS_CHILD", "NOTIFICATION", "TOKEN", "USR_PHONE", "USR_STATUS", "clearSettings", "", "getAuth", "getCarClass", "", "kotlin.jvm.PlatformType", "()Ljava/lang/Integer;", "getToken", "isCard", "", "()Ljava/lang/Boolean;", "isCash", "isChild", "isNotification", "readGeo", "Lcom/google/android/gms/maps/model/LatLng;", "setIsCard", "value", "setIsCash", "setIsChild", "setNotification", "storeAuth", "status", "phone", "", "storeCarClass", "car", "storeGeo", "geo", "storeToken", "token", "app_debug"})
public final class Prefs {
    private static final java.lang.String GEO_LAT = "geo_lat";
    private static final java.lang.String GEO_LON = "geo_lon";
    private static final java.lang.String TOKEN = "token";
    private static final java.lang.String NOTIFICATION = "notification";
    private static final java.lang.String CAR_CLASS = "car_class";
    private static final java.lang.String IS_CHILD = "is_child";
    private static final java.lang.String CARD_PAY = "card_pay";
    private static final java.lang.String CASH_PAY = "cash_pay";
    private static final java.lang.String USR_STATUS = "geo_lat";
    private static final java.lang.String USR_PHONE = "geo_lon";
    public static final ru.taximer.taxiandroid.Prefs INSTANCE = null;
    
    public final void storeGeo(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng geo) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.LatLng readGeo() {
        return null;
    }
    
    public final void storeAuth(int status, long phone) {
    }
    
    public final void getAuth() {
    }
    
    public final boolean storeToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final java.lang.Boolean isNotification() {
        return null;
    }
    
    public final boolean setNotification(boolean isNotification) {
        return false;
    }
    
    public final boolean storeCarClass(int car) {
        return false;
    }
    
    public final java.lang.Integer getCarClass() {
        return null;
    }
    
    public final boolean setIsChild(boolean value) {
        return false;
    }
    
    public final java.lang.Boolean isChild() {
        return null;
    }
    
    public final boolean setIsCard(boolean value) {
        return false;
    }
    
    public final java.lang.Boolean isCard() {
        return null;
    }
    
    public final boolean setIsCash(boolean value) {
        return false;
    }
    
    public final java.lang.Boolean isCash() {
        return null;
    }
    
    public final void clearSettings() {
    }
    
    private Prefs() {
        super();
    }
}