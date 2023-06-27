package uz.gita.my_max_way_uz.presentation.page.orders

import org.orbitmvi.orbit.ContainerHost
import uz.gita.my_max_way_uz.data.model.OrderData

interface OrdersContact {
    sealed interface Intent {
        object Load : Intent
    }

    sealed interface UiState {
        object Load : UiState
        data class Orders(val orders: List<OrderData>) : UiState
    }

    sealed interface SideEffect {
        data class HasError(val message: String) : SideEffect
    }

    interface ViewModel : ContainerHost<UiState, SideEffect> {
        fun onEventDispatcher(intent: Intent)
    }


}