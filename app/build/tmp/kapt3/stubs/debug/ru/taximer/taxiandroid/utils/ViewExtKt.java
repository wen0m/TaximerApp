package ru.taximer.taxiandroid.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000l\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\n\b\u0000\u0010\u0014\u0018\u0001*\u00020\u0015H\u0086\b\u001a\u001e\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00170\u0019\u001a(\u0010\u001b\u001a\u00020\u0017*\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\b\b\u0001\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u001a(\u0010 \u001a\u00020\u0017*\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\b\b\u0001\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u001a(\u0010!\u001a\u00020\u0017*\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\b\b\u0001\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u001a\n\u0010\"\u001a\u00020#*\u00020\u0007\u001a\n\u0010$\u001a\u00020\u0017*\u00020\u0007\u001a\u001c\u0010%\u001a\u00020\u0007*\u00020&2\u0006\u0010\'\u001a\u00020\u00012\b\b\u0002\u0010(\u001a\u00020\u0004\u001a\u001a\u0010)\u001a\u00020\u0017*\u00020*2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020-\u001a\u0014\u0010.\u001a\u00020\u0017*\u00020/2\b\u00100\u001a\u0004\u0018\u000101\u001a\u0014\u0010.\u001a\u00020\u0017*\u00020/2\b\b\u0001\u00102\u001a\u00020\u0001\u001a\u0014\u00103\u001a\u00020\u0017*\u00020/2\b\u00100\u001a\u0004\u0018\u000101\u001a\u0014\u00103\u001a\u00020\u0017*\u00020/2\b\b\u0001\u00102\u001a\u00020\u0001\u001a\u0014\u00104\u001a\u00020\u0017*\u00020/2\b\u00100\u001a\u0004\u0018\u000101\u001a\u0014\u00105\u001a\u00020\u0017*\u00020/2\b\u00100\u001a\u0004\u0018\u000101\u001a\u0014\u00105\u001a\u00020\u0017*\u00020/2\b\b\u0001\u00102\u001a\u00020\u0001\u001a\u0014\u00106\u001a\u00020\u0017*\u00020/2\b\u00100\u001a\u0004\u0018\u000101\u001a\u0014\u00107\u001a\u00020\u0017*\u00020/2\b\u00100\u001a\u0004\u0018\u000101\u001a\u0014\u00107\u001a\u00020\u0017*\u00020/2\b\b\u0001\u00102\u001a\u00020\u0001\u001a\u0012\u00108\u001a\u00020\u0017*\u00020\u00072\u0006\u00109\u001a\u00020#\u001a\u0014\u00108\u001a\u00020\u0017*\u00020\u00072\b\b\u0001\u0010:\u001a\u00020\u0001\u001a\n\u0010\f\u001a\u00020\u0017*\u00020\u0007\u001a\n\u0010\u000e\u001a\u00020\u0017*\u00020\u0007\u001a\u0014\u0010;\u001a\u00020\u0017*\u00020/2\b\b\u0001\u0010<\u001a\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0017*\u00020\u0007\u001a\n\u0010=\u001a\u00020\u0017*\u00020\u0007\u001a\n\u0010>\u001a\u00020\u0017*\u00020\u0007\u001a\n\u0010?\u001a\u00020\u0017*\u00020\u0007\u001a&\u0010@\u001a\u00020\u0017*\u00020\u00182\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00040\u00192\u0006\u0010B\u001a\u00020\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\"(\u0010\u0006\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n\"(\u0010\u000b\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n\"(\u0010\r\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n\"\u0015\u0010\u000f\u001a\u00020\u0004*\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\b\"(\u0010\u0010\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\n\u00a8\u0006C"}, d2 = {"MATCH_PARENT", "", "WRAP_CONTENT", "glideDebug", "", "value", "isDisabled", "Landroid/view/View;", "(Landroid/view/View;)Z", "setDisabled", "(Landroid/view/View;Z)V", "isGone", "setGone", "isInvisible", "setInvisible", "isNotVisible", "isVisible", "setVisible", "createParcel", "Landroid/os/Parcelable$Creator;", "T", "Landroid/os/Parcelable;", "afterTextChanged", "", "Landroid/widget/EditText;", "Lkotlin/Function1;", "", "displayFullImage", "Landroid/widget/ImageView;", "uri", "fallbackImageResId", "withBlur", "displayImage", "displayListImage", "getElevationCompat", "", "hideKeyboard", "inflate", "Landroid/view/ViewGroup;", "layoutId", "attachToRoot", "setCheckedSilently", "Landroid/widget/CompoundButton;", "isChecked", "listener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "setCompoundDrawableBottomCompat", "Landroid/widget/TextView;", "drawable", "Landroid/graphics/drawable/Drawable;", "resId", "setCompoundDrawableLeftCompat", "setCompoundDrawableLeftRetainCompat", "setCompoundDrawableRightCompat", "setCompoundDrawableRightRetainCompat", "setCompoundDrawableTopCompat", "setElevationCompat", "elevation", "elevationResId", "setTextAppearanceCompat", "styleRes", "showKeyboard", "toggleVisibility", "toggleVisibilityGone", "validate", "validator", "message", "app_debug"})
public final class ViewExtKt {
    public static final int MATCH_PARENT = -1;
    public static final int WRAP_CONTENT = -2;
    private static final boolean glideDebug = false;
    
    public static final void showKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver) {
    }
    
    public static final boolean isDisabled(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver) {
        return false;
    }
    
    public static final void setDisabled(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver, boolean value) {
    }
    
    public static final boolean isVisible(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver) {
        return false;
    }
    
    public static final void setVisible(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver, boolean value) {
    }
    
    public static final boolean isNotVisible(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver) {
        return false;
    }
    
    public static final void setVisible(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver) {
    }
    
    public static final boolean isInvisible(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver) {
        return false;
    }
    
    public static final void setInvisible(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver, boolean value) {
    }
    
    public static final void setInvisible(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver) {
    }
    
    public static final boolean isGone(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver) {
        return false;
    }
    
    public static final void setGone(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver, boolean value) {
    }
    
    public static final void setGone(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver) {
    }
    
    public static final void toggleVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver) {
    }
    
    public static final void toggleVisibilityGone(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver) {
    }
    
    public static final void setElevationCompat(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver, @android.support.annotation.DimenRes()
    int elevationResId) {
    }
    
    public static final void setElevationCompat(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver, float elevation) {
    }
    
    public static final float getElevationCompat(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver) {
        return 0.0F;
    }
    
    public static final void setTextAppearanceCompat(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @android.support.annotation.StyleRes()
    int styleRes) {
    }
    
    public static final void setCompoundDrawableLeftCompat(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @android.support.annotation.DrawableRes()
    int resId) {
    }
    
    public static final void setCompoundDrawableLeftCompat(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
    }
    
    public static final void setCompoundDrawableLeftRetainCompat(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
    }
    
    public static final void setCompoundDrawableTopCompat(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @android.support.annotation.DrawableRes()
    int resId) {
    }
    
    public static final void setCompoundDrawableTopCompat(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
    }
    
    public static final void setCompoundDrawableRightCompat(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @android.support.annotation.DrawableRes()
    int resId) {
    }
    
    public static final void setCompoundDrawableRightCompat(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
    }
    
    public static final void setCompoundDrawableRightRetainCompat(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
    }
    
    public static final void setCompoundDrawableBottomCompat(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @android.support.annotation.DrawableRes()
    int resId) {
    }
    
    public static final void setCompoundDrawableBottomCompat(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
    }
    
    public static final void displayImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String uri, @android.support.annotation.DrawableRes()
    int fallbackImageResId, boolean withBlur) {
    }
    
    public static final void displayListImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String uri, @android.support.annotation.DrawableRes()
    int fallbackImageResId, boolean withBlur) {
    }
    
    public static final void displayFullImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String uri, @android.support.annotation.DrawableRes()
    int fallbackImageResId, boolean withBlur) {
    }
    
    public static final void setCheckedSilently(@org.jetbrains.annotations.NotNull()
    android.widget.CompoundButton $receiver, boolean isChecked, @org.jetbrains.annotations.NotNull()
    android.widget.CompoundButton.OnCheckedChangeListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.view.View inflate(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup $receiver, int layoutId, boolean attachToRoot) {
        return null;
    }
    
    public static final void afterTextChanged(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> afterTextChanged) {
    }
    
    public static final void validate(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> validator, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private static final <T extends android.os.Parcelable>android.os.Parcelable.Creator<T> createParcel() {
        return null;
    }
}