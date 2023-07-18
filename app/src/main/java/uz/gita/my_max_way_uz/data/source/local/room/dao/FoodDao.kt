package uz.gita.my_max_way_uz.data.source.local.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity

@Dao
interface FoodDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFood(foodEntity: FoodEntity)

    @Update
    fun updateFood(foodEntity: FoodEntity)

    @Delete
    fun deleteFood(foodEntity: FoodEntity)

    @Query("SELECT * FROM foods")
    fun getFoods(): Flow<List<FoodEntity>>

    @Query("DELETE  FROM foods")
    fun clearTable()

    @Query("SELECT exists (SELECT * FROM foods where name = :name AND count = :count)")
    fun checkFood(name: String, count: Int): Boolean
}