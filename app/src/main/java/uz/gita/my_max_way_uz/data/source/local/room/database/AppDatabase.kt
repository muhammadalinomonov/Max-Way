package uz.gita.my_max_way_uz.data.source.local.room.database

import androidx.room.Database
import androidx.room.RoomDatabase
import uz.gita.my_max_way_uz.data.source.local.room.dao.FoodDao
import uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity

@Database(entities = [FoodEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getFoodsDao(): FoodDao

}