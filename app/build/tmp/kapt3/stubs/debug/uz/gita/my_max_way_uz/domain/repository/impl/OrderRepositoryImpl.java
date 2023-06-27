package uz.gita.my_max_way_uz.domain.repository.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016\u00f8\u0001\u0000J%\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\u00070\u00062\u0006\u0010\r\u001a\u00020\bH\u0016\u00f8\u0001\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Luz/gita/my_max_way_uz/domain/repository/impl/OrderRepositoryImpl;", "Luz/gita/my_max_way_uz/domain/repository/OrderRepository;", "()V", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "addOrder", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "orderData", "Luz/gita/my_max_way_uz/data/model/OrderData;", "getOrderedFoods", "", "userId", "app_debug"})
public final class OrderRepositoryImpl implements uz.gita.my_max_way_uz.domain.repository.OrderRepository {
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    
    @javax.inject.Inject
    public OrderRepositoryImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.String>> addOrder(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.data.model.OrderData orderData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.my_max_way_uz.data.model.OrderData>>> getOrderedFoods(@org.jetbrains.annotations.NotNull
    java.lang.String userId) {
        return null;
    }
}