package ru.taximer.taxiandroid.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lru/taximer/taxiandroid/di/BaseEndpointsModule;", "", "()V", "provideBaseEndpoints", "Lru/taximer/taxiandroid/network/TaxiApi;", "okHttpClient", "Lokhttp3/OkHttpClient;", "converterFactory", "Lretrofit2/Converter$Factory;", "callAdapterFactory", "Lretrofit2/CallAdapter$Factory;", "changeURl", "", "app_debug"})
@dagger.Module()
public final class BaseEndpointsModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final ru.taximer.taxiandroid.network.TaxiApi provideBaseEndpoints(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    retrofit2.Converter.Factory converterFactory, @org.jetbrains.annotations.NotNull()
    retrofit2.CallAdapter.Factory callAdapterFactory, @org.jetbrains.annotations.NotNull()
    java.lang.String changeURl) {
        return null;
    }
    
    public BaseEndpointsModule() {
        super();
    }
}