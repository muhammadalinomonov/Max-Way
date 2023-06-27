package uz.gita.my_max_way_uz.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\u0011\u0010\f\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u000e\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u000f\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ.\u0010\u0010\u001a\u00020\b2\u001b\u0010\u0011\u001a\u0017\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\u0012\u00a2\u0006\u0002\b\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\b2\n\u0010\u0015\u001a\u00060\u0016j\u0002`\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\b2\n\u0010\u0015\u001a\u00060\u0016j\u0002`\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\b2\n\u0010\u0015\u001a\u00060\u0016j\u0002`\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0011\u0010\u001b\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR+\u0010\u0004\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\u0002\b\t0\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Luz/gita/my_max_way_uz/navigation/NavigationDispatcher;", "Luz/gita/my_max_way_uz/navigation/AppNavigator;", "Luz/gita/my_max_way_uz/navigation/NavigationHandler;", "()V", "navigationStack", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlin/Function1;", "Lcafe/adriel/voyager/navigator/Navigator;", "", "Lkotlin/ExtensionFunctionType;", "getNavigationStack", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "back", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "backAll", "backUntilRoot", "navigate", "args", "Luz/gita/my_max_way_uz/navigation/NavigationArgs;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "navigateTo", "screen", "Lcafe/adriel/voyager/androidx/AndroidScreen;", "Luz/gita/my_max_way_uz/navigation/AppScreen;", "(Lcafe/adriel/voyager/androidx/AndroidScreen;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "replace", "replaceAll", "stackLog", "app_debug"})
@javax.inject.Singleton
public final class NavigationDispatcher implements uz.gita.my_max_way_uz.navigation.AppNavigator, uz.gita.my_max_way_uz.navigation.NavigationHandler {
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.jvm.functions.Function1<cafe.adriel.voyager.navigator.Navigator, kotlin.Unit>> navigationStack = null;
    
    @javax.inject.Inject
    public NavigationDispatcher() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.MutableSharedFlow<kotlin.jvm.functions.Function1<cafe.adriel.voyager.navigator.Navigator, kotlin.Unit>> getNavigationStack() {
        return null;
    }
    
    private final java.lang.Object navigate(kotlin.jvm.functions.Function1<? super cafe.adriel.voyager.navigator.Navigator, kotlin.Unit> args, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object replaceAll(@org.jetbrains.annotations.NotNull
    cafe.adriel.voyager.androidx.AndroidScreen screen, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object stackLog(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object back(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object backUntilRoot(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object backAll(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object navigateTo(@org.jetbrains.annotations.NotNull
    cafe.adriel.voyager.androidx.AndroidScreen screen, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object replace(@org.jetbrains.annotations.NotNull
    cafe.adriel.voyager.androidx.AndroidScreen screen, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}