package tech.skot.demoios.states

import tech.skot.model.SKBms
import tech.skot.model.SKStateDef

@SKBms(["CatalogBM"])
interface RootStateDef:SKStateDef {
    val cart: CartStateDef?
}

@SKBms(["CartBM"])
interface CartStateDef:SKStateDef {
    val basketId:String
}