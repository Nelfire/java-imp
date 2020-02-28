package fr.operateurs.arithmetique;

public class Calcul {

	public static void main(String[] args) {

		//Déclaration des variables
		int a = 4;
		int b = 5;

		int addition = aditionner(a,b);
		System.out.println("Addition : "+addition+"\n");
		int multiplication = a*b;
		System.out.println("Multiplication : "+multiplication+"\n");
		int soustraction = a-b;
		System.out.println("Soustraction : "+soustraction+"\n");
		int division = a/b;
		System.out.println("Division : "+division+"\n");
		System.out.println("C'est égal à 0 car il n'y a pas le reste de la division\n");
		int division2 = a%b;
		System.out.println("Reste division : "+division2+"\n");

	}
	
	public static int aditionner(int a, int b) {
		int resultat = a+b;
		return resultat;
	}

}
