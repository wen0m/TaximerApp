package ru.taximer.taxiandroid.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lru/taximer/taxiandroid/presenters/SplashView;", "Lru/taximer/taxiandroid/presenters/base/BaseLoadingView;", "goToMainScreen", "", "app_debug"})
@com.arellomobile.mvp.viewstate.strategy.StateStrategyType(value = com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class)
public abstract interface SplashView extends ru.taximer.taxiandroid.presenters.base.BaseLoadingView {
    
    public abstract void goToMainScreen();
}