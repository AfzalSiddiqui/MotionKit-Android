package com.motionkit.effects

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer

@Composable
fun Modifier.rotateClockwise(isAnimating: Boolean, duration: Int = 800): Modifier {
    val rotation by animateFloatAsState(
        targetValue = if (isAnimating) 360f else 0f,
        animationSpec = tween(duration), label = "rotateCW"
    )
    return graphicsLayer { rotationZ = rotation }
}

@Composable
fun Modifier.rotateCounterClockwise(isAnimating: Boolean, duration: Int = 800): Modifier {
    val rotation by animateFloatAsState(
        targetValue = if (isAnimating) -360f else 0f,
        animationSpec = tween(duration), label = "rotateCCW"
    )
    return graphicsLayer { rotationZ = rotation }
}
