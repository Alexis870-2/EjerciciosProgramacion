import java.util.Random;
import java.util.Scanner;

public class JuegoTanqueVisual {

    public static final int TAMANO = 21;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean jugar = true;

        while (jugar) {
            // === Inicialización del mapa ===
            char[][] mapa = inicializarMapa();

            // Posición fija del tanque (0,0)
            mapa[TAMANO - 1][0] = 'T';

            // Posición aleatoria del objetivo
            int objetivoX = random.nextInt(TAMANO);
            int objetivoY = random.nextInt(TAMANO);
            mapa[TAMANO - 1 - objetivoY][objetivoX] = 'O';

            // Mostrar mapa inicial
            mostrarMapa(mapa);

            // === Ingreso del disparo ===
            System.out.print("Ingresa coordenada X (0 - " + (TAMANO - 1) + "): ");
            int disparoX = scanner.nextInt();
            System.out.print("Ingresa coordenada Y (0 - " + (TAMANO - 1) + "): ");
            int disparoY = scanner.nextInt();

            // === Mostrar trayectoria y marcarla en el mapa ===
            mostrarTrayectoria(mapa, disparoX, disparoY, objetivoX, objetivoY);

            // Marcar disparo final con 'X' si está dentro del mapa
            if (dentroDelMapa(disparoX, disparoY)) {
                mapa[TAMANO - 1 - disparoY][disparoX] = 'X';
            }

            // Mostrar mapa actualizado con trayectoria y disparo
            mostrarMapa(mapa);

            // === Evaluar impacto ===
            if (disparoX == objetivoX && disparoY == objetivoY) {
                System.out.println("🎯 ¡Objetivo alcanzado!");
            } else {
                System.out.println("💥 Fallaste. El objetivo estaba en (" + objetivoX + ", " + objetivoY + ")");
            }

            // Evaluación matemática de las coordenadas
            evaluarNumero(disparoX, "X");
            evaluarNumero(disparoY, "Y");

            // Repetir juego
            System.out.print("¿Deseas jugar otra vez? (s/n): ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("s")) {
                jugar = false;
                System.out.println("¡Gracias por jugar!");
            }
        }

        scanner.close();
    }

    // ========================= MÉTODOS DE APOYO =========================

    // Inicializa el mapa con puntos
    public static char[][] inicializarMapa() {
        char[][] mapa = new char[TAMANO][TAMANO];
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                mapa[i][j] = '.';
            }
        }
        return mapa;
    }

    // Verifica si una coordenada está dentro del mapa
    public static boolean dentroDelMapa(int x, int y) {
        return x >= 0 && x < TAMANO && y >= 0 && y < TAMANO;
    }

    // Muestra el mapa completo
    public static void mostrarMapa(char[][] mapa) {
        System.out.println("\n=== MAPA DE GUERRA ===");
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=======================\n");
    }

    // Muestra la trayectoria y tabla paso a paso
    public static void mostrarTrayectoria(char[][] mapa, int disparoX, int disparoY, int objetivoX, int objetivoY) {
        System.out.println("Tabla de trayectoria:");
        System.out.printf("%-5s %-5s %-5s %-10s%n", "Paso", "X", "Y", "¿Impacta?");
        System.out.println("-----------------------------------");

        int paso = 1;
        boolean impactado = false;

        for (int x = 0; x <= disparoX && x < TAMANO; x++, paso++) {
            double y = (double) disparoY * x / disparoX;
            int yRedondeado = (int) Math.round(y);

            boolean enMapa = dentroDelMapa(x, yRedondeado);
            boolean impacto = (x == objetivoX && yRedondeado == objetivoY);

            if (enMapa && mapa[TAMANO - 1 - yRedondeado][x] == '.') {
                mapa[TAMANO - 1 - yRedondeado][x] = '*'; // Traza trayectoria
            }

            System.out.printf("%-5d %-5d %-5d %-10s%n", paso, x, yRedondeado, impacto ? "Sí" : "No");

            if (impacto) {
                impactado = true;
                break;
            }
        }

        if (!impactado) {
            System.out.println("No impactaste el objetivo en la trayectoria.");
        }
    }

    // Evalúa si un número es par/impar y si es primo
    public static void evaluarNumero(int numero, String eje) {
        System.out.println("Coordenada " + eje + " = " + numero);

        // Par o impar
        if (numero % 2 == 0) {
            System.out.println("Es un número par.");
        } else {
            System.out.println("Es un número impar.");
        }

        // Número primo
        if (esPrimo(numero)) {
            System.out.println("Y también es un número primo.");
        } else {
            System.out.println("Y no es un número primo.");
        }

        System.out.println();
    }

    // Verifica si un número es primo
    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

