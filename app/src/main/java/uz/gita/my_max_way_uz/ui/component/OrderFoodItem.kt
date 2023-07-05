package uz.gita.my_max_way_uz.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import uz.gita.my_max_way_uz.R
import uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity
import uz.gita.my_max_way_uz.presentation.page.busket.BasketContract

@Composable
fun OrderFoodItem(foodData: FoodEntity, onEventDispatcher: (BasketContract.Intent) -> Unit) {
    var count by remember {
        mutableStateOf(foodData.count)
    }
    Surface(
        Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(4.dp)
            .background(Color.Green),
        shadowElevation = 1.dp
    ) {
        Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceBetween) {
            AsyncImage(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(100.dp)
                    .padding(vertical = 16.dp)
                    .clip(RoundedCornerShape(4.dp))
                    .align(CenterVertically),
                model = ImageRequest.Builder(LocalContext.current)
                    .data(foodData.imageUrl)
                    .crossfade(true)
                    .build(),
                placeholder = painterResource(id = R.drawable.foof_placeholder),
                error = painterResource(id = R.drawable.foof_placeholder),
                contentDescription = null
            )

            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxHeight()
                    .align(CenterVertically)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .padding(top = 4.dp)
                        .height(30.dp)
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp)
                ) {
                    Text(
                        text = foodData.name,
                        modifier = Modifier.align(CenterVertically),
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp
                    )
                    IconButton(onClick = {
                        onEventDispatcher(
                            BasketContract.Intent.DeleteItem(
                                foodData
                            )
                        )
                    }, modifier = Modifier.align(CenterVertically)) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            modifier = Modifier,
                            contentDescription = null
                        )
                    }
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .height(40.dp)
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp)
                ) {
                    Text(
                        text = "${foodData.price * count} so'm",
                        modifier = Modifier.align(CenterVertically)
                    )

                    Card(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .width(95.dp)
                            .height(38.dp)
                            .padding(start = 8.dp, bottom = 4.dp)
                            .align(CenterVertically)
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
                                        onEventDispatcher(
                                            BasketContract.Intent.ChangeCount(
                                                foodData,
                                                --count
                                            )
                                        )
                                }, modifier = Modifier
                                    .width(30.dp)
                                    .padding(8.dp)
                                    .align(CenterVertically),
                                enabled = count > 1
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.minus),
                                    contentDescription = null
                                )
                            }
                            Text(
                                text = count.toString(),
                                modifier = Modifier.align(CenterVertically)
                            )

                            IconButton(
                                onClick = {

                                    onEventDispatcher(
                                        BasketContract.Intent.ChangeCount(
                                            foodData,
                                            ++count
                                        )
                                    )
                                }, modifier = Modifier
                                    .width(30.dp)
                                    .padding(8.dp)
                                    .align(CenterVertically)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.plus),
                                    contentDescription = null
                                )
                            }
                        }

                    }
                }

            }

        }
    }
}