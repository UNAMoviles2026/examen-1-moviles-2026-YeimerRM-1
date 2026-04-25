package com.moviles.examenmoviles.navigation

object AppDestinations {
    const val HOME = "home"
    const val DETAIL = "detail/{spaceId}"
    
    fun createDetailRoute(spaceId: Int) = "detail/$spaceId"
}
