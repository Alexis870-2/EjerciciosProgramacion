import java.util.Scanner;

public class ejercicio_75 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char caracter;

        System.out.print("Ingrese un carácter: ");
        caracter = sc.next().charAt(0);

        clasificarCaracter(caracter);

        sc.close();
    }

    // Subproceso que determina el tipo de carácter
    public static void clasificarCaracter(char c) {
        if (Character.isDigit(c)) {
            System.out.println("Es un número.");
        } else if (Character.isUpperCase(c)) {
            if (esVocal(c)) {
                System.out.println("Es una vocal mayúscula.");
            } else {
                System.out.println("Es una letra mayúscula.");
            }
        } else if (Character.isLowerCase(c)) {
            if (esVocal(c)) {
                System.out.println("Es una vocal minúscula.");
            } else {
                System.out.println("Es una letra minúscula.");
            }
        } else {
            System.out.println("Es un símbolo.");
        }
    }

    // Subproceso auxiliar para saber si es vocal
    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
