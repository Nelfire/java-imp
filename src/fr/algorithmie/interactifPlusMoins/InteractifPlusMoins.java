package fr.algorithmie.interactifPlusMoins;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {

		// Variables
		int essais = 0;
		// Choix d'un nombre aléatoir
		int secretNb = new Random().nextInt(100) + 1;

		System.out.println("Jouons ensemble, essai de trouve le chiffre auquel je pense !");

		// Saisie de l'utilisateur
		Scanner sc = new Scanner(System.in);
		int choix = sc.nextInt();

		while (choix != secretNb) {
			if (choix < secretNb) {
				essais++;
				System.out.println("C'est plus ! ");
				System.out.println("---> ");
				choix = sc.nextInt();
			} else if (choix > secretNb) {
				essais++;
				System.out.println("C'est moins ! ");
				System.out.println("---> ");
				choix = sc.nextInt();
			}
		}
		
		sc.close();

		if (choix == secretNb) {
			System.out.println("-- C'est gagné ! Mon chiffre était \"" + secretNb + "\". Vous avez trouvé en \""
					+ essais + "\" coups");
		}

	}

}
