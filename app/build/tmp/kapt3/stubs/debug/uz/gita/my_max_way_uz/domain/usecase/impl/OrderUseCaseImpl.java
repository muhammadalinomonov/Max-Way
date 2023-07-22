package uz.gita.my_max_way_uz.domain.usecase.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016\u00f8\u0001\u0000J\u001f\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016\u00f8\u0001\u0000J\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\bH\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00150\bH\u0016J%\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00150\t0\b2\u0006\u0010\u0017\u001a\u00020\nH\u0016\u00f8\u0001\u0000J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Luz/gita/my_max_way_uz/domain/usecase/impl/OrderUseCaseImpl;", "Luz/gita/my_max_way_uz/domain/usecase/OrderUseCase;", "repository", "Luz/gita/my_max_way_uz/domain/repository/OrderRepository;", "roomRepository", "Luz/gita/my_max_way_uz/domain/repository/RoomRepository;", "(Luz/gita/my_max_way_uz/domain/repository/OrderRepository;Luz/gita/my_max_way_uz/domain/repository/RoomRepository;)V", "addOrder", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "orderData", "Luz/gita/my_max_way_uz/data/model/OrderData;", "addToRoom", "foodEntity", "Luz/gita/my_max_way_uz/data/source/local/room/entity/FoodEntity;", "checkFood", "clearBasket", "", "deleteOrder", "getFoodsInBasket", "", "getOrderedFoods", "userId", "update", "app_debug"})
public final class OrderUseCaseImpl implements uz.gita.my_max_way_uz.domain.usecase.OrderUseCase {
    private final uz.gita.my_max_way_uz.domain.repository.OrderRepository repository = null;
    private final uz.gita.my_max_way_uz.domain.repository.RoomRepository roomRepository = null;
    
    @javax.inject.Inject
    public OrderUseCaseImpl(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.domain.repository.OrderRepository repository, @org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.domain.repository.RoomRepository roomRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.String>> addToRoom(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.String>> addOrder(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.data.model.OrderData orderData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Unit> update(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Unit> clearBasket() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity>> getFoodsInBasket() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Unit> deleteOrder(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.my_max_way_uz.data.model.OrderData>>> getOrderedFoods(@org.jetbrains.annotations.NotNull
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity> checkFood(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity foodEntity) {
        return null;
    }
}