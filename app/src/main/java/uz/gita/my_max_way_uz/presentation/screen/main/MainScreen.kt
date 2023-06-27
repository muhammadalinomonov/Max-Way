package uz.gita.my_max_way_uz.presentation.screen.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import uz.gita.my_max_way_uz.navigation.AppScreen
import uz.gita.my_max_way_uz.presentation.page.busket.BasketScreen
import uz.gita.my_max_way_uz.presentation.page.home.HomeScreen
import uz.gita.my_max_way_uz.presentation.page.orders.OrdersScreen
import uz.gita.my_max_way_uz.presentation.page.profile.ProfileScreen

class MainScreen : AppScreen() {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        TabNavigator(HomeScreen()) {
            Scaffold(
                content = {
                    Box(
                        Modifier
                            .fillMaxSize()
                            .padding(it)
                    ) {
                        CurrentTab()
                    }
                },
                bottomBar = {
                    NavigationBar(modifier = Modifier) {
                        TabNavigationItem(tab = HomeScreen())
                        TabNavigationItem(tab = BasketScreen())
                        TabNavigationItem(tab = OrdersScreen())
//                        TabNavigationItem(tab = ProfileScreen())
                    }
                }
            )
        }
    }
}

@Composable
private fun RowScope.TabNavigationItem(tab: Tab) {
    val tabNavigator = LocalTabNavigator.current

    NavigationBarItem(
        selected = tabNavigator.current == tab,
        onClick = { tabNavigator.current = tab },
        icon = { Icon(painter = tab.options.icon!!, contentDescription = tab.options.title) }
    )
}