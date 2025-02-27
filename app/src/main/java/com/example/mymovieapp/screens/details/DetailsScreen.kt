package com.example.mymovieapp.screens.details

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun DetailsScreen(navController: NavController) {
    Text(modifier = Modifier.padding(79.dp),
        text = "Details screen")
}
