package tech.skot.demo.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import tech.skot.contract.view.ComponentView

abstract class ComponentViewImpl :ComponentView {

    @Composable
    abstract fun ui(modifier:Modifier = Modifier)

    override fun onRemove() {}
}