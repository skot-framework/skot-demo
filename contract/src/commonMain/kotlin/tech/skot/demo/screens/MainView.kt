package tech.skot.demo.screens

import tech.skot.core.components.ScreenView
import tech.skot.core.components.StackView
import tech.skot.demo.components.TabView

interface MainView: ScreenView {
    val tabs:List<TabView>
    val stack: StackView
}