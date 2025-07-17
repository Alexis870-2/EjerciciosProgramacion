import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Leer un numero hasta 0 pero decir si es par o impar");
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número (0 para salir): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    System.out.println("El número " + numero + " es par.");
                } else {
                    System.out.println("El número " + numero + " es impar.");
                }
            }

        } while (numero != 0);

        System.out.println("Programa finalizado porque se ingresó un 0.");
    }
}
