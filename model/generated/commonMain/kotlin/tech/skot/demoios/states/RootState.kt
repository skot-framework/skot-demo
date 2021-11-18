package tech.skot.demoios.states

import kotlin.String
import tech.skot.demoios.model.business.CatalogBM
import tech.skot.demoios.model.business.CatalogBMImpl
import tech.skot.model.SKManualData

class RootState(
  infos: RootStateInfos
) : RootStateContract, RootStateDef {
  val key: String? = null

  override val cartSKData: SKManualData<CartState?> = SKManualData(infos.cart?.let { CartState(this,
      it) }) {
    saveState()
  }


  override var cart: CartState? by cartSKData

  val catalogBM: CatalogBM = CatalogBMImpl(key, this)

  fun infos(): RootStateInfos = RootStateInfos(
  cart = cart?.infos(),
  )
}
