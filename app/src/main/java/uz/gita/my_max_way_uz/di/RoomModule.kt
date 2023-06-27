package uz.gita.my_max_way_uz.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import uz.gita.my_max_way_uz.data.source.local.room.dao.FoodDao
import uz.gita.my_max_way_uz.data.source.local.room.database.AppDatabase
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    @Singleton
    fun provideDB(@ApplicationContext context: Context): AppDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "orders"
    ).allowMainThreadQueries().build()

    @[Provides Singleton]
    fun provideContactDao(db: AppDatabase): FoodDao = db.getFoodsDao()
}