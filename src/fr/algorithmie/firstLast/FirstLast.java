package fr.algorithmie.firstLast;

public class FirstLast {

	public static void main(String[] args) {
		// D�claration tableau d'entiers
		int[] tab1 = {3,6,8,4,8,3};
		boolean marqueur = false;
		
		//Si d�tection tableau 1er et dernier �l�ments �gaux, marqueur = true
		if((tab1.length>0)&&(tab1[0] == tab1[tab1.length-1] && tab1[tab1.length-1] == tab1[0])) {
			marqueur = true;
		}
		//Inutile de faire un esle, le marqueur est false par d�faut
		System.out.println("Etat du boolean : "+marqueur);
		
	}

}
