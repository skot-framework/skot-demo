package tech.skot.demo.screens

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tech.skot.demo.components.*

class DialogsViewImpl(
    override val alert: AlertViewImpl,
    override val snackBar: SnackBarViewImpl,
    override val onTapSnack:()->Unit,
    override val onTapAlert: () -> Unit) :ComponentViewImpl(),DialogsView {

    @Composable
    override fun ui(modifier: Modifier) {

        Column(modifier = modifier) {
            Button(onClick = onTapSnack) {
                Text("Snack !")
            }
            Button(onClick = onTapAlert) {
                Text("Alerte")
            }

        }
        alert.ui(modifier)
        snackBar.ui(modifier)
    }

}