import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Leer un numero y mostrar su cuadrado hasta que se introdusca un numero negativo");
        Scanner scanner = new Scanner(System.in);
                int numero;
        
                do {
                    System.out.print("Introduce un número (negativo para salir): ");
                    numero = scanner.nextInt();
        
                    if (numero >= 0) {
                        int cuadrado = numero * numero;
                        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
                    }
        
                } while (numero >= 0);
        
                System.out.println("Programa finalizado porque se ingresó un número negativo.");
    }
}
