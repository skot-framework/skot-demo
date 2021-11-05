package tech.skot.demoios.screens.burger.burger_screen

import tech.skot.demoios.di.viewInjector
import tech.skot.demoios.model.Burger
import tech.skot.viewmodel.asPrice

class CatalogItem(burger:Burger, onTapAdd: () -> Unit) : CatalogItemGen() {
    override val view: CatalogItemVC = viewInjector.catalogItem(
        imageUrl = burger.imageUrl,
        label = burger.title,
        price = burger.price.asPrice("EUR"),
        onClickAdd = onTapAdd
    )
}
