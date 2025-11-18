package h2;

public class H2_main {

	public static void main(String[] args) {
    
		
		// Deklaration und Initialisierung der Variablen
        int n = 48995;
        int digits = 0;
        
        // Ausgabe der Zahl
        System.out.println("Zahl: " + n );
        
		// Deklaration und Initialisierung des Arrays
        int[] a = {0,0,0,0,0,0,0,0,0};	//ein Array mit 9 deklarieren
        
        // Berechnung der Anzahl der Ziffern
        if (n == 0) {
            digits = 1;
        } else {
            int temp = n;
            while (temp > 0) {
                digits=digits+1;
                temp = temp / 10;
            }
        }
        // Ausgabe der Anzahl der Ziffern der Zahl n
        System.out.println("\nAnzahl der Ziffern: " + digits);
        
        
     // Abspeichern der Ziffern im Array a
        int temp = n;
        int i = 0;
        for (i=0; i<digits; i++) {
        	a[8-i] = temp %10;
        	temp = temp / 10;
        }
        // Ausgabe Ziffern in das Array
        System.out.println("\nArray a: ");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }


	}

}
