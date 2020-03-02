package fr.algorithmie.sommeDeTableauxDiff;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		// Déclaration des tableaux
		int[] tab1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4}; 
		int[] tab2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ; 

		//Détection tableau le plus grand
		int tailleTableauLePlusGrand = (tab1.length>tab2.length) ? tab1.length : tab2.length;
		int tailleTableauLePlusPetit = (tab1.length<tab2.length) ? tab1.length : tab2.length;
		//Création d'un tableau, de la taille la plus grande
		int[] tab3 = new int[tailleTableauLePlusGrand];
		//Déclaration variables
		int compteur = 0;
		
		//On boucle tant qu'on détecte pas la fin du plus petit tableau
		while(compteur<tailleTableauLePlusGrand-1) {
			if(tailleTableauLePlusPetit!=compteur) {
				tab3[compteur] = tab1[compteur] + tab2[compteur];
				System.out.println(tab3[compteur]);
				compteur++;
			}
		}

		
	}

}
