package tech.skot.demoios.model.business

import kotlinx.coroutines.delay
import kotlinx.serialization.builtins.ListSerializer
import tech.skot.core.di.get
import tech.skot.demoios.model.Burger
import tech.skot.demoios.model.network.UABurger
import tech.skot.demoios.model.network.UAClient
import tech.skot.demoios.states.CartState
import tech.skot.demoios.states.CartStateInfos
import tech.skot.demoios.states.RootState
import tech.skot.model.SKBM
import tech.skot.model.SKData
import tech.skot.model.currentTimeMillis

interface CatalogBM {
    val catalog: SKData<List<Burger>>
    suspend fun createCart(): CartState
}

class CatalogBMImpl(
    key: String?,
    private val rootState: RootState,
    uaClient: UAClient = get()
) : SKBM(key), CatalogBM {
    override val catalog =
        DistantData<List<Burger>>(
            name = "CATALOG",
            serializer = ListSerializer(Burger.serializer()),
            validity = 10 * 60 * 1000L,
            fetchData = {
                uaClient.getBurgers().map { it.toBurger() }
            })

    fun UABurger.toBurger() =
        Burger(
            id = ref,
            title = title,
            imageUrl = thumbnail,
            description = description,
            price = price/100.0
        )

    override suspend fun createCart(): CartState {
        delay(200)
        return CartState(
            rootState = rootState,
            CartStateInfos(basketId = currentTimeMillis().toString())
        ).apply {
            rootState.cart = this
        }
    }
}
