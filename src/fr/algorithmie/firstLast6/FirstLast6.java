package fr.algorithmie.firstLast6;

public class FirstLast6 {

	public static void main(String[] args) {
		// D�claration tableau d'entiers
		int[] tab1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, 6};
		boolean marqueur = false;
		
		//Si d�tection "6" en d�but ou fin du tableau, marqueur = true
		if((tab1.length>0)&&(tab1[0] == 6 || tab1[tab1.length-1] == 6)) {
			marqueur = true;
		}
		//Inutile de faire un esle, le marqueur est false par d�faut
		System.out.println("Etat du boolean : "+marqueur);
		

	}

}
