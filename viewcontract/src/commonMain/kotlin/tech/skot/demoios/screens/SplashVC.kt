package tech.skot.demoios.screens

import tech.skot.core.components.SKOpens
import tech.skot.core.components.SKScreenVC

@SKOpens([OnTopVC::class])
interface SplashVC : SKScreenVC {
    var message:String
    val onTapOpenOnTopScreen:()->Unit
}
