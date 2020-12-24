package tech.skot.demo.screens

import tech.skot.core.components.PagerView
import tech.skot.core.components.ScreenView

interface PagerExampleView : ScreenView {
    val pager: PagerView
    val onTapToIndex2:()->Unit
    var textSelectedPage:String?
}