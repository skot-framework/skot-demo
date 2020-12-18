package tech.skot.demo.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.ui.tooling.preview.Preview
import tech.skot.core.SKLog
import tech.skot.demo.components.ComponentViewImpl

class NavigationViewImpl(override val onTapOpenModale:()->Unit) :ComponentViewImpl(), NavigationView {

    @Composable
    override fun ui(modifier: Modifier) {
        Column(modifier = modifier.background(Color(red = 255, green = 0, blue = 0, alpha = 128))) {
            Button(onClick = onTapOpenModale) {
                Text("Ouvre une modale !")
            }
        }
    }
    
}

@Preview
@Composable
fun prevNavigation() {
    
    val navigationViewImpl = NavigationViewImpl {
        SKLog.d("----- onTapOpenModale")
    }
    navigationViewImpl.ui(modifier = Modifier.fillMaxSize())
    
}