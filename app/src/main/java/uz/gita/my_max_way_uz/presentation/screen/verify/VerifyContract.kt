package uz.gita.my_max_way_uz.presentation.screen.verify

import org.orbitmvi.orbit.ContainerHost

interface VerifyContract {
    sealed interface Intent{
        data class SmsData(val sms:String):Intent
    }
    sealed interface UiState{
        object Default:UiState
    }
    sealed interface SideEffect{
        data class HasError(val message:String):SideEffect
    }
    interface ViewModel:ContainerHost<UiState, SideEffect>{
        fun onEventDispatcher(intent: Intent)
    }
    interface Direction{
        suspend fun openMainScreen()
    }
}