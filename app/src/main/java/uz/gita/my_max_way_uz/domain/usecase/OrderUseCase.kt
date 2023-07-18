package uz.gita.my_max_way_uz.domain.usecase

import kotlinx.coroutines.flow.Flow
import uz.gita.my_max_way_uz.data.model.OrderData
import uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity

interface OrderUseCase {
    fun addToRoom(foodEntity: FoodEntity): Flow<Result<String>>
    fun addOrder(orderData: OrderData): Flow<Result<String>>
    fun update(foodEntity: FoodEntity): Flow<Unit>
    fun clearBasket(): Flow<Unit>
    fun getFoodsInBasket(): Flow<List<FoodEntity>>
    fun deleteOrder(foodEntity: FoodEntity): Flow<Unit>
    fun getOrderedFoods(userId: String): Flow<Result<List<OrderData>>>
    fun checkFood(foodEntity: FoodEntity):Boolean
}