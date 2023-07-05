package uz.gita.my_max_way_uz.presentation.page.busket

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
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
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import org.orbitmvi.orbit.compose.collectAsState
import org.orbitmvi.orbit.compose.collectSideEffect
import uz.gita.my_max_way_uz.R
import uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity
import uz.gita.my_max_way_uz.navigation.AppScreen
import uz.gita.my_max_way_uz.ui.component.OrderFoodItem


class BasketScreen : Tab, AppScreen() {


    override val options: TabOptions
        @Composable
        get() {
            val title = "Savatcha"
            val icon = painterResource(id = R.drawable.ic_buy)
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
        val viewModel: BasketContract.ViewModel = getViewModel<BasketViewModel>()

        val uiState = viewModel.collectAsState()
        val context = LocalContext.current

        viewModel.collectSideEffect { sideEffect ->
            when (sideEffect) {
                is BasketContract.SideEffect.HasError -> {
                    Toast.makeText(context, sideEffect.message, Toast.LENGTH_SHORT).show()
                }
            }
        }

        BasketScreenContent(uiState, viewModel::onEventDispatcher)
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun BasketScreenContent(
        uiState: State<BasketContract.UiState>,
        onEventDispatcher: (BasketContract.Intent) -> Unit
    ) {


        var comment by remember { mutableStateOf("") }

        onEventDispatcher(BasketContract.Intent.Load)
        var foodsList = arrayListOf<FoodEntity>()
        var amount by remember {
            mutableStateOf(0L)
        }
        when (uiState.value) {
            is BasketContract.UiState.FoodsInBasket -> {

                foodsList =
                    (uiState.value as BasketContract.UiState.FoodsInBasket).foods as ArrayList<FoodEntity>

                amount = getPrice(foodsList)
            }

            BasketContract.UiState.Load -> {

            }

        }

        Scaffold(topBar = { TopBar(onEventDispatcher) }) {
            Surface(
                modifier = Modifier
                    .padding(it)
                    .padding(top = 16.dp)
                    .background(Color(0xFFF4F4F4))
            ) {
                Column(verticalArrangement = Arrangement.SpaceBetween) {
                    LazyColumn(
                        modifier = Modifier
                            .height(0.dp)
                            .weight(1f)
                            .clip(RoundedCornerShape(8.dp))
                    ) {
                        items(foodsList) { foodData ->

                            OrderFoodItem(foodData, onEventDispatcher)

                        }
                        if (foodsList.isNotEmpty())
                            item {
                                Surface(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(80.dp)
                                        .clip(RoundedCornerShape(4.dp)),
                                    shadowElevation = 4.dp
                                ) {
                                    Column(modifier = Modifier.fillMaxSize()) {

                                        Text(
                                            text = "Izoh",
                                            modifier = Modifier.padding(horizontal = 10.dp)
                                        )
                                        Box(
                                            modifier = Modifier
                                                .padding(top = 8.dp)
                                                .fillMaxWidth()
                                                .height(50.dp)
                                                .padding(horizontal = 10.dp)
                                                .clip(RoundedCornerShape(8.dp))


                                        ) {

                                            TextField(
                                                modifier = Modifier.fillMaxSize(),
                                                value = comment,
                                                onValueChange = { newValue -> comment = newValue },
                                                colors = TextFieldDefaults.textFieldColors(
                                                    textColor = Color.Black,
                                                    focusedIndicatorColor = Color.Transparent,
                                                    unfocusedIndicatorColor = Color.Transparent,
                                                    disabledIndicatorColor = Color.Transparent,
                                                    cursorColor = Color(0xFF050505)
                                                ),
                                                placeholder = {
                                                    Text(
                                                        text = "Izoh...",
                                                        color = Color.Gray
                                                    )
                                                }
                                            )
                                        }
                                    }

                                }
                            }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(40.dp)
                            .padding(horizontal = 12.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Buyurtma narxi: ", fontWeight = FontWeight.Medium)
                        Text(text = "$amount so'm", fontWeight = FontWeight.Medium)
                    }

                    Button(
                        onClick = {
                            onEventDispatcher(
                                BasketContract.Intent.OrderToMarker(
                                    foodsList,
                                    comment,
                                    amount
                                )
                            )

                        }, modifier = Modifier
                            .fillMaxWidth()
                            .height(55.dp)
                            .padding(horizontal = 12.dp)
                            .padding(bottom = 8.dp)
                            .clip(RoundedCornerShape(12.dp)),
                        shape = MaterialTheme.shapes.small,
                        colors = ButtonDefaults.buttonColors(Color(0xFF51277D)),
                        enabled = foodsList.isNotEmpty()
                    ) {
                        Text(text = "Buyurtmani rasmiylashtirish")
                    }

                }
            }


        }
    }

    @Composable
    fun TopBar(onEventDispatcher: (BasketContract.Intent) -> Unit) {

        var dialogState by remember { mutableStateOf(false) }
        Surface(shadowElevation = 8.dp) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .height(56.dp),

                ) {
                Text(
                    text = "Savatcha",
                    modifier = Modifier.align(Alignment.Center),
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp
                )
                IconButton(
                    onClick = { dialogState = true },
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .padding(end = 8.dp)
                ) {
                    Icon(imageVector = Icons.Default.Delete, contentDescription = null)
                }
            }
        }
        if (dialogState) {
            AlertDialog(
                onDismissRequest = { dialogState = false },
                title = { Text(text = "Tozalash") },
                text = { Text(text = "Rostandanham savatni tozalashni hohlaysizmi?") },
                confirmButton = {
                    Button(
                        onClick = {
                            onEventDispatcher(BasketContract.Intent.ClearBasket)
                            dialogState = false
                        },
                        modifier = Modifier.padding(vertical = 8.dp)
                    ) {
                        Text(text = "Ha")
                    }
                },
                dismissButton = {
                    Button(
                        onClick = { dialogState = false },
                        modifier = Modifier.padding(vertical = 8.dp)
                    ) {
                        Text(text = "Yo'q")
                    }
                }
            )
        }
    }

    private fun getPrice(foodList: List<FoodEntity>): Long {
        var amount: Long = 0
        foodList.forEach {
            amount += it.price * it.count
        }
        return amount
    }

}