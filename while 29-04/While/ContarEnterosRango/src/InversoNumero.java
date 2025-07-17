import java.util.Scanner;

public class InversoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        int inverso = 0;

        while (numero != 0) {
            int digito = numero % 10;
            inverso = inverso * 10 + digito;
            numero /= 10;
        }

        System.out.println("El número invertido es: " + inverso);
    }
}
