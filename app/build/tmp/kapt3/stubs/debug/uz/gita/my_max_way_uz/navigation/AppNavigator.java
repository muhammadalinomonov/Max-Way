package uz.gita.my_max_way_uz.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0006\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0007\u001a\u00020\u00032\n\u0010\b\u001a\u00060\tj\u0002`\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00032\n\u0010\b\u001a\u00060\tj\u0002`\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u00032\n\u0010\b\u001a\u00060\tj\u0002`\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u000e\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Luz/gita/my_max_way_uz/navigation/AppNavigator;", "", "back", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "backAll", "backUntilRoot", "navigateTo", "screen", "Lcafe/adriel/voyager/androidx/AndroidScreen;", "Luz/gita/my_max_way_uz/navigation/AppScreen;", "(Lcafe/adriel/voyager/androidx/AndroidScreen;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "replace", "replaceAll", "stackLog", "app_debug"})
public abstract interface AppNavigator {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object stackLog(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object back(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object backUntilRoot(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object backAll(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object navigateTo(@org.jetbrains.annotations.NotNull
    cafe.adriel.voyager.androidx.AndroidScreen screen, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object replace(@org.jetbrains.annotations.NotNull
    cafe.adriel.voyager.androidx.AndroidScreen screen, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object replaceAll(@org.jetbrains.annotations.NotNull
    cafe.adriel.voyager.androidx.AndroidScreen screen, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}