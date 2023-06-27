package uz.gita.my_max_way_uz.presentation.page.busket

import org.orbitmvi.orbit.ContainerHost
import uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity

interface BasketContract {
    sealed interface Intent {
        object Load : Intent
        object ClearBasket : Intent
        data class ChangeCount(val foodEntity: FoodEntity, val count: Int) : Intent
        data class DeleteItem(val foodData: FoodEntity) : Intent

        data class OrderToMarker(
            val foodList: List<FoodEntity>,
            val comment: String,
            val allPrice: Long
        ) : Intent

    }

    sealed interface UiState {
        object Load : UiState
        data class FoodsInBasket(val foods: List<FoodEntity>) : UiState
    }

    sealed interface SideEffect {
        data class HasError(val message: String) : SideEffect
    }

    interface ViewModel : ContainerHost<UiState, SideEffect> {
        fun onEventDispatcher(intent: Intent)
    }

    interface Directions {
        suspend fun backToHome()
    }
}