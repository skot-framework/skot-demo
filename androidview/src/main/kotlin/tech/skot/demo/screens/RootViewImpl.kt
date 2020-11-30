package tech.skot.demo.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import tech.skot.demo.components.ComponentViewImpl
import tech.skot.demo.components.StackView
import tech.skot.demo.components.StackViewImpl

class RootViewImpl(override val stack:StackViewImpl) :ComponentViewImpl(), RootView {

    @Composable
    override fun ui(modifier: Modifier) {
        stack.ui(modifier = modifier.fillMaxSize())
    }
}