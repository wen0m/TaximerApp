package ru.taximer.taxiandroid.network.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u001b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001c\u0010%\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b\'\u0010\bR\u001c\u0010(\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001a\u0010+\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010\u000eR\u001a\u0010.\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\f\"\u0004\b0\u0010\u000e\u00a8\u00061"}, d2 = {"Lru/taximer/taxiandroid/network/models/AvailableTaxiResult;", "", "()V", "about", "", "getAbout", "()Ljava/lang/String;", "setAbout", "(Ljava/lang/String;)V", "average_wait_time", "", "getAverage_wait_time", "()I", "setAverage_wait_time", "(I)V", "id", "getId", "setId", "img_url", "getImg_url", "setImg_url", "isHas_carsharing", "", "()Z", "setHas_carsharing", "(Z)V", "isHas_child", "setHas_child", "isHas_taxi", "setHas_taxi", "isPay_card", "setPay_card", "isPay_card_driver", "setPay_card_driver", "name", "getName", "setName", "name_en", "getName_en", "setName_en", "phone_number", "getPhone_number", "setPhone_number", "rating", "getRating", "setRating", "status", "getStatus", "setStatus", "app_debug"})
public final class AvailableTaxiResult {
    private int id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name_en;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String about;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String phone_number;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String img_url;
    private int rating;
    private int status;
    private boolean isHas_taxi;
    private boolean isHas_carsharing;
    private boolean isHas_child;
    private boolean isPay_card;
    private boolean isPay_card_driver;
    private int average_wait_time;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName_en() {
        return null;
    }
    
    public final void setName_en(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAbout() {
        return null;
    }
    
    public final void setAbout(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhone_number() {
        return null;
    }
    
    public final void setPhone_number(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImg_url() {
        return null;
    }
    
    public final void setImg_url(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getRating() {
        return 0;
    }
    
    public final void setRating(int p0) {
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public final void setStatus(int p0) {
    }
    
    public final boolean isHas_taxi() {
        return false;
    }
    
    public final void setHas_taxi(boolean p0) {
    }
    
    public final boolean isHas_carsharing() {
        return false;
    }
    
    public final void setHas_carsharing(boolean p0) {
    }
    
    public final boolean isHas_child() {
        return false;
    }
    
    public final void setHas_child(boolean p0) {
    }
    
    public final boolean isPay_card() {
        return false;
    }
    
    public final void setPay_card(boolean p0) {
    }
    
    public final boolean isPay_card_driver() {
        return false;
    }
    
    public final void setPay_card_driver(boolean p0) {
    }
    
    public final int getAverage_wait_time() {
        return 0;
    }
    
    public final void setAverage_wait_time(int p0) {
    }
    
    public AvailableTaxiResult() {
        super();
    }
}