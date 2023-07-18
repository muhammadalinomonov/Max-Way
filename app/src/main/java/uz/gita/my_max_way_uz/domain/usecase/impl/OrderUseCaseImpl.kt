package uz.gita.my_max_way_uz.domain.usecase.impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import uz.gita.my_max_way_uz.data.model.OrderData
import uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity
import uz.gita.my_max_way_uz.domain.repository.OrderRepository
import uz.gita.my_max_way_uz.domain.repository.RoomRepository
import uz.gita.my_max_way_uz.domain.usecase.OrderUseCase
import javax.inject.Inject

class OrderUseCaseImpl @Inject constructor(
    private val repository: OrderRepository,
    private val roomRepository: RoomRepository
) : OrderUseCase {
    override fun addToRoom(foodEntity: FoodEntity): Flow<Result<String>> = flow {
        roomRepository.addToRoom(foodEntity)
        emit(Result.success("Savatga qo'shildi"))
    }

    override fun addOrder(orderData: OrderData): Flow<Result<String>> =
        repository.addOrder(orderData)

    override fun update(foodEntity: FoodEntity): Flow<Unit> =
        roomRepository.updateOrder(foodEntity)

    override fun clearBasket(): Flow<Unit> = roomRepository.clearBasket()
    override fun getFoodsInBasket(): Flow<List<FoodEntity>> = roomRepository.getFoods()
    override fun deleteOrder(foodEntity: FoodEntity): Flow<Unit> = flow {
        roomRepository.deleteOrder(foodEntity)
        emit(Unit)
    }

    override fun getOrderedFoods(userId: String): Flow<Result<List<OrderData>>> =
        repository.getOrderedFoods(userId)

    override fun checkFood(foodEntity: FoodEntity): Boolean = roomRepository.checkFood(foodEntity)

}