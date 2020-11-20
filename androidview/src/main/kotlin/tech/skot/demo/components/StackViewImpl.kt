package tech.skot.demo.components

import androidx.compose.animation.Crossfade
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import tech.skot.contract.view.ComponentView

class StackViewImpl : ComponentViewImpl(),StackView {

    val _screens: MutableState<List<ComponentView>> = mutableStateOf(emptyList())
    override var screens: List<ComponentView> by _screens


    @Composable
    override fun ui(modifier: Modifier) {
        Crossfade(current = screens.lastOrNull()) {
            (it as? ComponentViewImpl?)?.ui(modifier = modifier)
        }
    }


}

