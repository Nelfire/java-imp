package fr.algorithmie.rechercheMax;

public class RechercheMax {

	public static void main(String[] args) {
		// Déclaration variables
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int compteur = 0;
		int elementLePlusGrand = 0;
		System.out.println("--- L'élément le plus grand du tableau ---");
		while(array.length>compteur) 
		{
			if(array[compteur]>elementLePlusGrand) {
				elementLePlusGrand = array[compteur];
			}
			compteur++;
		}
		System.out.println(elementLePlusGrand);
			

	}

}
