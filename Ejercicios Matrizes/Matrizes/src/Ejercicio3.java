public class Ejercicio3 {
    public static void MatrizMarco(String[] args) {
        final int FILAS = 5;
        final int COLUMNAS = 15;
        int[][] marco = new int[FILAS][COLUMNAS];

        // Cargar la matriz con 1 en los bordes y 0 en el interior
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (i == 0 || i == FILAS - 1 || j == 0 || j == COLUMNAS - 1) {
                    marco[i][j] = 1;
                } else {
                    marco[i][j] = 0;
                }
            }
        }

        // Mostrar la matriz en pantalla
        System.out.println("Matriz tipo marco (1 en bordes, 0 en interior):");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(marco[i][j]);
            }
            System.out.println();
        }
    }
}
