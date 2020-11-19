package tech.skot.demo.screens

import tech.skot.demo.base.BaseScreenView

interface DemoBaseActionsView :BaseScreenView {

    val onTapBack:()->Unit

    val onTapAlert:()->Unit
    val onTapConfirm:()->Unit
    val onTapSnack:()->Unit
    val onTapShortSnack:()->Unit
    val onTapOpenExternalNavigator:()->Unit

}