package uz.gita.my_max_way_uz.presentation.page.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.orbitmvi.orbit.viewmodel.container
import uz.gita.my_max_way_uz.domain.usecase.HomeUseCase
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val direction: HomeContact.Directions,
    private val useCase: HomeUseCase
) : HomeContact.ViewModel, ViewModel() {
    override val container =
        container<HomeContact.UiState, HomeContact.SideEffect.HasError>(HomeContact.UiState())

    override val uiState = MutableStateFlow(HomeContact.UiState())

    init {
        onEventDispatcher(HomeContact.Intent.Load)
    }

    override fun onEventDispatcher(intent: HomeContact.Intent) {
        val list = arrayListOf<String>()
        when (intent) {
            HomeContact.Intent.Load -> {
                viewModelScope.launch {
                    useCase.getFoodsByCategory("", emptyList()).onEach { result ->
                        result.onSuccess { list ->
                            uiState.update {
                                it.copy(foods = list)
                            }
                        }

                    }.launchIn(viewModelScope)

                    useCase.getCategories().onEach { result ->
                        result.onSuccess { list ->
                            Log.d("YYY", list.toString())
                            uiState.update {
                                it.copy(categories = list)
                            }
                        }
                    }.launchIn(viewModelScope)

                }
            }


            is HomeContact.Intent.OpenDetailsScreen -> {
                viewModelScope.launch {
                    direction.navigateToDetailsScreen(intent.foodData)
                }
            }


            is HomeContact.Intent.SelectCategories -> {
                useCase.getFoodsByCategory("", intent.list).onEach { result ->
                    result.onSuccess { list ->
                        Log.d("YYY", "select" + list.toString())
                        uiState.update {
                            it.copy(foods = list)
                        }
                    }
                }.launchIn(viewModelScope)
            }

            is HomeContact.Intent.Search -> {
                useCase.getFoodsByCategory(intent.name, list)
                    .onEach { result ->
                        result.onSuccess { list ->
                            uiState.update {
                                it.copy(foods = list)
                            }

                        }
                        result.onFailure {
                        }
                    }.launchIn(viewModelScope)
            }
        }
    }

}