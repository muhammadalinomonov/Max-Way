package uz.gita.my_max_way_uz.presentation.page.profile

import uz.gita.my_max_way_uz.navigation.AppNavigator
import uz.gita.my_max_way_uz.presentation.page.editprofile.EditProfileScreen
import javax.inject.Inject

class ProfileScreenDirections @Inject constructor(private val navigator: AppNavigator) :
    ProfileContact.Directions {
    override suspend fun openEditProfileScreen() {
        navigator.navigateTo(EditProfileScreen())
    }
}