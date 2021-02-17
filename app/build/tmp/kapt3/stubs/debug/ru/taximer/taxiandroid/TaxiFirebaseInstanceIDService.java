package ru.taximer.taxiandroid;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lru/taximer/taxiandroid/TaxiFirebaseInstanceIDService;", "Lcom/google/firebase/iid/FirebaseInstanceIdService;", "()V", "usecases", "Lru/taximer/taxiandroid/network/usecases/UserUsecases;", "getUsecases", "()Lru/taximer/taxiandroid/network/usecases/UserUsecases;", "onTokenRefresh", "", "app_debug"})
public final class TaxiFirebaseInstanceIDService extends com.google.firebase.iid.FirebaseInstanceIdService {
    @org.jetbrains.annotations.NotNull()
    private final ru.taximer.taxiandroid.network.usecases.UserUsecases usecases = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.taximer.taxiandroid.network.usecases.UserUsecases getUsecases() {
        return null;
    }
    
    @java.lang.Override()
    public void onTokenRefresh() {
    }
    
    public TaxiFirebaseInstanceIDService() {
        super();
    }
}