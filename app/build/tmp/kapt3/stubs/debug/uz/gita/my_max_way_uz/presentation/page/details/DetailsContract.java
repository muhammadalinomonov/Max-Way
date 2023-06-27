package uz.gita.my_max_way_uz.presentation.page.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract;", "", "Directions", "Intent", "SideEffect", "UiState", "ViewModel", "app_debug"})
public abstract interface DetailsContract {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$Intent;", "", "AddToOrder", "BackToHome", "ChangeCount", "Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$Intent$AddToOrder;", "Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$Intent$BackToHome;", "Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$Intent$ChangeCount;", "app_debug"})
    public static abstract interface Intent {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$Intent$BackToHome;", "Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$Intent;", "()V", "app_debug"})
        public static final class BackToHome implements uz.gita.my_max_way_uz.presentation.page.details.DetailsContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.my_max_way_uz.presentation.page.details.DetailsContract.Intent.BackToHome INSTANCE = null;
            
            private BackToHome() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$Intent$ChangeCount;", "Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$Intent;", "count", "", "price", "", "(IJ)V", "getCount", "()I", "getPrice", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
        public static final class ChangeCount implements uz.gita.my_max_way_uz.presentation.page.details.DetailsContract.Intent {
            private final int count = 0;
            private final long price = 0L;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.my_max_way_uz.presentation.page.details.DetailsContract.Intent.ChangeCount copy(int count, long price) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public ChangeCount(int count, long price) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getCount() {
                return 0;
            }
            
            public final long component2() {
                return 0L;
            }
            
            public final long getPrice() {
                return 0L;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$Intent$AddToOrder;", "Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$Intent;", "food", "Luz/gita/my_max_way_uz/data/model/FoodData;", "count", "", "(Luz/gita/my_max_way_uz/data/model/FoodData;I)V", "getCount", "()I", "getFood", "()Luz/gita/my_max_way_uz/data/model/FoodData;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
        public static final class AddToOrder implements uz.gita.my_max_way_uz.presentation.page.details.DetailsContract.Intent {
            @org.jetbrains.annotations.NotNull
            private final uz.gita.my_max_way_uz.data.model.FoodData food = null;
            private final int count = 0;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.my_max_way_uz.presentation.page.details.DetailsContract.Intent.AddToOrder copy(@org.jetbrains.annotations.NotNull
            uz.gita.my_max_way_uz.data.model.FoodData food, int count) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public AddToOrder(@org.jetbrains.annotations.NotNull
            uz.gita.my_max_way_uz.data.model.FoodData food, int count) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.my_max_way_uz.data.model.FoodData component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.my_max_way_uz.data.model.FoodData getFood() {
                return null;
            }
            
            public final int component2() {
                return 0;
            }
            
            public final int getCount() {
                return 0;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$UiState;", "", "Count", "Load", "Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$UiState$Count;", "Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$UiState$Load;", "app_debug"})
    public static abstract interface UiState {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$UiState$Load;", "Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$UiState;", "()V", "app_debug"})
        public static final class Load implements uz.gita.my_max_way_uz.presentation.page.details.DetailsContract.UiState {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.my_max_way_uz.presentation.page.details.DetailsContract.UiState.Load INSTANCE = null;
            
            private Load() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$UiState$Count;", "Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$UiState;", "count", "", "(I)V", "getCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
        public static final class Count implements uz.gita.my_max_way_uz.presentation.page.details.DetailsContract.UiState {
            private final int count = 0;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.my_max_way_uz.presentation.page.details.DetailsContract.UiState.Count copy(int count) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public Count(int count) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getCount() {
                return 0;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$SideEffect;", "", "ShowSnackBar", "Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$SideEffect$ShowSnackBar;", "app_debug"})
    public static abstract interface SideEffect {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$SideEffect$ShowSnackBar;", "Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$SideEffect;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class ShowSnackBar implements uz.gita.my_max_way_uz.presentation.page.details.DetailsContract.SideEffect {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String message = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.my_max_way_uz.presentation.page.details.DetailsContract.SideEffect.ShowSnackBar copy(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public ShowSnackBar(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getMessage() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$ViewModel;", "Lorg/orbitmvi/orbit/ContainerHost;", "Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$UiState;", "Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$SideEffect;", "onEventDispatcher", "", "intent", "Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$Intent;", "app_debug"})
    public static abstract interface ViewModel extends org.orbitmvi.orbit.ContainerHost<uz.gita.my_max_way_uz.presentation.page.details.DetailsContract.UiState, uz.gita.my_max_way_uz.presentation.page.details.DetailsContract.SideEffect> {
        
        public abstract void onEventDispatcher(@org.jetbrains.annotations.NotNull
        uz.gita.my_max_way_uz.presentation.page.details.DetailsContract.Intent intent);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0005"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$Directions;", "", "backToHome", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface Directions {
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object backToHome(@org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    }
}