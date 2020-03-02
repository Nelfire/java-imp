package fr.algorithmie.interactifPlusGrand;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		
		int[] tab1 = new int[10];
		int compteur = 0;
		int elementLePlusGrand = 0;
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		// Intéraction avec l'utilisateur
		for (int cpt = 0; cpt <10; cpt ++) {
			System.out.println("Choix du chiffre N°"+(cpt+1));
			int choix = sc.nextInt();
			tab1[cpt] = choix;
		}
		
		// Annoncer l'élément le plus grand trouvé
		System.out.println("--- L'élément le plus grand du tableau est ---");
		while(tab1.length>compteur) 
		{
			if(tab1[compteur]>elementLePlusGrand) {
				elementLePlusGrand = tab1[compteur];
			}
			compteur++;
		}
		sc.close();
		System.out.println(elementLePlusGrand);

	}

}
