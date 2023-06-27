package uz.gita.my_max_way_uz.domain.usecase

import kotlinx.coroutines.flow.Flow
import uz.gita.my_max_way_uz.data.model.CategoryData

interface HomeUseCase {
    fun getFoodsByCategory( name: String, lit: List<String>): Flow<Result<List<CategoryData>>>
    fun getFoodsBySearch( name: String): Flow<Result<List<CategoryData>>>
    fun getCategories(): Flow<Result<List<String>>>

}