import java.util.Scanner;

public class ejercicio_74 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, resultadoPar, resultadoImpar;

        System.out.print("Ingrese un número entero: ");
        num1 = sc.nextInt();

        resultadoPar = sumarDigitosPares(num1);
        resultadoImpar = sumarDigitosImpares(num1);

        System.out.println("Suma de dígitos pares: " + resultadoPar);
        System.out.println("Suma de dígitos impares: " + resultadoImpar);

        sc.close();
    }

    // Subproceso para sumar los dígitos pares
    public static int sumarDigitosPares(int numero) {
        int suma = 0, digito;
        numero = Math.abs(numero); // Para manejar números negativos
        while (numero > 0) {
            digito = numero % 10;
            if (digito % 2 == 0) {
                suma += digito;
            }
            numero /= 10;
        }
        return suma;
    }

    // Subproceso para sumar los dígitos impares
    public static int sumarDigitosImpares(int numero) {
        int suma = 0, digito;
        numero = Math.abs(numero); // Para manejar números negativos
        while (numero > 0) {
            digito = numero % 10;
            if (digito % 2 != 0) {
                suma += digito;
            }
            numero /= 10;
        }
        return suma;
    }
}
