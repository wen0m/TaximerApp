package ru.taximer.taxiandroid.ui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 +2\u00020\u0001:\u0002+,B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010\'\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u000e\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012\u00a8\u0006-"}, d2 = {"Lru/taximer/taxiandroid/ui/dialogs/OrderTaxiDialog;", "Landroid/app/DialogFragment;", "()V", "ARG_DESC", "", "getARG_DESC", "()Ljava/lang/String;", "callDriverBtn", "Landroid/widget/Button;", "getCallDriverBtn", "()Landroid/widget/Button;", "setCallDriverBtn", "(Landroid/widget/Button;)V", "cancelBtn", "Landroid/widget/TextView;", "getCancelBtn", "()Landroid/widget/TextView;", "setCancelBtn", "(Landroid/widget/TextView;)V", "description", "getDescription", "setDescription", "descriptionText", "getDescriptionText", "setDescriptionText", "(Ljava/lang/String;)V", "taxiIcon", "Landroid/widget/ImageView;", "getTaxiIcon", "()Landroid/widget/ImageView;", "setTaxiIcon", "(Landroid/widget/ImageView;)V", "taxiName", "getTaxiName", "setTaxiName", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "refreshDescriptionText", "desc", "Companion", "GetOrder", "app_debug"})
public final class OrderTaxiDialog extends android.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ARG_DESC = "Dialog.DESCRIPTION";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String descriptionText;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageView taxiIcon;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView taxiName;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView description;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button callDriverBtn;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView cancelBtn;
    public static final ru.taximer.taxiandroid.ui.dialogs.OrderTaxiDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getARG_DESC() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescriptionText() {
        return null;
    }
    
    public final void setDescriptionText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageView getTaxiIcon() {
        return null;
    }
    
    public final void setTaxiIcon(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getTaxiName() {
        return null;
    }
    
    public final void setTaxiName(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getCallDriverBtn() {
        return null;
    }
    
    public final void setCallDriverBtn(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getCancelBtn() {
        return null;
    }
    
    public final void setCancelBtn(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void refreshDescriptionText(@org.jetbrains.annotations.NotNull()
    java.lang.String desc) {
    }
    
    public OrderTaxiDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lru/taximer/taxiandroid/ui/dialogs/OrderTaxiDialog$GetOrder;", "", "getOrder", "", "onCancel", "app_debug"})
    public static abstract interface GetOrder {
        
        public abstract void getOrder();
        
        public abstract void onCancel();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lru/taximer/taxiandroid/ui/dialogs/OrderTaxiDialog$Companion;", "", "()V", "newInstance", "Lru/taximer/taxiandroid/ui/dialogs/OrderTaxiDialog;", "content", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ru.taximer.taxiandroid.ui.dialogs.OrderTaxiDialog newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String content) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}