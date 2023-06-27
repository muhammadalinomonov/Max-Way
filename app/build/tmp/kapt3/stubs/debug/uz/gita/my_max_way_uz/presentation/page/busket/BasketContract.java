package uz.gita.my_max_way_uz.presentation.page.busket;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract;", "", "Directions", "Intent", "SideEffect", "UiState", "ViewModel", "app_debug"})
public abstract interface BasketContract {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b\u00a8\u0006\f"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$Intent;", "", "ChangeCount", "ClearBasket", "DeleteItem", "Load", "OrderToMarker", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$Intent$ChangeCount;", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$Intent$ClearBasket;", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$Intent$DeleteItem;", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$Intent$Load;", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$Intent$OrderToMarker;", "app_debug"})
    public static abstract interface Intent {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$Intent$Load;", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$Intent;", "()V", "app_debug"})
        public static final class Load implements uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.Intent.Load INSTANCE = null;
            
            private Load() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$Intent$ClearBasket;", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$Intent;", "()V", "app_debug"})
        public static final class ClearBasket implements uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.Intent.ClearBasket INSTANCE = null;
            
            private ClearBasket() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$Intent$ChangeCount;", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$Intent;", "foodEntity", "Luz/gita/my_max_way_uz/data/source/local/room/entity/FoodEntity;", "count", "", "(Luz/gita/my_max_way_uz/data/source/local/room/entity/FoodEntity;I)V", "getCount", "()I", "getFoodEntity", "()Luz/gita/my_max_way_uz/data/source/local/room/entity/FoodEntity;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
        public static final class ChangeCount implements uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.Intent {
            @org.jetbrains.annotations.NotNull
            private final uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodEntity = null;
            private final int count = 0;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.Intent.ChangeCount copy(@org.jetbrains.annotations.NotNull
            uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodEntity, int count) {
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
            
            public ChangeCount(@org.jetbrains.annotations.NotNull
            uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodEntity, int count) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity getFoodEntity() {
                return null;
            }
            
            public final int component2() {
                return 0;
            }
            
            public final int getCount() {
                return 0;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$Intent$DeleteItem;", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$Intent;", "foodData", "Luz/gita/my_max_way_uz/data/source/local/room/entity/FoodEntity;", "(Luz/gita/my_max_way_uz/data/source/local/room/entity/FoodEntity;)V", "getFoodData", "()Luz/gita/my_max_way_uz/data/source/local/room/entity/FoodEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class DeleteItem implements uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.Intent {
            @org.jetbrains.annotations.NotNull
            private final uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodData = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.Intent.DeleteItem copy(@org.jetbrains.annotations.NotNull
            uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodData) {
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
            
            public DeleteItem(@org.jetbrains.annotations.NotNull
            uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodData) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity getFoodData() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\bH\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$Intent$OrderToMarker;", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$Intent;", "foodList", "", "Luz/gita/my_max_way_uz/data/source/local/room/entity/FoodEntity;", "comment", "", "allPrice", "", "(Ljava/util/List;Ljava/lang/String;J)V", "getAllPrice", "()J", "getComment", "()Ljava/lang/String;", "getFoodList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class OrderToMarker implements uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.Intent {
            @org.jetbrains.annotations.NotNull
            private final java.util.List<uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity> foodList = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String comment = null;
            private final long allPrice = 0L;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.Intent.OrderToMarker copy(@org.jetbrains.annotations.NotNull
            java.util.List<uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity> foodList, @org.jetbrains.annotations.NotNull
            java.lang.String comment, long allPrice) {
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
            
            public OrderToMarker(@org.jetbrains.annotations.NotNull
            java.util.List<uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity> foodList, @org.jetbrains.annotations.NotNull
            java.lang.String comment, long allPrice) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity> getFoodList() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getComment() {
                return null;
            }
            
            public final long component3() {
                return 0L;
            }
            
            public final long getAllPrice() {
                return 0L;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$UiState;", "", "FoodsInBasket", "Load", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$UiState$FoodsInBasket;", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$UiState$Load;", "app_debug"})
    public static abstract interface UiState {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$UiState$Load;", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$UiState;", "()V", "app_debug"})
        public static final class Load implements uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.UiState {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.UiState.Load INSTANCE = null;
            
            private Load() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$UiState$FoodsInBasket;", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$UiState;", "foods", "", "Luz/gita/my_max_way_uz/data/source/local/room/entity/FoodEntity;", "(Ljava/util/List;)V", "getFoods", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class FoodsInBasket implements uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.UiState {
            @org.jetbrains.annotations.NotNull
            private final java.util.List<uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity> foods = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.UiState.FoodsInBasket copy(@org.jetbrains.annotations.NotNull
            java.util.List<uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity> foods) {
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
            
            public FoodsInBasket(@org.jetbrains.annotations.NotNull
            java.util.List<uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity> foods) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity> getFoods() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$SideEffect;", "", "HasError", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$SideEffect$HasError;", "app_debug"})
    public static abstract interface SideEffect {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$SideEffect$HasError;", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$SideEffect;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class HasError implements uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.SideEffect {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String message = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.SideEffect.HasError copy(@org.jetbrains.annotations.NotNull
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
            
            public HasError(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$ViewModel;", "Lorg/orbitmvi/orbit/ContainerHost;", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$UiState;", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$SideEffect;", "onEventDispatcher", "", "intent", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$Intent;", "app_debug"})
    public static abstract interface ViewModel extends org.orbitmvi.orbit.ContainerHost<uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.UiState, uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.SideEffect> {
        
        public abstract void onEventDispatcher(@org.jetbrains.annotations.NotNull
        uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.Intent intent);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0005"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$Directions;", "", "backToHome", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface Directions {
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object backToHome(@org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    }
}