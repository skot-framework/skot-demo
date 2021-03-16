package tech.skot.demo.screens.presented

import tech.skot.core.components.SKUses
import tech.skot.core.components.ScreenVC
import tech.skot.demo.components.SimpleCompteurVC

@SKUses([SimpleCompteurVC::class])
interface BottomPageExampleVC:ScreenVC {
    val counter:SimpleCompteurVC
}