package tech.skot.demo.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import tech.skot.demo.components.ComponentViewImpl

class SplashViewImpl(messageInitial:String) : ComponentViewImpl(),SplashView {

    val _message: MutableState<String> = mutableStateOf(messageInitial)
    override var message: String by _message

    @Composable
    override fun ui(modifier: Modifier) {
        Box(modifier = Modifier.fillMaxSize(), alignment = Alignment.Center) {
            Text(text = message ?: "")
        }
    }

}