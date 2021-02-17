package ru.taximer.taxiandroid.utils.gms;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lru/taximer/taxiandroid/utils/gms/GoogleApiPartialCallbacks;", "", "onGoogleApiClientConnected", "", "onGoogleApiClientConnectionFailed", "onGoogleApiClientConnectionSuspended", "cause", "", "onGoogleApiClientErrorResolved", "app_debug"})
public abstract interface GoogleApiPartialCallbacks {
    
    public abstract void onGoogleApiClientConnected();
    
    public abstract void onGoogleApiClientConnectionSuspended(int cause);
    
    public abstract void onGoogleApiClientConnectionFailed();
    
    public abstract void onGoogleApiClientErrorResolved();
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        public static void onGoogleApiClientConnected(ru.taximer.taxiandroid.utils.gms.GoogleApiPartialCallbacks $this) {
        }
        
        public static void onGoogleApiClientConnectionSuspended(ru.taximer.taxiandroid.utils.gms.GoogleApiPartialCallbacks $this, int cause) {
        }
        
        public static void onGoogleApiClientConnectionFailed(ru.taximer.taxiandroid.utils.gms.GoogleApiPartialCallbacks $this) {
        }
    }
}