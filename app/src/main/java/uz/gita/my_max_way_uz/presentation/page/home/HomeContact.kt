package uz.gita.my_max_way_uz.presentation.page.home

import org.orbitmvi.orbit.ContainerHost
import uz.gita.my_max_way_uz.data.model.CategoryData
import uz.gita.my_max_way_uz.data.model.FoodData

interface HomeContact {
    sealed interface Intent {
        object Load : Intent
        data class Search (val name:String): Intent
        data class SelectCategories(val list: List<String>) : Intent
        data class OpenDetailsScreen(val foodData: FoodData) : Intent

    }

    sealed interface UiState {
        object Loading : UiState
        data class Categories(val categories: List<String>) : UiState
        data class Foods(val foodList: List<CategoryData>) : UiState
    }

    sealed interface SideEffect {
        data class HasError(val message: String) : SideEffect
    }

    interface ViewModel : ContainerHost<UiState, SideEffect.HasError> {
        fun onEventDispatcher(intent: Intent)
    }

    interface Directions {
        suspend fun navigateToDetailsScreen(foodData: FoodData)
    }
}