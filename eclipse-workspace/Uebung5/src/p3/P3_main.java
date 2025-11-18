package p3;

public class P3_main {

	public static void main(String[] args) {
	
        // Ursprüngliche Matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // (a) Erhöhe jedes Element um 1 und gib die Matrix aus
        System.out.println("Matrix nach Erhöhung um 1:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] += 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // (b) Berechne die Summe aller Elemente
        int summe = 0;
		for (int i = 0 ; i < matrix.length; i++) {
			for (int j = 0; j< matrix[i].length; j++) {
				summe += matrix [i][j];
			}
		}
		System.out.println("Summe: " +summe);
		System.out.println();
		
		
		// (c)
		
		
	}

}
