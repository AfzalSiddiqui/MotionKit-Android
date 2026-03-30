# MotionKit-Android

A Jetpack Compose animation library with **26 reusable animation effects** as Modifier extensions.

## Setup

Open in Android Studio. Requires:
- Android Studio Hedgehog+
- Kotlin 1.9.20+
- Compose BOM 2024.01.00

## Quick Start

```kotlin
import com.motionkit.core.AnimatedBox
import com.motionkit.core.MotionTrigger
import com.motionkit.effects.*

// Using AnimatedBox wrapper
AnimatedBox(
    trigger = MotionTrigger.OnTap,
    animationModifier = { isAnimating -> Modifier.fadeIn(isAnimating) }
) {
    Text("Hello")
}

// Using Modifier extensions directly
var active by remember { mutableStateOf(false) }
Text(
    "Animated",
    modifier = Modifier.bounce(active).clickable { active = !active }
)
```

## Animations

| # | Effect | Modifier | Description |
|---|--------|----------|-------------|
| 1 | Fade In | `.fadeIn(isAnimating)` | Opacity 0 → 1 |
| 2 | Fade Out | `.fadeOut(isAnimating)` | Opacity 1 → 0 |
| 3 | Scale Up | `.scaleUp(isAnimating)` | Scale 0.5 → 1 |
| 4 | Scale Down | `.scaleDown(isAnimating)` | Scale 1.5 → 1 |
| 5 | Bounce | `.bounce(isAnimating)` | Spring bounce |
| 6 | Shake | `.shake(isAnimating)` | Horizontal shake |
| 7 | Rotate CW | `.rotateClockwise(isAnimating)` | 360° CW |
| 8 | Rotate CCW | `.rotateCounterClockwise(isAnimating)` | 360° CCW |
| 9 | Slide Left | `.slideInFromLeft(isAnimating)` | Slide from left |
| 10 | Slide Right | `.slideInFromRight(isAnimating)` | Slide from right |
| 11 | Slide Top | `.slideInFromTop(isAnimating)` | Slide from top |
| 12 | Slide Bottom | `.slideInFromBottom(isAnimating)` | Slide from bottom |
| 13 | Slide Out L | `.slideOutToLeft(isAnimating)` | Slide out left |
| 14 | Slide Out R | `.slideOutToRight(isAnimating)` | Slide out right |
| 15 | Pulse | `.pulse(isAnimating)` | Repeating pulse |
| 16 | Flip H | `.flipHorizontal(isAnimating)` | 3D Y-axis flip |
| 17 | Flip V | `.flipVertical(isAnimating)` | 3D X-axis flip |
| 18 | Swing | `.swing(isAnimating)` | Wobble oscillation |
| 19 | Stagger | `.staggeredItem(index)` | Delayed list items |
| 20 | Color Pulse | `.colorPulse(isAnimating)` | Background color |
| 21 | Opacity+Scale | `.opacityScale(isAnimating)` | Combined effect |
| 22 | Shimmer | `.shimmer(isAnimating)` | Loading shimmer |
| 23 | Path Motion | `.pathMotion(isAnimating)` | Curve motion |
| 24 | Spring | `.springElastic(isAnimating)` | Spring physics |
| 25 | Typewriter | `TypewriterText(text)` | Character reveal |
| 26 | Morph | `MorphShape()` | Shape morph |

## Project Structure

```
app/src/main/java/com/motionkit/
├── core/
│   └── AnimatedBox.kt
├── effects/
│   ├── FadeEffects.kt
│   ├── ScaleEffects.kt
│   ├── BounceEffect.kt
│   ├── ShakeEffect.kt
│   ├── RotateEffects.kt
│   ├── SlideEffects.kt
│   ├── PulseEffect.kt
│   ├── FlipEffects.kt
│   ├── SwingEffect.kt
│   ├── StaggeredListEffect.kt
│   ├── ColorPulseEffect.kt
│   ├── OpacityScaleEffect.kt
│   ├── ShimmerEffect.kt
│   ├── PathMotionEffect.kt
│   ├── SpringElasticEffect.kt
│   ├── TypewriterEffect.kt
│   └── MorphEffect.kt
├── demo/
│   ├── DemoButton.kt
│   ├── DemoCard.kt
│   ├── DemoLabel.kt
│   ├── DemoList.kt
│   └── DemoScreen.kt
├── ui/theme/
│   ├── Color.kt
│   ├── Theme.kt
│   └── Type.kt
└── MainActivity.kt
```

## License

MIT
