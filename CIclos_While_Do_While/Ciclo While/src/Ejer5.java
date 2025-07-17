import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar número y dígito
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        System.out.print("Ingrese el dígito a buscar: ");
        int digitoBuscado = scanner.nextInt();

        // Convertir el número a valor absoluto para evitar problemas con números negativos
        numero = Math.abs(numero);
        
        boolean encontrado = false;

        // Buscar el dígito en el número
        while (numero > 0) {
            int digito = numero % 10;
            if (digito == digitoBuscado) {
                encontrado = true;
                break; // Si encontramos el dígito, salimos del ciclo
            }
            numero = numero / 10;
        }

        // Mostrar resultado
        if (encontrado) {
            System.out.println("El dígito " + digitoBuscado + " se encuentra en el número.");
        } else {
            System.out.println("El dígito " + digitoBuscado + " no se encuentra en el número.");
        }

        scanner.close();
    }
}

