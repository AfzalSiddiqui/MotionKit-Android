package com.motionkit.core

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

enum class MotionTrigger {
    OnAppear,
    OnTap
}

@Composable
fun AnimatedBox(
    modifier: Modifier = Modifier,
    trigger: MotionTrigger = MotionTrigger.OnAppear,
    animationModifier: @Composable (isAnimating: Boolean) -> Modifier,
    content: @Composable () -> Unit
) {
    var isAnimating by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        if (trigger == MotionTrigger.OnAppear) {
            isAnimating = true
        }
    }

    val appliedModifier = animationModifier(isAnimating)

    Box(
        modifier = modifier
            .then(appliedModifier)
            .then(
                if (trigger == MotionTrigger.OnTap) {
                    Modifier.clickable { isAnimating = !isAnimating }
                } else Modifier
            )
    ) {
        content()
    }
}
