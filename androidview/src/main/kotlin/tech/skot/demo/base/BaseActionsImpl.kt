package tech.skot.demo.base

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.view.Gravity
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import tech.skot.core.SKLog
import kotlin.Boolean
import kotlin.Function0
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import tech.skot.demo.android.BaseActivity
import tech.skot.demo.android.BaseFragment
import tech.skot.demo.androidview.R

class BaseActionsImpl(
  private val activity: BaseActivity,
  private val fragment: BaseFragment?
) : BaseActions {
  override fun displayAlert(title: String?, message: String?, onOk: (() -> Unit)?) {
    val builder = AlertDialog.Builder(activity)
    title?.let { builder.setTitle(it) }
    message?.let { builder.setMessage(it) }
    builder.setPositiveButton("Ok", { _, _ -> onOk?.invoke() })
    builder.show()
  }


  override fun confirm(title: String?, message: String?, okLabel: String?, koLabel: String?, onOk: () -> Unit) {
    val builder = AlertDialog.Builder(activity)
    title?.let { builder.setTitle(it) }
    message?.let { builder.setMessage(it) }
    builder.setPositiveButton(okLabel
      ?: activity.getString(R.string.yes), { _, _ -> onOk.invoke() })
    builder.setNegativeButton(koLabel
      ?: activity.getString(R.string.no), { _, _ -> })
    builder.show()
  }

  override fun closeKeyboard() {
    (activity.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager)?.hideSoftInputFromWindow(activity.window.decorView.windowToken, 0)
  }

  override fun toast(message: String, top: Boolean, long: Boolean) {
    Toast.makeText(activity, message, if (long) Toast.LENGTH_LONG else Toast.LENGTH_SHORT)
      .apply {
        if (top) {
          this.setGravity(Gravity.TOP, 0, 0)
        }
      }.show()
  }

  override fun snack(message: String, long: Boolean, action: Pair<String, () -> Unit>?) {
    Snackbar.make(activity.findViewById(android.R.id.content), message, if (long) Snackbar.LENGTH_LONG else Snackbar.LENGTH_SHORT)
      .apply {
        action?.let { (label, block) ->
          setAction(label, View.OnClickListener {
            block()
          })

        }
        view.apply {
          (layoutParams as? FrameLayout.LayoutParams)?.let {
            it.gravity = Gravity.TOP
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
              it.topMargin = activity.window?.decorView?.rootWindowInsets?.systemWindowInsetTop ?: 0
            }

            layoutParams = it
          }
        }
        show()
      }

  }

  override fun openExternalNavigator(url: String) {
    try {
      Intent(Intent.ACTION_VIEW, Uri.parse(url)).let {
//                it.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        activity.startActivity(it)
      }
    }
    catch (ex:Exception) {
      SKLog.e("Erreur à l'ouverture du lien $url dans un navigateur externe ", ex)
    }
  }
}
