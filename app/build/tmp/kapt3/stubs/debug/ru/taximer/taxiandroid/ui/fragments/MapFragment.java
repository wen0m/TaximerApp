package ru.taximer.taxiandroid.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00de\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u001b\u0018\u0000 \u009b\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0002\u009b\u0001B\u0005\u00a2\u0006\u0002\u0010\tJ\b\u0010\\\u001a\u00020]H\u0003J\u0016\u0010^\u001a\u00020]2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020]0`H\u0002J\u0016\u0010a\u001a\u00020]2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020]0`H\u0002J\u0012\u0010b\u001a\u00020]2\b\u0010c\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010d\u001a\u00020]2\b\u0010c\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010e\u001a\u00020]H\u0002J\b\u0010f\u001a\u00020]H\u0016J\b\u0010g\u001a\u00020]H\u0016J\b\u0010h\u001a\u00020]H\u0016J$\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020l2\b\u0010m\u001a\u0004\u0018\u00010n2\b\u0010o\u001a\u0004\u0018\u00010pH\u0016J\b\u0010q\u001a\u00020]H\u0016J\u0012\u0010r\u001a\u00020]2\b\u0010s\u001a\u0004\u0018\u00010tH\u0016J\b\u0010u\u001a\u00020]H\u0016J\u0010\u0010v\u001a\u00020]2\u0006\u0010w\u001a\u000207H\u0016J\u0012\u0010x\u001a\u00020K2\b\u0010y\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010z\u001a\u00020]H\u0016J0\u0010{\u001a\u00020]2\u0006\u0010|\u001a\u00020\'2\u000e\u0010}\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u007f0~2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0016\u00a2\u0006\u0003\u0010\u0082\u0001J\t\u0010\u0083\u0001\u001a\u00020]H\u0016J\u0012\u0010\u0084\u0001\u001a\u00020]2\u0007\u0010\u0085\u0001\u001a\u00020pH\u0016J\u001c\u0010\u0086\u0001\u001a\u00020]2\u0007\u0010\u0087\u0001\u001a\u00020j2\b\u0010o\u001a\u0004\u0018\u00010pH\u0016J\t\u0010\u0088\u0001\u001a\u00020]H\u0002J\t\u0010\u0089\u0001\u001a\u00020?H\u0007J\t\u0010\u008a\u0001\u001a\u00020]H\u0002J\u0014\u0010\u008b\u0001\u001a\u00020]2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u008d\u0001\u001a\u00020]2\u0007\u0010\u008e\u0001\u001a\u00020K2\u0007\u0010\u008f\u0001\u001a\u00020K2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u000fH\u0016J\u0013\u0010\u0091\u0001\u001a\u00020]2\b\u0010s\u001a\u0004\u0018\u00010\u001eH\u0016J\t\u0010\u0092\u0001\u001a\u00020]H\u0016J\u001d\u0010\u0093\u0001\u001a\u00020]2\u0007\u0010\u0094\u0001\u001a\u00020K2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u000fH\u0016J\t\u0010\u0095\u0001\u001a\u00020]H\u0016J\u0013\u0010\u0096\u0001\u001a\u00020]2\b\u0010s\u001a\u0004\u0018\u00010\u001eH\u0016J\t\u0010\u0097\u0001\u001a\u00020]H\u0002J\u001b\u0010\u0098\u0001\u001a\u00020]2\u0007\u0010\u0099\u0001\u001a\u00020\u001e2\u0007\u0010\u009a\u0001\u001a\u00020\u001eH\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u001a\u0010&\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u00108\u001a\u0004\u0018\u000109X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010>\u001a\u00020?8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010D\u001a\u0004\u0018\u00010EX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020KX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001c\u0010P\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u001a\"\u0004\bR\u0010\u001cR\u0011\u0010S\u001a\u00020T\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u000e\u0010W\u001a\u00020XX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010Y\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010)\"\u0004\b[\u0010+\u00a8\u0006\u009c\u0001"}, d2 = {"Lru/taximer/taxiandroid/ui/fragments/MapFragment;", "Lcom/arellomobile/mvp/MvpAppCompatFragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/location/LocationListener;", "Lru/taximer/taxiandroid/presenters/MainTaxiView;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "Lcom/google/android/gms/maps/GoogleMap$OnCameraIdleListener;", "Lcom/google/android/gms/maps/GoogleMap$OnCameraMoveListener;", "Lcom/google/android/gms/maps/GoogleMap$OnCameraMoveCanceledListener;", "()V", "cameraHandler", "Landroid/os/Handler;", "getCameraHandler", "()Landroid/os/Handler;", "cameraPoisition", "Lcom/google/android/gms/maps/model/LatLng;", "getCameraPoisition", "()Lcom/google/android/gms/maps/model/LatLng;", "setCameraPoisition", "(Lcom/google/android/gms/maps/model/LatLng;)V", "currentPoisition", "getCurrentPoisition", "setCurrentPoisition", "endMarker", "Lcom/google/android/gms/maps/model/Marker;", "getEndMarker", "()Lcom/google/android/gms/maps/model/Marker;", "setEndMarker", "(Lcom/google/android/gms/maps/model/Marker;)V", "endPos", "Lru/taximer/taxiandroid/network/models/PlaceLocationModel;", "getEndPos", "()Lru/taximer/taxiandroid/network/models/PlaceLocationModel;", "setEndPos", "(Lru/taximer/taxiandroid/network/models/PlaceLocationModel;)V", "firstPos", "getFirstPos", "setFirstPos", "height", "", "getHeight", "()I", "setHeight", "(I)V", "icnGenerator", "Lcom/google/maps/android/ui/IconGenerator;", "getIcnGenerator", "()Lcom/google/maps/android/ui/IconGenerator;", "setIcnGenerator", "(Lcom/google/maps/android/ui/IconGenerator;)V", "locationProvider", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mFirebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "map", "Lcom/google/android/gms/maps/GoogleMap;", "mapFragment", "Lcom/google/android/gms/maps/MapView;", "getMapFragment", "()Lcom/google/android/gms/maps/MapView;", "setMapFragment", "(Lcom/google/android/gms/maps/MapView;)V", "presenter", "Lru/taximer/taxiandroid/presenters/MainTaxiPresenter;", "getPresenter", "()Lru/taximer/taxiandroid/presenters/MainTaxiPresenter;", "setPresenter", "(Lru/taximer/taxiandroid/presenters/MainTaxiPresenter;)V", "projection", "Lcom/google/android/gms/maps/Projection;", "getProjection", "()Lcom/google/android/gms/maps/Projection;", "setProjection", "(Lcom/google/android/gms/maps/Projection;)V", "ready", "", "getReady", "()Z", "setReady", "(Z)V", "startMarker", "getStartMarker", "setStartMarker", "usecases", "Lru/taximer/taxiandroid/network/usecases/UserUsecases;", "getUsecases", "()Lru/taximer/taxiandroid/network/usecases/UserUsecases;", "userLocationCallback", "Lcom/google/android/gms/location/LocationCallback;", "width", "getWidth", "setWidth", "allowMyLocation", "", "checkMyLocationPermission", "func", "Lkotlin/Function0;", "checkMyLocationPermissionSilent", "drawEndMarker", "gps", "drawStartMarker", "getCurrentLocation", "onCameraIdle", "onCameraMove", "onCameraMoveCanceled", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onLocationChanged", "location", "Landroid/location/Location;", "onLowMemory", "onMapReady", "googleMap", "onMarkerClick", "marker", "onPause", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onSaveInstanceState", "outState", "onViewCreated", "view", "positionOnMap", "provideMainTaxiPresenter", "requestLocationPermission", "setBeginState", "pos", "setEditState", "isStartEdit", "isBothLocationContaints", "position", "setEnd", "setManual", "setManualSelectionState", "isStart", "setReadyState", "setStart", "showLocationRationale", "startSearch", "start", "end", "Companion", "app_debug"})
public final class MapFragment extends com.arellomobile.mvp.MvpAppCompatFragment implements com.google.android.gms.maps.OnMapReadyCallback, com.google.android.gms.location.LocationListener, ru.taximer.taxiandroid.presenters.MainTaxiView, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener, com.google.android.gms.maps.GoogleMap.OnCameraIdleListener, com.google.android.gms.maps.GoogleMap.OnCameraMoveListener, com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener {
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter(type = com.arellomobile.mvp.presenter.PresenterType.GLOBAL)
    public ru.taximer.taxiandroid.presenters.MainTaxiPresenter presenter;
    @org.jetbrains.annotations.NotNull()
    private final ru.taximer.taxiandroid.network.usecases.UserUsecases usecases = null;
    private com.google.android.gms.maps.GoogleMap map;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.Marker startMarker;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.Marker endMarker;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.LatLng currentPoisition;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.LatLng cameraPoisition;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.Projection projection;
    @org.jetbrains.annotations.NotNull()
    public com.google.maps.android.ui.IconGenerator icnGenerator;
    private int width;
    private int height;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.MapView mapFragment;
    @org.jetbrains.annotations.Nullable()
    private ru.taximer.taxiandroid.network.models.PlaceLocationModel firstPos;
    @org.jetbrains.annotations.Nullable()
    private ru.taximer.taxiandroid.network.models.PlaceLocationModel endPos;
    private boolean ready;
    private com.google.android.gms.location.FusedLocationProviderClient locationProvider;
    private com.google.android.gms.location.LocationCallback userLocationCallback;
    private com.google.firebase.analytics.FirebaseAnalytics mFirebaseAnalytics;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler cameraHandler = null;
    private static final int PERMISSION_REQUEST_CODE_LOCATION = 7;
    private static final float DEFAULT_ZOOM = 16.0F;
    public static final ru.taximer.taxiandroid.ui.fragments.MapFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.presenters.MainTaxiPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.presenters.MainTaxiPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.ProvidePresenter(type = com.arellomobile.mvp.presenter.PresenterType.GLOBAL)
    public final ru.taximer.taxiandroid.presenters.MainTaxiPresenter provideMainTaxiPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.network.usecases.UserUsecases getUsecases() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.Marker getStartMarker() {
        return null;
    }
    
