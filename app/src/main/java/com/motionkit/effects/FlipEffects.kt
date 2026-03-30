package com.motionkit.effects

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer

@Composable
fun Modifier.flipHorizontal(isAnimating: Boolean, duration: Int = 600): Modifier {
    val rotation by animateFloatAsState(
        targetValue = if (isAnimating) 180f else 0f,
        animationSpec = tween(duration), label = "flipH"
    )
    return graphicsLayer {
        rotationY = rotation
        cameraDistance = 12f * density
    }
}

@Composable
fun Modifier.flipVertical(isAnimating: Boolean, duration: Int = 600): Modifier {
    val rotation by animateFloatAsState(
        targetValue = if (isAnimating) 180f else 0f,
        animationSpec = tween(duration), label = "flipV"
    )
    return graphicsLayer {
        rotationX = rotation
        cameraDistance = 12f * density
    }
}
