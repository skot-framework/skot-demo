package tech.skot.demoios.model

import kotlinx.serialization.Serializable

@Serializable
data class Burger(
        val id: String,
        val title: String,
        val imageUrl: String,
        val description: String,
        val price: Double)