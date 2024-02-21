// Définition du package
package com.example.restservice;

// Importation des classes nécessaires pour lancer une application Spring Boot
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Annotation pour indiquer que c'est une application Spring Boot
@SpringBootApplication
public class RestServiceApplication {

	// Méthode principale qui lance l'application
	public static void main(String[] args) {
		// Lancement de l'application Spring Boot
		SpringApplication.run(RestServiceApplication.class, args);
	}
}

