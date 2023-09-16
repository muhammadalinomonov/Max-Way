package uz.gita.my_max_way_uz.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.valentinilk.shimmer.shimmer


@Preview
@Composable
fun ShimmerPrev() {
    ShimmerItem()
}

@Composable
fun ShimmerItem() {
    LazyColumn {
        items(10) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(110.dp)
                    .padding(horizontal = 16.dp, vertical = 1.dp)
                    .background(Color.White)
                    .clip(RoundedCornerShape(8.dp))
                    .shimmer()
                /*,
            colors = CardDefaults.cardColors(Color.White)*/
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(105.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(

                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(vertical = 4.dp, horizontal = 4.dp),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(bottom = 10.dp)
                                .width(200.dp)
                                .height(30.dp)
                                .clip(
                                    RoundedCornerShape(8.dp)
                                )
                                .background(Color(0xFFCFCCCC))
                        )
                        Box(
                            modifier = Modifier
                                .padding(bottom = 10.dp)
                                .width(120.dp)
                                .height(20.dp)
                                .clip(
                                    RoundedCornerShape(8.dp)
                                )
                                .background(Color(0xFFCFCCCC))
                        )
                    }

                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .size(100.dp)
                            .padding(8.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color(0xFFCFCCCC)),


                        )
                }


                Box(
                    modifier = Modifier
                        .height(1.dp)
                        .fillMaxWidth()
                        .background(Color.Gray.copy(0.5f))
                        .padding(bottom = 2.dp)
                )

            }
        }
    }
}