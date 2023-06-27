package uz.gita.my_max_way_uz.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.my_max_way_uz.domain.usecase.HomeUseCase
import uz.gita.my_max_way_uz.domain.usecase.OrderUseCase
import uz.gita.my_max_way_uz.domain.usecase.impl.HomeUseCaseImpl
import uz.gita.my_max_way_uz.domain.usecase.impl.OrderUseCaseImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface UseCaseModule {


    @Binds
    @Singleton
    fun bindNetworkUseCase(impl: HomeUseCaseImpl): HomeUseCase

    @Binds
    @Singleton
    fun bindOrderUseCase(impl: OrderUseCaseImpl): OrderUseCase


}