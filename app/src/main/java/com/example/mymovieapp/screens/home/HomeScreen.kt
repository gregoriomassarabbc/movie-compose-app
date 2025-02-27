package com.example.mymovieapp.screens.home

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mymovieapp.MovieRow
import com.example.mymovieapp.navigation.MovieScreens

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        modifier = Modifier.padding(3.dp),
        content = { MainContent(navController) },
        containerColor = Color.Cyan,
        topBar = {
            TopAppBar(
                title = { Text("Movies") },
                colors = TopAppBarColors(
                    containerColor = Color.Magenta,
                    scrolledContainerColor = Color.Cyan,
                    navigationIconContentColor = Color.Cyan,
                    titleContentColor = Color.White,
                    actionIconContentColor = Color.Cyan,
                )
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                containerColor = Color.Magenta,
                onClick = { Log.i("Hello", "click fab") }
            ) { }
        }
    )
}

@Composable
fun MainContent(
    navController: NavController,
    movieList: List<String> = listOf(
        "Space Odyssey",
        "Blade Runner",
        "Mad Max",
        "Twin Peaks",
        "Mullholland Drive",
        "Stalker",
        "Amarcord",
        "Deserto Rosso"
    )
) {
    Column(modifier = Modifier.padding(top = 76.dp)) {
        LazyColumn {
            items(items = movieList) {
                MovieRow(it, onItemClick = { movie ->
                    Log.d("TAG", movie)
                    navController.navigate(route = MovieScreens.DetailedScreen.name)
                })
            }

        }
    }
}
