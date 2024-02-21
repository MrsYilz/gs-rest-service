// Définition du package
package com.example.restservice;

// Importation de la classe AtomicLong pour un compteur thread-safe
import java.util.concurrent.atomic.AtomicLong;

// Importation des annotations de Spring pour définir un contrôleur REST
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Annotation pour indiquer que cette classe est un contrôleur REST
@RestController
public class GreetingController {

	// Modèle de message à utiliser pour les salutations
	private static final String template = "Hello, %s!";
	
	// Compteur pour générer des ID uniques pour chaque salutation
	private final AtomicLong counter = new AtomicLong();

	// Méthode pour gérer les requêtes GET à l'URL /greeting
	@GetMapping("/greeting")
	public Greeting greeting(
		// Paramètre de requête pour spécifier le nom dans la salutation
		@RequestParam(value = "name", defaultValue = "World") String name
	) {
		// Création d'une nouvelle salutation avec un ID unique et le message formaté
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}

