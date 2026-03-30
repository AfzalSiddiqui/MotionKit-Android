package com.motionkit.effects

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer

@Composable
fun Modifier.opacityScale(isAnimating: Boolean, duration: Int = 500): Modifier {
    val alpha by animateFloatAsState(
        targetValue = if (isAnimating) 1f else 0f,
        animationSpec = tween(duration), label = "opScaleAlpha"
    )
    val scale by animateFloatAsState(
        targetValue = if (isAnimating) 1f else 0.6f,
        animationSpec = tween(duration), label = "opScaleScale"
    )
    return graphicsLayer {
        this.alpha = alpha
        scaleX = scale
        scaleY = scale
    }
}
