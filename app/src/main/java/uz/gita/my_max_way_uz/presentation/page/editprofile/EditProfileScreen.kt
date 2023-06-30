package uz.gita.my_max_way_uz.presentation.page.editprofile

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.hilt.getViewModel
import com.vanpra.composematerialdialogs.MaterialDialog
import com.vanpra.composematerialdialogs.datetime.date.datepicker
import com.vanpra.composematerialdialogs.rememberMaterialDialogState
import uz.gita.my_max_way_uz.R
import uz.gita.my_max_way_uz.navigation.AppScreen
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale

class EditProfileScreen : AppScreen() {
    @RequiresApi(Build.VERSION_CODES.O)
    @Composable
    override fun Content() {
        val viewModel: EditProfileContact.ViewModel = getViewModel<EditProfileViewModel>()
        val uiState = viewModel.uiState.collectAsState().value

        EditProfileContent(uiState, viewModel::onEventDispatcher)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun EditProfileContent(
        uiState: EditProfileContact.UiState,
        onEventsDispatcher: (EditProfileContact.Intent) -> Unit
    ) {
        var name by remember { mutableStateOf(uiState.name) }
        val phoneNumber by remember { mutableStateOf(uiState.phoneNumber) }

        var pickedDate by remember { mutableStateOf(LocalDate.now()) }

        val dateDialogState = rememberMaterialDialogState()

        var birthday by remember{ mutableStateOf(uiState.birthday) }
        val formattedDate by remember {
            derivedStateOf {
                DateTimeFormatter
                    .ofPattern("dd.MM.yyyy")
                    .format(pickedDate)
            }
        }

        Scaffold(modifier = Modifier.fillMaxSize(), topBar = { TopBar(onEventsDispatcher) }) {
            Column(modifier = Modifier.padding(it)) {
                Text(text = "Full name")
                TextField(
                    value = name,
                    onValueChange = { newWord -> name = newWord },
                    placeholder = { "Enter your name" },
                    modifier = Modifier.fillMaxWidth()
                )
                Text(text = "Phone number:")
                Log.d("KKKK", phoneNumber)
                TextField(
                    value = phoneNumber,
                    onValueChange = { },
                    placeholder = { "Enter your name" },
                    modifier = Modifier.fillMaxWidth(),
                    enabled = false
                )

                Text(text = "Your Birthday")

                TextField(
                    value = birthday,
                    onValueChange = { },
                    enabled = false,
                    modifier = Modifier.fillMaxWidth(),
                    trailingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_calendar),
                            contentDescription = null,
                            modifier = Modifier.clickable {

                                dateDialogState.show()
                            }
                        )
                    })


                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(0.dp)
                        .weight(1f)
                )

                Button(
                    onClick = {
                        onEventsDispatcher(
                            EditProfileContact.Intent.SaveData(
                                name,
                                formattedDate
                            )
                        )
                    }, modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .padding(horizontal = 16.dp)
                ) {
                    Text(text = "Save")
                }
            }

        }


        MaterialDialog(
            dialogState = dateDialogState,
            buttons = {
                positiveButton(text = "Ok") {
                    // todo
                }
                negativeButton(text = "Cancel")
            }
        ) {
            datepicker(
                initialDate = LocalDate.now(),
                title = "Pick a date",
                allowedDateValidator = {
                    it < LocalDate.now()
                }
            ) {
                birthday = it.toString()
            }
        }
    }

    @Composable
    private fun TopBar(onEventsDispatcher: (EditProfileContact.Intent) -> Unit) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp)
                .height(56.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = null,
                modifier = Modifier
                    .clip(RoundedCornerShape(50f))
                    .clickable {
                        onEventsDispatcher(EditProfileContact.Intent.BackToProfile)
                    })

            Text(text = "Edit profile", modifier = Modifier.padding(start = 16.dp))

        }
    }
}

fun String.toDate(): Date {
    val format = SimpleDateFormat("dd.MM.yyyy", Locale.getDefault())
    format.parse(this)
    return format.calendar.time
}