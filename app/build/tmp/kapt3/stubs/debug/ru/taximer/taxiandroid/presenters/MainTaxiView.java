package ru.taximer.taxiandroid.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\u0011\u001a\u00020\u0003H&J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H&\u00a8\u0006\u0016"}, d2 = {"Lru/taximer/taxiandroid/presenters/MainTaxiView;", "Lcom/arellomobile/mvp/MvpView;", "setBeginState", "", "pos", "Lru/taximer/taxiandroid/network/models/PlaceLocationModel;", "setEditState", "isStartEdit", "", "isBothLocationContaints", "position", "Lcom/google/android/gms/maps/model/LatLng;", "setEnd", "location", "setManual", "setManualSelectionState", "isStart", "setReadyState", "setStart", "startSearch", "start", "end", "app_debug"})
public abstract interface MainTaxiView extends com.arellomobile.mvp.MvpView {
    
    public abstract void setStart(@org.jetbrains.annotations.Nullable()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel location);
    
    public abstract void setEnd(@org.jetbrains.annotations.Nullable()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel location);
    
    public abstract void setEditState(boolean isStartEdit, boolean isBothLocationContaints, @org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng position);
    
    public abstract void startSearch(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel start, @org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel end);
    
    public abstract void setBeginState(@org.jetbrains.annotations.Nullable()
    ru.taximer.taxiandroid.network.models.PlaceLocationModel pos);
    
    public abstract void setManualSelectionState(boolean isStart, @org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng position);
    
    public abstract void setReadyState();
    
    public abstract void setManual();
}