package tech.skot.demo.screens

import tech.skot.core.components.Screen
import tech.skot.demo.di.viewInjector

class BottomSheetExample : Screen<BottomSheetExampleView>() {

    override val view = viewInjector.bottomSheetExample { dismiss() }


}