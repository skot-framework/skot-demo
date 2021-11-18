package tech.skot.demoios

import android.content.Context
import kotlin.Int
import kotlin.String
import tech.skot.demoios.view.R

class StringsImpl(
  private val applicationContext: Context
) : Strings {
  private fun get(strId: Int): String = applicationContext.getString(strId)
}
