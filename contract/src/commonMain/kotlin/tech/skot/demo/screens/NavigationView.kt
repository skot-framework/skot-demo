package tech.skot.demo.screens

import tech.skot.contract.view.ComponentView

interface NavigationView:ComponentView {
    val onTapOpenModale:()->Unit
}