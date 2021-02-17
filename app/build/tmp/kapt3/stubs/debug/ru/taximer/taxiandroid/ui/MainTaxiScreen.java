package ru.taximer.taxiandroid.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00e4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u0092\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0004\u0091\u0001\u0092\u0001B\u0005\u00a2\u0006\u0002\u0010\nJ\u0012\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J*\u0010P\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010Q2\u0006\u0010R\u001a\u00020\u000e2\u0006\u0010S\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020\u000eH\u0016J\b\u0010U\u001a\u00020MH\u0016J\u000e\u0010V\u001a\u00020M2\u0006\u0010W\u001a\u00020)J\"\u0010X\u001a\u00020M2\u0006\u0010Y\u001a\u00020\u000e2\u0006\u0010Z\u001a\u00020\u000e2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0014J\b\u0010]\u001a\u00020MH\u0016J\u0012\u0010^\u001a\u00020M2\b\u0010_\u001a\u0004\u0018\u00010`H\u0014J\b\u0010a\u001a\u00020MH\u0014J\u001a\u0010b\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010c2\u0006\u0010d\u001a\u00020)H\u0016J\b\u0010e\u001a\u00020MH\u0016J\u0010\u0010f\u001a\u00020M2\u0006\u0010g\u001a\u00020)H\u0016J\u0018\u0010h\u001a\u00020)2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010j\u001a\u00020kH\u0016J \u0010l\u001a\u00020M2\u0006\u0010m\u001a\u00020n2\u000e\u0010o\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010pH\u0016J\b\u0010q\u001a\u00020MH\u0014J\b\u0010r\u001a\u00020MH\u0014J*\u0010s\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010Q2\u0006\u0010R\u001a\u00020\u000e2\u0006\u0010S\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020\u000eH\u0016J\u0006\u0010t\u001a\u00020MJ\u0006\u0010u\u001a\u00020MJ\u0006\u0010v\u001a\u00020MJ\b\u0010w\u001a\u000203H\u0007J\b\u0010x\u001a\u00020GH\u0007J\u0012\u0010y\u001a\u00020M2\b\u0010z\u001a\u0004\u0018\u00010nH\u0016J\"\u0010{\u001a\u00020M2\u0006\u0010|\u001a\u00020)2\u0006\u0010W\u001a\u00020)2\b\u0010}\u001a\u0004\u0018\u00010~H\u0016J\u0013\u0010\u007f\u001a\u00020M2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010nH\u0016J\t\u0010\u0081\u0001\u001a\u00020MH\u0002J\t\u0010\u0082\u0001\u001a\u00020MH\u0016J\u001c\u0010\u0083\u0001\u001a\u00020M2\u0007\u0010\u0084\u0001\u001a\u00020)2\b\u0010}\u001a\u0004\u0018\u00010~H\u0016J\t\u0010\u0085\u0001\u001a\u00020MH\u0016J\u0014\u0010\u0086\u0001\u001a\u00020M2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010nH\u0016J\u0012\u0010\u0087\u0001\u001a\u00020M2\u0007\u0010\u0088\u0001\u001a\u00020\u0014H\u0016J\t\u0010\u0089\u0001\u001a\u00020MH\u0016J\u001b\u0010\u008a\u0001\u001a\u00020M2\u0007\u0010\u008b\u0001\u001a\u00020n2\u0007\u0010\u008c\u0001\u001a\u00020nH\u0016J\"\u0010\u008d\u0001\u001a\u00020M*\u00030\u008e\u00012\u0014\u0010\u008f\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020M0\u0090\u0001R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000#X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010$\u001a\u00020%\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u000209X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0011\u0010>\u001a\u00020%\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010\'R\u001a\u0010@\u001a\u00020AX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001e\u0010F\u001a\u00020G8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K\u00a8\u0006\u0093\u0001"}, d2 = {"Lru/taximer/taxiandroid/ui/MainTaxiScreen;", "Lcom/arellomobile/mvp/MvpAppCompatActivity;", "Lru/taximer/taxiandroid/presenters/MainTaxiView;", "Landroid/text/TextWatcher;", "Lru/taximer/taxiandroid/utils/gms/GoogleApiPartialCallbacks;", "Lru/taximer/taxiandroid/utils/gms/GoogleApiPartialActivityCallbacks;", "Lru/taximer/taxiandroid/ui/adapters/OnPlaceListener;", "Lru/taximer/taxiandroid/presenters/base/BaseLoadingView;", "Landroid/view/View$OnFocusChangeListener;", "Lcom/treebo/internetavailabilitychecker/InternetConnectivityListener;", "()V", "adapter", "Lru/taximer/taxiandroid/ui/adapters/SearchPlaceAdapter;", "click", "", "getClick", "()I", "setClick", "(I)V", "completeAddr", "", "getCompleteAddr", "()Ljava/lang/String;", "setCompleteAddr", "(Ljava/lang/String;)V", "delayMilliseconds", "", "getDelayMilliseconds", "()J", "setDelayMilliseconds", "(J)V", "devClicker", "getDevClicker", "setDevClicker", "googleApiPartial", "Lru/taximer/taxiandroid/utils/gms/GoogleApiPartial;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "ignoreChange", "", "getIgnoreChange", "()Z", "setIgnoreChange", "(Z)V", "mFirebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "mInternetAvailabilityChecker", "Lcom/treebo/internetavailabilitychecker/InternetAvailabilityChecker;", "presenter", "Lru/taximer/taxiandroid/presenters/MainTaxiPresenter;", "getPresenter", "()Lru/taximer/taxiandroid/presenters/MainTaxiPresenter;", "setPresenter", "(Lru/taximer/taxiandroid/presenters/MainTaxiPresenter;)V", "snackbar", "Landroid/support/design/widget/Snackbar;", "getSnackbar", "()Landroid/support/design/widget/Snackbar;", "setSnackbar", "(Landroid/support/design/widget/Snackbar;)V", "tmpHandler", "getTmpHandler", "toggle", "Landroid/support/v7/app/ActionBarDrawerToggle;", "getToggle", "()Landroid/support/v7/app/ActionBarDrawerToggle;", "setToggle", "(Landroid/support/v7/app/ActionBarDrawerToggle;)V", "userSettingsPresenter", "Lru/taximer/taxiandroid/presenters/UserSettingsPresenter;", "getUserSettingsPresenter", "()Lru/taximer/taxiandroid/presenters/UserSettingsPresenter;", "setUserSettingsPresenter", "(Lru/taximer/taxiandroid/presenters/UserSettingsPresenter;)V", "afterTextChanged", "", "p0", "Landroid/text/Editable;", "beforeTextChanged", "", "p1", "p2", "p3", "hideLoading", "hidePanel", "isBothLocationContaints", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onFocusChange", "Landroid/view/View;", "value", "onGoogleApiClientErrorResolved", "onInternetConnectivityChanged", "isConnected", "onKeyDown", "keycode", "event", "Landroid/view/KeyEvent;", "onPlaceSelect", "place", "Lru/taximer/taxiandroid/network/models/PlaceLocationModel;", "placeTypes", "", "onResume", "onStop", "onTextChanged", "openEndSearch", "openPanel", "openStartSearch", "provideMainTaxiPresenter", "provideUserSettingsPresenter", "setBeginState", "pos", "setEditState", "isStartEdit", "position", "Lcom/google/android/gms/maps/model/LatLng;", "setEnd", "location", "setFeedBack", "setManual", "setManualSelectionState", "isStart", "setReadyState", "setStart", "showError", "message", "showLoading", "startSearch", "start", "end", "onChange", "Landroid/widget/EditText;", "cb", "Lkotlin/Function1;", "BottomCallbck", "Companion", "app_debug"})
public final class MainTaxiScreen extends com.arellomobile.mvp.MvpAppCompatActivity implements ru.taximer.taxiandroid.presenters.MainTaxiView, android.text.TextWatcher, ru.taximer.taxiandroid.utils.gms.GoogleApiPartialCallbacks, ru.taximer.taxiandroid.utils.gms.GoogleApiPartialActivityCallbacks, ru.taximer.taxiandroid.ui.adapters.OnPlaceListener, ru.taximer.taxiandroid.presenters.base.BaseLoadingView, android.view.View.OnFocusChangeListener, com.treebo.internetavailabilitychecker.InternetConnectivityListener {
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter(type = com.arellomobile.mvp.presenter.PresenterType.GLOBAL)
    public ru.taximer.taxiandroid.presenters.MainTaxiPresenter presenter;
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter(type = com.arellomobile.mvp.presenter.PresenterType.LOCAL)
    public ru.taximer.taxiandroid.presenters.UserSettingsPresenter userSettingsPresenter;
    private ru.taximer.taxiandroid.ui.adapters.SearchPlaceAdapter adapter;
    private ru.taximer.taxiandroid.utils.gms.GoogleApiPartial<ru.taximer.taxiandroid.ui.MainTaxiScreen> googleApiPartial;
    private com.google.firebase.analytics.FirebaseAnalytics mFirebaseAnalytics;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler handler = null;
    @org.jetbrains.annotations.NotNull()
    public android.support.design.widget.Snackbar snackbar;
    private long delayMilliseconds;
    private com.treebo.internetavailabilitychecker.InternetAvailabilityChecker mInternetAvailabilityChecker;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String completeAddr;
    @org.jetbrains.annotations.NotNull()
    public android.support.v7.app.ActionBarDrawerToggle toggle;
    private int click;
    private int devClicker;
    private boolean ignoreChange;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler tmpHandler = null;
    public static final ru.taximer.taxiandroid.ui.MainTaxiScreen.Companion Companion = null;
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
    public final ru.taximer.taxiandroid.presenters.UserSettingsPresenter getUserSettingsPresenter() {
        return null;
    }
    
    public final void setUserSettingsPresenter(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.presenters.UserSettingsPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.ProvidePresenter(type = com.arellomobile.mvp.presenter.PresenterType.LOCAL)
    public final ru.taximer.taxiandroid.presenters.UserSettingsPresenter provideUserSettingsPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Handler getHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.design.widget.Snackbar getSnackbar() {
        return null;
    }
    
    public final void setSnackbar(@org.jetbrains.annotations.NotNull()
    android.support.design.widget.Snackbar p0) {
    }
    
    public final long getDelayMilliseconds() {
        return 0L;
    }
    
    public final void setDelayMilliseconds(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCompleteAddr() {
        return null;
    }
    
    public final void setCompleteAddr(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.app.ActionBarDrawerToggle getToggle() {
        return null;
    }
    
    public final void setToggle(@org.jetbrains.annotations.NotNull()
    android.support.v7.app.ActionBarDrawerToggle p0) {
    }
    
    public final int getClick() {
        return 0;
    }
    
    public final void setClick(int p0) {
    }
    
    public final int getDevClicker() {
        return 0;
    }
    
    public final void setDevClicker(int p0) {
    }
    
    public final boolean getIgnoreChange() {
        return false;
    }
    
    public final void setIgnoreChange(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Handler getTmpHandler() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public boolean onKeyDown(int keycode, @org.jetbrains.annotations.NotNull()
    android.view.KeyEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void onGoogleApiClientErrorResolved() {
    }
    
    private final void setFeedBack() {
    }
    
    @java.lang.Override()
    public void startSearch(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel start, @org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel end) {
    }
    
    public final void onChange(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> cb) {
    }
    
    @java.lang.Override()
    public void onFocusChange(@org.jetbrains.annotations.Nullable()
    android.view.View p0, boolean value) {
    }
    
    @java.lang.Override()
    public void setManual() {
    }
    
    @java.lang.Override()
    public void afterTextChanged(@org.jetbrains.annotations.Nullable()
    android.text.Editable p0) {
    }
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence p0, int p1, int p2, int p3) {
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence p0, int p1, int p2, int p3) {
    }
    
    @java.lang.Override()
    public void setBeginState(@org.jetbrains.annotations.Nullable()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel pos) {
    }
    
    @java.lang.Override()
    public void setManualSelectionState(boolean isStart, @org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng position) {
    }
    
    @java.lang.Override()
    public void onPlaceSelect(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel place, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> placeTypes) {
    }
    
    @java.lang.Override()
    public void setStart(@org.jetbrains.annotations.Nullable()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel location) {
    }
    
    public final void openStartSearch() {
    }
    
    @java.lang.Override()
    public void setEnd(@org.jetbrains.annotations.Nullable()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel location) {
    }
    
    public final void openEndSearch() {
    }
    
    @java.lang.Override()
    public void setReadyState() {
    }
    
    @java.lang.Override()
    public void setEditState(boolean isStartEdit, boolean isBothLocationContaints, @org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng position) {
    }
    
    public final void openPanel() {
    }
    
    public final void hidePanel(boolean isBothLocationContaints) {
    }
    
    @java.lang.Override()
    public void onInternetConnectivityChanged(boolean isConnected) {
    }
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    public MainTaxiScreen() {
        super();
    }
    
    public void onGoogleApiClientConnected() {
    }
    
    public void onGoogleApiClientConnectionSuspended(int cause) {
    }
    
    public void onGoogleApiClientConnectionFailed() {
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\f"}, d2 = {"Lru/taximer/taxiandroid/ui/MainTaxiScreen$BottomCallbck;", "Landroid/support/design/widget/BottomSheetBehavior$BottomSheetCallback;", "(Lru/taximer/taxiandroid/ui/MainTaxiScreen;)V", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "app_debug"})
    public final class BottomCallbck extends android.support.design.widget.BottomSheetBehavior.BottomSheetCallback {
        
        @java.lang.Override()
        public void onStateChanged(@org.jetbrains.annotations.NotNull()
        android.view.View bottomSheet, int newState) {
        }
        
        @java.lang.Override()
        public void onSlide(@org.jetbrains.annotations.NotNull()
        android.view.View bottomSheet, float slideOffset) {
        }
        
        public BottomCallbck() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lru/taximer/taxiandroid/ui/MainTaxiScreen$Companion;", "", "()V", "launch", "", "context", "Landroid/app/Activity;", "app_debug"})
    public static final class Companion {
        
        public final void launch(@org.jetbrains.annotations.NotNull()
        android.app.Activity context) {
        }
        
        private Companion() {
            super();
        }
    }
}