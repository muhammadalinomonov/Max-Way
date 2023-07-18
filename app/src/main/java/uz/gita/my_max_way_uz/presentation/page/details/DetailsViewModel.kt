package uz.gita.my_max_way_uz.presentation.page.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.postSideEffect
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container
import uz.gita.my_max_way_uz.data.source.local.sharedpref.SharedPref
import uz.gita.my_max_way_uz.domain.usecase.OrderUseCase
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(
    private val directions: DetailsContract.Directions,
    private val useCase: OrderUseCase,
    private val sharedPref: SharedPref
) : ViewModel(), DetailsContract.ViewModel {
    override val container =
        container<DetailsContract.UiState, DetailsContract.SideEffect>(DetailsContract.UiState.Load)

    override fun onEventDispatcher(intent: DetailsContract.Intent) {
        when (intent) {
            is DetailsContract.Intent.AddToOrder -> {
                useCase.addToRoom(intent.food.toFoodEntityData(intent.count, sharedPref.phone))
                    .onEach {
                        it.onSuccess {
                            intent {
                                postSideEffect(DetailsContract.SideEffect.ShowSnackBar(it))
                            }
                        }
                        it.onFailure {
                            intent {
                                postSideEffect(DetailsContract.SideEffect.ShowSnackBar(it.message!!))
                            }
                        }
                    }.launchIn(viewModelScope)
            }

            DetailsContract.Intent.BackToHome -> {
                viewModelScope.launch {
                    directions.backToHome()
                }
            }

            is DetailsContract.Intent.ChangeCount -> {
                intent {
                    reduce {
                        DetailsContract.UiState.Count(intent.count)
                    }
                }
            }

            DetailsContract.Intent.OpenToBucketScreen -> {
                viewModelScope.launch {
                    directions.openBasketScreen()
                }
            }

            is DetailsContract.Intent.CheckFood -> {
                intent { reduce { DetailsContract.UiState.CheckFood(useCase.checkFood(intent.foodEntity)) } }
            }
        }
    }
}