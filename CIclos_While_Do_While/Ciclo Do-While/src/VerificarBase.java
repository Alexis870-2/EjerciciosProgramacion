import java.util.Scanner;

public class VerificarBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de número y base
        System.out.print("Ingrese un número entero (sin prefijos de base): ");
        int numero = scanner.nextInt();

        System.out.print("Ingrese la base (entre 2 y 10): ");
        int base = scanner.nextInt();

        // Validación de base
        if (base < 2 || base > 10) {
            System.out.println("La base debe estar entre 2 y 10.");
            return;
        }

        int numeroAbsoluto = Math.abs(numero);
        boolean pertenece = true;

        // Verificar dígito por dígito
        while (numeroAbsoluto > 0) {
            int digito = numeroAbsoluto % 10;
            if (digito >= base) {
                pertenece = false;
                break;
            }
            numeroAbsoluto = numeroAbsoluto / 10;
        }

        // Resultado
        if (pertenece) {
            System.out.println("El número SÍ pertenece a la base " + base + ".");
        } else {
            System.out.println("El número NO pertenece a la base " + base + ".");
        }

        scanner.close();
    }
}

