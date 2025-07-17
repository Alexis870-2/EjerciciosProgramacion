import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Nota de 0 10,Insuficiente,Suficiente,Satisfactorio ");
        Scanner scanner = new Scanner(System.in);

        // Pedir la nota
        System.out.print("Ingrese una nota entre 0 y 10: ");
        double nota = scanner.nextDouble();

        // Validamos que esté en el rango permitido
        if (nota < 0 || nota > 10) {
            System.out.println("Nota fuera de rango. Debe estar entre 0 y 10.");
        } else {
            // Clasificamos la nota
            if (nota < 5) {
                System.out.println("Insuficiente");
            } else if (nota < 7) {
                System.out.println("Suficiente");
            } else {
                System.out.println("Satisfactorio");
            }
        }
    }
}
