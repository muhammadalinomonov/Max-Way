package uz.gita.my_max_way_uz.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00f8\u0001\u0000J%\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\u00040\u00032\u0006\u0010\n\u001a\u00020\u0005H&\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Luz/gita/my_max_way_uz/domain/repository/OrderRepository;", "", "addOrder", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "orderData", "Luz/gita/my_max_way_uz/data/model/OrderData;", "getOrderedFoods", "", "userId", "app_debug"})
public abstract interface OrderRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.String>> addOrder(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.data.model.OrderData orderData);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.my_max_way_uz.data.model.OrderData>>> getOrderedFoods(@org.jetbrains.annotations.NotNull
    java.lang.String userId);
}