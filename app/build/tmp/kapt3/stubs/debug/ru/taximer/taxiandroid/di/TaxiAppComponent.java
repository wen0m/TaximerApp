package ru.taximer.taxiandroid.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lru/taximer/taxiandroid/di/TaxiAppComponent;", "", "appContext", "Landroid/content/Context;", "baseEndpoints", "Lru/taximer/taxiandroid/network/TaxiApi;", "baseUsecases", "Lru/taximer/taxiandroid/network/usecases/BaseUsecases;", "app_debug"})
@dagger.Component(modules = {ru.taximer.taxiandroid.di.AppModule.class, ru.taximer.taxiandroid.di.NetModule.class, ru.taximer.taxiandroid.di.BaseEndpointsModule.class, ru.taximer.taxiandroid.di.BaseUsecasesModule.class})
@javax.inject.Singleton()
public abstract interface TaxiAppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context appContext();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.taximer.taxiandroid.network.TaxiApi baseEndpoints();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.taximer.taxiandroid.network.usecases.BaseUsecases baseUsecases();
}