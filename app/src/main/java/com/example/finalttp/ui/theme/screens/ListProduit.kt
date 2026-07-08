package com.example.finalttp.ui.theme.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.finalttp.ui.theme.components.ProduitCard
import com.example.finalttp.data.listeBiens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListProduit(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Liste des produits") })
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .padding(paddingValues)
                .padding(8.dp),
            contentPadding = PaddingValues(8.dp)
        ) {
            items(listeBiens) { bien ->
                ProduitCard(
                    bien = bien,
                    onClick = {
                        navController.navigate("detail/${bien.id}")
                    }
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}
