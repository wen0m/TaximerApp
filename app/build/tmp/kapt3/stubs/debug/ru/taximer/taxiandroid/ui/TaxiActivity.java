package ru.taximer.taxiandroid.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 }2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0001}B\u0005\u00a2\u0006\u0002\u0010\tJ\u0010\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010G\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0017H\u0002J\b\u0010K\u001a\u00020DH\u0016J\b\u0010L\u001a\u00020DH\u0016J\b\u0010M\u001a\u00020DH\u0016J\b\u0010N\u001a\u00020DH\u0016J\b\u0010O\u001a\u00020DH\u0002J\b\u0010P\u001a\u00020DH\u0016J\"\u0010Q\u001a\u00020D2\u0006\u0010R\u001a\u00020!2\u0006\u0010S\u001a\u00020!2\b\u0010T\u001a\u0004\u0018\u00010UH\u0014J8\u0010V\u001a\u00020D2\u0006\u0010W\u001a\u00020!2\u0006\u0010X\u001a\u00020\u00172\u0006\u0010Y\u001a\u00020\u00172\u0006\u0010Z\u001a\u00020\u00172\u0006\u0010[\u001a\u00020\u00172\u0006\u0010\\\u001a\u00020\u0017H\u0016J\b\u0010]\u001a\u00020DH\u0016J\b\u0010^\u001a\u00020DH\u0016J\u0010\u0010_\u001a\u00020D2\u0006\u0010`\u001a\u00020\u0017H\u0016J\u0012\u0010a\u001a\u00020D2\b\u0010b\u001a\u0004\u0018\u00010cH\u0014J\u0012\u0010d\u001a\u00020I2\b\u0010e\u001a\u0004\u0018\u00010fH\u0016J\u0012\u0010g\u001a\u00020I2\b\u0010h\u001a\u0004\u0018\u00010iH\u0016J\b\u0010j\u001a\u00020DH\u0016J\b\u0010k\u001a\u00020DH\u0016J\b\u0010l\u001a\u00020DH\u0014J\u0010\u0010m\u001a\u00020D2\u0006\u0010n\u001a\u00020\u0017H\u0016J\b\u0010o\u001a\u00020-H\u0007J\b\u0010p\u001a\u000203H\u0007J\b\u0010q\u001a\u00020\'H\u0007J\u0018\u0010r\u001a\u00020D2\u0006\u0010s\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0016J\u001e\u0010t\u001a\u00020D2\f\u0010u\u001a\b\u0012\u0004\u0012\u00020w0v2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010x\u001a\u00020D2\u0006\u0010y\u001a\u00020\u0017H\u0016J\b\u0010z\u001a\u00020DH\u0016J\b\u0010{\u001a\u00020DH\u0016J\b\u0010|\u001a\u00020DH\u0016R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020\'8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010:\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\r\"\u0004\b<\u0010\u000fR\u001a\u0010=\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0013\"\u0004\b?\u0010\u0015R\u001a\u0010@\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0019\"\u0004\bB\u0010\u001b\u00a8\u0006~"}, d2 = {"Lru/taximer/taxiandroid/ui/TaxiActivity;", "Lcom/arellomobile/mvp/MvpAppCompatActivity;", "Lru/taximer/taxiandroid/presenters/TaxoparkView;", "Lru/taximer/taxiandroid/presenters/GetTaxiView;", "Lru/taximer/taxiandroid/presenters/GetBestTaxiView;", "Lru/taximer/taxiandroid/ui/adapters/OnTaxiHolderListener;", "Lru/taximer/taxiandroid/ui/adapters/TaxiCallHolderListener;", "Lru/taximer/taxiandroid/ui/dialogs/ConfirmPhoneDialog$SendCode;", "Lru/taximer/taxiandroid/ui/dialogs/OrderTaxiDialog$GetOrder;", "()V", "end", "Lru/taximer/taxiandroid/network/models/PlaceLocationModel;", "getEnd", "()Lru/taximer/taxiandroid/network/models/PlaceLocationModel;", "setEnd", "(Lru/taximer/taxiandroid/network/models/PlaceLocationModel;)V", "endPoint", "Lcom/google/android/gms/maps/model/LatLng;", "getEndPoint", "()Lcom/google/android/gms/maps/model/LatLng;", "setEndPoint", "(Lcom/google/android/gms/maps/model/LatLng;)V", "hash", "", "getHash", "()Ljava/lang/String;", "setHash", "(Ljava/lang/String;)V", "mAdapter", "Lru/taximer/taxiandroid/ui/adapters/TaxiAdapter;", "mFirebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "orderId", "", "getOrderId", "()I", "setOrderId", "(I)V", "presenter", "Lru/taximer/taxiandroid/presenters/TaxoparkPresenter;", "getPresenter", "()Lru/taximer/taxiandroid/presenters/TaxoparkPresenter;", "setPresenter", "(Lru/taximer/taxiandroid/presenters/TaxoparkPresenter;)V", "presenterBestTaxi", "Lru/taximer/taxiandroid/presenters/GetBestTaxiPresenter;", "getPresenterBestTaxi", "()Lru/taximer/taxiandroid/presenters/GetBestTaxiPresenter;", "setPresenterBestTaxi", "(Lru/taximer/taxiandroid/presenters/GetBestTaxiPresenter;)V", "presenterTaxi", "Lru/taximer/taxiandroid/presenters/GetTaxiPresenter;", "getPresenterTaxi", "()Lru/taximer/taxiandroid/presenters/GetTaxiPresenter;", "setPresenterTaxi", "(Lru/taximer/taxiandroid/presenters/GetTaxiPresenter;)V", "skeletonScreen", "Lcom/ethanhua/skeleton/RecyclerViewSkeletonScreen;", "start", "getStart", "setStart", "startPoint", "getStartPoint", "setStartPoint", "taxId", "getTaxId", "setTaxId", "addBestTaxi", "", "taxi", "Lru/taximer/taxiandroid/network/models/SearchTaxiModel;", "addTaxi", "appInstalledOrNot", "", "uri", "changeNumberResult", "getOrder", "hideLoading", "hideLoadingIndicator", "initList", "lastResultAdded", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onAppSelect", "type", "installUrl", "openUrl", "appId", "taxoparkId", "taxinameEng", "onBackPressed", "onCancel", "onCodeConfirm", "code", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onOrderResult", "onPhoneCall", "onResume", "onSendCodeResult", "result", "provideGetBestPresenter", "provideGetTaxiPresenter", "provideTaxoparkPresenter", "refreshOrderStatus", "description", "setTaxoparkPack", "taxoparl", "", "", "showError", "message", "showLoading", "showLoadingIndicator", "showResults", "Companion", "app_debug"})
public final class TaxiActivity extends com.arellomobile.mvp.MvpAppCompatActivity implements ru.taximer.taxiandroid.presenters.TaxoparkView, ru.taximer.taxiandroid.presenters.GetTaxiView, ru.taximer.taxiandroid.presenters.GetBestTaxiView, ru.taximer.taxiandroid.ui.adapters.OnTaxiHolderListener, ru.taximer.taxiandroid.ui.adapters.TaxiCallHolderListener, ru.taximer.taxiandroid.ui.dialogs.ConfirmPhoneDialog.SendCode, ru.taximer.taxiandroid.ui.dialogs.OrderTaxiDialog.GetOrder {
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter(type = com.arellomobile.mvp.presenter.PresenterType.LOCAL)
    public ru.taximer.taxiandroid.presenters.TaxoparkPresenter presenter;
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter(type = com.arellomobile.mvp.presenter.PresenterType.LOCAL)
    public ru.taximer.taxiandroid.presenters.GetTaxiPresenter presenterTaxi;
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter(type = com.arellomobile.mvp.presenter.PresenterType.LOCAL)
    public ru.taximer.taxiandroid.presenters.GetBestTaxiPresenter presenterBestTaxi;
    private ru.taximer.taxiandroid.ui.adapters.TaxiAdapter mAdapter;
    private com.ethanhua.skeleton.RecyclerViewSkeletonScreen skeletonScreen;
    private com.google.firebase.analytics.FirebaseAnalytics mFirebaseAnalytics;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String hash;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.maps.model.LatLng startPoint;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.maps.model.LatLng endPoint;
    @org.jetbrains.annotations.NotNull()
    public ru.taximer.taxiandroid.network.models.PlaceLocationModel start;
    @org.jetbrains.annotations.NotNull()
    public ru.taximer.taxiandroid.network.models.PlaceLocationModel end;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String taxId;
    private int orderId;
    public static final ru.taximer.taxiandroid.ui.TaxiActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.presenters.TaxoparkPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.presenters.TaxoparkPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.ProvidePresenter(type = com.arellomobile.mvp.presenter.PresenterType.LOCAL)
    public final ru.taximer.taxiandroid.presenters.TaxoparkPresenter provideTaxoparkPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.presenters.GetTaxiPresenter getPresenterTaxi() {
        return null;
    }
    
    public final void setPresenterTaxi(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.presenters.GetTaxiPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.ProvidePresenter(type = com.arellomobile.mvp.presenter.PresenterType.LOCAL)
    public final ru.taximer.taxiandroid.presenters.GetTaxiPresenter provideGetTaxiPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.presenters.GetBestTaxiPresenter getPresenterBestTaxi() {
        return null;
    }
    
    public final void setPresenterBestTaxi(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.presenters.GetBestTaxiPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.ProvidePresenter(type = com.arellomobile.mvp.presenter.PresenterType.LOCAL)
    public final ru.taximer.taxiandroid.presenters.GetBestTaxiPresenter provideGetBestPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHash() {
        return null;
    }
    
    public final void setHash(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.LatLng getStartPoint() {
        return null;
    }
    
    public final void setStartPoint(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.LatLng getEndPoint() {
        return null;
    }
    
    public final void setEndPoint(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.network.models.PlaceLocationModel getStart() {
        return null;
    }
    
    public final void setStart(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.network.models.PlaceLocationModel getEnd() {
        return null;
    }
    
    public final void setEnd(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTaxId() {
        return null;
    }
    
    public final void setTaxId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getOrderId() {
        return 0;
    }
    
    public final void setOrderId(int p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void initList() {
    }
    
    @java.lang.Override()
    public void setTaxoparkPack(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> taxoparl, @org.jetbrains.annotations.NotNull()
    java.lang.String hash) {
    }
    
    @java.lang.Override()
    public void addBestTaxi(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.SearchTaxiModel taxi) {
    }
    
    @java.lang.Override()
    public void addTaxi(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.SearchTaxiModel taxi) {
    }
    
    @java.lang.Override()
    public void showResults() {
    }
    
    @java.lang.Override()
    public void lastResultAdded() {
    }
    
    @java.lang.Override()
    public void showLoadingIndicator() {
    }
    
    @java.lang.Override()
    public void hideLoadingIndicator() {
    }
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void onAppSelect(int type, @org.jetbrains.annotations.NotNull()
    java.lang.String installUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String openUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String appId, @org.jetbrains.annotations.NotNull()
    java.lang.String taxoparkId, @org.jetbrains.annotations.NotNull()
    java.lang.String taxinameEng) {
    }
    
    @java.lang.Override()
    public void onSendCodeResult(@org.jetbrains.annotations.NotNull()
    java.lang.String result) {
    }
    
    @java.lang.Override()
    public void onCodeConfirm(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
    }
    
    @java.lang.Override()
    public void onOrderResult() {
    }
    
    @java.lang.Override()
    public void changeNumberResult() {
    }
    
    @java.lang.Override()
    public void refreshOrderStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String description, int orderId) {
    }
    
    @java.lang.Override()
    public void getOrder() {
    }
    
    @java.lang.Override()
    public void onCancel() {
    }
    
    @java.lang.Override()
    public void onPhoneCall() {
    }
    
    private final boolean appInstalledOrNot(java.lang.String uri) {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public TaxiActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b\u00a8\u0006\n"}, d2 = {"Lru/taximer/taxiandroid/ui/TaxiActivity$Companion;", "", "()V", "launch", "", "context", "Landroid/app/Activity;", "placeStart", "Lru/taximer/taxiandroid/network/models/PlaceLocationModel;", "placeEnd", "app_debug"})
    public static final class Companion {
        
        public final void launch(@org.jetbrains.annotations.NotNull()
        android.app.Activity context, @org.jetbrains.annotations.NotNull()
        ru.taximer.taxiandroid.network.models.PlaceLocationModel placeStart, @org.jetbrains.annotations.NotNull()
        ru.taximer.taxiandroid.network.models.PlaceLocationModel placeEnd) {
        }
        
        private Companion() {
            super();
        }
    }
}