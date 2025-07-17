import java.util.Scanner;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Pedir dos numeros y decir cual es el mañor");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }
}
