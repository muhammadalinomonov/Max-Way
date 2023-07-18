package uz.gita.my_max_way_uz.presentation.page.details

import uz.gita.my_max_way_uz.navigation.AppNavigator
import uz.gita.my_max_way_uz.presentation.page.busket.BasketScreen
import uz.gita.my_max_way_uz.presentation.screen.main.MainScreen
import javax.inject.Inject

class DetailsDirections @Inject constructor(private val navigator: AppNavigator) :
    DetailsContract.Directions {
    override suspend fun backToHome() {
        navigator.back()
    }

    override suspend fun openBasketScreen() {
        navigator.replace(MainScreen(BasketScreen()))
    }
}