package uz.gita.my_max_way_uz.presentation.screen.verify

import uz.gita.my_max_way_uz.navigation.AppNavigator
import uz.gita.my_max_way_uz.presentation.screen.main.MainScreen
import javax.inject.Inject

class VerifyDirection @Inject constructor(private val navigator: AppNavigator) :
    VerifyContract.Direction {
    override suspend fun openMainScreen() {
        navigator.navigateTo(MainScreen())
    }
}