package fr.algorithmie.interactifSommeArithmetique;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Choisissez un nombre :");
		
		//On récuperer le nombre choisi
		int choix = sc.nextInt();
		int total = 0;
		while(choix>0) {
			total = total + (choix);
			choix--;
		}
		sc.close();
		System.out.println(total);

	}

}
