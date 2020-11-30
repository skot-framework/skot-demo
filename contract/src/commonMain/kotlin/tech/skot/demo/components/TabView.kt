package tech.skot.demo.components

import tech.skot.contract.view.ComponentView

interface TabView : ComponentView {
    val label: String
    val onTap: () -> Unit
    var selected: Boolean

}