    public final void setStartMarker(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.Marker getEndMarker() {
        return null;
    }
    
    public final void setEndMarker(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.LatLng getCurrentPoisition() {
        return null;
    }
    
    public final void setCurrentPoisition(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.LatLng getCameraPoisition() {
        return null;
    }
    
    public final void setCameraPoisition(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.Projection getProjection() {
        return null;
    }
    
    public final void setProjection(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.Projection p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.maps.android.ui.IconGenerator getIcnGenerator() {
        return null;
    }
    
    public final void setIcnGenerator(@org.jetbrains.annotations.NotNull()
    com.google.maps.android.ui.IconGenerator p0) {
    }
    
    public final int getWidth() {
        return 0;
    }
    
    public final void setWidth(int p0) {
    }
    
    public final int getHeight() {
        return 0;
    }
    
    public final void setHeight(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.MapView getMapFragment() {
        return null;
    }
    
    public final void setMapFragment(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.MapView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ru.taximer.taxiandroid.network.models.PlaceLocationModel getFirstPos() {
        return null;
    }
    
    public final void setFirstPos(@org.jetbrains.annotations.Nullable()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ru.taximer.taxiandroid.network.models.PlaceLocationModel getEndPos() {
        return null;
    }
    
    public final void setEndPos(@org.jetbrains.annotations.Nullable()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel p0) {
    }
    
    public final boolean getReady() {
        return false;
    }
    
    public final void setReady(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Handler getCameraHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onLowMemory() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @java.lang.Override()
    public boolean onMarkerClick(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker marker) {
        return false;
    }
    
    @java.lang.Override()
    public void onCameraIdle() {
    }
    
    @java.lang.Override()
    public void onCameraMove() {
    }
    
    @java.lang.Override()
    public void onCameraMoveCanceled() {
    }
    
    @java.lang.Override()
    public void startSearch(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel start, @org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel end) {
    }
    
    @java.lang.Override()
    public void setBeginState(@org.jetbrains.annotations.Nullable()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel pos) {
    }
    
    @java.lang.Override()
    public void setManual() {
    }
    
    @java.lang.Override()
    public void setManualSelectionState(boolean isStart, @org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng position) {
    }
    
    @java.lang.Override()
    public void setStart(@org.jetbrains.annotations.Nullable()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel location) {
    }
    
    @java.lang.Override()
    public void setEnd(@org.jetbrains.annotations.Nullable()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel location) {
    }
    
    @java.lang.Override()
    public void setEditState(boolean isStartEdit, boolean isBothLocationContaints, @org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng position) {
    }
    
    @java.lang.Override()
    public void setReadyState() {
    }
    
    private final void positionOnMap() {
    }
    
    private final void drawStartMarker(com.google.android.gms.maps.model.LatLng gps) throws java.io.IOException {
    }
    
    private final void drawEndMarker(com.google.android.gms.maps.model.LatLng gps) throws java.io.IOException {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void allowMyLocation() {
    }
    
    private final void getCurrentLocation() {
    }
    
    @java.lang.Override()
    public void onLocationChanged(@org.jetbrains.annotations.Nullable()
    android.location.Location location) {
    }
    
    private final void checkMyLocationPermission(kotlin.jvm.functions.Function0<kotlin.Unit> func) {
    }
    
    private final void checkMyLocationPermissionSilent(kotlin.jvm.functions.Function0<kotlin.Unit> func) {
    }
    
    private final void showLocationRationale() {
    }
    
    private final void requestLocationPermission() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    public MapFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lru/taximer/taxiandroid/ui/fragments/MapFragment$Companion;", "", "()V", "DEFAULT_ZOOM", "", "PERMISSION_REQUEST_CODE_LOCATION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}