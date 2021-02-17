package ru.taximer.taxiandroid.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u001c\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lru/taximer/taxiandroid/presenters/GetTaxiPresenter;", "Lru/taximer/taxiandroid/presenters/base/BaseRxPresenter;", "Lru/taximer/taxiandroid/network/models/SearchTaxiModel;", "Lru/taximer/taxiandroid/presenters/GetTaxiView;", "()V", "usecases", "Lru/taximer/taxiandroid/network/usecases/TaxiUsecases;", "getUsecases", "()Lru/taximer/taxiandroid/network/usecases/TaxiUsecases;", "onComplete", "", "onNext", "t", "setTaxoparks", "taxoparks", "", "", "hash", "", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class GetTaxiPresenter extends ru.taximer.taxiandroid.presenters.base.BaseRxPresenter<ru.taximer.taxiandroid.network.models.SearchTaxiModel, ru.taximer.taxiandroid.presenters.GetTaxiView> {
    @org.jetbrains.annotations.NotNull()
    private final ru.taximer.taxiandroid.network.usecases.TaxiUsecases usecases = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.network.usecases.TaxiUsecases getUsecases() {
        return null;
    }
    
    public final void setTaxoparks(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> taxoparks, @org.jetbrains.annotations.NotNull()
    java.lang.String hash) {
    }
    
    @java.lang.Override()
    public synchronized void onNext(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.SearchTaxiModel t) {
    }
    
    @java.lang.Override()
    public void onComplete() {
    }
    
    public GetTaxiPresenter() {
        super();
    }
}