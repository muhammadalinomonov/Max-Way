package uz.gita.my_max_way_uz.data.model

data class CategoryData(
    val id: Long = 0,
    val name: String,
    val items: List<FoodData>
)