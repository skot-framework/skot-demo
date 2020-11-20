package tech.skot.demo.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import tech.skot.core.SKLog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        SKLog.d("onCreate MainActivity")
        setContent {
            SKLog.d("setContent")
            startScreen?.ui(Modifier)
        }
    }

    override fun onBackPressed() {
        onBackPressed?.invoke()
    }
}

var onBackPressed: (() -> Unit)? = null