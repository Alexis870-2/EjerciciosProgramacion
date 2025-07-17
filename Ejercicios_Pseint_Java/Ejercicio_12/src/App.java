import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Numero entre 0 y 9999 tambien si es palindromo");
        Scanner scanner = new Scanner(System.in);

        // Pedir un número entre 0 y 9999
        System.out.print("Ingrese un número entre 0 y 9999: ");
        int numero = scanner.nextInt();

        // Verificar que esté en el rango permitido
        if (numero < 0 || numero > 9999) {
            System.out.println("El número está fuera del rango permitido.");
        } else {
            // Convertimos el número a String para compararlo al revés
            String original = Integer.toString(numero);
            String invertido = new StringBuilder(original).reverse().toString();

            // Comparamos si el número es igual al invertido
            if (original.equals(invertido)) {
                System.out.println("El número " + numero + " es palíndromo.");
            } else {
                System.out.println("El número " + numero + " no es palíndromo.");
            }
        }
    }
}
