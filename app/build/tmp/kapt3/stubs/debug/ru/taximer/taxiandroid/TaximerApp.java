package ru.taximer.taxiandroid;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016\u00a8\u0006\u000b"}, d2 = {"Lru/taximer/taxiandroid/TaximerApp;", "Landroid/support/multidex/MultiDexApplication;", "()V", "attachBaseContext", "", "context", "Landroid/content/Context;", "initDagger", "onCreate", "onLowMemory", "Companion", "app_debug"})
public final class TaximerApp extends android.support.multidex.MultiDexApplication {
    private static ru.taximer.taxiandroid.di.AppModule _appModule;
    private static final kotlin.Lazy _appComponent$delegate = null;
    public static final ru.taximer.taxiandroid.TaximerApp.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onLowMemory() {
    }
    
    private final void initDagger() {
    }
    
    public TaximerApp() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final ru.taximer.taxiandroid.di.TaxiAppComponent getAppComponent() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u00048FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0006R\u0011\u0010\u000e\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lru/taximer/taxiandroid/TaximerApp$Companion;", "", "()V", "_appComponent", "Lru/taximer/taxiandroid/di/TaxiAppComponent;", "get_appComponent", "()Lru/taximer/taxiandroid/di/TaxiAppComponent;", "_appComponent$delegate", "Lkotlin/Lazy;", "_appModule", "Lru/taximer/taxiandroid/di/AppModule;", "appComponent", "appComponent$annotations", "getAppComponent", "appModule", "getAppModule", "()Lru/taximer/taxiandroid/di/AppModule;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ru.taximer.taxiandroid.di.AppModule getAppModule() {
            return null;
        }
        
        private final ru.taximer.taxiandroid.di.TaxiAppComponent get_appComponent() {
            return null;
        }
        
        public static void appComponent$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.taximer.taxiandroid.di.TaxiAppComponent getAppComponent() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}