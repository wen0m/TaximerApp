package ru.taximer.taxiandroid.network.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J$\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&Jg\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u001aH&\u00a2\u0006\u0002\u0010\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H&J\u0018\u0010\"\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H&\u00a8\u0006#"}, d2 = {"Lru/taximer/taxiandroid/network/usecases/TaxiUsecases;", "", "getBestTaxopark", "Lio/reactivex/Flowable;", "Lru/taximer/taxiandroid/network/models/SearchTaxiModel;", "hash", "", "getHistory", "", "Lru/taximer/taxiandroid/network/models/HistoryModel;", "isStart", "", "point", "Lcom/google/android/gms/maps/model/LatLng;", "getTaxoparcks", "Lru/taximer/taxiandroid/network/models/TaxoparkResultModel;", "start", "Lru/taximer/taxiandroid/network/models/PlaceLocationModel;", "end", "carType", "", "isChild", "isCard", "isCash", "apps", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Lru/taximer/taxiandroid/network/models/PlaceLocationModel;Lru/taximer/taxiandroid/network/models/PlaceLocationModel;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/ArrayList;)Lio/reactivex/Flowable;", "getTaxopark", "id", "", "sendInstallEvent", "", "pxoparkId", "sendOpenEvent", "app_debug"})
public abstract interface TaxiUsecases {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.TaxoparkResultModel> getTaxoparcks(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel start, @org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel end, @org.jetbrains.annotations.Nullable()
    java.lang.Integer carType, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isChild, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isCard, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isCash, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> apps);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.SearchTaxiModel> getTaxopark(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String hash);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<ru.taximer.taxiandroid.network.models.SearchTaxiModel> getBestTaxopark(@org.jetbrains.annotations.NotNull()
    java.lang.String hash);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.util.List<ru.taximer.taxiandroid.network.models.HistoryModel>> getHistory(boolean isStart, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng point);
    
    public abstract void sendInstallEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String hash, @org.jetbrains.annotations.NotNull()
    java.lang.String pxoparkId);
    
    public abstract void sendOpenEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String hash, @org.jetbrains.annotations.NotNull()
    java.lang.String pxoparkId);
}