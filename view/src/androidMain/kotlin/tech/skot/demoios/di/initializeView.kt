package tech.skot.demoios.di

import android.os.Build
import android.view.Gravity
import android.widget.FrameLayout
import com.google.android.material.snackbar.Snackbar
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKComponentView
import tech.skot.demoios.android.SplashActivity

suspend fun initializeView() {
  SKActivity.launchActivityClass = SplashActivity::class.java
  SKComponentView.displayError = { message ->
          Snackbar.make(activity.window.decorView, message, Snackbar.LENGTH_LONG)
              .apply {
                  view.apply {
                      (layoutParams as? FrameLayout.LayoutParams)?.let {
                          it.gravity = Gravity.TOP
                          if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                              it.topMargin =
      activity.window?.decorView?.rootWindowInsets?.systemWindowInsetTop
                                  ?: 0
                          }

                          layoutParams = it
                      }
                  }
                  show()
              }
      }
}
