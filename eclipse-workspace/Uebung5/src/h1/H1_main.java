package h1;

public class H1_main {

	public static void main(String[] args) {
	
		// Deklaration und Initialisierung des Arrays
        int[] myArray = {5,6,7,10,13};	//ein Array deklarieren
 
        // Ausgabe vor dem Umdrehen
        System.out.println("Originales Array:");
        for (int wert : myArray) {
            System.out.print(wert + "  ");
        }

        // Umdrehen des Arrays
        for (int i = 0; i < myArray.length / 2; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = temp;
        }

        // Ausgabe nach dem Umdrehen
        System.out.println("\n\n\nUmgekehrtes Array:");
        for (int wert : myArray) {
            System.out.print(wert + "  ");
   
        }

	}

}
