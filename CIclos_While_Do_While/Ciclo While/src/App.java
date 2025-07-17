import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);

        // Solicitar el rango al usuario
        System.out.print("Ingrese el número inicial del rango: ");
        int inicio = scanner.nextInt();

        System.out.print("Ingrese el número final del rango: ");
        int fin = scanner.nextInt();

        // Asegurarse de que inicio sea menor o igual al fin
        if (inicio > fin) {
            System.out.println("El número inicial debe ser menor o igual al número final.");
        } else {
            int contador = 0;
            int actual = inicio;

            while (actual <= fin) {
                contador++;
                actual++;
            }

            System.out.println("Cantidad de números enteros en el rango: " + contador);
        }

    }
}
