import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean jugar = true;

        while (jugar) {
            // Generar coordenadas aleatorias del objetivo
            int objetivoX = random.nextInt(21); // Rango: 0 a 20
            int objetivoY = random.nextInt(21);

            System.out.println("¡Nuevo objetivo generado! Dispara...");
            System.out.print("Ingresa coordenada X: ");
            int disparoX = scanner.nextInt();
            System.out.print("Ingresa coordenada Y: ");
            int disparoY = scanner.nextInt();

            // Evaluar impacto
            if (disparoX == objetivoX && disparoY == objetivoY) {
                System.out.println("🎯 ¡Objetivo alcanzado!");
            } else {
                System.out.println("💥 Fallaste. El objetivo estaba en (" + objetivoX + ", " + objetivoY + ")");
            }

            // Evaluación extra: Par, impar y primo
            evaluarNumero(disparoX, "X");
            evaluarNumero(disparoY, "Y");

            // Repetir o salir
            System.out.print("¿Deseas volver a jugar? (s/n): ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("s")) {
                jugar = false;
                System.out.println("Gracias por jugar. ¡Hasta pronto!");
            }
        }

        scanner.close();
    }

    // Función para evaluar par, impar y primo
    public static void evaluarNumero(int numero, String etiqueta) {
        System.out.println("Coordenada " + etiqueta + " = " + numero);

        if (numero % 2 == 0) {
            System.out.println("Es un número par.");
        } else {
            System.out.println("Es un número impar.");
        }

        if (esPrimo(numero)) {
            System.out.println("Además, es un número primo.");
        } else {
            System.out.println("No es un número primo.");
        }
    }

    // Verifica si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    

    }
}
