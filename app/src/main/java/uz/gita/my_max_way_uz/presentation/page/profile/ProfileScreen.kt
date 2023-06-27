package uz.gita.my_max_way_uz.presentation.page.profile

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.res.painterResource
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import uz.gita.my_max_way_uz.R
import uz.gita.my_max_way_uz.navigation.AppScreen


class ProfileScreen:Tab, AppScreen() {
    override val options: TabOptions
        @Composable
        get() {
            val title = "Profile Screen"
            val icon = painterResource(id = R.drawable.ic_profile)
            return remember {
                TabOptions(
                    index = 0u,
                    title = title,
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {

    }
}