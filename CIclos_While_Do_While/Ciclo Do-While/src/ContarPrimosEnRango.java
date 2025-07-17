import java.util.Scanner;

public class ContarPrimosEnRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso del rango
        System.out.print("Ingrese el número inicial del rango: ");
        int inicio = scanner.nextInt();

        System.out.print("Ingrese el número final del rango: ");
        int fin = scanner.nextInt();

        int contadorPrimos = 0;
        int numero = inicio;

        while (numero <= fin) {
            if (esPrimo(numero)) {
                contadorPrimos++;
            }
            numero++;
        }

        System.out.println("Cantidad de números primos en el rango [" + inicio + ", " + fin + "]: " + contadorPrimos);

        scanner.close();
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int n) {
        if (n <= 1) return false;

        int i = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
