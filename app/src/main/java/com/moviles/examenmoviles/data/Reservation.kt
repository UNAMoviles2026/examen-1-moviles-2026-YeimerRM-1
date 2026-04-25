package com.moviles.examenmoviles.data

data class Reservation(
    val userId: Int,
    val spaceId: Int,
    val date: String,
    val hours: Int
)
