package uz.gita.my_max_way_uz.presentation.screen.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import cafe.adriel.voyager.hilt.getViewModel
import uz.gita.my_max_way_uz.navigation.AppScreen
import uz.gita.my_max_way_uz.R

class SplashScreen : AppScreen() {
    @Composable
    override fun Content() {
        getViewModel<SplashViewModel>()
        SplashContent()
    }

    @Composable
    fun SplashContent() {
        Surface {
            Image(
                painterResource(id = R.drawable.splash),
                modifier = Modifier.background(Color(0xFF51277D)),
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
            )
        }
    }
}