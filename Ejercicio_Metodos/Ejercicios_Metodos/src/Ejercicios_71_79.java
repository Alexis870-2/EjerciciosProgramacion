import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios_71_79 {

    // Problema 51: Suma y promedio de 4 números
    public static void problema51() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[4];
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }
        double promedio = suma / 4.0;
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }

    // Problema 52: Mayor y menor de 4 números
    public static void problema52() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        int mayor = numeros[0];
        int menor = numeros[0];
        for (int num : numeros) {
            if (num > mayor) mayor = num;
            if (num < menor) menor = num;
        }
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }

    // Problema 53: Contar múltiplos de n en 6 números
    public static void problema53() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];
        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();
        int contador = 0;
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % n == 0) contador++;
        }
        System.out.println("Múltiplos de " + n + ": " + contador);
    }

    // Problema 54: Ordenar 5 números asc o desc
    public static void problema54() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        System.out.print("Orden (A para ascendente, D para descendente): ");
        char orden = sc.next().toUpperCase().charAt(0);

        Arrays.sort(numeros);
        if (orden == 'D') {
            for (int i = 0; i < numeros.length / 2; i++) {
                int temp = numeros[i];
                numeros[i] = numeros[numeros.length - 1 - i];
                numeros[numeros.length - 1 - i] = temp;
            }
        }
        System.out.println("Números ordenados:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }

    // Problema 55: Contar números repetidos en 6 números
    public static void problema55() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        int repetidos = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    repetidos++;
                    break;
                }
            }
        }
        System.out.println("Cantidad de números repetidos: " + repetidos);
    }

    // Problema 71: Suma de un vector de longitud n
    public static void problema71() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la longitud del vector: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        int suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
            suma += vector[i];
        }
        System.out.println("Suma: " + suma);
    }

    // Problema 72: Ordenar 5 números
    public static void problema72() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        Arrays.sort(vector);
        System.out.println("Ordenados: " + Arrays.toString(vector));
    }

    // Problema 73: Contar pares en vector de 6
    public static void problema73() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[6];
        int pares = 0;
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
            if (vector[i] % 2 == 0) pares++;
        }
        System.out.println("Cantidad de pares: " + pares);
    }

    // Problema 74: Mostrar vector de 5 números en orden inverso
    public static void problema74() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        System.out.println("Números en orden inverso:");
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }

    // Problema 75: Encontrar mayor en vector de 5 números
    public static void problema75() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[5];
        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
            if (vector[i] > mayor) mayor = vector[i];
        }
        System.out.println("Mayor: " + mayor);
    }

    // Problema 76: Encontrar menor en vector de 5 números
    public static void problema76() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[5];
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
            if (vector[i] < menor) menor = vector[i];
        }
        System.out.println("Menor: " + menor);
    }

    // Problema 77: Contar múltiplos de n en vector de 6
    public static void problema77() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[6];
        System.out.print("Ingrese un número n: ");
        int n = sc.nextInt();
        int contador = 0;
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
            if (vector[i] % n == 0) contador++;
        }
        System.out.println("Cantidad de múltiplos de " + n + ": " + contador);
    }

    // Problema 78: Mostrar vector de 5 números con índice
    public static void problema78() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        System.out.println("Números:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector[" + i + "] = " + vector[i]);
        }
    }

    // Problema 79: Vector de 5 decimales y mostrarlos
    public static void problema79() {
        Scanner sc = new Scanner(System.in);
        double[] vector = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Decimal " + (i + 1) + ": ");
            vector[i] = sc.nextDouble();
        }
        System.out.println("Decimales ingresados:");
        for (double d : vector) {
            System.out.println(d);
        }
    }

    // Problema 80: Vector de 3 palabras y mostrarlas
    public static void problema80() {
        Scanner sc = new Scanner(System.in);
        String[] vector = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            vector[i] = sc.next();
        }
        System.out.println("Palabras ingresadas:");
        for (String palabra : vector) {
            System.out.println(palabra);
        }
    }

    // Problema 81: Promedio de 3 notas
    public static void problema81() {
        Scanner sc = new Scanner(System.in);
        double[] vector = new double[3];
        double suma = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            vector[i] = sc.nextDouble();
            suma += vector[i];
        }
        System.out.println("Promedio: " + (suma / 3));
    }

    // Problema 82: Vector de 5 letras y mostrarlas
    public static void problema82() {
        Scanner sc = new Scanner(System.in);
        char[] letras = new char[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Letra " + (i + 1) + ": ");
            letras[i] = sc.next().charAt(0);
        }
        System.out.println("Letras ingresadas:");
        for (char letra : letras) {
            System.out.println(letra);
        }
    }

    // Problema 83: Suma total de 4 números
    public static void problema83() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[4];
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
            suma += vector[i];
        }
        System.out.println("Suma total: " + suma);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Ejercicios Propuestos ===");
        System.out.println("Seleccione un ejercicio (51-55, 71-83): ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 51: problema51(); break;
            case 52: problema52(); break;
            case 53: problema53(); break;
            case 54: problema54(); break;
            case 55: problema55(); break;
            case 71: problema71(); break;
            case 72: problema72(); break;
            case 73: problema73(); break;
            case 74: problema74(); break;
            case 75: problema75(); break;
            case 76: problema76(); break;
            case 77: problema77(); break;
            case 78: problema78(); break;
            case 79: problema79(); break;
            case 80: problema80(); break;
            case 81: problema81(); break;
            case 82: problema82(); break;
            case 83: problema83(); break;
            default:
                System.out.println("Opción no válida");
        }
    }
}

