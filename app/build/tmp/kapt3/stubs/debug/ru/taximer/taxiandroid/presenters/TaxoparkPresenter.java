package ru.taximer.taxiandroid.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0006J\b\u0010\u001b\u001a\u00020\u0014H\u0016J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0002H\u0016J\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0006J\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006J\u000e\u0010!\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\"\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$J\u0016\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006)"}, d2 = {"Lru/taximer/taxiandroid/presenters/TaxoparkPresenter;", "Lru/taximer/taxiandroid/presenters/base/BaseRxPresenter;", "Lru/taximer/taxiandroid/network/models/TaxoparkResultModel;", "Lru/taximer/taxiandroid/presenters/TaxoparkView;", "()V", "searchHash", "", "getSearchHash", "()Ljava/lang/String;", "setSearchHash", "(Ljava/lang/String;)V", "usecases", "Lru/taximer/taxiandroid/network/usecases/TaxiUsecases;", "getUsecases", "()Lru/taximer/taxiandroid/network/usecases/TaxiUsecases;", "usercases", "Lru/taximer/taxiandroid/network/usecases/UserUsecases;", "getUsercases", "()Lru/taximer/taxiandroid/network/usecases/UserUsecases;", "cancelOrder", "", "orderId", "", "confirmPhone", "code", "installEvent", "taxoparkId", "onComplete", "onNext", "t", "openEvent", "orderByPhone", "request_hash", "refreshStatus", "sendAuthCode", "phone", "", "setPoints", "start", "Lru/taximer/taxiandroid/network/models/PlaceLocationModel;", "end", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class TaxoparkPresenter extends ru.taximer.taxiandroid.presenters.base.BaseRxPresenter<ru.taximer.taxiandroid.network.models.TaxoparkResultModel, ru.taximer.taxiandroid.presenters.TaxoparkView> {
    @org.jetbrains.annotations.NotNull()
    private final ru.taximer.taxiandroid.network.usecases.TaxiUsecases usecases = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.taximer.taxiandroid.network.usecases.UserUsecases usercases = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String searchHash;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.network.usecases.TaxiUsecases getUsecases() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.network.usecases.UserUsecases getUsercases() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSearchHash() {
        return null;
    }
    
    public final void setSearchHash(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void sendAuthCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code, long phone) {
    }
    
    public final void confirmPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
    }
    
    public final void orderByPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String taxoparkId, @org.jetbrains.annotations.NotNull()
    java.lang.String request_hash) {
    }
    
    public final void refreshStatus(int orderId) {
    }
    
    public final void cancelOrder(int orderId) {
    }
    
    public final void setPoints(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel start, @org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel end) {
    }
    
    @java.lang.Override()
    public void onNext(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.TaxoparkResultModel t) {
    }
    
    @java.lang.Override()
    public void onComplete() {
    }
    
    public final void openEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String taxoparkId) {
    }
    
    public final void installEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String taxoparkId) {
    }
    
    public TaxoparkPresenter() {
        super();
    }
}