package uz.gita.my_max_way_uz.domain.repository

import kotlinx.coroutines.flow.Flow
import uz.gita.my_max_way_uz.data.model.OrderData

interface OrderRepository {
    fun addOrder(orderData: OrderData): Flow<Result<String>>
    fun getOrderedFoods(userId: String): Flow<Result<List<OrderData>>>
}