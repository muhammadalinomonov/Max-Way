package uz.gita.my_max_way_uz.presentation.screen.login

import android.app.Activity
import org.orbitmvi.orbit.ContainerHost

interface LoginContract {
    sealed interface Intent {
        data class LoginData(val phone:String, val name:String, val activity:Activity):Intent
    }

    sealed interface UiState {
        object Default : UiState
    }

    sealed interface SideEffect {
        data class HasError(val message: String) : SideEffect
    }

    interface ViewModel : ContainerHost<UiState, SideEffect> {
        fun onEventDispatcher(intent: Intent)
    }
    interface LoginDirection {
        suspend fun openVerifyScreen()
    }

}