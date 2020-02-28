package fr.algorithmie.inversionContenu;

public class InversionContenu {

	public static void main(String[] args) {
		// Déclaration variables
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] arrayCopy = new int[array.length];
		int compteur = 0;
		int compteur1 = 0;
		int compteur2 = 0;

		

		// Copier tableau + Inverser
		int tailleTableau = array.length -1;
		while(tailleTableau>=0) 
		{
			arrayCopy[compteur] = array[tailleTableau];
			tailleTableau--;
			compteur++;
		}
		

		// Affichage du tableau 1

		System.out.println("---Tableau 1---");
		while(array.length>compteur1) 
		{
			System.out.println(array[compteur1]);
			compteur1++;
		}

		// Affichage du tableau 2
		
		System.out.println("---Tableau 2---");
		while(array.length>compteur2) 
		{
			System.out.println(arrayCopy[compteur2]);
			compteur2++;
		}
		

	}

}
