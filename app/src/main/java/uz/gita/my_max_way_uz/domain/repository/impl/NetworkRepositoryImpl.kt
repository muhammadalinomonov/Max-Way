package uz.gita.my_max_way_uz.domain.repository.impl

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import uz.gita.my_max_way_uz.data.model.CategoryData
import uz.gita.my_max_way_uz.data.model.FoodData
import uz.gita.my_max_way_uz.domain.repository.NetworkRepository
import javax.inject.Inject

class NetworkRepositoryImpl @Inject constructor() : NetworkRepository {

    private val db = Firebase.firestore


    override suspend fun getAllCategory(): Result<List<CategoryData>> =
        withContext(Dispatchers.IO) {


            try {
                val a = db.collection("category")
                    .get()
                    .await()

                val resultList = arrayListOf<CategoryData>()

                a.documents.forEach {
                    val foodList = arrayListOf<FoodData>()

                    val subCollection = it.reference.collection("items")
                        .get()
                        .await()
                    subCollection.forEach { foodData ->
                        foodList.add(foodData.toObject(FoodData::class.java))
                    }

                    resultList.add(
                        CategoryData(
                            id = it.get("id") as Long,
                            name = it.get("name") as String,
                            items = foodList
                        )
                    )
                }
                return@withContext Result.success(resultList)
            } catch (e: Exception) {
                return@withContext Result.failure(e)
            }
        }
}