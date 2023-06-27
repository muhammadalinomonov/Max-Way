package uz.gita.my_max_way_uz.data.model

import uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity

data class FoodData(
    val id: Long = 0,
    val name: String = "",
    val price: Long = 0,
    val info: String = "",
    val imgUrl: String = ""
) {


    fun toFoodEntityData(count: Int, phoneNumber: String) =
        FoodEntity(id, name, price, count, info, imgUrl)

}
