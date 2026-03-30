package com.motionkit.effects

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer

@Composable
fun Modifier.slideInFromLeft(isAnimating: Boolean, duration: Int = 500): Modifier {
    val offsetX by animateFloatAsState(
        targetValue = if (isAnimating) 0f else -600f,
        animationSpec = tween(duration), label = "slideLeft"
    )
    val alpha by animateFloatAsState(
        targetValue = if (isAnimating) 1f else 0f,
        animationSpec = tween(duration), label = "slideLeftAlpha"
    )
    return graphicsLayer { translationX = offsetX; this.alpha = alpha }
}

@Composable
fun Modifier.slideInFromRight(isAnimating: Boolean, duration: Int = 500): Modifier {
    val offsetX by animateFloatAsState(
        targetValue = if (isAnimating) 0f else 600f,
        animationSpec = tween(duration), label = "slideRight"
    )
    val alpha by animateFloatAsState(
        targetValue = if (isAnimating) 1f else 0f,
        animationSpec = tween(duration), label = "slideRightAlpha"
    )
    return graphicsLayer { translationX = offsetX; this.alpha = alpha }
}

@Composable
fun Modifier.slideInFromTop(isAnimating: Boolean, duration: Int = 500): Modifier {
    val offsetY by animateFloatAsState(
        targetValue = if (isAnimating) 0f else -600f,
        animationSpec = tween(duration), label = "slideTop"
    )
    val alpha by animateFloatAsState(
        targetValue = if (isAnimating) 1f else 0f,
        animationSpec = tween(duration), label = "slideTopAlpha"
    )
    return graphicsLayer { translationY = offsetY; this.alpha = alpha }
}

@Composable
fun Modifier.slideInFromBottom(isAnimating: Boolean, duration: Int = 500): Modifier {
    val offsetY by animateFloatAsState(
        targetValue = if (isAnimating) 0f else 600f,
        animationSpec = tween(duration), label = "slideBottom"
    )
    val alpha by animateFloatAsState(
        targetValue = if (isAnimating) 1f else 0f,
        animationSpec = tween(duration), label = "slideBottomAlpha"
    )
    return graphicsLayer { translationY = offsetY; this.alpha = alpha }
}

@Composable
fun Modifier.slideOutToLeft(isAnimating: Boolean, duration: Int = 500): Modifier {
    val offsetX by animateFloatAsState(
        targetValue = if (isAnimating) -600f else 0f,
        animationSpec = tween(duration), label = "slideOutLeft"
    )
    val alpha by animateFloatAsState(
        targetValue = if (isAnimating) 0f else 1f,
        animationSpec = tween(duration), label = "slideOutLeftAlpha"
    )
    return graphicsLayer { translationX = offsetX; this.alpha = alpha }
}

@Composable
fun Modifier.slideOutToRight(isAnimating: Boolean, duration: Int = 500): Modifier {
    val offsetX by animateFloatAsState(
        targetValue = if (isAnimating) 600f else 0f,
        animationSpec = tween(duration), label = "slideOutRight"
    )
    val alpha by animateFloatAsState(
        targetValue = if (isAnimating) 0f else 1f,
        animationSpec = tween(duration), label = "slideOutRightAlpha"
    )
    return graphicsLayer { translationX = offsetX; this.alpha = alpha }
}
