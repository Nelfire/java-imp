package fr.operateurs.logique;

public class CalculLogique {

	public static void main(String[] args) {
		// Déclaration des variables
		boolean a = true;
		boolean b = false;
		boolean c = true;
		// Affichage
		System.out.println("-> A ou B ? "+(a||b));
		System.out.println("-> A ou C ? "+(a||c));
		System.out.println("-> A et B ? "+(a&&b));
		System.out.println("-> A et C ? "+(a&&c));

	}

}
