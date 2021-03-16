package tech.skot.demo.components

import tech.skot.core.components.ComponentVC

interface SimpleCompteurVC: ComponentVC {
    var label:String
    val onTap:()->Unit
}