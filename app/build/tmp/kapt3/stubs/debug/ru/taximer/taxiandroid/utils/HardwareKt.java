package ru.taximer.taxiandroid.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a&\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r\u001a\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u000e\u0010\u0012\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n\u001a\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016\u001a\u0016\u0010\u0017\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016\"\u001b\u0010\u0000\u001a\u00020\u00018FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0000\u0010\u0002\"\u001b\u0010\u0005\u001a\u00020\u00018FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0004\u001a\u0004\b\u0005\u0010\u0002\u00a8\u0006\u0018"}, d2 = {"is32bitArch", "", "()Z", "is32bitArch$delegate", "Lkotlin/Lazy;", "is64bitArch", "is64bitArch$delegate", "getActionBarHeight", "", "context", "Landroid/content/Context;", "getIntResource", "name", "", "defType", "defPackage", "getNavigationBarHeight", "getStatusBarHeight", "hasSoftwareNavBar", "hideKeyboard", "", "view", "Landroid/view/View;", "showKeyboard", "app_debug"})
public final class HardwareKt {
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy is32bitArch$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy is64bitArch$delegate = null;
    
    public static final boolean is32bitArch() {
        return false;
    }
    
    public static final boolean is64bitArch() {
        return false;
    }
    
    public static final boolean hasSoftwareNavBar(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public static final int getStatusBarHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    public static final int getActionBarHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    public static final int getNavigationBarHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    public static final int getIntResource(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String defType, @org.jetbrains.annotations.NotNull()
    java.lang.String defPackage) {
        return 0;
    }
    
    public static final void showKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
}