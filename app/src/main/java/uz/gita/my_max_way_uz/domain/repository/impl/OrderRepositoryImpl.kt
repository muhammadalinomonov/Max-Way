package uz.gita.my_max_way_uz.domain.repository.impl

import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.tasks.await
import uz.gita.my_max_way_uz.data.model.OrderData
import uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity
import uz.gita.my_max_way_uz.domain.repository.OrderRepository
import javax.inject.Inject

class OrderRepositoryImpl @Inject constructor() : OrderRepository {
    private val db = Firebase.firestore
    override fun addOrder(orderData: OrderData): Flow<Result<String>> =
        callbackFlow {
            Log.d("TTTT", orderData.allPrice.toString())
            var isHave = false
            val a = db.collection("orders")
                .get()
                .await()
            /*a.documents.forEach { queryS ->
                if ((queryS.get("userId") as String) == orderData.userId) {
                    isHave = true
                    orderData.foods.forEach {
                        queryS.reference.collection("foods")
                            .add(it)
                            .await()
                    }

                }
            }*/
            if (!isHave) {
                var documentId: String
                db.collection("orders")
                    .add(
                        MyDocument(
                            orderData.userId,
                            orderData.isDone,
                            orderData.comment,
                            orderData.allPrice
                        )
                    )
                    .addOnSuccessListener { it ->
                        documentId = it.id
                        orderData.foods.forEach {

                            db.collection("orders")
                                .document(documentId)
                                .collection("foods")
                                .add(it)
                        }
                    }
                    .await()

                a.documents.forEach { query ->
                    if (orderData.userId == query.get("userid")) {
                        orderData.foods.forEach {
                            query.reference.collection("foods")
                                .add(it)
                                .await()
                        }
                    }
                }
            }

            trySend(Result.success("Buyurtmangiz do'konga yetib bordi"))
            awaitClose()
        }.flowOn(Dispatchers.IO)

    override fun getOrderedFoods(userId: String): Flow<Result<List<OrderData>>> = flow {

        val a = db.collection("orders")
            .get()
            .await()
        val resultList = arrayListOf<OrderData>()

        a.documents.forEach { it ->
            val productList = arrayListOf<FoodEntity>()

            val subCollection = it.reference.collection("foods")
                .get()
                .await()

            subCollection.forEach { product ->
                productList.add(product.toObject(FoodEntity::class.java))

            }

            if ((it.get("userId") as String) == userId) {
                resultList.add(
                    OrderData(
                        userId = it.get("userId") as String,
                        comment = it.get("comment") as String,
                        foods = productList,
                        allPrice = it.get("allPrice") as Long,
                        isDone = it.get("done") as Boolean
                    )
                )
            }
        }
        emit(Result.success(resultList))
    }
}

data class MyDocument(
    val userId: String,
    val isDone: Boolean,
    val comment: String,
    val allPrice: Long
)