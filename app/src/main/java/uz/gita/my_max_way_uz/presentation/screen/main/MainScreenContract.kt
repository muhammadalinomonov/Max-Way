package uz.gita.my_max_way_uz.presentation.screen.main

import org.orbitmvi.orbit.ContainerHost

interface MainScreenContract {
    sealed interface Intent {
        object Load : Intent
    }

    data class UiState(val count: Int = 0)

    interface ViewModel : ContainerHost<UiState, UiState> {
        fun onEventDispatcher(intent: Intent)
    }
}