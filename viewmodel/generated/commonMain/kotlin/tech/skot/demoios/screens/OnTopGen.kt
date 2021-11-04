package tech.skot.demoios.screens

import tech.skot.core.components.SKComponent
import tech.skot.core.components.SKComponentVC
import tech.skot.core.components.SKScreen

abstract class OnTopGen : SKScreen<OnTopVC>() {
    protected abstract val btnClose: SKComponent<out SKComponentVC>

    override fun onRemove() {
        btnClose.onRemove()
        super.onRemove()
    }
}
