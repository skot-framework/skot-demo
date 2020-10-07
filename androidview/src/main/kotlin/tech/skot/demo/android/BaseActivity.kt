package tech.skot.demo.android

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.View
import tech.skot.view.SKActivity


open class BaseActivity : SKActivity() {


    var onResumeLambda: (() -> Unit)? = null
    override fun onResume() {
        super.onResume()
        onResumeLambda?.invoke()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
        super.onCreate(savedInstanceState)

    }

    var onPauseLambda: (() -> Unit)? = null
    override fun onPause() {
        super.onPause()
        onPauseLambda?.invoke()
    }
}