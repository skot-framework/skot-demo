package tech.skot.demoios.states

import kotlinx.serialization.Serializable
import kotlin.String

@Serializable
data class CartStateInfos(
    val basketId: String
)
