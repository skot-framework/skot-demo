package tech.skot.demoios.states

import tech.skot.model.SKData

interface RootStateContract {
    val cart: CartStateContract?

    val cartSKData: SKData<out CartStateContract?>
}
