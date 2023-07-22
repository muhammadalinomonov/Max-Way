package uz.gita.my_max_way_uz.domain.repository.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e0\nH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Luz/gita/my_max_way_uz/domain/repository/impl/RoomRepositoryImpl;", "Luz/gita/my_max_way_uz/domain/repository/RoomRepository;", "dao", "Luz/gita/my_max_way_uz/data/source/local/room/dao/FoodDao;", "(Luz/gita/my_max_way_uz/data/source/local/room/dao/FoodDao;)V", "addToRoom", "", "foodEntity", "Luz/gita/my_max_way_uz/data/source/local/room/entity/FoodEntity;", "checkFood", "Lkotlinx/coroutines/flow/Flow;", "clearBasket", "deleteOrder", "getFoods", "", "updateOrder", "app_debug"})
public final class RoomRepositoryImpl implements uz.gita.my_max_way_uz.domain.repository.RoomRepository {
    private final uz.gita.my_max_way_uz.data.source.local.room.dao.FoodDao dao = null;
    
    @javax.inject.Inject
    public RoomRepositoryImpl(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.data.source.local.room.dao.FoodDao dao) {
        super();
    }
    
    @java.lang.Override
    public void addToRoom(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodEntity) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity>> getFoods() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Unit> updateOrder(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodEntity) {
        return null;
    }
    
    @java.lang.Override
    public void deleteOrder(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodEntity) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Unit> clearBasket() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity> checkFood(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodEntity) {
        return null;
    }
}