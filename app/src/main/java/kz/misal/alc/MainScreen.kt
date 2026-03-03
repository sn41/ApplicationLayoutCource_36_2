package kz.misal.alc

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kz.misal.alc.ui.theme.ApplicationLayoutCource_36_2Theme

@Composable
fun MainScreen() {
    var text by remember { mutableStateOf("Привет лунатикам!") }
    var inputText by remember { mutableStateOf("") }
    Box(Modifier.fillMaxSize()){
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            OutlinedTextField(
                inputText,
                {newString -> inputText=newString},
                modifier = Modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp)
            )
            Text(text = text)
        }
        Button({
            text = inputText
            inputText = ""
        }, modifier = Modifier.align(Alignment.BottomEnd).padding(bottom = 32.dp, end = 16.dp)) {
            Text ("Жми")
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

//val brush = Brush.linearGradient(listOf<Color>(Color.Red, Color.White))
//val shape = RoundedCornerShape(4.dp, 16.dp, 32.dp, 48.dp)
//Button(
//{},
//shape = shape,
//colors = ButtonColors(
//containerColor = Color.Red,
//contentColor = Color.White,
//disabledContainerColor = Color.LightGray,
//disabledContentColor = Color.DarkGray
//),
//elevation = ButtonDefaults.buttonElevation(
//defaultElevation = 2.dp,
//pressedElevation = -(2).dp,
//focusedElevation = 2.dp,
//hoveredElevation = 1.dp,
//disabledElevation = 1.dp
//),
//border = BorderStroke(width = 2.dp, brush)
//) {
//    Text("Жми!")
//    Spacer(Modifier.width(4.dp))
//    Box(Modifier.clip(shape).size(16.dp).background(brush))
//}