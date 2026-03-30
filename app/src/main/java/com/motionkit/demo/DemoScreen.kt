package com.motionkit.demo

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.motionkit.core.MotionTrigger
import com.motionkit.effects.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DemoScreen() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("MotionKit Demo") })
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // 1. Fade In
            SectionTitle("1. Fade In")
            DemoCard("Fade In", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.fadeIn(isAnimating)
            }

            // 2. Fade Out
            SectionTitle("2. Fade Out")
            DemoCard("Fade Out", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.fadeOut(isAnimating)
            }

            // 3. Scale Up
            SectionTitle("3. Scale Up")
            DemoCard("Scale Up", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.scaleUp(isAnimating)
            }

            // 4. Scale Down
            SectionTitle("4. Scale Down")
            DemoCard("Scale Down", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.scaleDown(isAnimating)
            }

            // 5. Bounce
            SectionTitle("5. Bounce")
            DemoCard("Bounce", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.bounce(isAnimating)
            }

            // 6. Shake
            SectionTitle("6. Shake")
            DemoCard("Shake", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.shake(isAnimating)
            }

            // 7. Rotate Clockwise
            SectionTitle("7. Rotate Clockwise")
            DemoCard("Rotate CW", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.rotateClockwise(isAnimating)
            }

            // 8. Rotate Counter-Clockwise
            SectionTitle("8. Rotate Counter-Clockwise")
            DemoCard("Rotate CCW", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.rotateCounterClockwise(isAnimating)
            }

            // 9. Slide In from Left
            SectionTitle("9. Slide In from Left")
            DemoCard("Slide Left", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.slideInFromLeft(isAnimating)
            }

            // 10. Slide In from Right
            SectionTitle("10. Slide In from Right")
            DemoCard("Slide Right", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.slideInFromRight(isAnimating)
            }

            // 11. Slide In from Top
            SectionTitle("11. Slide In from Top")
            DemoCard("Slide Top", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.slideInFromTop(isAnimating)
            }

            // 12. Slide In from Bottom
            SectionTitle("12. Slide In from Bottom")
            DemoCard("Slide Bottom", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.slideInFromBottom(isAnimating)
            }

            // 13. Slide Out to Left
            SectionTitle("13. Slide Out to Left")
            DemoCard("Slide Out Left", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.slideOutToLeft(isAnimating)
            }

            // 14. Slide Out to Right
            SectionTitle("14. Slide Out to Right")
            DemoCard("Slide Out Right", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.slideOutToRight(isAnimating)
            }

            // 15. Pulse
            SectionTitle("15. Pulse / Heartbeat")
            DemoCard("Pulse", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.pulse(isAnimating)
            }

            // 16. Flip Horizontal
            SectionTitle("16. Flip Horizontal")
            DemoCard("Flip H", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.flipHorizontal(isAnimating)
            }

            // 17. Flip Vertical
            SectionTitle("17. Flip Vertical")
            DemoCard("Flip V", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.flipVertical(isAnimating)
            }

            // 18. Swing
            SectionTitle("18. Swing / Wobble")
            DemoCard("Swing", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.swing(isAnimating)
            }

            // 19. Staggered List
            SectionTitle("19. Staggered List")
            DemoList()

            // 20. Color Pulse
            SectionTitle("20. Color Pulse")
            DemoCard("Color Pulse", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.colorPulse(isAnimating)
            }

            // 21. Opacity + Scale
            SectionTitle("21. Opacity + Scale")
            DemoCard("Opacity + Scale", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.opacityScale(isAnimating)
            }

            // 22. Shimmer
            SectionTitle("22. Shimmer Loader")
            DemoCard("Shimmer", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.shimmer(isAnimating)
            }

            // 23. Path Motion
            SectionTitle("23. Path / Curve Motion")
            DemoCard("Path Motion", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.pathMotion(isAnimating)
            }

            // 24. Spring Elastic
            SectionTitle("24. Spring / Elastic")
            DemoCard("Spring", trigger = MotionTrigger.OnTap) { isAnimating ->
                Modifier.springElastic(isAnimating)
            }

            // 25. Typewriter
            SectionTitle("25. Typewriter Text")
            TypewriterText(
                fullText = "Hello, MotionKit!",
                style = MaterialTheme.typography.titleLarge
            )

            // 26. Morph
            SectionTitle("26. Morph / Shape Transition")
            MorphShape()

            Spacer(modifier = Modifier.height(32.dp))
        }
    }
}

@Composable
private fun SectionTitle(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.titleMedium,
        modifier = Modifier.padding(top = 8.dp)
    )
}
