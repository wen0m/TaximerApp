package ru.taximer.taxiandroid.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001<B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0016\u0010\u0019\u001a\u00020\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0003J\b\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\"\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0012\u0010%\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\b\u0010(\u001a\u00020\u0018H\u0014J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020$H\u0014J-\u0010.\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\u000e\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u000201002\u0006\u00102\u001a\u000203H\u0016\u00a2\u0006\u0002\u00104J\b\u00105\u001a\u00020\u0018H\u0014J\b\u00106\u001a\u00020\u0010H\u0007J\b\u00107\u001a\u00020\u0018H\u0002J\u0010\u00108\u001a\u00020\u00182\u0006\u00109\u001a\u000201H\u0016J\b\u0010:\u001a\u00020\u0018H\u0016J\b\u0010;\u001a\u00020\u0018H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lru/taximer/taxiandroid/ui/SplashActivity;", "Lcom/arellomobile/mvp/MvpAppCompatActivity;", "Lru/taximer/taxiandroid/presenters/SplashView;", "Lcom/treebo/internetavailabilitychecker/InternetConnectivityListener;", "()V", "duration", "", "getDuration", "()J", "setDuration", "(J)V", "locationProvider", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mInternetAvailabilityChecker", "Lcom/treebo/internetavailabilitychecker/InternetAvailabilityChecker;", "presenter", "Lru/taximer/taxiandroid/presenters/SplashPresenter;", "getPresenter", "()Lru/taximer/taxiandroid/presenters/SplashPresenter;", "setPresenter", "(Lru/taximer/taxiandroid/presenters/SplashPresenter;)V", "userLocationCallback", "Lcom/google/android/gms/location/LocationCallback;", "checkLocationEnabled", "", "checkMyLocationPermission", "func", "Lkotlin/Function0;", "getCurrentLocation", "goToMainScreen", "hideLoading", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onInternetConnectivityChanged", "isConnected", "", "onNewIntent", "intent", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "provideSplashPresenter", "requestLocationPermission", "showError", "message", "showLoading", "showLocationRationale", "Companion", "app_debug"})
public final class SplashActivity extends com.arellomobile.mvp.MvpAppCompatActivity implements ru.taximer.taxiandroid.presenters.SplashView, com.treebo.internetavailabilitychecker.InternetConnectivityListener {
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter(type = com.arellomobile.mvp.presenter.PresenterType.LOCAL)
    public ru.taximer.taxiandroid.presenters.SplashPresenter presenter;
    private long duration;
    private com.google.android.gms.location.FusedLocationProviderClient locationProvider;
    private com.treebo.internetavailabilitychecker.InternetAvailabilityChecker mInternetAvailabilityChecker;
    private com.google.android.gms.location.LocationCallback userLocationCallback;
    private static final int PERMISSION_REQUEST_CODE_LOCATION = 7;
    public static final ru.taximer.taxiandroid.ui.SplashActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.presenters.SplashPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.presenters.SplashPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.ProvidePresenter(type = com.arellomobile.mvp.presenter.PresenterType.LOCAL)
    public final ru.taximer.taxiandroid.presenters.SplashPresenter provideSplashPresenter() {
        return null;
    }
    
    public final long getDuration() {
        return 0L;
    }
    
    public final void setDuration(long p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    private final void getCurrentLocation() {
    }
    
    private final void checkLocationEnabled() {
    }
    
    private final void checkMyLocationPermission(kotlin.jvm.functions.Function0<kotlin.Unit> func) {
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
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void goToMainScreen() {
    }
    
    @java.lang.Override()
    public void onInternetConnectivityChanged(boolean isConnected) {
    }
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public SplashActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lru/taximer/taxiandroid/ui/SplashActivity$Companion;", "", "()V", "PERMISSION_REQUEST_CODE_LOCATION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}