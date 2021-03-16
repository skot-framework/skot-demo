package tech.skot.demo.screens

import tech.skot.core.components.LoaderVC
import tech.skot.core.components.SKOpens
import tech.skot.core.components.ScreenVC
import tech.skot.demo.screens.presented.PresentedComponentsVC

@SKOpens([PresentedComponentsVC::class])
interface MainVC : ScreenVC {
    val onTapLoader:()->Unit
    val onTapNavigation:()->Unit
    val onTapPresented:()->Unit
    val onTapTabsLibrary:()->Unit

    val loader:LoaderVC
}