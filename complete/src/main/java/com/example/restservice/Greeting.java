// Définition du package
package com.example.restservice;

// Définition d'un record public appelé Greeting
// Un record est une sorte de classe utilisée pour modéliser des données immuables
public record Greeting(
    // Le champ id de type long
    long id, 
    // Le champ content de type String
    String content
) { }

