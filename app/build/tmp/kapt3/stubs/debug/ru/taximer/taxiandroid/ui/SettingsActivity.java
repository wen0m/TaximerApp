package ru.taximer.taxiandroid.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\bH\u0007J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0016J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016J\b\u0010!\u001a\u00020\u000eH\u0016J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006&"}, d2 = {"Lru/taximer/taxiandroid/ui/SettingsActivity;", "Lcom/arellomobile/mvp/MvpAppCompatActivity;", "Lru/taximer/taxiandroid/presenters/SettingsView;", "Landroid/view/View$OnClickListener;", "()V", "mFirebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "presenter", "Lru/taximer/taxiandroid/presenters/SettingsPresenter;", "getPresenter", "()Lru/taximer/taxiandroid/presenters/SettingsPresenter;", "setPresenter", "(Lru/taximer/taxiandroid/presenters/SettingsPresenter;)V", "initUI", "", "onClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "provideSettingsPresenter", "setBuisnes", "setComfort", "setEconomy", "setIsCAsh", "value", "setIsCard", "setIsChild", "setMiniven", "showError", "message", "", "Companion", "app_debug"})
public final class SettingsActivity extends com.arellomobile.mvp.MvpAppCompatActivity implements ru.taximer.taxiandroid.presenters.SettingsView, android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter(type = com.arellomobile.mvp.presenter.PresenterType.LOCAL)
    public ru.taximer.taxiandroid.presenters.SettingsPresenter presenter;
    private com.google.firebase.analytics.FirebaseAnalytics mFirebaseAnalytics;
    public static final ru.taximer.taxiandroid.ui.SettingsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.presenters.SettingsPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.presenters.SettingsPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.ProvidePresenter(type = com.arellomobile.mvp.presenter.PresenterType.LOCAL)
    public final ru.taximer.taxiandroid.presenters.SettingsPresenter provideSettingsPresenter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUI() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void setBuisnes() {
    }
    
    @java.lang.Override()
    public void setComfort() {
    }
    
    @java.lang.Override()
    public void setEconomy() {
    }
    
    @java.lang.Override()
    public void setMiniven() {
    }
    
    @java.lang.Override()
    public void setIsChild(boolean value) {
    }
    
    @java.lang.Override()
    public void setIsCAsh(boolean value) {
    }
    
    @java.lang.Override()
    public void setIsCard(boolean value) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public SettingsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lru/taximer/taxiandroid/ui/SettingsActivity$Companion;", "", "()V", "launch", "", "context", "Landroid/app/Activity;", "app_debug"})
    public static final class Companion {
        
        public final void launch(@org.jetbrains.annotations.NotNull()
        android.app.Activity context) {
        }
        
        private Companion() {
            super();
        }
    }
}