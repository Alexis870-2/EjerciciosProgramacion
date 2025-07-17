import java.util.Scanner;

public class NumerosAmigos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de los dos números
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // Sumar divisores propios de cada número
        int sumaDiv1 = sumarDivisores(num1);
        int sumaDiv2 = sumarDivisores(num2);

        // Verificar si son amigos
        if (sumaDiv1 == num2 && sumaDiv2 == num1) {
            System.out.println(num1 + " y " + num2 + " son números amigos.");
        } else {
            System.out.println(num1 + " y " + num2 + " NO son números amigos.");
        }

        scanner.close();
    }

    // Método para sumar divisores propios de un número
    public static int sumarDivisores(int numero) {
        int suma = 0;
        int i = 1;

        while (i < numero) {
            if (numero % i == 0) {
                suma += i;
            }
            i++;
        }

        return suma;
    }
}
