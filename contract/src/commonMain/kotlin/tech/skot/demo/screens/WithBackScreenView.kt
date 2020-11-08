package tech.skot.demo.screens

import tech.skot.demo.base.BaseScreenView

interface WithBackScreenView : BaseScreenView {

    val onTapBack:()->Unit
    val onTapOpen:()->Unit

}