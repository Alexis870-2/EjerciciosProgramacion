import java.util.Scanner;

public class ExisteDigito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        System.out.print("Ingrese el dígito a buscar (0-9): ");
        int digitoBuscar = scanner.nextInt();

        boolean existe = false;
        int actual;

        if (numero < 0) numero = -numero;

        while (numero > 0) {
            actual = numero % 10;
            if (actual == digitoBuscar) {
                existe = true;
                break;
            }
            numero /= 10;
        }

        if (existe) {
            System.out.println("El dígito existe en el número.");
        } else {
            System.out.println("El dígito NO existe en el número.");
        }
    }
}
