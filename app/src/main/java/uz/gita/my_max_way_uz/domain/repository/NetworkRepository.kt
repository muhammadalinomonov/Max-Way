package uz.gita.my_max_way_uz.domain.repository

import kotlinx.coroutines.flow.Flow
import uz.gita.my_max_way_uz.data.model.CategoryData


interface NetworkRepository {
     suspend fun getAllCategory(): Result<List<CategoryData>>
}