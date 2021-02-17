package ru.taximer.taxiandroid.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u001c\u001a\u00020\u001dJ&\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#J\u0016\u0010$\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\b\u0010%\u001a\u00020&H\u0016J\u0010\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0016J&\u0010)\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#J\u0006\u0010*\u001a\u00020\fJ\u0018\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u00022\u0006\u0010(\u001a\u00020&H\u0016J\u0018\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&H\u0016J\u0010\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\fH\u0016J\u0014\u00103\u001a\u00020\u001d2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f04R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u00065"}, d2 = {"Lru/taximer/taxiandroid/ui/adapters/SearchPlaceAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lru/taximer/taxiandroid/ui/adapters/SearchPlaceViewHolder;", "Lru/taximer/taxiandroid/ui/adapters/OnPlaceHolderListener;", "googleApiPartial", "Lru/taximer/taxiandroid/utils/gms/GoogleApiPartial;", "Lru/taximer/taxiandroid/ui/MainTaxiScreen;", "listener", "Lru/taximer/taxiandroid/ui/adapters/OnPlaceListener;", "(Lru/taximer/taxiandroid/utils/gms/GoogleApiPartial;Lru/taximer/taxiandroid/ui/adapters/OnPlaceListener;)V", "data", "Ljava/util/ArrayList;", "Lru/taximer/taxiandroid/network/models/PlacePredictionModel;", "dataFrom", "dataTo", "getGoogleApiPartial", "()Lru/taximer/taxiandroid/utils/gms/GoogleApiPartial;", "getListener", "()Lru/taximer/taxiandroid/ui/adapters/OnPlaceListener;", "placeSubscription", "Lio/reactivex/disposables/Disposable;", "query", "", "suggestionSubscription", "usecases", "Lru/taximer/taxiandroid/network/usecases/TaxiUsecases;", "getUsecases", "()Lru/taximer/taxiandroid/network/usecases/TaxiUsecases;", "clear", "", "getAutocomplete", "constraint", "isStart", "", "point", "Lcom/google/android/gms/maps/model/LatLng;", "getHistoryPoints", "getItemCount", "", "getItemViewType", "position", "getPredicions", "getPredicition", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onPlaceSelect", "place", "setItems", "", "app_debug"})
public final class SearchPlaceAdapter extends android.support.v7.widget.RecyclerView.Adapter<ru.taximer.taxiandroid.ui.adapters.SearchPlaceViewHolder> implements ru.taximer.taxiandroid.ui.adapters.OnPlaceHolderListener {
    private java.lang.String query;
    private final java.util.ArrayList<ru.taximer.taxiandroid.network.models.PlacePredictionModel> data = null;
    private final java.util.ArrayList<ru.taximer.taxiandroid.network.models.PlacePredictionModel> dataFrom = null;
    private final java.util.ArrayList<ru.taximer.taxiandroid.network.models.PlacePredictionModel> dataTo = null;
    private io.reactivex.disposables.Disposable suggestionSubscription;
    private io.reactivex.disposables.Disposable placeSubscription;
    @org.jetbrains.annotations.NotNull()
    private final ru.taximer.taxiandroid.network.usecases.TaxiUsecases usecases = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.taximer.taxiandroid.utils.gms.GoogleApiPartial<ru.taximer.taxiandroid.ui.MainTaxiScreen> googleApiPartial = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.taximer.taxiandroid.ui.adapters.OnPlaceListener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.network.usecases.TaxiUsecases getUsecases() {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.network.models.PlacePredictionModel getPredicition() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.taximer.taxiandroid.network.models.PlacePredictionModel> data) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.ui.adapters.SearchPlaceViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.taximer.taxiandroid.ui.adapters.SearchPlaceViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onPlaceSelect(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.PlacePredictionModel place) {
    }
    
    public final void clear() {
    }
    
    public final synchronized void getAutocomplete(@org.jetbrains.annotations.Nullable()
    java.lang.String constraint, boolean isStart, @org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng point) {
    }
    
    public final void getHistoryPoints(boolean isStart, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng point) {
    }
    
    public final void getPredicions(@org.jetbrains.annotations.Nullable()
    java.lang.String constraint, boolean isStart, @org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng point) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.utils.gms.GoogleApiPartial<ru.taximer.taxiandroid.ui.MainTaxiScreen> getGoogleApiPartial() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.ui.adapters.OnPlaceListener getListener() {
        return null;
    }
    
    public SearchPlaceAdapter(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.utils.gms.GoogleApiPartial<ru.taximer.taxiandroid.ui.MainTaxiScreen> googleApiPartial, @org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.ui.adapters.OnPlaceListener listener) {
        super();
    }
}