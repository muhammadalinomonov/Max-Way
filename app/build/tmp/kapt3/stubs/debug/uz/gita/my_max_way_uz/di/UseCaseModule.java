package uz.gita.my_max_way_uz.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Luz/gita/my_max_way_uz/di/UseCaseModule;", "", "bindNetworkUseCase", "Luz/gita/my_max_way_uz/domain/usecase/HomeUseCase;", "impl", "Luz/gita/my_max_way_uz/domain/usecase/impl/HomeUseCaseImpl;", "bindOrderUseCase", "Luz/gita/my_max_way_uz/domain/usecase/OrderUseCase;", "Luz/gita/my_max_way_uz/domain/usecase/impl/OrderUseCaseImpl;", "app_debug"})
@dagger.Module
public abstract interface UseCaseModule {
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract uz.gita.my_max_way_uz.domain.usecase.HomeUseCase bindNetworkUseCase(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.domain.usecase.impl.HomeUseCaseImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract uz.gita.my_max_way_uz.domain.usecase.OrderUseCase bindOrderUseCase(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.domain.usecase.impl.OrderUseCaseImpl impl);
}