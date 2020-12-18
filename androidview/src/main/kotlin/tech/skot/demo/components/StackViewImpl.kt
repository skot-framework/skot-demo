package tech.skot.demo.components

import androidx.compose.animation.animatedFloat
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import tech.skot.contract.view.ComponentView
import androidx.compose.animation.core.AnimatedFloat
import androidx.compose.animation.core.AnimationEndReason
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.invalidate
import androidx.compose.runtime.key
import androidx.compose.runtime.onCommit
import androidx.compose.runtime.remember
import androidx.compose.ui.draw.drawOpacity
import androidx.compose.ui.util.fastForEach
import tech.skot.contract.view.ScreenView


class StackViewImpl : ComponentViewImpl(),StackView {

    val _screens: MutableState<List<ScreenView>> = mutableStateOf(emptyList())
    override var screens: List<ScreenView> by _screens


    @Composable
    override fun ui(modifier: Modifier) {
//        Crossfade(current = screens.lastOrNull()) {
//            (it as? ComponentViewImpl?)?.ui(modifier = modifier)
//        }
        if (screens.size % 2 != 0) {
            (screens.lastOrNull() as? ComponentViewImpl?)?.ui(modifier = modifier)
        }
        else {
            Box {
                (screens.lastOrNull() as? ComponentViewImpl?)?.ui(modifier = modifier)
            }
        }

    }


}





@Composable
fun <T> Crossfade(
    current: T,
    modifier: Modifier = Modifier,
    animation: AnimationSpec<Float> = tween(),
    children: @Composable (T) -> Unit
) {
    val state = remember { CrossfadeState<T>() }
    if (current != state.current) {
        state.current = current
        val keys = state.items.map { it.key }.toMutableList()
        if (!keys.contains(current)) {
            keys.add(current)
        }
        state.items.clear()
        keys.mapTo(state.items) { key ->
            CrossfadeAnimationItem(key) { children ->
                val opacity = animatedOpacity(
                    animation = animation,
                    visible = key == current,
                    onAnimationFinish = {
                        if (key == state.current) {
                            // leave only the current in the list
                            state.items.removeAll { it.key != state.current }
                            state.invalidate()
                        }
                    }
                )
                Box(Modifier.drawOpacity(opacity.value)) {
                    children()
                }
            }
        }
    }
    Box(modifier) {
        state.invalidate = invalidate
        state.items.fastForEach { (item, opacity) ->
            key(item) {
                opacity {
                    children(item)
                }
            }
        }
    }
}

private class CrossfadeState<T> {
    // we use Any here as something which will not be equals to the real initial value
    var current: Any? = Any()
    var items = mutableListOf<CrossfadeAnimationItem<T>>()
    var invalidate: () -> Unit = { }
}

private data class CrossfadeAnimationItem<T>(
    val key: T,
    val transition: CrossfadeTransition
)

private typealias CrossfadeTransition = @Composable (children: @Composable () -> Unit) -> Unit

@Composable
private fun animatedOpacity(
    animation: AnimationSpec<Float>,
    visible: Boolean,
    onAnimationFinish: () -> Unit = {}
): AnimatedFloat {
    val animatedFloat = animatedFloat(if (!visible) 1f else 0f)
    onCommit(visible) {
        animatedFloat.animateTo(
            if (visible) 1f else 0f,
            anim = animation,
            onEnd = { reason, _ ->
                if (reason == AnimationEndReason.TargetReached) {
                    onAnimationFinish()
                }
            }
        )
    }
    return animatedFloat
}
