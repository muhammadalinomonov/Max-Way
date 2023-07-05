package uz.gita.my_max_way_uz.presentation.page.busket

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.postSideEffect
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container
import uz.gita.my_max_way_uz.data.model.OrderData
import uz.gita.my_max_way_uz.data.source.local.sharedpref.SharedPref
import uz.gita.my_max_way_uz.domain.usecase.OrderUseCase
import javax.inject.Inject

@HiltViewModel
class BasketViewModel @Inject constructor(
    private val useCase: OrderUseCase,
    private val sharedPref: SharedPref
) : BasketContract.ViewModel, ViewModel() {
    override val container =
        container<BasketContract.UiState, BasketContract.SideEffect>(BasketContract.UiState.Load)

    override fun onEventDispatcher(intent: BasketContract.Intent) {
        when (intent) {
            is BasketContract.Intent.ChangeCount -> {
                useCase.update(intent.foodEntity.changeCount(intent.count))
                    .onEach {
                    }.launchIn(viewModelScope)
            }

            BasketContract.Intent.ClearBasket -> {
                useCase.clearBasket().onEach {
                }.launchIn(viewModelScope)
            }

            is BasketContract.Intent.OrderToMarker -> {
                var allPrice = 0L
                intent.foodList.forEach {
                    allPrice += it.price
                }
                useCase.addOrder(
                    OrderData(
                        intent.foodList,
                        sharedPref.phone,
                        intent.comment,
                        intent.allPrice
                    )
                )
                    .onEach {
                        it.onSuccess {
                            useCase.clearBasket().onEach {

                            }.launchIn(viewModelScope)
                            intent {
                                Log.d("AAAAA", it)
                                postSideEffect(BasketContract.SideEffect.HasError(it))
                            }
                        }
                    }.launchIn(viewModelScope)
            }

            BasketContract.Intent.Load -> {
                useCase.getFoodsInBasket().onEach {
                    intent {
                        reduce {
                            BasketContract.UiState.FoodsInBasket(it)
                        }
                    }
                }.launchIn(viewModelScope)
            }

            is BasketContract.Intent.DeleteItem -> {
                useCase.deleteOrder(intent.foodData).onEach {
                }.launchIn(viewModelScope)
            }
        }
    }
}