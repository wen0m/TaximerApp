package ru.taximer.taxiandroid.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lru/taximer/taxiandroid/presenters/AutocompleteView;", "Lru/taximer/taxiandroid/presenters/base/BaseLoadingView;", "showHistory", "", "history", "Ljava/util/ArrayList;", "Lru/taximer/taxiandroid/network/models/PlacePredictionModel;", "Lkotlin/collections/ArrayList;", "showPredictions", "word", "", "point", "Lcom/google/android/gms/maps/model/LatLng;", "app_debug"})
public abstract interface AutocompleteView extends ru.taximer.taxiandroid.presenters.base.BaseLoadingView {
    
    public abstract void showPredictions(@org.jetbrains.annotations.NotNull()
    java.lang.String word, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng point);
    
    public abstract void showHistory(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<ru.taximer.taxiandroid.network.models.PlacePredictionModel> history);
}