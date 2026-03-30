package com.motionkit.effects

import androidx.compose.material3.Text
import androidx.compose.runtime.*
import kotlinx.coroutines.delay

@Composable
fun TypewriterText(
    fullText: String,
    speedMs: Long = 50L,
    style: androidx.compose.ui.text.TextStyle = androidx.compose.ui.text.TextStyle.Default
) {
    var displayedText by remember { mutableStateOf("") }

    LaunchedEffect(fullText) {
        displayedText = ""
        for (i in fullText.indices) {
            displayedText = fullText.substring(0, i + 1)
            delay(speedMs)
        }
    }

    Text(text = displayedText, style = style)
}
