package com.moviles.examenmoviles.data

data class Space(
    val id: Int,
    val name: String,
    val description: String,
    val location: String,
    val capacity: Int,
    val pricePerHour: Double,
    val isAvailable: Boolean = true
)
