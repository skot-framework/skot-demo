package tech.skot.demo

import android.content.Context
import kotlin.Any
import kotlin.Int
import kotlin.String
import tech.skot.demo.view.R

class PluralsImpl(
  private val applicationContext: Context
) : Plurals {
  private fun compute(
    pluralId: Int,
    quantity: Int,
    vararg formatArgs: Any
  ): String = if (formatArgs.isEmpty()) {
    applicationContext.resources.getQuantityString(pluralId, quantity)
  }
  else {
    applicationContext.resources.getQuantityString(pluralId, quantity, *formatArgs)
  }
}
