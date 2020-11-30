package tech.skot.demo.screens

import tech.skot.contract.view.ComponentView

interface AuDessusView :ComponentView {
    val title:String
    val onTapOpenAnother:()->Unit
    val onTapClose:()->Unit
}