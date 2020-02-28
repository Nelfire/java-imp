package fr.algorithmie.affichagePartiel;

public class AffichagePartiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 

		int compteur = 0;
		System.out.println("--- Nombre supérieurs à 3 du tableau ---");
		while(array.length>compteur) 
		{
			if(array[compteur]>=3) {
				System.out.println(array[compteur]);
			}
			compteur++;
		}
		
		

		int compteur2 = 0;
		System.out.println("--- Entiers pairs du tableau ---");
		while(array.length>compteur2) 
		{
			if(array[compteur2]%2==0) {
				System.out.println(array[compteur2]);
			}
			compteur2++;
		}
		

		int compteur3 = 0;
		System.out.println("--- Indexs pairs du tableau ---");
		while(array.length>compteur3) 
		{
			if(compteur3%2==0) {
				System.out.println(array[compteur3]);
			}
			compteur3++;
		}
		
		
		int compteur4 = 0;
		System.out.println("--- Entiers impairs du tableau ---");
		while(array.length>compteur4) 
		{
			if(array[compteur4]%2!=0) {
				System.out.println(array[compteur4]);
			}
			compteur4++;
		}
		

	}

}
