import java.util.Scanner;

public class ConvertirBaseMenorDiez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero en base 10: ");
        int numero = scanner.nextInt();

        System.out.print("Ingrese la base destino (menor que 10): ");
        int base = scanner.nextInt();

        if (base >= 10 || base < 2) {
            System.out.println("La base debe ser menor que 10 y mayor que 1.");
            return;
        }

        int original = numero;
        String resultado = "";

        if (numero == 0) {
            resultado = "0";
        } else {
            while (numero > 0) {
                int digito = numero % base;
                resultado = digito + resultado;
                numero /= base;
            }
        }

        System.out.println("El número " + original + " en base " + base + " es: " + resultado);
    }
}
