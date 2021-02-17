package ru.taximer.taxiandroid.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lru/taximer/taxiandroid/presenters/GetBestTaxiView;", "Lru/taximer/taxiandroid/presenters/base/BaseLoadingView;", "addBestTaxi", "", "taxi", "Lru/taximer/taxiandroid/network/models/SearchTaxiModel;", "showResults", "app_debug"})
@com.arellomobile.mvp.viewstate.strategy.StateStrategyType(value = com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class)
public abstract interface GetBestTaxiView extends ru.taximer.taxiandroid.presenters.base.BaseLoadingView {
    
    public abstract void addBestTaxi(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.SearchTaxiModel taxi);
    
    public abstract void showResults();
}