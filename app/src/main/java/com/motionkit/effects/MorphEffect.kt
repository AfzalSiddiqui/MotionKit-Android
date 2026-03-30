package com.motionkit.effects

import androidx.compose.animation.core.animateIntAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MorphShape(
    modifier: Modifier = Modifier,
    color: Color = Color(0xFF1976D2)
) {
    var isCircle by remember { mutableStateOf(true) }
    val cornerRadius by animateIntAsState(
        targetValue = if (isCircle) 50 else 10,
        animationSpec = tween(800), label = "morph"
    )

    Box(
        modifier = modifier
            .size(100.dp)
            .clip(RoundedCornerShape(cornerRadius))
            .background(color)
            .clickable { isCircle = !isCircle }
    )
}
