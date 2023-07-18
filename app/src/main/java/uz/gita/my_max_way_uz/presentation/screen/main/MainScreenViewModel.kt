package uz.gita.my_max_way_uz.presentation.screen.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container
import uz.gita.my_max_way_uz.domain.repository.RoomRepository
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModel @Inject constructor(private val repository: RoomRepository) :
    MainScreenContract.ViewModel, ViewModel() {
    override val container = container<MainScreenContract.UiState, MainScreenContract.UiState>(
        MainScreenContract.UiState()
    )

    init {
        onEventDispatcher(MainScreenContract.Intent.Load)
    }

    override fun onEventDispatcher(intent: MainScreenContract.Intent) {
        when (intent) {
            MainScreenContract.Intent.Load -> {
                repository.getFoods().onEach {
                    intent {
                        reduce { MainScreenContract.UiState(it.size) }
                    }
                }.launchIn(viewModelScope)
            }
        }
    }

}