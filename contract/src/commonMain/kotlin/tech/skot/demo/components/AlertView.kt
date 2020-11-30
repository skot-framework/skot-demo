package tech.skot.demo.components

import tech.skot.contract.view.ComponentView

interface AlertView :ComponentView {

    data class Shown(
        val title:String?,
        val message:String?,
        val onDismissRequest:(()->Unit)?,
        val buttons:List<Button>
    )

    data class Button(val label:String, val action:()->Unit)

    var state:Shown?
}