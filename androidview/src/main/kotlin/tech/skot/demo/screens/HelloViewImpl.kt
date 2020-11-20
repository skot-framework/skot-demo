package tech.skot.demo.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import tech.skot.demo.components.ComponentViewImpl

class HelloViewImpl :ComponentViewImpl(),HelloView {
    
    @Composable
    override fun ui(modifier: Modifier) {
        Box(modifier = Modifier.fillMaxSize()) {
            Text(text = "Hello Skot !")
        }
    }
    
}