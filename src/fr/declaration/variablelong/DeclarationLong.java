package fr.declaration.variablelong;

public class DeclarationLong {

	public static void main(String[] args) {
		// Déclaration de variable
		long a = 3000L;
		long b = 3000;
		long c = 3000000000l;
		System.out.println("1) Il n'y a aucune différences entre les variables "+a+" et "+b);
		System.out.println("2) En revanche, la variable c, si l'on retire le L à la fin de la déclaration \n Il y a une erreur (chiffre trop grand). \n Et la majuscule/minuscule du L importe peut");

	}

}
