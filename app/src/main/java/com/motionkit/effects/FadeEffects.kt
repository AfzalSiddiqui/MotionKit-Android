package com.motionkit.effects

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer

@Composable
fun Modifier.fadeIn(isAnimating: Boolean, duration: Int = 500): Modifier {
    val alpha by animateFloatAsState(
        targetValue = if (isAnimating) 1f else 0f,
        animationSpec = tween(duration), label = "fadeIn"
    )
    return graphicsLayer { this.alpha = alpha }
}

@Composable
fun Modifier.fadeOut(isAnimating: Boolean, duration: Int = 500): Modifier {
    val alpha by animateFloatAsState(
        targetValue = if (isAnimating) 0f else 1f,
        animationSpec = tween(duration), label = "fadeOut"
    )
    return graphicsLayer { this.alpha = alpha }
}
