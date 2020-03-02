package fr.algorithmie.interactifFibonnaci;

import java.util.Scanner;

public class InteractifFibonnaci {

	public static void main(String[] args) {

		//Variables
		int n1 = 0;
		int n2 = 1;
		int somme = 0;
		int choix;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Choisissez un rang");
			choix = sc.nextInt();
		} while (choix < 2);
		System.out.print("0,1");
		
		for(int i = 0; i < (choix -2) ; i = i + 1)
		{
			System.out.print(",");
			somme = n1 + n2;
			System.out.print(somme);
			n1 = n2;
			n2 = somme;
		}

		sc.close();
	}

}
