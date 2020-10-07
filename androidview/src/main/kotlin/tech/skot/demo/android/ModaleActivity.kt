package tech.skot.demo.android

import android.graphics.drawable.TransitionDrawable
import tech.skot.demo.androidview.R

open class ModaleActivity : BaseActivity() {


    override fun onEnterAnimationComplete() {
        super.onEnterAnimationComplete()
        (resources.getDrawable(R.drawable.modale_backgroundcolor_transition, null) as? TransitionDrawable)?.let {
            window.setBackgroundDrawable(it)
            it.startTransition(100)
        }

    }


}