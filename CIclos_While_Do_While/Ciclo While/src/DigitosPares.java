import java.util.Scanner;

public class DigitosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        int contadorPares = 0;
        int digito;

        // Convertir a valor absoluto para evitar problemas con números negativos
        numero = Math.abs(numero);

        // Contar dígitos pares
        while (numero > 0) {
            digito = numero % 10; // obtener último dígito
            if (digito % 2 == 0) {
                contadorPares++;
            }
            numero = numero / 10; // eliminar el último dígito
        }

        System.out.println("Cantidad de dígitos pares: " + contadorPares);

        scanner.close();
    }
}

