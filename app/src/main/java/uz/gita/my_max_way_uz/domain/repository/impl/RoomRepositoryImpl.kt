package uz.gita.my_max_way_uz.domain.repository.impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import uz.gita.my_max_way_uz.data.source.local.room.dao.FoodDao
import uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity
import uz.gita.my_max_way_uz.domain.repository.RoomRepository
import javax.inject.Inject

class RoomRepositoryImpl @Inject constructor(private val dao: FoodDao) : RoomRepository {
    override fun addToRoom(foodEntity: FoodEntity) {
        dao.insertFood(foodEntity)
    }

    override fun getFoods(): Flow<List<FoodEntity>> =
        dao.getFoods()


    override fun updateOrder(foodEntity: FoodEntity): Flow<Unit> = flow {
        dao.updateFood(foodEntity)
        emit(Unit)
    }.flowOn(Dispatchers.IO)


    override fun deleteOrder(foodEntity: FoodEntity) {
        dao.deleteFood(foodEntity)
    }

    override fun clearBasket(): Flow<Unit> = flow {
        dao.clearTable()
        emit(Unit)
    }.flowOn(Dispatchers.IO)

    override fun checkFood(foodEntity: FoodEntity) =
        dao.checkFood(foodEntity.name, foodEntity.count)
}