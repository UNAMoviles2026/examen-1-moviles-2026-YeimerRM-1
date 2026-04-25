package com.moviles.examenmoviles.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.moviles.examenmoviles.ui.screens.detail.SpaceDetailScreen
import com.moviles.examenmoviles.ui.screens.home.HomeScreen

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppDestinations.HOME
    ) {
        composable(route = AppDestinations.HOME) {
            HomeScreen(
                onSpaceClick = { spaceId ->
                    navController.navigate(AppDestinations.createDetailRoute(spaceId))
                }
            )
        }
        composable(
            route = AppDestinations.DETAIL,
            arguments = listOf(navArgument("spaceId") { type = NavType.IntType })
        ) { backStackEntry ->
            val spaceId = backStackEntry.arguments?.getInt("spaceId") ?: 0
            SpaceDetailScreen(
                spaceId = spaceId,
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}
