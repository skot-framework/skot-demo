package tech.skot.demo.components

import tech.skot.core.components.ComponentView


interface TabView : ComponentView {
    val label: String
    val onTap: () -> Unit
    var selected: Boolean

}