import java.util.Scanner;

public class DigitoMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Tomamos el valor absoluto para evitar problemas con números negativos
        numero = Math.abs(numero);

        int mayor = 0;

        // Buscar el dígito mayor
        while (numero > 0) {
            int digito = numero % 10;  // extraer el último dígito
            if (digito > mayor) {
                mayor = digito;
            }
            numero = numero / 10;      // quitar el último dígito
        }

        System.out.println("El dígito mayor es: " + mayor);

        scanner.close();
    }
}