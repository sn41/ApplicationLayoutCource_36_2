# Состояния

## Добавим кнопку и сделаем так, чтобы нажав её мы изменили текст в текстовом поле

```kotlin
@Composable
fun MainScreen() {
    Column() {
        Text(
            text = "Привет лунатикам!",
        )
        Button({}) { }
    }
}
```

![img.png](img.png)

Кнопка имеет параметры:
```kotlin
@Composable
@ComposableInferredTarget
public fun Button(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = ButtonDefaults.shape,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
    elevation: ButtonElevation? = ButtonDefaults.buttonElevation(),
    border: BorderStroke? = null,
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    interactionSource: MutableInteractionSource? = null,
    // Обратите внимание на RowScope !!! content будет помещен в Row !!!
    content: @Composable (RowScope.() -> Unit)
): Unit
```

Давайте с ней немного поиграем:

```kotlin
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
```
Пока кнопка ничего не делает.
А строка текста задана константой "Привет лунатикам!"


