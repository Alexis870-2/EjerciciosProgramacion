import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void problema1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        int suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
            suma += vector[i];
        }
        System.out.println("Suma total: " + suma);
    }

    public static void problema2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
            if (vector[i] > mayor) mayor = vector[i];
        }
        System.out.println("Mayor elemento: " + mayor);
    }

    public static void problema3() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        int pares = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
            if (vector[i] % 2 == 0) pares++;
        }
        System.out.println("Cantidad de números pares: " + pares);
    }

    public static void problema4() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        System.out.println("Vector en orden inverso:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }

    public static void problema5() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[6];
        int suma = 0;
        for (int i = 0; i < 6; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
            suma += vector[i];
        }
        double promedio = (double) suma / 6;
        System.out.println("Promedio: " + promedio);
    }

    public static void problema6() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        Arrays.sort(vector);
        System.out.println("Vector ordenado: " + Arrays.toString(vector));
    }

    public static void problema7() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        System.out.print("Número a buscar: ");
        int num = sc.nextInt();
        boolean encontrado = false;
        for (int val : vector) {
            if (val == num) {
                encontrado = true;
                break;
            }
        }
        System.out.println(encontrado ? "Número encontrado." : "Número no encontrado.");
    }

    public static void problema8() {
        Scanner sc = new Scanner(System.in);
        int[] original = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Original[" + i + "]: ");
            original[i] = sc.nextInt();
        }
        int[] copia = Arrays.copyOf(original, 5);
        System.out.println("Copia: " + Arrays.toString(copia));
    }

    public static void problema9() {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        int[] suma = new int[3];
        System.out.println("Vector A:");
        for (int i = 0; i < 3; i++) {
            System.out.print("A[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Vector B:");
        for (int i = 0; i < 3; i++) {
            System.out.print("B[" + i + "]: ");
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            suma[i] = a[i] + b[i];
        }
        System.out.println("Vector suma: " + Arrays.toString(suma));
    }

    public static void problema10() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[4];
        System.out.print("Ingrese el escalar: ");
        int escalar = sc.nextInt();
        for (int i = 0; i < 4; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            vector[i] *= escalar;
        }
        System.out.println("Vector resultante: " + Arrays.toString(vector));
    }

    public static void problema11() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[5];
        int menor = Integer.MAX_VALUE, pos = -1;
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento[" + i + "]: ");
            vector[i] = sc.nextInt();
            if (vector[i] < menor) {
                menor = vector[i];
                pos = i;
            }
        }
        System.out.println("Menor valor: " + menor + " en la posición " + pos);
    }

    public static void problema12() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[8];
        System.out.print("Número a contar: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0; i < 8; i++) {
            System.out.print("Elemento[" + i + "]: ");
            vector[i] = sc.nextInt();
            if (vector[i] == num) count++;
        }
        System.out.println("Número " + num + " aparece " + count + " veces.");
    }

    public static void problema13() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[6];
        System.out.print("Elemento a eliminar: ");
        int eliminar = sc.nextInt();
        for (int i = 0; i < 6; i++) {
            System.out.print("Elemento[" + i + "]: ");
            vector[i] = sc.nextInt();
        }
        System.out.print("Vector sin el elemento: ");
        for (int i = 0; i < 6; i++) {
            if (vector[i] != eliminar)
                System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public static void problema14() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[6];
        boolean ordenado = true;
        for (int i = 0; i < 6; i++) {
            System.out.print("Elemento[" + i + "]: ");
            vector[i] = sc.nextInt();
            if (i > 0 && vector[i] < vector[i - 1]) ordenado = false;
        }
        System.out.println(ordenado ? "El vector está ordenado." : "El vector no está ordenado.");
    }

    public static void problema15() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Elemento[" + i + "]: ");
            vector[i] = sc.nextInt();
        }
        for (int i = 0; i < vector.length / 2; i++) {
            int temp = vector[i];
            vector[i] = vector[vector.length - 1 - i];
            vector[vector.length - 1 - i] = temp;
        }
        System.out.println("Vector invertido: " + Arrays.toString(vector));
    }

    public static void problema16() {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3], b = new int[3], fusion = new int[6];
        System.out.println("Vector A:");
        for (int i = 0; i < 3; i++) {
            System.out.print("A[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Vector B:");
        for (int i = 0; i < 3; i++) {
            System.out.print("B[" + i + "]: ");
            b[i] = sc.nextInt();
        }
        System.arraycopy(a, 0, fusion, 0, 3);
        System.arraycopy(b, 0, fusion, 3, 3);
        System.out.println("Vector fusionado: " + Arrays.toString(fusion));
    }

    public static void problema17() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.print("Elemento[" + i + "]: ");
            vector[i] = sc.nextInt();
        }
        int moda = vector[0], maxCount = 0;
        for (int i = 0; i < vector.length; i++) {
            int count = 0;
            for (int j = 0; j < vector.length; j++) {
                if (vector[j] == vector[i]) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                moda = vector[i];
            }
        }
        System.out.println("Moda: " + moda + " (aparece " + maxCount + " veces)");
    }

    public static void problema18() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[7];
        System.out.println("Ingrese 7 números:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Elemento[" + i + "]: ");
            vector[i] = sc.nextInt();
        }
        System.out.print("Vector sin duplicados: ");
        for (int i = 0; i < vector.length; i++) {
            boolean duplicado = false;
            for (int j = 0; j < i; j++) {
                if (vector[i] == vector[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public static void problema19() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[6];
        System.out.println("Ingrese 6 elementos:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Elemento[" + i + "]: ");
            vector[i] = sc.nextInt();
        }
        int ultimo = vector[vector.length - 1];
        for (int i = vector.length - 1; i > 0; i--) {
            vector[i] = vector[i - 1];
        }
        vector[0] = ultimo;
        System.out.println("Vector desplazado a la derecha: " + Arrays.toString(vector));
    }

    public static void problema20() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[5];
        System.out.println("Ingrese 5 elementos:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento[" + i + "]: ");
            vector[i] = sc.nextInt();
        }
        boolean esPalindromo = true;
        for (int i = 0; i < vector.length / 2; i++) {
            if (vector[i] != vector[vector.length - 1 - i]) {
                esPalindromo = false;
                break;
            }
        }
        System.out.println(esPalindromo ? "El vector es palíndromo." : "El vector no es palíndromo.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--- Menú de Ejercicios de Vectores ---");
            System.out.println("1. Sumar elementos del vector");
            System.out.println("2. Encontrar el mayor elemento");
            System.out.println("3. Contar números pares");
            System.out.println("4. Mostrar vector en orden inverso");
            System.out.println("5. Calcular promedio");
            System.out.println("6. Ordenar vector");
            System.out.println("7. Buscar un número");
            System.out.println("8. Copiar vector");
            System.out.println("9. Sumar dos vectores");
            System.out.println("10. Multiplicar vector por escalar");
            System.out.println("11. Posición del menor elemento");
            System.out.println("12. Contar ocurrencias");
            System.out.println("13. Eliminar un elemento");
            System.out.println("14. Verificar si vector está ordenado");
            System.out.println("15. Intercambiar elementos simétricos");
            System.out.println("16. Fusionar dos vectores");
            System.out.println("17. Encontrar la moda");
            System.out.println("18. Eliminar duplicados");
            System.out.println("19. Desplazar elementos a la derecha");
            System.out.println("20. Verificar si vector es palíndromo");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> problema1();
                case 2 -> problema2();
                case 3 -> problema3();
                case 4 -> problema4();
                case 5 -> problema5();
                case 6 -> problema6();
                case 7 -> problema7();
                case 8 -> problema8();
                case 9 -> problema9();
                case 10 -> problema10();
                case 11 -> problema11();
                case 12 -> problema12();
                case 13 -> problema13();
                case 14 -> problema14();
                case 15 -> problema15();
                case 16 -> problema16();
                case 17 -> problema17();
                case 18 -> problema18();
                case 19 -> problema19();
                case 20 -> problema20();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida, intente de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
