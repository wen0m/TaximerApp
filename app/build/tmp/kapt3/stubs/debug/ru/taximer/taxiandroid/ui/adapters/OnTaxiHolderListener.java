package ru.taximer.taxiandroid.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H&\u00a8\u0006\f"}, d2 = {"Lru/taximer/taxiandroid/ui/adapters/OnTaxiHolderListener;", "", "onAppSelect", "", "type", "", "installUrl", "", "openUrl", "appId", "taxoparkId", "taxinameEng", "app_debug"})
public abstract interface OnTaxiHolderListener {
    
    public abstract void onAppSelect(int type, @org.jetbrains.annotations.NotNull()
    java.lang.String installUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String openUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String appId, @org.jetbrains.annotations.NotNull()
    java.lang.String taxoparkId, @org.jetbrains.annotations.NotNull()
    java.lang.String taxinameEng);
}