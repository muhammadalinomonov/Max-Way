package uz.gita.my_max_way_uz.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.my_max_way_uz.navigation.AppNavigator
import uz.gita.my_max_way_uz.navigation.NavigationDispatcher
import uz.gita.my_max_way_uz.navigation.NavigationHandler

@Module
@InstallIn(SingletonComponent::class)
interface NavigationModule {

    @Binds
    fun bindAppNavigator(impl: NavigationDispatcher): AppNavigator

    @Binds
    fun bindNavigationHandler(impl: NavigationDispatcher): NavigationHandler
}


