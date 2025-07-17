import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Tres numeros ordenados de mayor a menor");
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario tres números
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();

        double mayor, medio, menor;

        // Usamos condicionales para ordenar los números de mayor a menor
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            if (num1 >= num3) {
                medio = num1;
                menor = num3;
            } else {
                medio = num3;
                menor = num1;
            }
        } else {
            mayor = num3;
            if (num1 >= num2) {
                medio = num1;
                menor = num2;
            } else {
                medio = num2;
                menor = num1;
            }
        }

        // Mostramos los números ordenados
        System.out.println("Orden de mayor a menor: " + mayor + ", " + medio + ", " + menor);
    }
}
