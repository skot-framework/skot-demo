package tech.skot.demo.screens

import tech.skot.core.components.ScreenView


interface NavigationView : ScreenView {
     val onTapOpenModale: () -> Unit
     val onTapToPager: () -> Unit
}