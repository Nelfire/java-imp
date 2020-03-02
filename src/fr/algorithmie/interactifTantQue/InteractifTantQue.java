package fr.algorithmie.interactifTantQue;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		// Interaction avec l'utilisateur
		System.out.println("Veuilliez selectionner un nombre entre 1 et 10 !");
		int choix = sc.nextInt();
		
		//On vérifie la saisie
		while(choix>10 || choix<1) {
			System.out.println("Erreur, veuilliez selectionner un nombre compris entre 1 et 10!");
			choix = sc.nextInt();
		}
		sc.close();
		System.out.println("--- Félicitations, vous avez selectionné \""+choix+"\" fin du programme ! ---");

	}

}
