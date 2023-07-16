package uz.gita.my_max_way_uz.presentation.screen.splash

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import uz.gita.my_max_way_uz.data.source.local.sharedpref.SharedPref
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val direction: SplashDirection,
    private val sharedPref: SharedPref
) : ViewModel() {
    init {
        openNextScreen()
    }

    private fun openNextScreen() {
        viewModelScope.launch {

            //todo
            delay(1500)

            direction.openMainScreen()
            /*if (sharedPref.hasToken) {
                direction.openMainScreen()
            } else {
                direction.openLoginScreen()
            }*/
        }
    }
}