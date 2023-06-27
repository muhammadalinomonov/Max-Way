package uz.gita.my_max_way_uz.presentation.screen.login

import android.app.Activity
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.hilt.getViewModel
import org.orbitmvi.orbit.compose.collectAsState
import uz.gita.my_max_way_uz.navigation.AppScreen

class LoginScreen  : AppScreen() {
    @Composable
    override fun Content() {

        val viewModel: LoginContract.ViewModel = getViewModel<LoginViewModel>()
        val uiState = viewModel.collectAsState()
        LoginScreenContent(uiState, viewModel::onEventDispatcher)
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun LoginScreenContent(
        uiState: State<LoginContract.UiState>,
        eventDispatcher: (LoginContract.Intent) -> Unit
    ) {
        val context = LocalContext.current


        var mobile by remember { mutableStateOf("+998") }


        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Enter Mobile Number")
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(value = mobile, onValueChange = {
                    mobile = it
                }, label = { Text("Phone number") }, modifier = Modifier.fillMaxWidth())
                Spacer(modifier = Modifier.height(20.dp))











                Button(onClick = {
                    eventDispatcher(LoginContract.Intent.LoginData(mobile, "", context as Activity))
                }) {
                    Text(text = "Submit")
                }
            }
        }
    }


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun PhoneNumberTextField(
        phoneNumber: String,
        onPhoneNumberChange: (String) -> Unit
    ) {
        val defaultCountryCode = "+1" // Replace with your desired default country code

        var isDefaultCodeVisible by remember { mutableStateOf(true) }

        TextField(
            value = if (phoneNumber.isBlank()) defaultCountryCode else phoneNumber,
            onValueChange = {
                if (it == defaultCountryCode) {
                    onPhoneNumberChange("")
                    isDefaultCodeVisible = true
                } else {
                    onPhoneNumberChange(it)
                    isDefaultCodeVisible = false
                }
            },
            placeholder = {
                Text(
                    text = if (isDefaultCodeVisible) defaultCountryCode else "",
                    color = if (isDefaultCodeVisible) LocalContentColor.current.copy(alpha = 0.5f)
                    else LocalContentColor.current
                )
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Phone
            ),
            visualTransformation = if (isDefaultCodeVisible) VisualTransformation.None
            else VisualTransformation.None // Replace with desired transformation
        )
    }
}
