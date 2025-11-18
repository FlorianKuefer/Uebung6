package h3;

public class H3_main {

	public static void main(String[] args) {
		
		
		// 2-dimensionale Matrix initialisieren
        int[][] einheiten = {
            {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
        
        // Variablen deklarieren
        int input = 123456; // Beispielwert in Cent
        int anzahl = 0;
        
     // Zerlegung des Betrags in möglichst wenige Einheiten
        for (int i = 0; i < einheiten[0].length; i++) {
            if (input >= einheiten[0][i]) {
                einheiten[1][i] = input / einheiten[0][i];
                anzahl += einheiten[1][i];
                input %= einheiten[0][i];
            }
        }

        // Ausgabe zur Kontrolle
        System.out.println("Zerlegung des Betrags in möglichst wenige Einheiten:\n");
        for (int i = 0; i < einheiten[0].length; i++) {
            if (einheiten[1][i] > 0) {
                System.out.println(einheiten[1][i] + " × " + (einheiten[0][i] / 100.0) + " €");
            }
        }
        System.out.print("\nAnzahl der Scheine bzw. Münzen = " + anzahl);

	}

}
