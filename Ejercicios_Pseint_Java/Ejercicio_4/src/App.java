import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Saber si dos numeros son iguales");
        Scanner scanner = new Scanner(System.in);

        // Solicitar los dos números al usuario
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Comparar los números
        if (numero1 == numero2) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los números son diferentes.");
        }
    }
}
