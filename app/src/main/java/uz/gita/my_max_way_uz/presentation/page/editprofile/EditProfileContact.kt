package uz.gita.my_max_way_uz.presentation.page.editprofile

import kotlinx.coroutines.flow.StateFlow

interface EditProfileContact {
    sealed interface Intent {
        object Load : Intent
        object BackToProfile:Intent
        data class SaveData(val name: String, val date: String) : Intent
    }

    data class UiState(
        val name: String = "",
        val phoneNumber: String = "",
        val birthday: String = ""
    )

    interface ViewModel {
        val uiState: StateFlow<UiState>
        fun onEventDispatcher(intent: Intent)

    }

    interface Directions{
        suspend fun backToProfile()
    }
}