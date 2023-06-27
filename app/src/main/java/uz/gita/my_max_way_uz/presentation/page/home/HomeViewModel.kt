package uz.gita.my_max_way_uz.presentation.page.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container
import uz.gita.my_max_way_uz.domain.usecase.HomeUseCase
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val direction: HomeContact.Directions,
    private val useCase: HomeUseCase
) : HomeContact.ViewModel, ViewModel() {
    override val container =
        container<HomeContact.UiState, HomeContact.SideEffect.HasError>(HomeContact.UiState.Loading)

    init {
        onEventDispatcher(HomeContact.Intent.Load)
    }

    override fun onEventDispatcher(intent: HomeContact.Intent) {
        val list = arrayListOf<String>()
        when (intent) {
            HomeContact.Intent.Load -> {
                viewModelScope.launch {

                    useCase.getCategories().onEach {
                        it.onSuccess {
                            Log.d("SSS", "getCategories $it")
                            intent {
                                reduce {
                                    HomeContact.UiState.Categories(list.map { it })
                                }
                            }
                        }
                    }.launchIn(viewModelScope)
                    delay(1000)
                    useCase.getFoodsByCategory("", emptyList()).onEach {
                        it.onSuccess { list ->
                            Log.d("SSS", "getFoodsByCategory $list")
                            intent {
                                reduce {
                                    HomeContact.UiState.Categories(list.map { it.name })
                                }
                            }
                            intent{
                                reduce {
                                    HomeContact.UiState.Foods(list)
                                }
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
                useCase.getFoodsByCategory("", intent.list).onEach {
                    it.onSuccess {
                        Log.d("LLL", "$it")
                        intent {
                            reduce {
                                HomeContact.UiState.Foods(it)
                            }
                        }
                    }
                }.launchIn(viewModelScope)
            }

            is HomeContact.Intent.Search -> {
                useCase.getFoodsByCategory(intent.name, list)
                    .onEach {
                        it.onSuccess {
                            intent {
                                reduce {
                                    HomeContact.UiState.Foods(it)
                                }
                            }
                            Log.d("TTT", list.toString())
                            Log.d("TTT", "getFoods on success ${it.size}")

                        }
                        it.onFailure {

                        }
                    }.launchIn(viewModelScope)
            }
        }
    }

}
/*viewModelScope.launch {
                    useCase.getCategories().onEach {
                        it.onSuccess {
                            intent {
                                reduce {
                                    list.addAll(it)

                                    HomeContact.UiState.Categories(it)
                                }
                            }
                        }
                    }.launchIn(viewModelScope)
                    delay(2000)
                    useCase.getFoodsByCategory("", list)
                        .onEach {
                            it.onSuccess {
                                Log.d("LLL", "$it")
                                intent {
                                    reduce {
                                        HomeContact.UiState.Foods(it)
                                    }
                                }

                            }
                            it.onFailure {

                            }
                        }.launchIn(viewModelScope)
                }*/