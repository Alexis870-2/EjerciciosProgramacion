import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Decir si un numero es multiplo del otro");
        Scanner scanner = new Scanner(System.in);

        // Pedimos dos números
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // Verificamos si alguno es múltiplo del otro
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else if (num2 % num1 == 0) {
            System.out.println(num2 + " es múltiplo de " + num1);
        } else {
            System.out.println("Ninguno de los dos es múltiplo del otro.");
        }
    }
}
