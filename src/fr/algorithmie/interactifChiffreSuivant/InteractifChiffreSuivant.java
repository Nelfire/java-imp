package fr.algorithmie.interactifChiffreSuivant;

import java.util.Scanner;

public class InteractifChiffreSuivant {

	public static void main(String[] args) {
		
		// Utilisation du scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est votre chiffre?");
		
		// On enregistre le choix de l'utilisateur
		int choix = sc.nextInt();
		System.out.println("Vous avez selectionné le chiffre : "+choix+"\n");
		System.out.println("Voici les 10 nombres qui suivent le votre :");
		sc.close();
		
		//On affiche les 10 chiffres qui suivent la selection.
		for(int i=1;i<=10;i++) {
			System.out.println("-> "+(choix+i)+"\n");
		}
		
		

	}

}
