package uz.gita.my_max_way_uz.presentation.screen.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.hilt.getViewModel
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import org.orbitmvi.orbit.compose.collectAsState
import uz.gita.my_max_way_uz.navigation.AppScreen
import uz.gita.my_max_way_uz.presentation.page.busket.BasketScreen
import uz.gita.my_max_way_uz.presentation.page.home.HomeScreen
import uz.gita.my_max_way_uz.presentation.page.orders.OrdersScreen
import uz.gita.my_max_way_uz.presentation.page.profile.ProfileScreen

class MainScreen(private val defaultScreen: Tab = HomeScreen()) : AppScreen() {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable


    override fun Content() {

        val viewModel: MainScreenContract.ViewModel = getViewModel<MainScreenViewModel>()
        val count = viewModel.collectAsState().value.count
        TabNavigator(defaultScreen) {
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
                    NavigationBar(
                        modifier = Modifier
                            .height(70.dp)
                            .background(Color.White),
                        contentColor = Color.White,
                        containerColor = Color.White
                    ) {
                        TabNavigationItem(tab = HomeScreen())
                        TabNavigationItem(tab = BasketScreen(), count)
                        TabNavigationItem(tab = OrdersScreen())
                        TabNavigationItem(tab = ProfileScreen())
                    }
                }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun RowScope.TabNavigationItem(tab: Tab, badgeCount: Int = 0) {
    val tabNavigator = LocalTabNavigator.current

    NavigationBarItem(
        selected = tabNavigator.current == tab,
        onClick = { tabNavigator.current = tab },
        alwaysShowLabel = true,
        label = {
            Text(
                text = tab.options.title,
                modifier = Modifier,
                color = if (tabNavigator.current == tab) Color(0xFF50267D) else Color.Black,
                fontSize = 11.sp
            )
        },
        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = Color.White,
            unselectedIconColor = MaterialTheme.colorScheme.onPrimary,
            indicatorColor = Color.White
        ),
        icon = {


            if (badgeCount > 0) {
                BadgedBox(badge = {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .background(Color.Red), contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = badgeCount.toString(),
                            color = Color.White,
                            modifier = Modifier
                                .background(Color.Red)
                                .padding(horizontal = 8.dp, vertical = 4.dp),
                            fontSize = 10.sp
                        )
                    }
                }) {
                    Icon(
                        painter = tab.options.icon!!,
                        contentDescription = null,
                        tint = if (tabNavigator.current == tab) Color(0xFF50267D) else Color(
                            0xFF979191
                        )
                    )
                }
            } else {
                Icon(
                    painter = tab.options.icon!!,
                    contentDescription = null,
                    tint = if (tabNavigator.current == tab) Color(0xFF50267D) else Color(0xFF979191)
                )
            }
            /*Icon(
                painter = tab.options.icon!!,
                contentDescription = tab.options.title,
                tint = if (tabNavigator.current == tab) Color(0xFF50267D) else Color.Black
            )*/
        }

    )
}