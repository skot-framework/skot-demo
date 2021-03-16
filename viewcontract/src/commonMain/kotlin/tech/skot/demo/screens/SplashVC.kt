package tech.skot.demo.screens

import tech.skot.core.components.SKOpens
import tech.skot.core.components.ScreenVC

@SKOpens([MainVC::class])
interface SplashVC : ScreenVC {
    val onTapGo:()->Unit
    var message:String?
}
