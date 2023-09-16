package uz.gita.my_max_way_uz.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0011H\'\u00a8\u0006\u0012"}, d2 = {"Luz/gita/my_max_way_uz/di/RepositoryModule;", "", "bindAuthRepo", "Luz/gita/my_max_way_uz/domain/repository/AuthRepository;", "impl", "Luz/gita/my_max_way_uz/domain/repository/impl/AuthRepositoryImpl;", "bindFoodsRepo", "Luz/gita/my_max_way_uz/domain/repository/FoodRepository;", "Luz/gita/my_max_way_uz/domain/repository/impl/FoodRepositoryImpl;", "bindNetworkRepo", "Luz/gita/my_max_way_uz/domain/repository/NetworkRepository;", "Luz/gita/my_max_way_uz/domain/repository/impl/NetworkRepositoryImpl;", "bindOrderRepo", "Luz/gita/my_max_way_uz/domain/repository/OrderRepository;", "Luz/gita/my_max_way_uz/domain/repository/impl/OrderRepositoryImpl;", "bindRoomRepo", "Luz/gita/my_max_way_uz/domain/repository/RoomRepository;", "Luz/gita/my_max_way_uz/domain/repository/impl/RoomRepositoryImpl;", "app_debug"})
@dagger.Module
public abstract interface RepositoryModule {
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract uz.gita.my_max_way_uz.domain.repository.AuthRepository bindAuthRepo(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.domain.repository.impl.AuthRepositoryImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract uz.gita.my_max_way_uz.domain.repository.NetworkRepository bindNetworkRepo(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.domain.repository.impl.NetworkRepositoryImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract uz.gita.my_max_way_uz.domain.repository.OrderRepository bindOrderRepo(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.domain.repository.impl.OrderRepositoryImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract uz.gita.my_max_way_uz.domain.repository.RoomRepository bindRoomRepo(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.domain.repository.impl.RoomRepositoryImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract uz.gita.my_max_way_uz.domain.repository.FoodRepository bindFoodsRepo(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.domain.repository.impl.FoodRepositoryImpl impl);
}