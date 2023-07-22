package uz.gita.my_max_way_uz.data.source.local.room.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\u0003H\'J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\'J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\'\u00a8\u0006\u0011"}, d2 = {"Luz/gita/my_max_way_uz/data/source/local/room/dao/FoodDao;", "", "checkFood", "Lkotlinx/coroutines/flow/Flow;", "Luz/gita/my_max_way_uz/data/source/local/room/entity/FoodEntity;", "name", "", "count", "", "clearTable", "", "deleteFood", "foodEntity", "getFoods", "", "insertFood", "updateFood", "app_debug"})
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
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM foods where name = :name AND count = :count")
    public abstract kotlinx.coroutines.flow.Flow<uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity> checkFood(@org.jetbrains.annotations.NotNull
    java.lang.String name, int count);
}