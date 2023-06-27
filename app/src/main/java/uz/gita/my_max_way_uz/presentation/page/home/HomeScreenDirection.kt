package uz.gita.my_max_way_uz.presentation.page.home

import uz.gita.my_max_way_uz.data.model.FoodData
import uz.gita.my_max_way_uz.navigation.AppNavigator
import uz.gita.my_max_way_uz.presentation.page.details.DetailsScreen
import javax.inject.Inject

class HomeScreenDirection @Inject constructor(private val appNavigator: AppNavigator) :
    HomeContact.Directions {
    override suspend fun navigateToDetailsScreen(foodData: FoodData) {
        appNavigator.navigateTo(DetailsScreen(foodData))
    }

}