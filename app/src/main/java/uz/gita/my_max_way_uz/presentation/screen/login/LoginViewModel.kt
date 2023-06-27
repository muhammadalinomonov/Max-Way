package uz.gita.my_max_way_uz.presentation.screen.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.postSideEffect
import org.orbitmvi.orbit.viewmodel.container
import uz.gita.my_max_way_uz.data.source.local.sharedpref.SharedPref
import uz.gita.my_max_way_uz.domain.repository.AuthRepository
import uz.gita.my_max_way_uz.utils.myLog
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val direction: LoginContract.LoginDirection,
    private val repository: AuthRepository,
    private val sharedPref: SharedPref
) :
    LoginContract.ViewModel, ViewModel() {
    override val container =
        container<LoginContract.UiState, LoginContract.SideEffect>(LoginContract.UiState.Default)


    override fun onEventDispatcher(intent: LoginContract.Intent) {
        when (intent) {

            is LoginContract.Intent.LoginData -> {
                repository.sendSms(intent.phone, intent.activity)
                    .onEach {
                        it.onSuccess {
                            sharedPref.phone = intent.phone
                            sharedPref.hasToken = true
                            myLog("on success in view model")
                            direction.openVerifyScreen()
                        }
                        it.onFailure {
                            myLog(it.message!!)
                            intent {
                                postSideEffect(LoginContract.SideEffect.HasError(it.message!!))
                            }
                        }
                    }.launchIn(viewModelScope)
            }
        }
    }
}