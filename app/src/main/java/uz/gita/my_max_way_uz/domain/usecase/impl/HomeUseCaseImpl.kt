package uz.gita.my_max_way_uz.domain.usecase.impl

import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import uz.gita.my_max_way_uz.data.model.CategoryData
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
                if (lit.isEmpty()) {
                    emit(Result.success(list))
                } else {
                    emit(Result.success(list.filter {
                        lit.contains(it.name)
                    }))
                }
            }
            result.onFailure {
                emit(Result.failure(it))
            }

        }.flowOn(IO)

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
        }.flowOn(IO)

    override fun getCategories(): Flow<Result<List<String>>> = flow<Result<List<String>>> {
        val resultList = arrayListOf<String>()
        repository.getAllCategory()
            .onSuccess {
                it.forEach {
                    resultList.add(it.name)
                }
            }
            .onFailure {
                emit(Result.failure(it))
            }
        emit(Result.success(resultList))
    }.flowOn(IO)
}