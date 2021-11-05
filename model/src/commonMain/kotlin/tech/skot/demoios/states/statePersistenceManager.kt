package tech.skot.demoios.states

import kotlin.String
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import tech.skot.model.globalCache

const val ROOTSTATE_GLOBAL_KEY: String = "ROOTSTATE"

lateinit var rootState: RootState

fun saveState() {
  GlobalScope.launch {
    globalCache.putData(
    serializer = RootStateInfos.serializer(),
    name = ROOTSTATE_GLOBAL_KEY,
    data = rootState.infos()
    )
  }
}

suspend fun restoreState(): RootState = globalCache.getData(
serializer = RootStateInfos.serializer(),
name = ROOTSTATE_GLOBAL_KEY
)?.
let { RootState(it) }
?: RootState(RootStateInfos(null))
