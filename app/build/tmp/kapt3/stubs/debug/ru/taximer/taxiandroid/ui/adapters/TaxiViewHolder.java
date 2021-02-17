package ru.taximer.taxiandroid.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 .2\u00020\u0001:\u0001.B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010,\u001a\u00020-2\u0006\u0010&\u001a\u00020\'2\u0006\u0010 \u001a\u00020!R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u0006/"}, d2 = {"Lru/taximer/taxiandroid/ui/adapters/TaxiViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "root", "Landroid/view/View;", "(Landroid/view/View;)V", "appIcon", "Lcom/makeramen/roundedimageview/RoundedImageView;", "getAppIcon", "()Lcom/makeramen/roundedimageview/RoundedImageView;", "setAppIcon", "(Lcom/makeramen/roundedimageview/RoundedImageView;)V", "appLabel", "Landroid/widget/TextView;", "getAppLabel", "()Landroid/widget/TextView;", "setAppLabel", "(Landroid/widget/TextView;)V", "appName", "getAppName", "setAppName", "appTime", "getAppTime", "setAppTime", "appValue", "getAppValue", "setAppValue", "goAppIcon", "getGoAppIcon", "setGoAppIcon", "goCallIcon", "getGoCallIcon", "setGoCallIcon", "listener", "Lru/taximer/taxiandroid/ui/adapters/OnTaxiHolderListener;", "getListener", "()Lru/taximer/taxiandroid/ui/adapters/OnTaxiHolderListener;", "setListener", "(Lru/taximer/taxiandroid/ui/adapters/OnTaxiHolderListener;)V", "model", "Lru/taximer/taxiandroid/network/models/SearchTaxiModel;", "getModel", "()Lru/taximer/taxiandroid/network/models/SearchTaxiModel;", "setModel", "(Lru/taximer/taxiandroid/network/models/SearchTaxiModel;)V", "bind", "", "Companion", "app_debug"})
public final class TaxiViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    private com.makeramen.roundedimageview.RoundedImageView appIcon;
    @org.jetbrains.annotations.NotNull()
    private com.makeramen.roundedimageview.RoundedImageView goAppIcon;
    @org.jetbrains.annotations.NotNull()
    private com.makeramen.roundedimageview.RoundedImageView goCallIcon;
    @org.jetbrains.annotations.NotNull()
    private android.widget.TextView appName;
    @org.jetbrains.annotations.NotNull()
    private android.widget.TextView appValue;
    @org.jetbrains.annotations.NotNull()
    private android.widget.TextView appLabel;
    @org.jetbrains.annotations.NotNull()
    private android.widget.TextView appTime;
    @org.jetbrains.annotations.Nullable()
    private ru.taximer.taxiandroid.network.models.SearchTaxiModel model;
    @org.jetbrains.annotations.Nullable()
    private ru.taximer.taxiandroid.ui.adapters.OnTaxiHolderListener listener;
    public static final ru.taximer.taxiandroid.ui.adapters.TaxiViewHolder.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.makeramen.roundedimageview.RoundedImageView getAppIcon() {
        return null;
    }
    
    public final void setAppIcon(@org.jetbrains.annotations.NotNull()
    com.makeramen.roundedimageview.RoundedImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.makeramen.roundedimageview.RoundedImageView getGoAppIcon() {
        return null;
    }
    
    public final void setGoAppIcon(@org.jetbrains.annotations.NotNull()
    com.makeramen.roundedimageview.RoundedImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.makeramen.roundedimageview.RoundedImageView getGoCallIcon() {
        return null;
    }
    
    public final void setGoCallIcon(@org.jetbrains.annotations.NotNull()
    com.makeramen.roundedimageview.RoundedImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getAppName() {
        return null;
    }
    
    public final void setAppName(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getAppValue() {
        return null;
    }
    
    public final void setAppValue(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getAppLabel() {
        return null;
    }
    
    public final void setAppLabel(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getAppTime() {
        return null;
    }
    
    public final void setAppTime(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ru.taximer.taxiandroid.network.models.SearchTaxiModel getModel() {
        return null;
    }
    
    public final void setModel(@org.jetbrains.annotations.Nullable()
    ru.taximer.taxiandroid.network.models.SearchTaxiModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ru.taximer.taxiandroid.ui.adapters.OnTaxiHolderListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    ru.taximer.taxiandroid.ui.adapters.OnTaxiHolderListener p0) {
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.SearchTaxiModel model, @org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.ui.adapters.OnTaxiHolderListener listener) {
    }
    
    private TaxiViewHolder(android.view.View root) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lru/taximer/taxiandroid/ui/adapters/TaxiViewHolder$Companion;", "", "()V", "create", "Lru/taximer/taxiandroid/ui/adapters/TaxiViewHolder;", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ru.taximer.taxiandroid.ui.adapters.TaxiViewHolder create(@org.jetbrains.annotations.NotNull()
        android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}