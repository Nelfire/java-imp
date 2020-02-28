package fr.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {
		// Ceci sont des variables
		
		byte uneVariableByte = 127;
		short uneVariableShort = 32767; 
		int uneVariableInt = 2_054_254;
		long uneVariableLong = 1_878_546_456;
		float uneVariableFloat = 9_000_000_000F;
		double uneVariableDouble = 123_456_789D;
		char uneVariableChar = 'A';
		boolean uneVariableBoolean = true;
		String uneVariableString = "Je suis une phrase";
		byte valeur1 = 1;
		byte valeur2 = 5;
		String randomString = "Voici le résultat d’un calcul : \n1+5=6";


		//Affichage des variables
		System.out.println("Affichage des variables ! \n");
		System.out.println("Char : "+uneVariableByte+"\n");
		System.out.println("Short : "+uneVariableShort+"\n");
		System.out.println("Int : "+uneVariableInt+"\n");
		System.out.println("Long : "+uneVariableLong+"\n");
		System.out.println("Float : "+uneVariableFloat+"\n");
		System.out.println("Double : "+uneVariableDouble+"\n");
		System.out.println("Char : "+uneVariableChar+"\n");
		System.out.println("String : "+uneVariableString+"\n");
		System.out.println(randomString);


	}

}
