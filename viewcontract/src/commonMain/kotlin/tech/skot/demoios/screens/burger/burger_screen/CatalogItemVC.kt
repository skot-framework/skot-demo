package tech.skot.demoios.screens.burger.burger_screen

import tech.skot.core.components.SKComponentVC

interface CatalogItemVC: SKComponentVC {
    val imageUrl: String
    val label: String
    val price: String
    val onClickAdd: () -> Unit
}