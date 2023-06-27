package uz.gita.my_max_way_uz.presentation.screen.login

import uz.gita.my_max_way_uz.navigation.AppNavigator
import uz.gita.my_max_way_uz.presentation.screen.verify.VerifyScreen
import javax.inject.Inject

class LoginDirectionImpl @Inject constructor(private val navigator: AppNavigator) :
    LoginContract.LoginDirection {
    override suspend fun openVerifyScreen() {
        navigator.navigateTo(VerifyScreen())
    }
}