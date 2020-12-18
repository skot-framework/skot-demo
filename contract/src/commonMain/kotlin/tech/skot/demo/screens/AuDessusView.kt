package tech.skot.demo.screens

import tech.skot.core.components.ScreenView

interface AuDessusView : ScreenView {
    val title:String
    val onTapOpenAnother:()->Unit
    val onTapClose:()->Unit
    val lines: List<Line>

    data class Line(val id:Long)
}