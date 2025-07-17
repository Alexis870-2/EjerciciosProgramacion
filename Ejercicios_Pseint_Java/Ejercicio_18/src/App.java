import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Leer un numero positivo o negativo hasta que se introdusca un cero");
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número (0 para salir): ");
            numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("El número es positivo.");
            } else if (numero < 0) {
                System.out.println("El número es negativo.");
            }

        } while (numero != 0);

        System.out.println("Programa finalizado porque se ingresó un 0.");
    }
}
