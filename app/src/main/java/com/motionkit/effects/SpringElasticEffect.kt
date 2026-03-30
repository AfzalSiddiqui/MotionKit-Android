package com.motionkit.effects

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer

@Composable
fun Modifier.springElastic(isAnimating: Boolean): Modifier {
    val scale by animateFloatAsState(
        targetValue = if (isAnimating) 1f else 0.3f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioHighBouncy,
            stiffness = Spring.StiffnessMedium
        ),
        label = "springElastic"
    )
    return graphicsLayer { scaleX = scale; scaleY = scale }
}
