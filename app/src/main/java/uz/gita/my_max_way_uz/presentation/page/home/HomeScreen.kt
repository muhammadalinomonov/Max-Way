package uz.gita.my_max_way_uz.presentation.page.home

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.hilt.getViewModel
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import uz.gita.my_max_way_uz.R
import uz.gita.my_max_way_uz.data.model.CategoryData
import uz.gita.my_max_way_uz.navigation.AppScreen
import uz.gita.my_max_way_uz.ui.component.CustomSearchView
import uz.gita.my_max_way_uz.ui.component.FoodItem

class HomeScreen : Tab, AppScreen() {
    override val options: TabOptions
        @Composable
        get() {
            val title = "Asosiy"

            val icon = painterResource(id = R.drawable.ic_home)
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
        val viewModel: HomeContact.ViewModel = getViewModel<HomeViewModel>()
        val uiState = viewModel.uiState.collectAsState().value

        HomeScreenContent(uiState, viewModel::onEventDispatcher)
    }


    @SuppressLint("MutableCollectionMutableState")
    @Composable
    fun HomeScreenContent(
        uiState: HomeContact.UiState,
        onEventDispatcher: (HomeContact.Intent) -> Unit
    ) {
        var foodsList by remember { mutableStateOf(listOf<CategoryData>()) }

        var search by remember { mutableStateOf("") }


        foodsList = uiState.foods

        val selectedCategories by remember {
            mutableStateOf(arrayListOf<String>())
        }



        Surface(modifier = Modifier.fillMaxSize()) {


            LazyColumn(modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF4F4F4))) {
                item {
                    CustomSearchView(search = search) {
                        search = it
                        onEventDispatcher(HomeContact.Intent.Search((search)))
                    }
                }
                item {
                    LazyRow(modifier = Modifier.padding(top = 8.dp)) {
                        item { Spacer(modifier = Modifier.width(10.dp)) }
                        items(uiState.categories.size) {
                            Button(
                                onClick = {
                                    if (selectedCategories.contains(uiState.categories[it])) {
                                        selectedCategories.remove(uiState.categories[it])
                                    } else {
                                        selectedCategories.add(uiState.categories[it])
                                    }

                                    onEventDispatcher(
                                        HomeContact.Intent.SelectCategories(selectedCategories)
                                    )
                                },
                                modifier = Modifier
                                    .padding(horizontal = 2.dp)
                                    .clip(RoundedCornerShape(1.dp)),
                                shape = MaterialTheme.shapes.small,
                                colors = if (selectedCategories.contains(uiState.categories[it])) {
                                    ButtonDefaults.buttonColors(Color(0xFF50267D))
                                } else
                                    ButtonDefaults.buttonColors(Color(0xFF9E9B9B))
                            ) {
                                Text(text = uiState.categories[it])
                            }
                        }
                    }
                }

                items(uiState.foods) { categoryData ->
                    Column(
                        modifier = Modifier
                            .padding(top = 16.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(Color.White)
                    ) {
                        Text(
                            text = categoryData.name,
                            Modifier.padding(start = 10.dp, top = 10.dp),
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Medium
                        )
                        categoryData.items.forEach { it ->
                            FoodItem(foodData = it) {
                                onEventDispatcher(HomeContact.Intent.OpenDetailsScreen(it))
                            }
                        }
                    }
                }
            }

            if (uiState.foods.isEmpty()) {

                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(60.dp),
                        strokeWidth = 8.dp,
                        color = Color(0xFF50267D)
                    )
                }
            }
        }
    }
}

