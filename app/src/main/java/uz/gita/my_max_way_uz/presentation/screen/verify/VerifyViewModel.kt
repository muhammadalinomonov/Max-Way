package uz.gita.my_max_way_uz.presentation.screen.verify

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
import javax.inject.Inject

@HiltViewModel
class VerifyViewModel @Inject constructor(
    private val direction: VerifyContract.Direction,
    private val repository: AuthRepository,
    private val sharedPref: SharedPref
) : VerifyContract.ViewModel, ViewModel() {
    override val container =
        container<VerifyContract.UiState, VerifyContract.SideEffect>(VerifyContract.UiState.Default)

    override fun onEventDispatcher(intent: VerifyContract.Intent) {
        when (intent) {
            is VerifyContract.Intent.SmsData -> {
                repository.signWithCredential(intent.sms).onEach {
                    it.onSuccess {
                        intent {
                            sharedPref.hasToken = true
                            direction.openMainScreen()
                        }
                    }
                    it.onFailure {
                        intent {
                            postSideEffect(VerifyContract.SideEffect.HasError(it.message!!))
                        }
                    }
                }.launchIn(viewModelScope)
            }
        }
    }
}