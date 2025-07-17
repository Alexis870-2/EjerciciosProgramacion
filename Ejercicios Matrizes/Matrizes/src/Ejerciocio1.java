import java.util.Scanner;

public class Ejerciocio1 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los valores enteros para la matriz 5x5:");
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 5; col++) {
                System.out.println("------------------------------------------");
                System.out.print("Elemento [fila " + fila + "][columna " + col + "]: ");
                matriz[fila][col] = scanner.nextInt();
            }
        }

        // Sumar y mostrar la suma de cada fila
        System.out.println("\nSuma de elementos por fila (horizontal):");
        for (int fila = 0; fila < 5; fila++) {
            int sumaFila = 0;
            for (int col = 0; col < 5; col++) {
                sumaFila += matriz[fila][col];
            }
            System.out.println("Fila " + fila + ": " + sumaFila);
        }

        // Sumar y mostrar la suma de cada columna
        System.out.println("\nSuma de elementos por columna (vertical):");
        for (int col = 0; col < 5; col++) {
            int sumaColumna = 0;
            for (int fila = 0; fila < 5; fila++) {
                sumaColumna += matriz[fila][col];
            }
            System.out.println("Columna " + col + ": " + sumaColumna);
        }
    }
}