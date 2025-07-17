import java.util.Scanner;

public class ejercicio_71 {

    // Método para calcular el área
    public static double calcularArea(double lado) {
        return lado * lado;
    }

    // Método para calcular el perímetro
    public static double calcularPerimetro(double lado) {
        return 4 * lado;
    }

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado, area, perimetro;

        System.out.print("Ingrese el valor  lade un lado del cuadrado: ");
        lado = sc.nextDouble();

        area = calcularArea(lado);
        perimetro = calcularPerimetro(lado);

        System.out.println("Área del cuadrado: " + area);
        System.out.println("Perímetro del cuadrado: " + perimetro);

        sc.close();
    }
}
