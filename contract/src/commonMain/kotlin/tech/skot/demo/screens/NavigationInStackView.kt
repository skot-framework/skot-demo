package tech.skot.demo.screens

import tech.skot.core.components.ScreenView
import tech.skot.core.components.StackView


interface NavigationInStackView : ScreenView {
    val stack: StackView
    val onTapPushScreen:()->Unit
    val onTapBack:()->Unit
}