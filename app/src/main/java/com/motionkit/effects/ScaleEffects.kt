package com.motionkit.effects

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer

@Composable
fun Modifier.scaleUp(isAnimating: Boolean, duration: Int = 500): Modifier {
    val scale by animateFloatAsState(
        targetValue = if (isAnimating) 1f else 0.5f,
        animationSpec = tween(duration), label = "scaleUp"
    )
    return graphicsLayer { scaleX = scale; scaleY = scale }
}

@Composable
fun Modifier.scaleDown(isAnimating: Boolean, duration: Int = 500): Modifier {
    val scale by animateFloatAsState(
        targetValue = if (isAnimating) 1f else 1.5f,
        animationSpec = tween(duration), label = "scaleDown"
    )
    return graphicsLayer { scaleX = scale; scaleY = scale }
}
