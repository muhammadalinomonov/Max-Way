package uz.gita.my_max_way_uz.presentation.page.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.hilt.getViewModel
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import uz.gita.my_max_way_uz.R
import uz.gita.my_max_way_uz.navigation.AppScreen


class ProfileScreen : Tab, AppScreen() {
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
        val viewModel: ProfileContact.ViewModel = getViewModel<ProfileViewModel>()
        val uiState = viewModel.uiState.collectAsState().value

        HomeScreenContent(uiState, viewModel::onEventDispatcher)
    }

    @Composable
    private fun HomeScreenContent(
        uiState: ProfileContact.UiState,
        onEventDispatcher: (ProfileContact.Intent) -> Unit
    ) {


        onEventDispatcher(ProfileContact.Intent.Load)
        Surface(
            modifier = Modifier
                .fillMaxSize()

        ) {
            Column(modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFCECACA))) {
                Row(modifier = Modifier.fillMaxWidth().height(56.dp).background(Color.White), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Profile",
                        modifier = Modifier
                            .background(Color.White)
                            .padding(bottom = 16.dp)
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(8.dp))
                        .padding(top = 12.dp)
                        .padding(bottom = 16.dp)
                        .background(Color.White)
                        .height(100.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.padding(start = 16.dp)) {
                        if (uiState.name.isNotEmpty()) {
                            Text(text = uiState.name)
                        }
                        Text(text = uiState.phoneNumber, modifier = Modifier.padding(top = 8.dp))
                    }


                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(end = 16.dp)
                            .clickable {
                                onEventDispatcher(ProfileContact.Intent.OpenEditProfileScreen)
                            })
                }
            }

        }
    }
}