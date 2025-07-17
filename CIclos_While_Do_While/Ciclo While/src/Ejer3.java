import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int inverso = 0;

        // Convertir a valor absoluto si quieres evitar el signo negativo en el inverso
        int numeroAbsoluto = Math.abs(numero);

        while (numeroAbsoluto > 0) {
            int digito = numeroAbsoluto % 10;
            inverso = inverso * 10 + digito;
            numeroAbsoluto = numeroAbsoluto / 10;
        }

        // Mantener el signo original del número
        if (numero < 0) {
            inverso = -inverso;
        }

        System.out.println("El inverso del número es: " + inverso);

        scanner.close();
    }
}