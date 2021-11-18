package tech.skot.demoios.states

import kotlin.String
import kotlinx.serialization.Serializable

@Serializable
data class CartStateInfos(
  val basketId: String
)
