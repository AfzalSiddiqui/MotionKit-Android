package com.motionkit.demo

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.motionkit.core.AnimatedBox
import com.motionkit.core.MotionTrigger

@Composable
fun DemoCard(
    title: String,
    subtitle: String = "Tap to animate",
    modifier: Modifier = Modifier,
    trigger: MotionTrigger = MotionTrigger.OnTap,
    animationModifier: @Composable (Boolean) -> Modifier
) {
    AnimatedBox(
        modifier = modifier,
        trigger = trigger,
        animationModifier = animationModifier
    ) {
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = title, style = MaterialTheme.typography.titleMedium)
                Text(text = subtitle, style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}
