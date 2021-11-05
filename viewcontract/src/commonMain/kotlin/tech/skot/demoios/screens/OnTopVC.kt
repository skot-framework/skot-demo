package tech.skot.demoios.screens

import tech.skot.core.components.SKOpens
import tech.skot.core.components.SKScreenVC
import tech.skot.core.components.inputs.SKButtonVC
import tech.skot.demoios.screens.burger.BurgerScreenVC

@SKOpens([BurgerScreenVC::class])
interface OnTopVC: SKScreenVC {
    val btnClose:SKButtonVC
    val btnBurger:SKButtonVC
}