package ru.taximer.taxiandroid.network.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 72\u00020\u0001:\u00017B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B/\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\b\u00a2\u0006\u0002\u0010\rB/\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000fB5\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0016J\t\u0010&\u001a\u00020\u0011H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0011H\u00c6\u0003J\t\u0010(\u001a\u00020\bH\u00c6\u0003J\t\u0010)\u001a\u00020\bH\u00c6\u0003J\t\u0010*\u001a\u00020\u000bH\u00c6\u0003J\t\u0010+\u001a\u00020\bH\u00c6\u0003JE\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\bH\u00c6\u0001J\b\u0010-\u001a\u00020\u000bH\u0016J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u00d6\u0003J\t\u00102\u001a\u00020\u000bH\u00d6\u0001J\t\u00103\u001a\u00020\bH\u00d6\u0001J\u0018\u00104\u001a\u0002052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u000bH\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\u0014\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010$\u00a8\u00068"}, d2 = {"Lru/taximer/taxiandroid/network/models/PlaceLocationModel;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "place", "Lcom/google/android/gms/location/places/Place;", "address", "", "type", "id", "", "result", "(Lcom/google/android/gms/location/places/Place;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/android/gms/maps/model/LatLng;", "(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "latitude", "", "longitude", "address_type", "historyId", "google_result", "(DDLjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getAddress_type", "google_json", "Lorg/json/JSONObject;", "getGoogle_json", "()Lorg/json/JSONObject;", "setGoogle_json", "(Lorg/json/JSONObject;)V", "getGoogle_result", "getHistoryId", "()I", "getLatitude", "()D", "getLongitude", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "Companion", "app_debug"})
public final class PlaceLocationModel implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private org.json.JSONObject google_json;
    private final double latitude = 0.0;
    private final double longitude = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String address = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String address_type = null;
    private final int historyId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String google_result = null;
    @org.jetbrains.annotations.NotNull()
    public static final android.os.Parcelable.Creator<ru.taximer.taxiandroid.network.models.PlaceLocationModel> CREATOR = null;
    public static final ru.taximer.taxiandroid.network.models.PlaceLocationModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.json.JSONObject getGoogle_json() {
        return null;
    }
    
    public final void setGoogle_json(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject p0) {
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    public final double getLatitude() {
        return 0.0;
    }
    
    public final double getLongitude() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress_type() {
        return null;
    }
    
    public final int getHistoryId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGoogle_result() {
        return null;
    }
    
    public PlaceLocationModel(double latitude, double longitude, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String address_type, int historyId, @org.jetbrains.annotations.NotNull()
    java.lang.String google_result) {
        super();
    }
    
    public PlaceLocationModel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    public PlaceLocationModel(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.places.Place place, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String result) {
        super();
    }
    
    public PlaceLocationModel(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng place, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String result) {
        super();
    }
    
    public final double component1() {
        return 0.0;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.network.models.PlaceLocationModel copy(double latitude, double longitude, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String address_type, int historyId, @org.jetbrains.annotations.NotNull()
    java.lang.String google_result) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u00a8\u0006\u0007"}, d2 = {"Lru/taximer/taxiandroid/network/models/PlaceLocationModel$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lru/taximer/taxiandroid/network/models/PlaceLocationModel;", "CREATOR$annotations", "app_debug"})
    public static final class Companion {
        
        @kotlin.Suppress(names = {"unused"})
        public static void CREATOR$annotations() {
        }
        
        private Companion() {
            super();
        }
    }
}