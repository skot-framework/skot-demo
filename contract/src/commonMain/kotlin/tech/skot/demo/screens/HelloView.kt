package tech.skot.demo.screens

import tech.skot.core.components.ScreenView

interface HelloView : ScreenView {
    val onTapBack:()->Unit
    val onOpenAnotherHello:()->Unit
}