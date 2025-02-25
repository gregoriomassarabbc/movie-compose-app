package com.example.mymovieapp.navigation

enum class MovieScreens {
    HomeScreen,
    DetailedScreen;
    companion object {
        fun fromRoute(route: String?) : MovieScreens
        = when (route?.substringBefore("/")) {
            HomeScreen.name -> HomeScreen
            DetailedScreen.name -> DetailedScreen
            null -> HomeScreen
            else -> {throw IllegalArgumentException("Route $route Does Not Exist")}
        }
    }
}