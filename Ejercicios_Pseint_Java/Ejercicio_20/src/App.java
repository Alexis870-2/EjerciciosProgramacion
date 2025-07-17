import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Adivina el numero");
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Se pide el número secreto (oculto para otro jugador)
        System.out.print("Jugador 1, introduce el número secreto: ");
        int numeroSecreto = scanner.nextInt();

        // Limpiar pantalla simuladamente con saltos de línea para ocultar el número secreto
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        int intento;

        // Paso 2: Jugador 2 intenta adivinar
        do {
            System.out.print("Jugador 2, intenta adivinar el número: ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Correcto! Has adivinado el número.");
            }

        } while (intento != numeroSecreto);
    }
}
