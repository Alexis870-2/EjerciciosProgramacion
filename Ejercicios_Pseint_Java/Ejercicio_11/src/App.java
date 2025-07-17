import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Calcular un numero desde el 0,9999 y cuantas cifras tiene");
        Scanner scanner = new Scanner(System.in);

        // Pedimos un número entre 0 y 9999
        System.out.print("Ingrese un número entre 0 y 9999: ");
        int numero = scanner.nextInt();

        // Verificamos que esté en el rango correcto
        if (numero < 0 || numero > 9999) {
            System.out.println("El número ingresado está fuera del rango permitido.");
        } else {
            int cifras;

            // Usamos condiciones para determinar la cantidad de cifras
            if (numero < 10) {
                cifras = 1;
            } else if (numero < 100) {
                cifras = 2;
            } else if (numero < 1000) {
                cifras = 3;
            } else {
                cifras = 4;
            }

            System.out.println("El número tiene " + cifras + " cifra(s).");
        }
    }
}
