package ru.taximer.taxiandroid.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0003\u001a\u00020\u0006\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0003\u001a\u00020\u0006\u001a$\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\u000b\u001a\u0018\u0010\r\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u000b\u001a\u0018\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u000b\u001a=\u0010\u000f\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0010*\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u00100\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u00100\u0014\u00a2\u0006\u0002\u0010\u0015\u001a\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\n0\u0017\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0002\u001a\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\n0\u0017\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0005\u001a\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\n0\u0017\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0007\u001a\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\n0\u0017\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\b\u001a\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\n0\b\"\u0004\b\u0000\u0010\n*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\n0\u0019\u001a\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\n0\u0007\"\u0004\b\u0000\u0010\n*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\n0\u0019\u001a\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u0005\"\u0004\b\u0000\u0010\n*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\n0\u0019\u001a\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u0002\"\u0004\b\u0000\u0010\n*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\n0\u0019\u00a8\u0006\u001b"}, d2 = {"containsKey", "", "Landroid/support/v4/util/LongSparseArray;", "key", "", "Landroid/support/v4/util/SparseArrayCompat;", "", "Landroid/util/LongSparseArray;", "Landroid/util/SparseArray;", "disjoint", "T", "", "other", "isNotNullOrEmpty", "isNullOrEmpty", "put", "V", "K", "", "pair", "Lkotlin/Pair;", "(Ljava/util/Map;Lkotlin/Pair;)Ljava/lang/Object;", "toHashMap", "Ljava/util/HashMap;", "toSparseArray", "", "toSparseArrayCompat", "app_debug"})
public final class CollectionsExtKt {
    
    public static final <T extends java.lang.Object>boolean isNullOrEmpty(@org.jetbrains.annotations.Nullable()
    java.util.Collection<? extends T> $receiver) {
        return false;
    }
    
    public static final <T extends java.lang.Object>boolean isNotNullOrEmpty(@org.jetbrains.annotations.Nullable()
    java.util.Collection<? extends T> $receiver) {
        return false;
    }
    
    public static final <T extends java.lang.Object>boolean disjoint(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends T> $receiver, @org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends T> other) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <K extends java.lang.Object, V extends java.lang.Object>V put(@org.jetbrains.annotations.NotNull()
    java.util.Map<K, V> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends K, ? extends V> pair) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>java.util.HashMap<java.lang.Integer, T> toHashMap(@org.jetbrains.annotations.NotNull()
    android.util.SparseArray<T> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>android.util.SparseArray<T> toSparseArray(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, ? extends T> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>java.util.HashMap<java.lang.Long, T> toHashMap(@org.jetbrains.annotations.NotNull()
    android.util.LongSparseArray<T> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>android.util.LongSparseArray<T> toSparseArray(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Long, ? extends T> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>java.util.HashMap<java.lang.Integer, T> toHashMap(@org.jetbrains.annotations.NotNull()
    android.support.v4.util.SparseArrayCompat<T> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>android.support.v4.util.SparseArrayCompat<T> toSparseArrayCompat(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, ? extends T> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>java.util.HashMap<java.lang.Long, T> toHashMap(@org.jetbrains.annotations.NotNull()
    android.support.v4.util.LongSparseArray<T> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>android.support.v4.util.LongSparseArray<T> toSparseArrayCompat(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Long, ? extends T> $receiver) {
        return null;
    }
    
    public static final boolean containsKey(@org.jetbrains.annotations.NotNull()
    android.util.SparseArray<?> $receiver, int key) {
        return false;
    }
    
    public static final boolean containsKey(@org.jetbrains.annotations.NotNull()
    android.support.v4.util.SparseArrayCompat<?> $receiver, int key) {
        return false;
    }
    
    public static final boolean containsKey(@org.jetbrains.annotations.NotNull()
    android.util.LongSparseArray<?> $receiver, long key) {
        return false;
    }
    
    public static final boolean containsKey(@org.jetbrains.annotations.NotNull()
    android.support.v4.util.LongSparseArray<?> $receiver, long key) {
        return false;
    }
}