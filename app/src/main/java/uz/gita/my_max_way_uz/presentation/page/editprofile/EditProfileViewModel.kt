package uz.gita.my_max_way_uz.presentation.page.editprofile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import uz.gita.my_max_way_uz.data.source.local.sharedpref.SharedPref
import javax.inject.Inject

@HiltViewModel
class EditProfileViewModel @Inject constructor(
    private val sharedPref: SharedPref,
    private val directions: EditProfileContact.Directions
) :
    EditProfileContact.ViewModel, ViewModel() {
    override val uiState = MutableStateFlow(EditProfileContact.UiState())

    init {
        onEventDispatcher(EditProfileContact.Intent.Load)
    }
    override fun onEventDispatcher(intent: EditProfileContact.Intent) {
        when (intent) {
            is EditProfileContact.Intent.SaveData -> {
                uiState.update {
                    it.copy(birthday = intent.date)
                }
                uiState.update {
                    it.copy(name = intent.name)
                }

                sharedPref.name = intent.name
                sharedPref.birthday = intent.date
            }


            EditProfileContact.Intent.Load -> {


                uiState.update {
                    it.copy(birthday = sharedPref.birthday)
                }
                uiState.update {
                    it.copy(name = sharedPref.name)
                }
                uiState.update {
                    it.copy(phoneNumber = sharedPref.phone)
                }
            }

            EditProfileContact.Intent.BackToProfile -> {
                viewModelScope.launch {
                    directions.backToProfile()
                }
            }
        }
    }
}