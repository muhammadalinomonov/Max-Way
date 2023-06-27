package uz.gita.my_max_way_uz.presentation.screen.verify

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.hilt.getViewModel
import org.orbitmvi.orbit.compose.collectAsState
import uz.gita.my_max_way_uz.navigation.AppScreen
import uz.gita.my_max_way_uz.ui.component.CommonLoginButton
import uz.gita.my_max_way_uz.ui.component.CommonText
import uz.gita.my_max_way_uz.ui.component.OtpView

class VerifyScreen : AppScreen() {
    @Composable
    override fun Content() {
        val viewModel: VerifyContract.ViewModel = getViewModel<VerifyViewModel>()
        val uiState = viewModel.collectAsState()
        val context = LocalContext.current
        VerifyScreenContent(uiState, viewModel::onEventDispatcher, context)
    }
}

@Composable
fun VerifyScreenContent(
    uiState: State<VerifyContract.UiState>,
    onEventDispatcher: (VerifyContract.Intent) -> Unit,
    context: Context
) {
    var smsCode by remember { mutableStateOf("") }


    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 30.dp, end = 30.dp, top = 20.dp, bottom = 20.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            CommonText(
                text = "Enter SMS code,",
                fontSize = 34.sp,
                fontWeight = FontWeight.Normal
            ) {}
            Spacer(modifier = Modifier.height(5.dp))

            Spacer(modifier = Modifier.height(20.dp))

            OtpView(otpText = smsCode, modifier = Modifier.fillMaxWidth()) {
                smsCode = it
            }

            Spacer(modifier = Modifier.height(130.dp))

            CommonLoginButton(text = "Next", modifier = Modifier.fillMaxWidth()) {
                if (smsCode.isNotEmpty()) {

                    onEventDispatcher(VerifyContract.Intent.SmsData(smsCode))

                } else {
                    Toast.makeText(context, "Please fill data", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}


@Preview
@Composable
fun VerifyScreenContentPreview() {
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        VerifyScreenContent(
            uiState = remember {
                mutableStateOf(VerifyContract.UiState.Default)
            },
            onEventDispatcher = {

            },
            context = context
        )
    }
}