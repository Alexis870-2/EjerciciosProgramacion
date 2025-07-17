import java.util.Scanner;

public class Ejercicio7 {
    public static void OperacionesMatrices(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño n de las matrices nxn: ");
        int n = sc.nextInt();

        int[][] matrizA = new int[n][n];
        int[][] matrizB = new int[n][n];
        int[][] suma = new int[n][n];
        int[][] producto = new int[n][n];

        int totalElementos = n * n * 2;
        int sumaTotal = 0;
        int mayorSuma = Integer.MIN_VALUE;

        System.out.println("\nIngrese los elementos de la Matriz A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrizA[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nIngrese los elementos de la Matriz B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrizB[i][j] = sc.nextInt();
            }
        }

        // Suma de matrices y cálculo del mayor elemento
        System.out.println("\n Suma de las dos matrices:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                suma[i][j] = matrizA[i][j] + matrizB[i][j];
                sumaTotal += matrizA[i][j] + matrizB[i][j];
                if (suma[i][j] > mayorSuma) {
                    mayorSuma = suma[i][j];
                }
                System.out.print(suma[i][j] + "\t");
            }
            System.out.println();
        }

        // Promedio de todos los elementos de ambas matrices
        double promedio = (double) sumaTotal / totalElementos;
        System.out.printf("\n Promedio de todos los elementos: %.2f\n", promedio);

        // Producto de las matrices (A * B)
        System.out.println("\n Producto de las dos matrices (A × B):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                producto[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    producto[i][j] += matrizA[i][k] * matrizB[k][j];
                }
                System.out.print(producto[i][j] + "\t");
            }
            System.out.println();
        }

        // Elemento mayor en la matriz suma
        System.out.println("\n El mayor elemento en la matriz suma es: " + mayorSuma);

        sc.close();
    }
}
