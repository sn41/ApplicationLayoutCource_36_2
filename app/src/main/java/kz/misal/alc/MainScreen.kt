package kz.misal.alc

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kz.misal.alc.ui.theme.ApplicationLayoutCource_36_2Theme

@Composable
fun MainScreen() {
    Column() {
        Text(
            text = "Привет лунатикам!",
        )

        val brush = Brush.linearGradient(listOf<Color>(Color.Red, Color.White))
        val shape = RoundedCornerShape(4.dp, 16.dp, 32.dp, 48.dp)
        Button(
            {},
            shape = shape,
            colors = ButtonColors(
                containerColor = Color.Red,
                contentColor = Color.White,
                disabledContainerColor = Color.LightGray,
                disabledContentColor = Color.DarkGray
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 2.dp,
                pressedElevation = -(2).dp,
                focusedElevation = 2.dp,
                hoveredElevation = 1.dp,
                disabledElevation = 1.dp
            ),
            border = BorderStroke(width = 2.dp, brush)
        ) {
            Text("Жми!")
            Spacer(Modifier.width(4.dp))
            Box(Modifier.clip(shape).size(16.dp).background(brush))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ApplicationLayoutCource_36_2Theme {
        MainScreen()
    }
}