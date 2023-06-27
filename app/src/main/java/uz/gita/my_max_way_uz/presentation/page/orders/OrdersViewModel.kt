package uz.gita.my_max_way_uz.presentation.page.orders

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container
import uz.gita.my_max_way_uz.data.source.local.sharedpref.SharedPref
import uz.gita.my_max_way_uz.domain.usecase.OrderUseCase
import javax.inject.Inject

@HiltViewModel
class OrdersViewModel @Inject constructor(
    private val useCase: OrderUseCase,
    private val sharedPref: SharedPref
) :
    OrdersContact.ViewModel, ViewModel() {
    override val container =
        container<OrdersContact.UiState, OrdersContact.SideEffect>(OrdersContact.UiState.Load)

    init {
        onEventDispatcher(OrdersContact.Intent.Load)
    }

    override fun onEventDispatcher(intent: OrdersContact.Intent) {
        when (intent) {
            OrdersContact.Intent.Load -> {
                useCase.getOrderedFoods(sharedPref.phone)
                    .onEach {
                        it.onSuccess {
                            intent {
                                reduce {
                                    Log.d("TTTT", "$it")
                                    OrdersContact.UiState.Orders(it)
                                }
                            }
                        }
                    }.launchIn(viewModelScope)
            }
        }
    }
}