package fr.algorithmie.rotation;

public class Rotation {

	public static void main(String[] args) {
		// Déclaration tableau d'entiers
		int[] tab1 = {0,1,2,3,4,5,6,7};

		//Variables
		int sauvegardeValeur = tab1[tab1.length-1];
		int emplacement1 = tab1.length-2; //7
		int emplacement2 = tab1.length-1; //8
		
		//Décaler les éléments de 1 vers la droite
		while(emplacement1>=0) {
			
			tab1[emplacement2] = tab1[emplacement1];
			emplacement1--;
			emplacement2--;
		}

		//Ajout de l'élément sauvegardé au début du tableau
		tab1[emplacement2] = sauvegardeValeur;
		
		// Affichage du tableau
		int compteur = 0;
		while(compteur!=tab1.length) {
			System.out.println(tab1[compteur]);
			compteur++;
		}
		
	}

}
