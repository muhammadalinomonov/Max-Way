package uz.gita.my_max_way_uz.domain.repository

import kotlinx.coroutines.flow.Flow
import uz.gita.my_max_way_uz.data.model.CategoryData

interface FoodRepository {
    fun getFoodsByCategory(search: String, lit: List<String>): Flow<Result<List<CategoryData>>>
    fun getFoodsBySearch(search: String): Flow<Result<List<CategoryData>>>
    fun getCategories(): Flow<Result<List<String>>>
}