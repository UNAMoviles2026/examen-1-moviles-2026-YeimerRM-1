package com.moviles.examenmoviles.ui.screens.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.moviles.examenmoviles.navigation.AppDestinations
import com.moviles.examenmoviles.ui.screens.detail.SpaceDetailScreen
import com.moviles.examenmoviles.ui.screens.home.HomeScreen

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    Scaffold(
        bottomBar = {
            if (currentDestination?.route == AppDestinations.HOME) {
                NavigationBar {
                    NavigationBarItem(
                        icon = { 
                            Text(
                                text = "Inicio",
                                style = MaterialTheme.typography.labelLarge
                            ) 
                        },
                        selected = true,
                        onClick = {
                            navController.navigate(AppDestinations.HOME) {
                                popUpTo(AppDestinations.HOME) { saveState = true }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = AppDestinations.HOME,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(AppDestinations.HOME) {
                HomeScreen(
                    onSpaceClick = { spaceId ->
                        navController.navigate(AppDestinations.createDetailRoute(spaceId))
                    }
                )
            }
            composable(
                route = AppDestinations.DETAIL,
                arguments = listOf(androidx.navigation.navArgument("spaceId") { type = androidx.navigation.NavType.IntType })
            ) { backStackEntry ->
                val spaceId = backStackEntry.arguments?.getInt("spaceId") ?: 0
                SpaceDetailScreen(
                    spaceId = spaceId,
                    onBackClick = { navController.popBackStack() }
                )
            }
        }
    }
}
