package fr.algorithmie.sommeDeTableaux;

public class SommeDeTableaux {
	
	public static void main(String[] args) {
		// D�claration des tableaux
		int[] tab1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4}; 
		int[] tab2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		int[] tab3 = new int[tab1.length];
		//D�claration variables
		int compteur = 0;
		
		//Test taille des tableaux
		if(tab1.length == tab2.length) {
			while(compteur<tab1.length-1) {
				tab3[compteur] = tab1[compteur] + tab2[compteur];
				System.out.println(tab3[compteur]);
						compteur++;
			}
		} else {
			System.out.println("Les deux tableaux ne font pas la m�me taille, impossible d'effectuer le calcul");
		}
		
	}

}
