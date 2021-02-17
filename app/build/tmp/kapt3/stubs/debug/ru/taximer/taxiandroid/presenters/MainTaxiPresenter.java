package ru.taximer.taxiandroid.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0015J\u0006\u0010\u001b\u001a\u00020\u0015J\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019J.\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$J\u001c\u0010&\u001a\u00020\u00072\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010*\u001a\u00020\u0019J\u0006\u0010+\u001a\u00020\tJ\b\u0010,\u001a\u00020\u0015H\u0016J\u0006\u0010-\u001a\u00020\u0015J\b\u0010.\u001a\u00020\u0015H\u0002J\u000e\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u0007J\u0006\u00101\u001a\u00020\u0015J\u0006\u00102\u001a\u00020\u0015J\u0006\u00103\u001a\u00020\u0015R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u00064"}, d2 = {"Lru/taximer/taxiandroid/presenters/MainTaxiPresenter;", "Lcom/arellomobile/mvp/MvpPresenter;", "Lru/taximer/taxiandroid/presenters/MainTaxiView;", "()V", "addressDisposable", "Lio/reactivex/disposables/Disposable;", "endLocation", "Lru/taximer/taxiandroid/network/models/PlaceLocationModel;", "isEndEdit", "", "()Z", "setEndEdit", "(Z)V", "isStartEdit", "setStartEdit", "startLocation", "usecases", "Lru/taximer/taxiandroid/network/usecases/UserUsecases;", "getUsecases", "()Lru/taximer/taxiandroid/network/usecases/UserUsecases;", "attachView", "", "view", "detectFallbackReverseGeocode", "coordinates", "Lcom/google/android/gms/maps/model/LatLng;", "editEnd", "editStart", "editStartFirst", "getGeoCodeResult", "lat", "", "lng", "reason", "", "timeSinceMapDrag", "", "timeSinceMapMove", "getPlaceLocationModel", "addresses", "", "Landroid/location/Address;", "getSearchLocation", "isBothLocationSelected", "onDestroy", "onSearch", "setEditState", "setLocation", "location", "setManual", "setReady", "setSearchingState", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class MainTaxiPresenter extends com.arellomobile.mvp.MvpPresenter<ru.taximer.taxiandroid.presenters.MainTaxiView> {
    private ru.taximer.taxiandroid.network.models.PlaceLocationModel startLocation;
    private ru.taximer.taxiandroid.network.models.PlaceLocationModel endLocation;
    private boolean isStartEdit;
    private boolean isEndEdit;
    private io.reactivex.disposables.Disposable addressDisposable;
    @org.jetbrains.annotations.NotNull()
    private final ru.taximer.taxiandroid.network.usecases.UserUsecases usecases = null;
    
    public final boolean isStartEdit() {
        return false;
    }
    
    public final void setStartEdit(boolean p0) {
    }
    
    public final boolean isEndEdit() {
        return false;
    }
    
    public final void setEndEdit(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.network.usecases.UserUsecases getUsecases() {
        return null;
    }
    
    @java.lang.Override()
    public void attachView(@org.jetbrains.annotations.Nullable()
    ru.taximer.taxiandroid.presenters.MainTaxiView view) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.LatLng getSearchLocation() {
        return null;
    }
    
    public final void editStartFirst(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng coordinates) {
    }
    
    public final void editStart() {
    }
    
    public final void editEnd() {
    }
    
    public final void setLocation(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel location) {
    }
    
    public final void setReady() {
    }
    
    public final void setManual() {
    }
    
    private final void setEditState() {
    }
    
    public final boolean isBothLocationSelected() {
        return false;
    }
    
    public final void onSearch() {
    }
    
    public final void getGeoCodeResult(double lat, double lng, @org.jetbrains.annotations.NotNull()
    java.lang.String reason, long timeSinceMapDrag, long timeSinceMapMove) {
    }
    
    public final void detectFallbackReverseGeocode(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng coordinates) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.network.models.PlaceLocationModel getPlaceLocationModel(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends android.location.Address> addresses, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng coordinates) {
        return null;
    }
    
    public final void setSearchingState() {
    }
    
    public MainTaxiPresenter() {
        super();
    }
}