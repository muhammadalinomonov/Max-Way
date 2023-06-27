package uz.gita.my_max_way_uz.data.source.local.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "foods")
data class FoodEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String = "",
    val price: Long = 0,
    val count: Int = 0,
    val description: String = "",
    val imageUrl: String = "",
) {
    fun changeCount(count: Int) = FoodEntity(id, name, price, count, description, imageUrl)
}
