package kz.misal.alc

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kz.misal.alc.ui.theme.ApplicationLayoutCource_36_2Theme

@Composable
fun MainScreen() {
    Text(
        text = "Привет лунатикам!",
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ApplicationLayoutCource_36_2Theme {
        MainScreen()
    }
}