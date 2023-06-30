package uz.gita.my_max_way_uz.presentation.page.editprofile

import uz.gita.my_max_way_uz.navigation.AppNavigator
import javax.inject.Inject

class EditProfileDirections @Inject constructor(private val navigator: AppNavigator) :
    EditProfileContact.Directions {
    override suspend fun backToProfile() {
        navigator.back()
    }

}