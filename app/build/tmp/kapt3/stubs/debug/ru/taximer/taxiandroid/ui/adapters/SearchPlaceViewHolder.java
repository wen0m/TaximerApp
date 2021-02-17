package ru.taximer.taxiandroid.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lru/taximer/taxiandroid/ui/adapters/SearchPlaceViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "root", "Landroid/view/View;", "(Landroid/view/View;)V", "listener", "Lru/taximer/taxiandroid/ui/adapters/OnPlaceHolderListener;", "getListener", "()Lru/taximer/taxiandroid/ui/adapters/OnPlaceHolderListener;", "setListener", "(Lru/taximer/taxiandroid/ui/adapters/OnPlaceHolderListener;)V", "model", "Lru/taximer/taxiandroid/network/models/PlacePredictionModel;", "getModel", "()Lru/taximer/taxiandroid/network/models/PlacePredictionModel;", "setModel", "(Lru/taximer/taxiandroid/network/models/PlacePredictionModel;)V", "placeAddress", "Landroid/widget/TextView;", "placeName", "bind", "", "Companion", "app_debug"})
public final class SearchPlaceViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
    private android.widget.TextView placeName;
    private android.widget.TextView placeAddress;
    @org.jetbrains.annotations.NotNull()
    private ru.taximer.taxiandroid.network.models.PlacePredictionModel model;
    @org.jetbrains.annotations.Nullable()
    private ru.taximer.taxiandroid.ui.adapters.OnPlaceHolderListener listener;
    public static final ru.taximer.taxiandroid.ui.adapters.SearchPlaceViewHolder.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.network.models.PlacePredictionModel getModel() {
        return null;
    }
    
    public final void setModel(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.PlacePredictionModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ru.taximer.taxiandroid.ui.adapters.OnPlaceHolderListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    ru.taximer.taxiandroid.ui.adapters.OnPlaceHolderListener p0) {
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.PlacePredictionModel model, @org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.ui.adapters.OnPlaceHolderListener listener) {
    }
    
    private SearchPlaceViewHolder(android.view.View root) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lru/taximer/taxiandroid/ui/adapters/SearchPlaceViewHolder$Companion;", "", "()V", "create", "Lru/taximer/taxiandroid/ui/adapters/SearchPlaceViewHolder;", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ru.taximer.taxiandroid.ui.adapters.SearchPlaceViewHolder create(@org.jetbrains.annotations.NotNull()
        android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}