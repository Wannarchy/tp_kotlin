package com.example.finalttp.ui.theme.screens

import com.example.finalttp.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.finalttp.navigation.Routes

@Composable
fun AccueilScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "Logo"
        )

        Button(
            onClick = {
                navController.navigate(Routes.LISTE_PRODUIT)
            }
        ) {
            Text("Voir les produits")
        }
    }
}