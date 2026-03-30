package com.motionkit.effects

import androidx.compose.animation.core.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer

@Composable
fun Modifier.swing(isAnimating: Boolean): Modifier {
    val infiniteTransition = rememberInfiniteTransition(label = "swing")
    val rotation by infiniteTransition.animateFloat(
        initialValue = -15f,
        targetValue = 15f,
        animationSpec = infiniteRepeatable(
            animation = tween(300, easing = EaseInOut),
            repeatMode = RepeatMode.Reverse
        ),
        label = "swingRotation"
    )
    return if (isAnimating) {
        graphicsLayer { rotationZ = rotation }
    } else {
        this
    }
}
