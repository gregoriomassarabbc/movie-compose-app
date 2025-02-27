package com.example.mymovieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mymovieapp.screens.details.DetailsScreen
import com.example.mymovieapp.screens.home.HomeScreen


@Composable
fun MovieNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = MovieScreens.HomeScreen.name) {
        composable(MovieScreens.HomeScreen.name) {
            HomeScreen(navController)
        }
        composable(MovieScreens.DetailedScreen.name) {
            DetailsScreen(navController)
        }
    }

}

