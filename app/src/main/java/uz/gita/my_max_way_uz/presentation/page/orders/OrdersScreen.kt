package uz.gita.my_max_way_uz.presentation.page.orders

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.hilt.getViewModel
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import org.orbitmvi.orbit.compose.collectAsState
import uz.gita.my_max_way_uz.R
import uz.gita.my_max_way_uz.data.model.OrderData
import uz.gita.my_max_way_uz.navigation.AppScreen


class OrdersScreen : Tab, AppScreen() {
    override val options: TabOptions
        @Composable
        get() {
            val title = "Buyurtmalarim"
            val icon = painterResource(id = R.drawable.bag2)
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
        val viewModel: OrdersContact.ViewModel = getViewModel<OrdersViewModel>()
        val uiState = viewModel.collectAsState()

        OrdersScreenContent(uiState, viewModel::onEventDispatcher)
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun OrdersScreenContent(
        uiState: State<OrdersContact.UiState>,
        onEventDispatcher: (OrdersContact.Intent) -> Unit
    ) {
        onEventDispatcher(OrdersContact.Intent.Load)
        var orderList = arrayListOf<OrderData>()
        when (uiState.value) {
            OrdersContact.UiState.Load -> {

            }

            is OrdersContact.UiState.Orders -> {
                orderList =
                    (uiState.value as OrdersContact.UiState.Orders).orders as ArrayList<OrderData>
            }
        }

        Scaffold(topBar = { TopAppBar() }) {
            Surface(
                Modifier
                    .padding(it)
                    .background(Color(0xFFF4F4F4))
                    .fillMaxSize()

            ) {
                LazyColumn(
                    Modifier
                        .padding(top = 8.dp)
                ) {
                    items(orderList) {
                        Surface(
                            shadowElevation = 8.dp,
                            modifier = Modifier
                                .padding(vertical = 4.dp)
                                .padding(horizontal = 8.dp)

                        ) {
                            Column(
                                horizontalAlignment = Alignment.End,
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(Color.White)

                            ) {
                                it.foods.forEach {

                                    Row(
                                        Modifier
                                            .fillMaxWidth()
                                            .padding(8.dp)
                                            .clip(RoundedCornerShape(8.dp))
                                    ) {
                                        Text(
                                            text = it.name,
                                            modifier = Modifier.padding(start = 8.dp)
                                        )
                                        Text(
                                            text = it.count.toString() + " ta",
                                            modifier = Modifier.padding(start = 16.dp)
                                        )
                                        Spacer(
                                            modifier = Modifier
                                                .width(0.dp)
                                                .weight(1f)
                                        )
                                        Text(text = (it.count * it.price).toString())
                                    }
                                }

                                if (it.comment.isNotEmpty()) {
                                    Text(
                                        text = "Izoh: ${it.comment}",
                                        modifier = Modifier
                                            .align(Alignment.Start)
                                            .padding(top = 8.dp)
                                            .padding(horizontal = 16.dp)
                                    )
                                }
                                Button(
                                    onClick = { },
                                    modifier = Modifier.padding(
                                        bottom = 8.dp,
                                        end = 8.dp,
                                        top = 8.dp
                                    ),
                                    colors = ButtonDefaults.buttonColors(Color(0xFF50267D))
                                ) {
                                    Text(
                                        text = "${it.allPrice} so'm",
                                        Modifier,
                                        color = Color.White
                                    )
                                }
                            }
                        }

                    }
                }
                if (orderList.isEmpty()) {

                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        CircularProgressIndicator(
                            modifier = Modifier.size(60.dp),
                            strokeWidth = 8.dp,
                            color = Color(0xFF50267D)
                        )
                    }
                }
            }

            if (orderList.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                ) {
                    Column(
                        modifier = Modifier
                            .align(Alignment.Center),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.empty),
                            contentDescription = null,
                            modifier = Modifier
                                .size(150.dp)
                        )
                        Text(text = "Buyurtma mavjud emas", modifier = Modifier, color = Color.Gray, fontSize = 12.sp, textAlign = TextAlign.Center)
                    }


                }
            }
        }
    }


    @Composable
    fun TopAppBar() {
        Surface(shadowElevation = 8.dp, modifier = Modifier.height(56.dp)) {
            Box(
                modifier = Modifier
                    .height(56.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Buyurtmalarim",
                    modifier = Modifier.align(Alignment.Center),
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp
                )
            }
        }
    }
}