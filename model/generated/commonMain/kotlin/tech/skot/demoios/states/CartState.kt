package tech.skot.demoios.states

import kotlin.String
import tech.skot.demoios.model.business.CartBM
import tech.skot.demoios.model.business.CartBMImpl

class CartState(
  val rootState: RootState,
  infos: CartStateInfos
) : CartStateContract, CartStateDef {
  val key: String = infos.basketId

  override val basketId: String = infos.basketId

  val cartBM: CartBM = CartBMImpl(key, rootState, this)

  fun infos(): CartStateInfos = CartStateInfos(
  basketId = basketId,
  )
}
