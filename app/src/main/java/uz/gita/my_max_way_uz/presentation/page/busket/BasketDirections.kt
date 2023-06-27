package uz.gita.my_max_way_uz.presentation.page.busket

import uz.gita.my_max_way_uz.navigation.AppNavigator
import javax.inject.Inject

class BasketDirections @Inject constructor(private val navigator: AppNavigator) :
    BasketContract.Directions {
    override suspend fun backToHome() {
        navigator.back()
    }
}