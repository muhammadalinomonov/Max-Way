package uz.gita.my_max_way_uz.presentation.page.details

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.hilt.getViewModel
import coil.compose.AsyncImage
import coil.request.ImageRequest
import org.orbitmvi.orbit.compose.collectAsState
import org.orbitmvi.orbit.compose.collectSideEffect
import uz.gita.my_max_way_uz.R
import uz.gita.my_max_way_uz.data.model.FoodData
import uz.gita.my_max_way_uz.navigation.AppScreen

class DetailsScreen(private val foodData: FoodData) : AppScreen() {
    @Composable
    override fun Content() {
        val viewModel: DetailsContract.ViewModel = getViewModel<DetailsViewModel>()

        val context = LocalContext.current

        val uiState = viewModel.collectAsState()
        viewModel.collectSideEffect { sideEffect ->
            when (sideEffect) {
                is DetailsContract.SideEffect.ShowSnackBar -> {
                    //todo show snackbar
                    Toast.makeText(context, sideEffect.message, Toast.LENGTH_SHORT).show()
                }
            }
        }
        DetailsScreenContent(uiState, viewModel::onEventDispatcher)

    }


    @Composable
    private fun DetailsScreenContent(
        uiState: State<DetailsContract.UiState>,
        onEventDispatcher: (DetailsContract.Intent) -> Unit
    ) {
        var count by remember {
            mutableStateOf(1)
        }


        var isHave by remember {
            mutableStateOf(false)
        }
        when(val valueUiState = uiState.value){
            is DetailsContract.UiState.CheckFood -> {
                isHave = valueUiState.state
            }
            is DetailsContract.UiState.Count -> {

            }
            DetailsContract.UiState.Load -> {

            }
        }
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.fillMaxSize()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                ) {


                    AsyncImage(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White)
                            .clip(RoundedCornerShape(0.dp)),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(foodData.imgUrl)
                            .crossfade(true)
                            .build(),
                        placeholder = painterResource(id = R.drawable.foof_placeholder),
                        error = painterResource(id = R.drawable.foof_placeholder),
                        contentDescription = null
                    )

                    IconButton(
                        onClick = { onEventDispatcher(DetailsContract.Intent.BackToHome) },
                        modifier = Modifier
                            .padding(top = 2.dp, start = 2.dp)
                            .clip(shape = RoundedCornerShape(50))
                            .background(Color(0xFFFFFFFF))

                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            modifier = Modifier.clip(shape = RoundedCornerShape(50)),
                            contentDescription = null
                        )
                    }
                }

                Text(
                    text = foodData.name,
                    modifier = Modifier.padding(start = 8.dp, top = 8.dp),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )


                Text(
                    text = foodData.info,
                    modifier = Modifier.padding(top = 16.dp, start = 8.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )

                Spacer(
                    modifier = Modifier
                        .height(0.dp)
                        .weight(1f)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Card(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .width(120.dp)
                            .height(42.dp)
                            .padding(start = 8.dp)
                        /*.border(
                            1.dp, Color(
                                0xFFB4B4B4
                            )
                        ),*/
                    ) {
                        Row(
                            modifier = Modifier.fillMaxSize(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            IconButton(
                                onClick = {
                                    if (count > 1)
                                        count--
                                }, modifier = Modifier
                                    .width(40.dp)
                                    .padding(12.dp)
                                    .align(Alignment.CenterVertically),
                                enabled = count > 1
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.minus),
                                    contentDescription = null
                                )
                            }
                            Text(
                                text = count.toString(),
                                modifier = Modifier.align(Alignment.CenterVertically)
                            )

                            IconButton(
                                onClick = {
                                    count++
                                }, modifier = Modifier
                                    .width(40.dp)
                                    .padding(12.dp)
                                    .align(Alignment.CenterVertically)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.plus),
                                    contentDescription = null
                                )
                            }
                        }

                    }

                    Text(
                        text = "${count * foodData.price} so'm",
                        modifier = Modifier.padding(end = 16.dp),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )
                }

                Button(
                    onClick = {
                        //todo
//                        onEventDispatcher(DetailsContract.Intent.OpenToBucketScreen)
                        onEventDispatcher(DetailsContract.Intent.AddToOrder(foodData, count))
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .height(56.dp)
                        .clip(RoundedCornerShape(0.dp))
                        .padding(bottom = 12.dp),
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(Color(0xFF51277D))
                ) {
                    Text(text = "Qo'shish", modifier = Modifier.align(Alignment.CenterVertically))
                }
            }

        }
    }


    /* @Composable
     fun TopSnackBar(
         snackBarText: String,
         duration: SnackbarDuration = SnackbarDuration.Short
     ) {
         val snackbarHostState = remember { SnackbarHostState() }
         val coroutineScope = rememberCoroutineScope()

         SnackbarHost(
             hostState = snackbarHostState,
             snackbar = { data ->
                 Snackbar(
                     modifier = Modifier.padding(16.dp),

                     contentColor = Color.Black,

                     ) {
                     Text(text = snackBarText)
                 }
             }
         )

         LaunchedEffect(snackBarText) {
             coroutineScope.launch {
                 snackbarHostState.showSnackbar(snackBarText, duration.name)
             }
         }
     }*/

}