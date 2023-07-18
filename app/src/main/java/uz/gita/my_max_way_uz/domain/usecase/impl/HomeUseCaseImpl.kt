package uz.gita.my_max_way_uz.domain.usecase.impl

import kotlinx.coroutines.Dispatchers.Default
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import uz.gita.my_max_way_uz.data.model.CategoryData
import uz.gita.my_max_way_uz.data.model.FoodData
import uz.gita.my_max_way_uz.domain.repository.NetworkRepository
import uz.gita.my_max_way_uz.domain.usecase.HomeUseCase
import javax.inject.Inject

class HomeUseCaseImpl @Inject constructor(private val repository: NetworkRepository) : HomeUseCase {
    override fun getFoodsByCategory(
        name: String,
        lit: List<String>
    ): Flow<Result<List<CategoryData>>> =
        flow<Result<List<CategoryData>>> {

            val result = repository.getAllCategory()
            result.onSuccess { list ->
                val resultList = arrayListOf<CategoryData>()
                if (lit.isEmpty()) {
                    list.forEach {
                        val foodList = arrayListOf<FoodData>()
                        it.items.forEach { foodData ->
                            if (foodData.name.contains(name) or foodData.info.contains(name)) {
                                foodList.add(foodData)
                            }
                        }
                        if (foodList.isNotEmpty())
                            resultList.add(CategoryData(it.id, it.name, foodList))
                    }
                    emit(Result.success(resultList))
                } else {
                    list.forEach {
                        if (lit.contains(it.name)) {
                            val foodList = arrayListOf<FoodData>()
                            it.items.forEach { foodData ->
                                if (foodData.name.contains(name) or foodData.info.contains(name)) {
                                    foodList.add(foodData)
                                }
                            }
                            if (foodList.isNotEmpty())
                                resultList.add(CategoryData(it.id, it.name, foodList))
                        }
                    }
                    emit(Result.success(resultList))
                }
            }
            result.onFailure {
                emit(Result.failure(it))
            }

        }.flowOn(Default)

    override fun getFoodsBySearch(name: String): Flow<Result<List<CategoryData>>> =
        flow<Result<List<CategoryData>>> {
            val resultList = arrayListOf<CategoryData>()

            repository.getAllCategory()
                .onSuccess {
                    it.forEach { categoryData ->
                        categoryData.items.forEach { foodData ->
                            if (foodData.name.contains(
                                    name,
                                    ignoreCase = true
                                ) || foodData.info.contains(name, ignoreCase = true)
                            ) {
                                resultList.add(categoryData)
                            }
                        }
                    }
                }
                .onFailure {
                    emit(Result.failure(it))
                }

            emit(Result.success(resultList))
        }.flowOn(Default)

    override fun getCategories(): Flow<Result<List<String>>> = flow<Result<List<String>>> {
        val resultList = arrayListOf<String>()
        repository.getAllCategory()
            .onSuccess { result ->
                result.forEach {
                    resultList.add(it.name)
                }
            }
            .onFailure {
                emit(Result.failure(it))
            }
        emit(Result.success(resultList))
    }.flowOn(Default)
}