package tech.skot.demo.components

import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

class AlertViewImpl : ComponentViewImpl(), AlertView {

    private val _state: MutableState<AlertView.Shown?> = mutableStateOf(null)
    override var state: AlertView.Shown? by _state

    @Composable
    override fun ui(modifier: Modifier) {
        state?.let {
            AlertDialog(
                onDismissRequest = it.onDismissRequest ?: {},
                title = it.title?.let { { Text(it) } },
                buttons = {
                    it.buttons.map {
                        Button(onClick = it.action) {
                            Text(text = it.label)
                        }
                    }
                }
            )
        }
    }


}