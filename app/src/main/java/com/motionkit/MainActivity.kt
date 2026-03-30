package com.motionkit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.motionkit.demo.DemoScreen
import com.motionkit.ui.theme.MotionKitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MotionKitTheme {
                DemoScreen()
            }
        }
    }
}
