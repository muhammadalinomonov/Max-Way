package uz.gita.my_max_way_uz.presentation.page.home

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import cafe.adriel.voyager.hilt.getViewModel
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import org.orbitmvi.orbit.compose.collectAsState
import uz.gita.my_max_way_uz.R
import uz.gita.my_max_way_uz.data.model.CategoryData
import uz.gita.my_max_way_uz.navigation.AppScreen
import uz.gita.my_max_way_uz.ui.component.CustomSearchView
import uz.gita.my_max_way_uz.ui.component.FoodItem

class HomeScreen : Tab, AppScreen() {
    override val options: TabOptions
        @Composable
        get() {
            val title = "Home"

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
        val uiState = viewModel.collectAsState()

        HomeScreenContent(uiState.value, viewModel::onEventDispatcher)
    }


    @SuppressLint("MutableCollectionMutableState")
    @Composable
    fun HomeScreenContent(
        uiState: HomeContact.UiState,
        onEventDispatcher: (HomeContact.Intent) -> Unit
    ) {
        var categories by remember { mutableStateOf(mutableListOf<String>()) }
        var foodsList by remember { mutableStateOf(mutableListOf<CategoryData>()) }

        var search by remember { mutableStateOf("") }


//        onEventDispatcher(HomeContact.Intent.Load)
        when (uiState) {
            is HomeContact.UiState.Categories -> {
                categories =
                    uiState.categories as ArrayList<String>
            }

            is HomeContact.UiState.Foods -> {
                foodsList =
                    uiState.foodList as ArrayList<CategoryData>
            }

            HomeContact.UiState.Loading -> {}
        }
//        var selectedCategories by remember { mutableStateOf(mutableListOf<String>()) }


        val selectedCategories = arrayListOf<String>()
        Surface(modifier = Modifier.fillMaxSize()) {

            val categories = foodsList.map { it.name }

            LazyColumn(modifier = Modifier.fillMaxSize()) {
                item {
                    CustomSearchView(search = search) {
                        search = it
                        onEventDispatcher(HomeContact.Intent.Search((search)))
                    }
                }
                item {
                    LazyRow {
                        items(categories.size) {


                            Button(
                                onClick = {
                                    if (selectedCategories.contains(foodsList[it].name)) {
                                        selectedCategories.remove(foodsList[it].name)
                                    } else {
                                        selectedCategories.add(foodsList[it].name)
                                    }

                                    onEventDispatcher(
                                        HomeContact.Intent.SelectCategories(selectedCategories)
                                    )
                                },
                                colors = if (selectedCategories.contains(foodsList[it].name)) ButtonDefaults.buttonColors(
                                    Color.Blue
                                ) else ButtonDefaults.buttonColors(
                                    Color(0xFF9E9B9B)
                                )
                            ) {
                                Text(text = foodsList[it].name)
                            }
                        }
                    }
                }

                items(foodsList) { categoryData ->
                    Column {
                        Text(text = categoryData.name)
                        categoryData.items.forEach { it ->
                            FoodItem(foodData = it) {
                                onEventDispatcher(HomeContact.Intent.OpenDetailsScreen(it))
                            }
                        }
                    }
                }
            }
        }
    }
}

