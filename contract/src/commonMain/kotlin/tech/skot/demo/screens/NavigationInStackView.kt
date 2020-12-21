package tech.skot.demo.screens

import tech.skot.core.components.ScreenView
import tech.skot.core.components.StackView
import tech.skot.core.components.UiState


interface NavigationInStackView : ScreenView {
    val stack: StackView
    val onTapPushScreen: () -> Unit
    val onTapBack: () -> Unit

}