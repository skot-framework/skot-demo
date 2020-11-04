package tech.skot.demo

import kotlinx.coroutines.delay

class EssaiCoroutines {

    suspend fun message():String {
        delay(2000)
        return "coucou"
    }


}
