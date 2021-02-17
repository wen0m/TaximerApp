package ru.taximer.taxiandroid.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fJ\u0006\u0010\u0012\u001a\u00020\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J8\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u0018\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0014H\u0016J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0014H\u0016J\b\u0010$\u001a\u00020\u0010H\u0016R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006%"}, d2 = {"Lru/taximer/taxiandroid/ui/adapters/TaxiAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lru/taximer/taxiandroid/ui/adapters/TaxiViewHolder;", "Lru/taximer/taxiandroid/ui/adapters/OnTaxiHolderListener;", "Lru/taximer/taxiandroid/ui/adapters/TaxiCallHolderListener;", "callback", "phoneback", "(Lru/taximer/taxiandroid/ui/adapters/OnTaxiHolderListener;Lru/taximer/taxiandroid/ui/adapters/TaxiCallHolderListener;)V", "getCallback", "()Lru/taximer/taxiandroid/ui/adapters/OnTaxiHolderListener;", "data", "Landroid/support/v7/util/SortedList;", "Lru/taximer/taxiandroid/network/models/SearchTaxiModel;", "getPhoneback", "()Lru/taximer/taxiandroid/ui/adapters/TaxiCallHolderListener;", "addItem", "", "item", "clear", "getItemCount", "", "onAppSelect", "type", "installUrl", "", "openUrl", "appId", "taxoparkId", "taxinameEng", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onPhoneCall", "app_debug"})
public final class TaxiAdapter extends android.support.v7.widget.RecyclerView.Adapter<ru.taximer.taxiandroid.ui.adapters.TaxiViewHolder> implements ru.taximer.taxiandroid.ui.adapters.OnTaxiHolderListener, ru.taximer.taxiandroid.ui.adapters.TaxiCallHolderListener {
    private final android.support.v7.util.SortedList<ru.taximer.taxiandroid.network.models.SearchTaxiModel> data = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.taximer.taxiandroid.ui.adapters.OnTaxiHolderListener callback = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.taximer.taxiandroid.ui.adapters.TaxiCallHolderListener phoneback = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.ui.adapters.TaxiViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.taximer.taxiandroid.ui.adapters.TaxiViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void addItem(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.network.models.SearchTaxiModel item) {
    }
    
    public final void clear() {
    }
    
    @java.lang.Override()
    public void onAppSelect(int type, @org.jetbrains.annotations.NotNull()
    java.lang.String installUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String openUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String appId, @org.jetbrains.annotations.NotNull()
    java.lang.String taxoparkId, @org.jetbrains.annotations.NotNull()
    java.lang.String taxinameEng) {
    }
    
    @java.lang.Override()
    public void onPhoneCall() {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.ui.adapters.OnTaxiHolderListener getCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.ui.adapters.TaxiCallHolderListener getPhoneback() {
        return null;
    }
    
    public TaxiAdapter(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.ui.adapters.OnTaxiHolderListener callback, @org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.ui.adapters.TaxiCallHolderListener phoneback) {
        super();
    }
}