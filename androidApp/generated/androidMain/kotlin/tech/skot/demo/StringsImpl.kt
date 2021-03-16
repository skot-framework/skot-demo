package tech.skot.demo

import android.content.Context
import kotlin.Int
import kotlin.String
import tech.skot.demo.view.R

class StringsImpl(
  private val applicationContext: Context
) : Strings {
  override val splash_message: String
    get() = get(R.string.splash_message)

  override val component_with_scroll_state_label: String
    get() = get(R.string.component_with_scroll_state_label)

  override val simple_compteur_initial: String
    get() = get(R.string.simple_compteur_initial)

  override val presented_components_simple_snack_message: String
    get() = get(R.string.presented_components_simple_snack_message)

  override val presented_components_snack_with_action_message: String
    get() = get(R.string.presented_components_snack_with_action_message)

  override val presented_components_snack_with_action_button_label: String
    get() = get(R.string.presented_components_snack_with_action_button_label)

  private fun get(strId: Int): String = applicationContext.getString(strId)
}
