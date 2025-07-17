import java.util.Scanner;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Area de un circulo");
        Scanner scanner = new Scanner(System.in);

        // Solicitar el radio al usuario
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el área
        double area = Math.PI * Math.pow(radio, 2);

        // Mostrar el resultado
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
    }
}
