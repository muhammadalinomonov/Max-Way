package uz.gita.my_max_way_uz.domain.repository

import kotlinx.coroutines.flow.Flow
import uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity

interface RoomRepository {
    fun addToRoom(foodEntity: FoodEntity)
    fun getFoods(): Flow<List<FoodEntity>>
    fun updateOrder(foodEntity: FoodEntity): Flow<Unit>
    fun deleteOrder(foodEntity: FoodEntity)
    fun clearBasket(): Flow<Unit>

    fun checkFood(foodEntity: FoodEntity):Boolean
}