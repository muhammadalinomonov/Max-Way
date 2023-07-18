package uz.gita.my_max_way_uz.presentation.page.details

import org.orbitmvi.orbit.ContainerHost
import uz.gita.my_max_way_uz.data.model.FoodData
import uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity

interface DetailsContract {
    sealed interface Intent {
        object BackToHome : Intent
        data class ChangeCount(val count: Int, val price: Long) : Intent
        data class AddToOrder(val food: FoodData, val count: Int) : Intent
        object OpenToBucketScreen : Intent

        data class CheckFood(val foodEntity: FoodEntity) : Intent
    }

    sealed interface UiState {
        object Load : UiState

        data class CheckFood(val state: Boolean) : UiState
        data class Count(val count: Int) : UiState
    }

    sealed interface SideEffect {
        data class ShowSnackBar(val message: String) : SideEffect
    }

    interface ViewModel : ContainerHost<UiState, SideEffect> {
        fun onEventDispatcher(intent: Intent)
    }

    interface Directions {
        suspend fun backToHome()
        suspend fun openBasketScreen()
    }
}