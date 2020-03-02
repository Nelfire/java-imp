package fr.algorithmie.interactifStockageNombre;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		int[] tab1 = new int[1];
		int[] tableauTemporaire = null;
		int compteurValeur = 0;
		int choix = 0;
		Scanner sc = new Scanner(System.in);
		
		while (choix != 3) {
			System.out.println("1 - Ajouter un nombre au tableau.");
			System.out.println("2 - Liste des nombres déjà présent dans le tableau.");
			System.out.println("3 - Quitter.");
			choix = sc.nextInt();

			switch (choix) {
			case 1:
				System.out.println("Quel nombre voulez-vous ajouter ?");
				int ajouterNombre = sc.nextInt();

				if (compteurValeur >= tab1.length) {
					tableauTemporaire = tab1.clone();
					tab1 = new int[compteurValeur + 1];
					System.arraycopy(tableauTemporaire, 0, tab1, 0, tableauTemporaire.length);
				}

				tab1[compteurValeur] = ajouterNombre;
				compteurValeur++;
				break;
			case 2:
				//System.out.println(tab1.length);
				System.out.println("Voici le contenu du tableau");
				for (int i = 0; i <= tab1.length-1; i++) {
					System.out.println(tab1[i]);
				}
				break;

			default:
				System.out.println("Choix incorrect");
				break;
			}

		}
		sc.close();
	}

}
