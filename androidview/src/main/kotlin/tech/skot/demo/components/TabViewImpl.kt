package tech.skot.demo.components

import android.util.Log
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

class TabViewImpl(override val label:String, override val onTap:()->Unit, selectedInitial:Boolean) :ComponentViewImpl(), TabView {

    val _selected:MutableState<Boolean> = mutableStateOf(selectedInitial)
    override var selected:Boolean by _selected

    @Composable
    override fun ui(modifier: Modifier) {
        Button(onClick = onTap) {
            Text(
                text = label,
                fontSize = if (selected) 24.sp else 20.sp
            )
        }
    }

}