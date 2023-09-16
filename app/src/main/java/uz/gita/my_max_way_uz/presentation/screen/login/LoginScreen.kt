package uz.gita.my_max_way_uz.presentation.screen.login

import android.app.Activity
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.hilt.getViewModel
import org.orbitmvi.orbit.compose.collectAsState
import uz.gita.my_max_way_uz.navigation.AppScreen
import uz.gita.my_max_way_uz.ui.component.CommonLoginButton
import uz.gita.my_max_way_uz.ui.component.CommonText
import uz.gita.my_max_way_uz.ui.component.CommonTextField
import uz.gita.my_max_way_uz.utils.PhoneVisualTransformation

class LoginScreen : AppScreen() {
    @Composable
    override fun Content() {
        val viewModel: LoginContract.ViewModel = getViewModel<LoginViewModel>()
        val uiState = viewModel.collectAsState()
        val context = LocalContext.current
        LoginScreenContent(uiState, viewModel::onEventDispatcher, context)
    }
}

@Composable
fun LoginScreenContent(
    uiState: State<LoginContract.UiState>,
    onEventDispatcher: (LoginContract.Intent) -> Unit,
    context: Context
) {

    when (uiState.value) {
        is LoginContract.UiState.Default -> {
            var mobile by remember { mutableStateOf("") }
            var name by remember { mutableStateOf("") }

            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 30.dp, end = 30.dp, top = 20.dp, bottom = 20.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Spacer(modifier = Modifier.height(60.dp))
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        CommonText(
                            text = "Xush Kelibsiz,",
                            fontSize = 34.sp,
                            fontWeight = FontWeight.Bold
                        ) {}
                        Spacer(modifier = Modifier.height(5.dp))
                        CommonText(
                            text = "Ismingiz va telefon raqamingizni kiriting!",
                            fontSize = 28.sp,
                            color = Color.Gray
                        ) {}
                    }
                    Spacer(modifier = Modifier.height(60.dp))
                    CommonTextField(
                        text = name,
                        placeholder = "Ism",
                        onValueChange = { name = it },
                        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    CommonTextField(
                        text = mobile,
                        placeholder = "+998 YY YYY YY YY",
                        onValueChange = {
                            if (it.length < 10) {
                                mobile = it
                            }
                        },

                        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Phone),
                        visualTransformation = PhoneVisualTransformation(
                            mask = "+998 00 000 00 00",
                            '0'
                        )
                    )

                    Spacer(modifier = Modifier.height(150.dp))

                    CommonLoginButton(
                        text = "Keyingi",
                        mobile.length == 9 && name.isNotEmpty(),
                        modifier = Modifier.fillMaxWidth()
                    ) {

                        if (mobile.length == 9 && name.isNotEmpty()) {
                            onEventDispatcher.invoke(
                                LoginContract.Intent.LoginData(
                                    "+998$mobile",
                                    name,
                                    context as Activity
                                )
                            )
                        } else {
                            Toast.makeText(context, "Please fill data", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }

        is LoginContract.UiState.Load -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
        }
    }

}

@Preview
@Composable
fun LoginScreenPreview() {
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        LoginScreenContent(
            uiState = remember {
                mutableStateOf(LoginContract.UiState.Default)
            },
            onEventDispatcher = {

            },
            context = context
        )
    }
}