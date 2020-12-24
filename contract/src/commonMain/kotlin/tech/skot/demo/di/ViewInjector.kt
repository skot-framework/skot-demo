package tech.skot.demo.di

import tech.skot.core.components.PagerView
import tech.skot.core.components.StackView
import tech.skot.core.components.presented.AlertView
import tech.skot.core.components.presented.BottomSheetView
import tech.skot.core.components.presented.SnackBarView
import tech.skot.demo.components.TabView
import tech.skot.demo.screens.*


interface ViewInjector {
    fun tabView(label: String, onTap: () -> Unit, selectedInitial: Boolean): TabView


    fun splash(message: String): SplashView
    fun main(tabs: List<TabView>, stack: StackView): MainView
    fun dialogs(
        alert: AlertView,
        snackBar: SnackBarView,
        bottomSheet: BottomSheetView,
        onTapSnack: () -> Unit,
        onTapAlert: () -> Unit,
        onTapAlertCustomButton: () -> Unit,
        onTapAlertTwoButtons: () -> Unit,
        onTapShowBottomSheet: () -> Unit,
        onTapShowGlobalBottomSheet: () -> Unit,
    ): DialogsView

    fun navigation(onTapOpenModale: () -> Unit, onTapToPager: () -> Unit): NavigationView
    fun navigationInStack(
        stack: StackView,
        onTapPushScreen: () -> Unit,
        onTapBack: () -> Unit
    ): NavigationInStackView

    fun auDessus(
        title: String,
        onTapOpenAnother: () -> Unit,
        onTapClose: () -> Unit,
        lines: List<AuDessusView.Line>
    ): AuDessusView

    fun aScreenInAStackView(
        title: String,
        lines: List<AScreenInAStackView.Line>
    ): AScreenInAStackView

    fun bottomSheetExample(onTapDismiss: () -> Unit): BottomSheetExampleView

    fun pagerExample(pager:PagerView, onTapToIndex2:()->Unit):PagerExampleView
}