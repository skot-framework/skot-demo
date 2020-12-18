package tech.skot.demo.components

import tech.skot.core.components.Component
import tech.skot.demo.di.viewInjector

class Tab(val label:String, val onTap:()->Unit) : Component<TabView>() {

    override val view = viewInjector.tabView(label = label, onTap = onTap, selectedInitial = false)

}