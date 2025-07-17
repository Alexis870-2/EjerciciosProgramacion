

public class App {
    public static void main(String[] args) throws Exception {
        // Definir dos matrices de 3x3
        int[][] matrizA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrizB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Matriz resultado
        int[][] suma = new int[3][3];

        // Sumar las matrices
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                suma[f][c] = matrizA[f][c] + matrizB[f][c];
            }
        }

        // Mostrar matrices y resultado en formato de matriz
        System.out.println("Matriz A:");
        mostrarMatriz(matrizA);

        System.out.println("\nMatriz B:");
        mostrarMatriz(matrizB);

        System.out.println("\nSuma de A + B:");
        mostrarMatriz(suma);
    }

    // Método para mostrar una matriz en formato de filas y columnas
    public static void mostrarMatriz(int[][] matriz) {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[f][c] + "\t");
            }
            System.out.println(); // salto de línea por fila
    }
}
}
