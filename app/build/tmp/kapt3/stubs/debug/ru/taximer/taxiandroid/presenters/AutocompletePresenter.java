package ru.taximer.taxiandroid.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lru/taximer/taxiandroid/presenters/AutocompletePresenter;", "Lcom/arellomobile/mvp/MvpPresenter;", "Lru/taximer/taxiandroid/presenters/AutocompleteView;", "()V", "historyPoints", "Ljava/util/ArrayList;", "Lru/taximer/taxiandroid/network/models/PlacePredictionModel;", "placeSubscription", "Lio/reactivex/disposables/Disposable;", "suggestionSubscription", "usecases", "Lru/taximer/taxiandroid/network/usecases/TaxiUsecases;", "getUsecases", "()Lru/taximer/taxiandroid/network/usecases/TaxiUsecases;", "showHistory", "", "isStart", "", "point", "Lcom/google/android/gms/maps/model/LatLng;", "showPredictions", "word", "", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class AutocompletePresenter extends com.arellomobile.mvp.MvpPresenter<ru.taximer.taxiandroid.presenters.AutocompleteView> {
    private final java.util.ArrayList<ru.taximer.taxiandroid.network.models.PlacePredictionModel> historyPoints = null;
    private io.reactivex.disposables.Disposable suggestionSubscription;
    private io.reactivex.disposables.Disposable placeSubscription;
    @org.jetbrains.annotations.NotNull()
    private final ru.taximer.taxiandroid.network.usecases.TaxiUsecases usecases = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.network.usecases.TaxiUsecases getUsecases() {
        return null;
    }
    
    public final void showHistory(boolean isStart, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng point) {
    }
    
    public final void showPredictions(@org.jetbrains.annotations.NotNull()
    java.lang.String word, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng point) {
    }
    
    public AutocompletePresenter() {
        super();
    }
}