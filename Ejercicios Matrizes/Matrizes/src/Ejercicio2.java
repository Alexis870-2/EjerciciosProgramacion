public class Ejercicio2 {
    public static void MatrizDiagonal(String[] args) {
        final int TAM = 5;
        int[][] diagonal = new int[TAM][TAM];

        // Cargar la matriz con 1 en la diagonal principal y 0 en el resto
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (i == j) {
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }

        System.out.println("Matriz con 1 en la diagonal y 0 en el resto:");
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }
    }
}

