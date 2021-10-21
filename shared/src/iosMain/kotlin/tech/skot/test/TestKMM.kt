package tech.skot.test

import kotlinx.coroutines.*
import tech.skot.core.SKLog
import tech.skot.model.globalCache

fun coco():String {
    SKLog.d("Log SKLog : Coucou titi")
    CoroutineScope(Dispatchers.Main).launch {
        val savedString = globalCache.getString("TEST")
        SKLog.d("savedString TEST = $savedString")
        globalCache.putString("TEST", "Yes !!! - $savedString")
        delay(2000)
        SKLog.d("-- 2s de passées")
        delay(2000)
        SKLog.d("-- 4s de passées")
    }
//    GlobalScope.launch {
//        val savedString = globalCache.getString("TEST")
//        SKLog.d("savedString TEST = $savedString")
//        globalCache.putString("TEST", "Yes !!! - $savedString")
//        delay(2000)
//        SKLog.d("-- 2s de passées")
//        delay(2000)
//        SKLog.d("-- 4s de passées")
//    }
    return "coucou"
}