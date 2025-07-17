import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de múltiplos de 5 que desea obtener: ");
        int N = scanner.nextInt();

        int contador = 0;
        int numero = 1;

        System.out.println("Primeros " + N + " múltiplos de 5:");

        do {
            if (numero % 5 == 0) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        } while (contador < N);

        System.out.println("Cantidad total de múltiplos encontrados: " + contador);
    }
}
