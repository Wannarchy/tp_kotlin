package com.example.finalttp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.finalttp.ui.theme.screens.AccueilScreen
import com.example.finalttp.ui.theme.screens.DetailProduitScreen
import com.example.finalttp.ui.theme.screens.ListProduit

object Routes {
    const val LISTE_PRODUIT = "liste_biens"
    const val DETAIL_PRODUIT = "detail/{bienId}"
    const val ACCUEIL = "accueil"
}

@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.ACCUEIL
    ) {
        composable(Routes.LISTE_PRODUIT) {
            ListProduit(navController = navController)
        }
        composable(Routes.ACCUEIL) {
            AccueilScreen(navController)
        }
        composable(
            route = Routes.DETAIL_PRODUIT,
            arguments = listOf(
                navArgument("bienId") { type = androidx.navigation.NavType.IntType }
            )
        ) { backStackEntry ->
            val bienId = backStackEntry.arguments?.getInt("bienId")
            DetailProduitScreen(navController = navController, bienId = bienId)
        }
    }
}
