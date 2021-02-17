package ru.taximer.taxiandroid.network.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\nH\u00c6\u0003JF\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\bH\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\""}, d2 = {"Lru/taximer/taxiandroid/network/models/BaseResponseModel;", "T", "", "result", "errors", "", "Lru/taximer/taxiandroid/network/models/ErrorModel;", "warnings", "", "success", "", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Z)V", "getErrors", "()Ljava/util/List;", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSuccess", "()Z", "getWarnings", "()Ljava/lang/String;", "setWarnings", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Z)Lru/taximer/taxiandroid/network/models/BaseResponseModel;", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class BaseResponseModel<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    private final T result = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ru.taximer.taxiandroid.network.models.ErrorModel> errors = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String warnings;
    private final boolean success = false;
    
    @org.jetbrains.annotations.Nullable()
    public final T getResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ru.taximer.taxiandroid.network.models.ErrorModel> getErrors() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWarnings() {
        return null;
    }
    
    public final void setWarnings(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getSuccess() {
        return false;
    }
    
    public BaseResponseModel(@org.jetbrains.annotations.Nullable()
    T result, @org.jetbrains.annotations.NotNull()
    java.util.List<ru.taximer.taxiandroid.network.models.ErrorModel> errors, @org.jetbrains.annotations.Nullable()
    java.lang.String warnings, boolean success) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ru.taximer.taxiandroid.network.models.ErrorModel> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.network.models.BaseResponseModel<T> copy(@org.jetbrains.annotations.Nullable()
    T result, @org.jetbrains.annotations.NotNull()
    java.util.List<ru.taximer.taxiandroid.network.models.ErrorModel> errors, @org.jetbrains.annotations.Nullable()
    java.lang.String warnings, boolean success) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}