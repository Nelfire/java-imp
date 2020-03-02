package fr.algorithmie.interfactif21Batons;

import java.util.Random;
import java.util.Scanner;

public class Interfactif21Batons {

	public static void main(String[] args) {
		// Déclaration des variables
		int nombreBatons = 21;
		int numeroTour = 1;
		int nombreRetrait;
		Scanner sc = new Scanner(System.in);

		// 1 = Joueur , 2 = Ordinateur
		int tourJoueur = new Random().nextInt(2);

		// Tant qu'il y a des batons, on joue
		while (nombreBatons != 0) {
			// C'est au tour du joueur
			if (tourJoueur == 1) {
				System.out.println("---> Tour n°" + numeroTour + " [C'est à votre tour]");
				System.out.println("Combien de batons voulez-vous retirer (De 1 à 3)");
				nombreRetrait = sc.nextInt();

				// Si tentative retrait superieur a 3 , erreur
				while (nombreRetrait > 3) {
					System.out.println("Vous ne pouvez pas retirer plus de 3 batons");
					System.out.println("Combien de batons voulez-vous retirer (De 1 à 3)");
					nombreRetrait = sc.nextInt();
				}

				// Actualiser nouveau nombre baton dispo
				nombreBatons = nombreBatons - nombreRetrait;
				numeroTour++;

				// Tour joueur suivant.
				tourJoueur = 2;

				// Annonce
				System.out.println("Il reste " + nombreBatons + " batons");
				if(nombreBatons==0) {
					System.out.println("Vous avez gagné !");
				}

			} else {
				System.out.println("---> Tour n°" + numeroTour + " [C'est à l'ordinateur]");
				if (nombreBatons <= 3) {
					nombreRetrait = nombreBatons;
				} else if (nombreBatons == 7) {
					nombreRetrait = 3;
				} else if (nombreBatons == 6) {
					nombreRetrait = 2;
				} else if (nombreBatons == 5) {
					nombreRetrait = 1;
				} else {
					nombreRetrait = new Random().nextInt(3) + 1;
				}
				System.out.println("L'ordinateur retire " + nombreRetrait + " batons");

				// Actualiser nouveau nombre baton dispo
				nombreBatons = nombreBatons - nombreRetrait;
				numeroTour++;

				// Tour joueur suivant.
				tourJoueur = 1;

				// Annonce
				System.out.println("Il reste " + nombreBatons + " batons");
				if(nombreBatons==0) {
					System.out.println("Victoire de l'ordinateur !");
				}
			}

		}

		sc.close();
	}

}
