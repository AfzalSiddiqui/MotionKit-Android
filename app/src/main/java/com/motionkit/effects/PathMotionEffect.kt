package com.motionkit.effects

import androidx.compose.animation.core.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun Modifier.pathMotion(isAnimating: Boolean): Modifier {
    if (!isAnimating) return this

    val infiniteTransition = rememberInfiniteTransition(label = "pathMotion")
    val progress by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(2000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "pathProgress"
    )
    val angle = progress * 2 * Math.PI
    return graphicsLayer {
        translationX = (sin(angle) * 100).toFloat()
        translationY = (cos(angle) * 60).toFloat()
    }
}
