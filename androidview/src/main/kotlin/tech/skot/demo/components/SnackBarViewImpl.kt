package tech.skot.demo.components

import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Snackbar
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay

class SnackBarViewImpl : ComponentViewImpl(), SnackBarView {

    private val _state: MutableState<SnackBarView.Shown?> = mutableStateOf(null)
    override var state: SnackBarView.Shown? by _state

    @Composable
    override fun ui(modifier: Modifier) {
        state?.let {
            Snackbar(
                text = { Text(it.message) },
                action = it.action?.let {
                    {
                        Button(onClick = it.action) {
                            Text(text = it.label)
                        }
                    }
                }
            )

            LaunchedEffect(subject = state, block = {
                delay(3000)
                state = null
            })
        }

    }


}