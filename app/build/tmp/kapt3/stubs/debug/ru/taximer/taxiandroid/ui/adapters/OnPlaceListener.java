package ru.taximer.taxiandroid.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&\u00a8\u0006\t"}, d2 = {"Lru/taximer/taxiandroid/ui/adapters/OnPlaceListener;", "", "onPlaceSelect", "", "place", "Lru/taximer/taxiandroid/network/models/PlaceLocationModel;", "placeTypes", "", "", "app_debug"})
public abstract interface OnPlaceListener {
    
    public abstract void onPlaceSelect(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel place, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> placeTypes);
}