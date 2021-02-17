package ru.taximer.taxiandroid.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000p\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010=\u001a\u00020\u0001*\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0015\u0010\u000e\u001a\u00020\u000f*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0012\u001a\u00020\u0013*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u0016\u001a\u00020\u0017*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0015\u0010\u001a\u001a\u00020\u001b*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0015\u0010\u001e\u001a\u00020\u0017*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019\"\u0015\u0010\u001e\u001a\u00020\u0017*\u00020\u001f8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010 \"\u0015\u0010!\u001a\u00020\u0017*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0019\"\u0015\u0010\"\u001a\u00020\u0017*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0019\"\u0015\u0010\"\u001a\u00020\u0017*\u00020\u001f8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010 \"\u0015\u0010#\u001a\u00020\u0017*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u0019\"\u0015\u0010#\u001a\u00020\u0017*\u00020\u001f8F\u00a2\u0006\u0006\u001a\u0004\b#\u0010 \"\u0015\u0010$\u001a\u00020\u0017*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u0019\"\u0015\u0010$\u001a\u00020\u0017*\u00020\u001f8F\u00a2\u0006\u0006\u001a\u0004\b$\u0010 \"\u0015\u0010%\u001a\u00020&*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(\"\u0015\u0010)\u001a\u00020**\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b+\u0010,\"\u0015\u0010-\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u0005\"\u0015\u0010/\u001a\u000200*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b1\u00102\"\u0015\u00103\u001a\u000204*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b5\u00106\"\u0015\u00107\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b8\u0010\u0005\"\u0015\u00109\u001a\u00020:*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b;\u0010<\u00a8\u0006>"}, d2 = {"TABLET_SMALLEST_WIDTH", "", "actionBarHeight", "Landroid/content/Context;", "getActionBarHeight", "(Landroid/content/Context;)I", "alarmManager", "Landroid/app/AlarmManager;", "getAlarmManager", "(Landroid/content/Context;)Landroid/app/AlarmManager;", "clipboardManager", "Landroid/content/ClipboardManager;", "getClipboardManager", "(Landroid/content/Context;)Landroid/content/ClipboardManager;", "connectivityManager", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "(Landroid/content/Context;)Landroid/net/ConnectivityManager;", "downloadManager", "Landroid/app/DownloadManager;", "getDownloadManager", "(Landroid/content/Context;)Landroid/app/DownloadManager;", "hasSoftwareNavBar", "", "getHasSoftwareNavBar", "(Landroid/content/Context;)Z", "inputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "getInputMethodManager", "(Landroid/content/Context;)Landroid/view/inputmethod/InputMethodManager;", "isLandscape", "Landroid/content/res/Configuration;", "(Landroid/content/res/Configuration;)Z", "isNetworkAvailable", "isPhone", "isPortrait", "isTablet", "keyguardManager", "Landroid/app/KeyguardManager;", "getKeyguardManager", "(Landroid/content/Context;)Landroid/app/KeyguardManager;", "layoutInflater", "Landroid/view/LayoutInflater;", "getLayoutInflater", "(Landroid/content/Context;)Landroid/view/LayoutInflater;", "navBarHeight", "getNavBarHeight", "notificationManager", "Landroid/support/v4/app/NotificationManagerCompat;", "getNotificationManager", "(Landroid/content/Context;)Landroid/support/v4/app/NotificationManagerCompat;", "powerManager", "Landroid/os/PowerManager;", "getPowerManager", "(Landroid/content/Context;)Landroid/os/PowerManager;", "statusBarHeight", "getStatusBarHeight", "vibrator", "Landroid/os/Vibrator;", "getVibrator", "(Landroid/content/Context;)Landroid/os/Vibrator;", "isFirstInstall", "app_debug"})
public final class ContextExtKt {
    private static final int TABLET_SMALLEST_WIDTH = 600;
    
    public static final boolean getHasSoftwareNavBar(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return false;
    }
    
    public static final int getStatusBarHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return 0;
    }
    
    public static final int getActionBarHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return 0;
    }
    
    public static final int getNavBarHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return 0;
    }
    
    public static final boolean isPhone(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return false;
    }
    
    public static final boolean isPhone(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration $receiver) {
        return false;
    }
    
    public static final boolean isTablet(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return false;
    }
    
    public static final boolean isTablet(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration $receiver) {
        return false;
    }
    
    public static final boolean isPortrait(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return false;
    }
    
    public static final boolean isPortrait(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration $receiver) {
        return false;
    }
    
    public static final boolean isLandscape(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return false;
    }
    
    public static final boolean isLandscape(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration $receiver) {
        return false;
    }
    
    public static final boolean isNetworkAvailable(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.view.LayoutInflater getLayoutInflater(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.net.ConnectivityManager getConnectivityManager(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.view.inputmethod.InputMethodManager getInputMethodManager(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.app.AlarmManager getAlarmManager(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.support.v4.app.NotificationManagerCompat getNotificationManager(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.os.Vibrator getVibrator(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.app.DownloadManager getDownloadManager(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.ClipboardManager getClipboardManager(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.os.PowerManager getPowerManager(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.app.KeyguardManager getKeyguardManager(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return null;
    }
    
    public static final int isFirstInstall(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return 0;
    }
}