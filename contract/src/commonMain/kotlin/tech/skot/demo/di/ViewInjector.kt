package tech.skot.demo.di

import tech.skot.demo.components.AlertView
import tech.skot.demo.components.SnackBarView
import tech.skot.demo.components.StackView
import tech.skot.demo.components.TabView
import tech.skot.demo.screens.*


interface ViewInjector {
    fun statck():StackView
    fun tabView(label:String, onTap:()->Unit, selectedInitial:Boolean):TabView
    fun alert():AlertView
    fun snackBar():SnackBarView


    fun root(stack:StackView):RootView
    fun hello():HelloView
    fun splash(message:String?):SplashView
    fun main(tabs:List<TabView>,content:StackView):MainView
    fun dialogs(alert: AlertView, snackBar:SnackBarView, onTapSnack:()->Unit, onTapAlert:()->Unit):DialogsView
    fun navigation(onTapOpenModale:()->Unit):NavigationView
    fun auDessus(title:String, onTapOpenAnother:()->Unit, onTapClose:()->Unit):AuDessusView
}
