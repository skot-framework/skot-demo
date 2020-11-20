package tech.skot.demo.screens

import tech.skot.contract.view.ComponentView
import tech.skot.demo.components.StackView

interface RootView : ComponentView {
    val stack:StackView
}