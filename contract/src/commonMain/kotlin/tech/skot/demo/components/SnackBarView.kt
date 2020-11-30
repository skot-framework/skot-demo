package tech.skot.demo.components

import tech.skot.contract.view.ComponentView

interface SnackBarView :ComponentView {

    data class Shown(
        val message:String,
        val action:Action?
    )

    data class Action(val label:String, val action:()->Unit)

    var state:Shown?
}