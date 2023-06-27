package uz.gita.my_max_way_uz.ui.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import uz.gita.my_max_way_uz.data.model.FoodData

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun FoodItem(foodData: FoodData, onClick: (FoodData) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .padding(horizontal = 16.dp, vertical = 4.dp)
            .clickable {
                onClick.invoke(foodData)
            }
    ) {
        Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceBetween) {
            Column(

                modifier = Modifier.fillMaxHeight().padding(vertical = 4.dp, horizontal = 4.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = foodData.name)
                Text(text = "${foodData.price} so'm")
            }

            GlideImage(
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .size(100.dp)
                    .padding(8.dp),
                model = foodData.imgUrl,
                contentDescription = ""
            )
        }
    }
}