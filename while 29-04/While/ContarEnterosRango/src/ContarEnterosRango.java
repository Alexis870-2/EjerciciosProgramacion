import java.util.Scanner;

public class ContarEnterosRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número inicial del rango: ");
        int inicio = scanner.nextInt();
        
        System.out.print("Ingrese el número final del rango: ");
        int fin = scanner.nextInt();

        int contador = 0;
        int actual = inicio;

        if (inicio <= fin) {
            while (actual <= fin) {
                contador++;
                actual++;
            }
        } else {
            while (actual >= fin) {
                contador++;
                actual--;
            }
        }

        System.out.println("Cantidad de números enteros en el rango: " + contador);
    }
}
