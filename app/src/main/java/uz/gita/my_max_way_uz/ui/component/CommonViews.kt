package uz.gita.my_max_way_uz.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.gita.my_max_way_uz.ui.theme.LightGrayColor
import uz.gita.my_max_way_uz.ui.theme.PinkColor

@Composable
fun CommonText(
    text: String,
    color: Color = Color.Black,
    fontSize: TextUnit = 16.sp,
    fontWeight: FontWeight = FontWeight.Normal,
    function: () -> Unit
) {
    Text(text = text,
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight,
        modifier = Modifier.clickable {
            function()
        })
}

@Composable
fun CommonLoginButton(
    text: String, enabled:Boolean,modifier: Modifier = Modifier, onClick: () -> Unit
) {
    Button(
        enabled = enabled,
        modifier = modifier
            .background(
                PinkColor, RoundedCornerShape(20.dp)
            )
            .height(58.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent/*, disabledContentColor = Color.Gray*/, disabledContainerColor = Color.Gray
        ),
        onClick = { onClick() },
        elevation = ButtonDefaults.buttonElevation(0.dp, 0.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(text = text, fontSize = 20.sp, color = Color.White)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CommonTextField(
    text: String,
    placeholder: String,
    onValueChange: (String) -> Unit,
    keyboardOptions: KeyboardOptions,
    visualTransformation: VisualTransformation = VisualTransformation.None
) {
    OutlinedTextField(
        value = text,
        onValueChange = { onValueChange(it) },
        label = { Text(text = placeholder, color = Color.Gray) },
        maxLines = 1,
        singleLine = true,
        keyboardOptions = keyboardOptions,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = PinkColor, cursorColor = Color.Black
        ),

        shape = RoundedCornerShape(15.dp),
        modifier = Modifier.fillMaxWidth(),
        visualTransformation = visualTransformation
    )
}