package ru.taximer.taxiandroid.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0005H&\u00a8\u0006\r"}, d2 = {"Lru/taximer/taxiandroid/presenters/TaxoparkView;", "Lru/taximer/taxiandroid/presenters/base/BaseLoadingView;", "refreshOrderStatus", "", "description", "", "orderId", "", "setTaxoparkPack", "taxoparl", "", "", "hash", "app_debug"})
@com.arellomobile.mvp.viewstate.strategy.StateStrategyType(value = com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class)
public abstract interface TaxoparkView extends ru.taximer.taxiandroid.presenters.base.BaseLoadingView {
    
    public abstract void setTaxoparkPack(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> taxoparl, @org.jetbrains.annotations.NotNull()
    java.lang.String hash);
    
    public abstract void refreshOrderStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String description, int orderId);
}