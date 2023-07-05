package uz.gita.my_max_way_uz.ui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomSearchView(
    search: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit
) {

    Box(
        modifier = modifier
            .padding(top = 8.dp)
            .fillMaxWidth()
            .height(50.dp)
            .padding(horizontal = 10.dp)
            .clip(RoundedCornerShape(8.dp))


    ) {

        TextField(
            modifier = Modifier.fillMaxSize(),
            value = search,
            onValueChange = onValueChange,
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.Black,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                cursorColor = Color(0xFF050505)
            ),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "") },
//            trailingIcon = { Icon(imageVector = Icons.Default.Clear, contentDescription = "") },
            placeholder = { Text(text = "Qidirish..", color = Color.Gray) }
        )
    }
}