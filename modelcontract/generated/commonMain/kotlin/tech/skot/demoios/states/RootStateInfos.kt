package tech.skot.demoios.states

import kotlinx.serialization.Serializable

@Serializable
data class RootStateInfos(
    val cart: CartStateInfos? = null
)
