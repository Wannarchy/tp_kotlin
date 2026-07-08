package com.example.finalttp.data

import com.example.finalttp.R
import java.util.Locale

// id : identifiant unique (entier)
// titre : titre du produit (texte)
// prix : prix (nombre décimal)
// description : description détaillée (texte)
// urlImage : URL ou ressource de l’image (Any pour supporter String et Int)

data class Bien(
    val id: Int,
    val titre: String,
    val prix: Double,
    val description: String,
    val urlImage: Any,
) {
    /**
     * Formate le prix avec un séparateur de milliers et le symbole Euro.
     * Exemple : 250000.0 -> 250 000 €
     */
    fun prixFormatte(): String = "%,.0f €".format(Locale.FRANCE, prix)
}

val listeBiens = listOf(
    Bien(
        id = 1,
        titre = "Table de salon",
        description = "7IKEA Table Furniture Billionaire House painter and decorator, Black simple small table, angle, white png",
        prix = 23.3,

        urlImage = R.drawable.tablette,
    ),
    Bien(
        id = 2,
        titre = "Chaise Table Salon blanc",
        description = "Chaise Table Salon Housse IKEA.",
        prix = 45.0,
        urlImage = R.drawable.chaiseblanc,
    )
)
