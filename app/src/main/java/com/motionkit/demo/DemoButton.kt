package com.motionkit.demo

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.motionkit.core.AnimatedBox
import com.motionkit.core.MotionTrigger

@Composable
fun DemoButton(
    text: String,
    modifier: Modifier = Modifier,
    trigger: MotionTrigger = MotionTrigger.OnTap,
    animationModifier: @Composable (Boolean) -> Modifier
) {
    AnimatedBox(
        modifier = modifier,
        trigger = trigger,
        animationModifier = animationModifier
    ) {
        Button(onClick = {}) {
            Text(text)
        }
    }
}
