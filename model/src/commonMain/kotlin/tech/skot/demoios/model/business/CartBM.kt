package tech.skot.demoios.model.business

import kotlin.String
import tech.skot.demoios.states.CartState
import tech.skot.demoios.states.RootState
import tech.skot.model.SKBM

interface CartBM

class CartBMImpl(
  key: String?,
  private val rootState: RootState,
  private val cartState: CartState
) : SKBM(key), CartBM
