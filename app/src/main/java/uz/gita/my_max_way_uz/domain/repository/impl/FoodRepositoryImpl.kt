package uz.gita.my_max_way_uz.domain.repository.impl

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.tasks.await
import uz.gita.my_max_way_uz.data.model.CategoryData
import uz.gita.my_max_way_uz.data.model.FoodData
import uz.gita.my_max_way_uz.domain.repository.FoodRepository
import javax.inject.Inject

class FoodRepositoryImpl @Inject constructor(private val db: FirebaseFirestore) : FoodRepository {
    private lateinit var a: QuerySnapshot
    override fun getFoodsByCategory(
        search: String,
        lit: List<String>
    ): Flow<Result<List<CategoryData>>> = flow<Result<List<CategoryData>>> {
        if (!::a.isInitialized){
            a = db.collection("category")
                .get()
                .await()
        }
        try {
            val result = arrayListOf<CategoryData>()

            a.documents.forEach {
                val foodList = arrayListOf<FoodData>()

                val subCollection = it.reference.collection("items")
                    .get()
                    .await()
                subCollection.forEach { foodData ->


                        foodList.add(foodData.toObject(FoodData::class.java))

                }

                result.add(
                    CategoryData(
                        id = it.get("id") as Long,
                        name = it.get("name") as String,
                        items = foodList
                    )
                )

                val resultList = arrayListOf<CategoryData>()
                if (lit.isEmpty()) {
                    result.forEach {category->
                        val foods = arrayListOf<FoodData>()
                        category.items.forEach { foodData ->
                            if (foodData.name.contains(search) or foodData.info.contains(search)) {
                                foods.add(foodData)
                            }
                        }
                        if (foods.isNotEmpty())
                            resultList.add(CategoryData(category.id, category.name, foods))
                    }
                    emit(Result.success(resultList))
                } else {
                    result.forEach {category->
                        if (lit.contains(category.name)) {
                            val foods = arrayListOf<FoodData>()
                            category.items.forEach { foodData ->
                                if (foodData.name.contains(search) or foodData.info.contains(search)) {
                                    foods.add(foodData)
                                }
                            }
                            if (foods.isNotEmpty())
                                resultList.add(CategoryData(category.id, category.name, foods))
                        }
                    }
                    emit(Result.success(resultList))
                }


            }
        } catch (e: Exception) {
            emit(Result.failure(e))
        }
    }.flowOn(Dispatchers.IO)

    override fun getFoodsBySearch(search: String): Flow<Result<List<CategoryData>>> =
        flow<Result<List<CategoryData>>> {
            if (!::a.isInitialized){
                a = db.collection("category")
                    .get()
                    .await()
            }
            try {
                val resultList = arrayListOf<CategoryData>()

                a.documents.forEach {
                    val foodList = arrayListOf<FoodData>()

                    val subCollection = it.reference.collection("items")
                        .get()
                        .await()
                    subCollection.forEach { foodData ->

                        val food = foodData.toObject(FoodData::class.java)
                        if (food.name.contains(search, ignoreCase = true)
                            || food.info.contains(search, ignoreCase = true)
                        ) {
                            foodList.add(food)
                        }
                    }

                    resultList.add(
                        CategoryData(
                            id = it.get("id") as Long,
                            name = it.get("name") as String,
                            items = foodList
                        )
                    )
                    emit(Result.success(resultList))
                }
            } catch (e: Exception) {
                emit(Result.failure(e))
            }
        }.flowOn(Dispatchers.IO)

    override fun getCategories(): Flow<Result<List<String>>> = flow<Result<List<String>>> {
        try{
            val resultList = arrayListOf<String>()
            a = db.collection("category")
                .get()
                .await()

            a.documents.forEach {
                resultList.add(it.get("name") as String)
            }
            emit(Result.success(resultList))
        }catch (e:Exception){
            emit(Result.failure(e))
        }
    }.flowOn(Dispatchers.IO)
}