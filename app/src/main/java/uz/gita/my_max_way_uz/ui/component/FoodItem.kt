package uz.gita.my_max_way_uz.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import uz.gita.my_max_way_uz.data.model.FoodData

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun FoodItem(foodData: FoodData, isLastItem: Boolean = false, onClick: (FoodData) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(110.dp)
            .padding(horizontal = 16.dp, vertical = 1.dp)
            .background(Color.White)
            .clip(RoundedCornerShape(8.dp))
            .clickable {
                onClick.invoke(foodData)
            }/*,
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
                    .width(0.dp)
                    .weight(3f)
                    .padding(vertical = 0.dp, horizontal = 4.dp),
//                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = foodData.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black,
                    modifier = Modifier.padding(top = 10.dp)
                )
                Text(text  = foodData.info, maxLines = 2, fontSize = 12.sp, overflow = TextOverflow.Ellipsis)
                Spacer(modifier = Modifier.height(0.dp).weight(1f))
                Text(
                    text = "${foodData.price} so'm",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF50267D),
                    modifier = Modifier.padding(bottom = 10.dp)
                )
            }


            GlideImage(
                modifier = Modifier
                    .padding(end = 4.dp)
                    .size(100.dp)

                    .padding(8.dp)
                    .clip(RoundedCornerShape(10.dp)),
                model = foodData.imgUrl,

                contentDescription = "",
                contentScale = ContentScale.Crop
            )
        }

        if (!isLastItem)
            Box(
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth()
                    .background(Color.Gray)
                    .padding(bottom = 2.dp)
            )
    }
}