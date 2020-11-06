package tech.skot.demo.shared

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import tech.skot.core.SKLog


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

    fun greetingCor() {
        SKLog.d("greetingCor start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(8000)
            SKLog.d("greetingCor after delay")
        }
    }
}
