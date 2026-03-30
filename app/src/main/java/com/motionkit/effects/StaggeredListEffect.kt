package com.motionkit.effects

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import kotlinx.coroutines.delay

@Composable
fun Modifier.staggeredItem(index: Int, delayPerItem: Long = 100L): Modifier {
    var visible by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        delay(index * delayPerItem)
        visible = true
    }

    val alpha by animateFloatAsState(
        targetValue = if (visible) 1f else 0f,
        animationSpec = tween(400), label = "staggerAlpha"
    )
    val offsetY by animateFloatAsState(
        targetValue = if (visible) 0f else 40f,
        animationSpec = tween(400), label = "staggerOffset"
    )
    return graphicsLayer {
        this.alpha = alpha
        translationY = offsetY
    }
}
