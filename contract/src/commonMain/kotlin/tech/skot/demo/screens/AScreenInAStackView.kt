package tech.skot.demo.screens

import tech.skot.core.components.ScreenView
import tech.skot.core.components.UiState


interface AScreenInAStackView : ScreenView {
    val title:String
    var lines: List<Line>

    data class Line(val id:Long)

    data class State(val scroll:Int)
    val scrollState: UiState<State>
}