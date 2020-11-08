package tech.skot.demo.screens

import tech.skot.demo.base.BaseScreenView

interface OneButtonView : BaseScreenView {

    val onTapButton:()->Unit

}