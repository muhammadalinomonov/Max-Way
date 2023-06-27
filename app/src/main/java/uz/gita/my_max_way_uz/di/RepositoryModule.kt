package uz.gita.my_max_way_uz.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.my_max_way_uz.domain.repository.AuthRepository
import uz.gita.my_max_way_uz.domain.repository.NetworkRepository
import uz.gita.my_max_way_uz.domain.repository.OrderRepository
import uz.gita.my_max_way_uz.domain.repository.RoomRepository
import uz.gita.my_max_way_uz.domain.repository.impl.AuthRepositoryImpl
import uz.gita.my_max_way_uz.domain.repository.impl.NetworkRepositoryImpl
import uz.gita.my_max_way_uz.domain.repository.impl.OrderRepositoryImpl
import uz.gita.my_max_way_uz.domain.repository.impl.RoomRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @Binds
    @Singleton
    fun bindAuthRepo(impl: AuthRepositoryImpl): AuthRepository

    @Binds
    @Singleton
    fun bindNetworkRepo(impl: NetworkRepositoryImpl): NetworkRepository

    @Binds
    @Singleton
    fun bindOrderRepo(impl: OrderRepositoryImpl): OrderRepository

    @Binds
    @Singleton
    fun bindRoomRepo(impl: RoomRepositoryImpl): RoomRepository




}