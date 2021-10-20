package tech.skot.demoios

import android.content.Context
import kotlin.Int
import kotlin.String

class StringsImpl(
    private val applicationContext: Context
) : Strings {
    private fun get(strId: Int): String = applicationContext.getString(strId)
}
