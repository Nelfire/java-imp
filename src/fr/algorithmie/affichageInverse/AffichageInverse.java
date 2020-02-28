package fr.algorithmie.affichageInverse;

public class AffichageInverse {

	public static void main(String[] args) {
		
		// Déclarations
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] arrayCopy = new int[array.length];
		int compteur = 0;
		int compteur2 = 0;

		
		//Tableau normal
		System.out.println("--- NON INVERSE ---");

		while(array.length>compteur) 
		{
			System.out.println(array[compteur]);
			compteur++;
		}
		
		
		// Tableau inversé
		System.out.println("--- INVERSE ---");
		int tailleTableau = array.length -1;
		while(tailleTableau>=0) 
		{
			System.out.println(array[tailleTableau]);
			tailleTableau--;
		}
		

		// Copie du tableau principal
		System.out.println("--- Copie du tableau principal ---");
		while(array.length-1>=compteur2) 
		{
			arrayCopy[compteur2] = array[compteur2];
			System.out.println(arrayCopy[compteur2]);
			compteur2++;
		}
		

	}

}
