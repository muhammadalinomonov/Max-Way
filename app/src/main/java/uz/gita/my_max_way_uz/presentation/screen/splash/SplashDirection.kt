package uz.gita.my_max_way_uz.presentation.screen.splash

import uz.gita.my_max_way_uz.navigation.AppNavigator
import uz.gita.my_max_way_uz.presentation.screen.login.LoginScreen
import uz.gita.my_max_way_uz.presentation.screen.main.MainScreen
import javax.inject.Inject

interface SplashDirection {
    suspend fun openMainScreen()
    suspend fun openLoginScreen()
}

class SplashDirectionImpl @Inject constructor(private val navigator: AppNavigator) :
    SplashDirection {
    override suspend fun openMainScreen() {
        navigator.replace(MainScreen())
    }

    override suspend fun openLoginScreen() {
        navigator.replace(LoginScreen())
    }
}