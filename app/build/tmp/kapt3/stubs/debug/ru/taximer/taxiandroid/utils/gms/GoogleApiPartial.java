package ru.taximer.taxiandroid.utils.gms;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000*\f\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\u00020\u00042\u00020\u0005:\u00011B9\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\"\u0010\t\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\n\"\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0012\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010\'\u001a\u00020(H\u0016J\u0006\u0010)\u001a\u00020\u001fJ\u0006\u0010*\u001a\u00020\u001fJ\u0010\u0010+\u001a\u00020\u001f2\b\u0010,\u001a\u0004\u0018\u00010\"J\u000e\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\"J\u0006\u0010/\u001a\u00020\u001fJ\u0006\u00100\u001a\u00020\u001fR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013@BX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u000e\u0010\u001d\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lru/taximer/taxiandroid/utils/gms/GoogleApiPartial;", "Act", "Landroid/support/v7/app/AppCompatActivity;", "Lru/taximer/taxiandroid/utils/gms/GoogleApiPartialActivityCallbacks;", "Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;", "Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;", "activity", "callbacks", "Lru/taximer/taxiandroid/utils/gms/GoogleApiPartialCallbacks;", "apis", "", "Lcom/google/android/gms/common/api/Api;", "Lcom/google/android/gms/common/api/Api$ApiOptions$NotRequiredOptions;", "(Landroid/support/v7/app/AppCompatActivity;Lru/taximer/taxiandroid/utils/gms/GoogleApiPartialCallbacks;[Lcom/google/android/gms/common/api/Api;)V", "OUT_STATE_RESOLVING_ERROR", "", "TAG_DIALOG_ERROR", "Ljava/lang/ref/WeakReference;", "<set-?>", "Lcom/google/android/gms/common/api/GoogleApiClient;", "googleApiClient", "getGoogleApiClient$app_debug", "()Lcom/google/android/gms/common/api/GoogleApiClient;", "setGoogleApiClient", "(Lcom/google/android/gms/common/api/GoogleApiClient;)V", "isConnected", "", "()Z", "isConnecting", "isResolvingError", "destroy", "", "onConnected", "p0", "Landroid/os/Bundle;", "onConnectionFailed", "result", "Lcom/google/android/gms/common/ConnectionResult;", "onConnectionSuspended", "cause", "", "onErrorResolved", "reconnect", "restoreState", "savedState", "saveState", "outState", "start", "stop", "ErrorDialogFragment", "app_debug"})
public final class GoogleApiPartial<Act extends android.support.v7.app.AppCompatActivity & ru.taximer.taxiandroid.utils.gms.GoogleApiPartialActivityCallbacks> implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    private final java.lang.String OUT_STATE_RESOLVING_ERROR = "RESOLVING_ERROR_OUT_STATE";
    private final java.lang.String TAG_DIALOG_ERROR = "google_api_client_error_dialog_tag";
    private final java.lang.ref.WeakReference<android.support.v7.app.AppCompatActivity> activity = null;
    private final java.lang.ref.WeakReference<ru.taximer.taxiandroid.utils.gms.GoogleApiPartialCallbacks> callbacks = null;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.common.api.GoogleApiClient googleApiClient;
    private boolean isResolvingError;
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.common.api.GoogleApiClient getGoogleApiClient$app_debug() {
        return null;
    }
    
    private final void setGoogleApiClient(com.google.android.gms.common.api.GoogleApiClient p0) {
    }
    
    public final void restoreState(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedState) {
    }
    
    public final void start() {
    }
    
    public final void saveState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    public final void reconnect() {
    }
    
    public final void stop() {
    }
    
    public final void onErrorResolved() {
    }
    
    public final void destroy() {
    }
    
    public final boolean isConnected() {
        return false;
    }
    
    public final boolean isConnecting() {
        return false;
    }
    
    @java.lang.Override()
    public void onConnected(@org.jetbrains.annotations.Nullable()
    android.os.Bundle p0) {
    }
    
    @java.lang.Override()
    public void onConnectionSuspended(int cause) {
    }
    
    @java.lang.Override()
    public void onConnectionFailed(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.common.ConnectionResult result) {
    }
    
    public GoogleApiPartial(@org.jetbrains.annotations.NotNull()
    Act activity, @org.jetbrains.annotations.NotNull()
    ru.taximer.taxiandroid.utils.gms.GoogleApiPartialCallbacks callbacks, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.common.api.Api<? extends com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions>... apis) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lru/taximer/taxiandroid/utils/gms/GoogleApiPartial$ErrorDialogFragment;", "Landroid/support/v7/app/AppCompatDialogFragment;", "()V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "", "dialog", "Landroid/content/DialogInterface;", "app_debug"})
    public static final class ErrorDialogFragment extends android.support.v7.app.AppCompatDialogFragment {
        private java.util.HashMap _$_findViewCache;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState) {
            return null;
        }
        
        @java.lang.Override()
        public void onDismiss(@org.jetbrains.annotations.Nullable()
        android.content.DialogInterface dialog) {
        }
        
        public ErrorDialogFragment() {
            super();
        }
    }
}