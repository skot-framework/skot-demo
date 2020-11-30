package tech.skot.demo.screens

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import tech.skot.demo.components.*

class MainViewImpl(override val tabs:List<TabViewImpl>, override val content: StackViewImpl) :ComponentViewImpl(),MainView {

    @Composable
    override fun ui(modifier: Modifier) {
        Column(modifier = modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.SpaceBetween) {
            content.ui(
                Modifier.weight(1f, true)
            )
            Spacer(modifier = Modifier.wrapContentHeight())
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                tabs.forEach { it.ui(Modifier.weight(1f)) }
            }
        }
    }
}