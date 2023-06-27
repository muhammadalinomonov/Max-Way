package uz.gita.my_max_way_uz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.Navigator
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.my_max_way_uz.navigation.NavigationHandler
import uz.gita.my_max_way_uz.presentation.screen.splash.SplashScreen
import uz.gita.my_max_way_uz.ui.theme.MaxWayTheme
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var navigationHandler: NavigationHandler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaxWayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Navigator(screen = SplashScreen()) { navigator ->
                        LaunchedEffect(navigator) {
                            navigationHandler.navigationStack
                                .onEach { it.invoke(navigator) }
                                .launchIn(lifecycleScope)
                        }
                        CurrentScreen()
                    }
                }
            }
        }
    }
}


