package uz.gita.my_max_way_uz.data.source.local.room.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\bH\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\f"}, d2 = {"Luz/gita/my_max_way_uz/data/source/local/room/dao/FoodDao;", "", "clearTable", "", "deleteFood", "foodEntity", "Luz/gita/my_max_way_uz/data/source/local/room/entity/FoodEntity;", "getFoods", "Lkotlinx/coroutines/flow/Flow;", "", "insertFood", "updateFood", "app_debug"})
public abstract interface FoodDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertFood(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodEntity);
    
    @androidx.room.Update
    public abstract void updateFood(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodEntity);
    
    @androidx.room.Delete
    public abstract void deleteFood(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodEntity);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM foods")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity>> getFoods();
    
    @androidx.room.Query(value = "DELETE  FROM foods")
    public abstract void clearTable();
}