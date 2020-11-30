package tech.skot.demo.screens

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tech.skot.core.SKLog
import tech.skot.demo.components.ComponentViewImpl




class AuDessusViewImpl(override val title:String, override val onTapOpenAnother:()->Unit, override val onTapClose:()->Unit):ComponentViewImpl(),AuDessusView {


    @Composable
    override fun ui(modifier: Modifier) {
        Column(modifier = modifier.fillMaxHeight()) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(title, modifier = Modifier.weight(1f))
                Button(onClick = onTapOpenAnother) {
                    Text("Open")
                }
                Button(onClick = onTapClose) {
                    Text("close")
                }
            }
            ScrollableColumn(
                modifier = Modifier.fillMaxSize().background(Color.Gray),
                scrollState = skScrollState()
            ) {
                repeat(60) {
                    Text(text = "Ligne $it", fontSize = 28.sp, modifier = Modifier.padding(12.dp))
                }
            }
        }
    }


}

@Composable
fun AuDessusUI(modifier: Modifier) {

}