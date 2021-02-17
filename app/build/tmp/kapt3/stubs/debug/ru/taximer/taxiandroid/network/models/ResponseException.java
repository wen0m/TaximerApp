package ru.taximer.taxiandroid.network.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lru/taximer/taxiandroid/network/models/ResponseException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "errorModel", "Lru/taximer/taxiandroid/network/models/ErrorModel;", "(Lru/taximer/taxiandroid/network/models/ErrorModel;)V", "getErrorModel", "()Lru/taximer/taxiandroid/network/models/ErrorModel;", "getLocalizedMessage", "", "app_debug"})
public final class ResponseException extends java.lang.RuntimeException {
    @org.jetbrains.annotations.Nullable()
    private final ru.taximer.taxiandroid.network.models.ErrorModel errorModel = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getLocalizedMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ru.taximer.taxiandroid.network.models.ErrorModel getErrorModel() {
        return null;
    }
    
    public ResponseException(@org.jetbrains.annotations.Nullable()
    ru.taximer.taxiandroid.network.models.ErrorModel errorModel) {
        super();
    }
}