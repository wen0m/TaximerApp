package ru.taximer.taxiandroid.presenters.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016\u00a8\u0006\u000e"}, d2 = {"Lru/taximer/taxiandroid/presenters/base/BaseRxPresenter;", "Model", "View", "Lru/taximer/taxiandroid/presenters/base/BaseLoadingView;", "Lcom/arellomobile/mvp/MvpPresenter;", "Lorg/reactivestreams/Subscriber;", "()V", "onError", "", "t", "", "onSubscribe", "s", "Lorg/reactivestreams/Subscription;", "app_debug"})
public abstract class BaseRxPresenter<Model extends java.lang.Object, View extends ru.taximer.taxiandroid.presenters.base.BaseLoadingView> extends com.arellomobile.mvp.MvpPresenter<View> implements org.reactivestreams.Subscriber<Model> {
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
    }
    
    @java.lang.Override()
    public void onSubscribe(@org.jetbrains.annotations.Nullable()
    org.reactivestreams.Subscription s) {
    }
    
    public BaseRxPresenter() {
        super();
    }
}