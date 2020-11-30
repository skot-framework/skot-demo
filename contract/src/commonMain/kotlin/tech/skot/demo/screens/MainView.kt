package tech.skot.demo.screens

import tech.skot.contract.view.ComponentView
import tech.skot.demo.components.StackView
import tech.skot.demo.components.TabView

interface MainView: ComponentView {
    val tabs:List<TabView>
    val content: StackView
}