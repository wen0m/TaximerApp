package ru.taximer.taxiandroid.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\u0002J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0017\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lru/taximer/taxiandroid/presenters/SplashPresenter;", "Lru/taximer/taxiandroid/presenters/base/BaseRxPresenter;", "", "Lru/taximer/taxiandroid/presenters/SplashView;", "()V", "usecases", "Lru/taximer/taxiandroid/network/usecases/UserUsecases;", "getUsecases", "()Lru/taximer/taxiandroid/network/usecases/UserUsecases;", "askGeoposition", "onComplete", "onNext", "t", "(Lkotlin/Unit;)V", "openApp", "hash", "", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class SplashPresenter extends ru.taximer.taxiandroid.presenters.base.BaseRxPresenter<kotlin.Unit, ru.taximer.taxiandroid.presenters.SplashView> {
    @org.jetbrains.annotations.NotNull()
    private final ru.taximer.taxiandroid.network.usecases.UserUsecases usecases = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.network.usecases.UserUsecases getUsecases() {
        return null;
    }
    
    public final void openApp(@org.jetbrains.annotations.NotNull()
    java.lang.String hash) {
    }
    
    public final void askGeoposition() {
    }
    
    @java.lang.Override()
    public void onNext(@org.jetbrains.annotations.Nullable()
    kotlin.Unit t) {
    }
    
    @java.lang.Override()
    public void onComplete() {
    }
    
    public SplashPresenter() {
        super();
    }
}