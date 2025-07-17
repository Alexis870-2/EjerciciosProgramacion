import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso del número
        System.out.print("Ingrese un número entero en base 10: ");
        int numero = scanner.nextInt();

        // Ingreso de la base de destino
        System.out.print("Ingrese la base a la que desea convertir (menor que 10): ");
        int base = scanner.nextInt();

        // Validar que la base sea válida
        if (base < 2 || base >= 10) {
            System.out.println("La base debe estar entre 2 y 9.");
        } else {
            int numeroOriginal = numero;
            String resultado = "";

            // Convertimos a base deseada
            while (numero > 0) {
                int residuo = numero % base;
                resultado = residuo + resultado; // construir el número al revés
                numero = numero / base;
            }

            System.out.println("El número " + numeroOriginal + " en base " + base + " es: " + resultado);
        }

        scanner.close();
    }
}

