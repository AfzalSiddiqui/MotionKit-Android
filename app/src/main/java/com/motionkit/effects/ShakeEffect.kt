package com.motionkit.effects

import androidx.compose.animation.core.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer

@Composable
fun Modifier.shake(isAnimating: Boolean): Modifier {
    val infiniteTransition = rememberInfiniteTransition(label = "shake")
    val offsetX by infiniteTransition.animateFloat(
        initialValue = -10f,
        targetValue = 10f,
        animationSpec = infiniteRepeatable(
            animation = tween(80, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "shakeOffset"
    )
    return if (isAnimating) {
        graphicsLayer { translationX = offsetX }
    } else {
        this
    }
}
