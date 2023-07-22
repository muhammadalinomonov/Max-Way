package uz.gita.my_max_way_uz.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u0007H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\r"}, d2 = {"Luz/gita/my_max_way_uz/domain/repository/RoomRepository;", "", "addToRoom", "", "foodEntity", "Luz/gita/my_max_way_uz/data/source/local/room/entity/FoodEntity;", "checkFood", "Lkotlinx/coroutines/flow/Flow;", "clearBasket", "deleteOrder", "getFoods", "", "updateOrder", "app_debug"})
public abstract interface RoomRepository {
    
    public abstract void addToRoom(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodEntity);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity>> getFoods();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Unit> updateOrder(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodEntity);
    
    public abstract void deleteOrder(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodEntity);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Unit> clearBasket();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity> checkFood(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodEntity);
}