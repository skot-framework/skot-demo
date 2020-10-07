package tech.skot.demo.android

import tech.skot.view.SKFragment

open class BaseFragment : SKFragment() {

    var onResumeLambda: (() -> Unit)? = null
    override fun onResume() {
        super.onResume()
        onResumeLambda?.invoke()
    }

    var onPauseLambda: (() -> Unit)? = null
    override fun onPause() {
        super.onPause()
        onPauseLambda?.invoke()
    }
}