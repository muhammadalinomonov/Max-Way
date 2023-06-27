package uz.gita.my_max_way_uz.presentation.screen.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Luz/gita/my_max_way_uz/presentation/screen/splash/SplashDirection;", "", "openLoginScreen", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openMainScreen", "app_debug"})
public abstract interface SplashDirection {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object openMainScreen(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object openLoginScreen(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}