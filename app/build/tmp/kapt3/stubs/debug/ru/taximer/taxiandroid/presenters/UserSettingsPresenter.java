package ru.taximer.taxiandroid.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002J\b\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lru/taximer/taxiandroid/presenters/UserSettingsPresenter;", "Lru/taximer/taxiandroid/presenters/base/BaseRxPresenter;", "", "Lru/taximer/taxiandroid/presenters/base/BaseLoadingView;", "()V", "usecases", "Lru/taximer/taxiandroid/network/usecases/UserUsecases;", "getUsecases", "()Lru/taximer/taxiandroid/network/usecases/UserUsecases;", "changeNotifications", "", "value", "onComplete", "onNext", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class UserSettingsPresenter extends ru.taximer.taxiandroid.presenters.base.BaseRxPresenter<java.lang.Boolean, ru.taximer.taxiandroid.presenters.base.BaseLoadingView> {
    @org.jetbrains.annotations.NotNull()
    private final ru.taximer.taxiandroid.network.usecases.UserUsecases usecases = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.network.usecases.UserUsecases getUsecases() {
        return null;
    }
    
    public final void changeNotifications(boolean value) {
    }
    
    @java.lang.Override()
    public void onNext(boolean value) {
    }
    
    @java.lang.Override()
    public void onComplete() {
    }
    
    public UserSettingsPresenter() {
        super();
    }
}