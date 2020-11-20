package tech.skot.demo.components

import tech.skot.contract.view.ComponentView

interface StackView :ComponentView {
    var screens: List<ComponentView>
}