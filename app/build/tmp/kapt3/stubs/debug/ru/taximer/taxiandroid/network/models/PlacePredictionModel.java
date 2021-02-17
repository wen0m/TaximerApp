package ru.taximer.taxiandroid.network.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 42\u00020\u0001:\u00014B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B/\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u00a2\u0006\u0002\u0010\rB\u000f\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\b\u0010.\u001a\u00020\u0017H\u0016J\u0010\u0010/\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0002J\u0018\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0017H\u0016R\u0011\u0010\u0011\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\'R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-\u00a8\u00065"}, d2 = {"Lru/taximer/taxiandroid/network/models/PlacePredictionModel;", "Landroid/os/Parcelable;", "parcelIn", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "autocompletePrediction", "Lcom/google/android/gms/location/places/AutocompletePrediction;", "(Lcom/google/android/gms/location/places/AutocompletePrediction;)V", "placeId", "", "primaryText", "secondaryText", "fullText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "place", "Lru/taximer/taxiandroid/network/models/HistoryModel;", "(Lru/taximer/taxiandroid/network/models/HistoryModel;)V", "address", "getAddress", "()Ljava/lang/String;", "fullAddress", "getFullAddress", "historyId", "", "getHistoryId", "()Ljava/lang/Integer;", "setHistoryId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "locality", "getLocality", "location", "Lcom/google/android/gms/maps/model/LatLng;", "getLocation", "()Lcom/google/android/gms/maps/model/LatLng;", "setLocation", "(Lcom/google/android/gms/maps/model/LatLng;)V", "getPlaceId", "setPlaceId", "(Ljava/lang/String;)V", "placeTypes", "", "getPlaceTypes", "()Ljava/util/List;", "setPlaceTypes", "(Ljava/util/List;)V", "describeContents", "trimToCity", "writeToParcel", "", "dest", "flags", "Companion", "app_debug"})
public final class PlacePredictionModel implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String placeId;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String address = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String locality = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fullAddress = null;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.LatLng location;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.Integer> placeTypes;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer historyId;
    @org.jetbrains.annotations.NotNull()
    public static final android.os.Parcelable.Creator<ru.taximer.taxiandroid.network.models.PlacePredictionModel> CREATOR = null;
    public static final ru.taximer.taxiandroid.network.models.PlacePredictionModel.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlaceId() {
        return null;
    }
    
    public final void setPlaceId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocality() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFullAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.LatLng getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getPlaceTypes() {
        return null;
    }
    
    public final void setPlaceTypes(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getHistoryId() {
        return null;
    }
    
    public final void setHistoryId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel dest, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    private final java.lang.String trimToCity(java.lang.String locality) {
        return null;
    }
    
    private PlacePredictionModel(android.os.Parcel parcelIn) {
        super();
    }
    
    public PlacePredictionModel(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.places.AutocompletePrediction autocompletePrediction) {
        super();
    }
    
    public PlacePredictionModel(@org.jetbrains.annotations.NotNull()
    java.lang.String placeId, @org.jetbrains.annotations.NotNull()
    java.lang.String primaryText, @org.jetbrains.annotations.NotNull()
    java.lang.String secondaryText, @org.jetbrains.annotations.NotNull()
    java.lang.String fullText) {
        super();
    }
    
    public PlacePredictionModel(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.HistoryModel place) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u00a8\u0006\u0007"}, d2 = {"Lru/taximer/taxiandroid/network/models/PlacePredictionModel$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lru/taximer/taxiandroid/network/models/PlacePredictionModel;", "CREATOR$annotations", "app_debug"})
    public static final class Companion {
        
        @kotlin.Suppress(names = {"unused"})
        public static void CREATOR$annotations() {
        }
        
        private Companion() {
            super();
        }
    }
}