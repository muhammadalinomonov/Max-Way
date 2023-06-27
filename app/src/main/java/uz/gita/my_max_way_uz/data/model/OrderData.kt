package uz.gita.my_max_way_uz.data.model

import uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity

data class OrderData(
    val foods: List<FoodEntity>,
    val userId: String,
    val comment: String,
    val allPrice:Long,
    val isDone: Boolean = false
)
