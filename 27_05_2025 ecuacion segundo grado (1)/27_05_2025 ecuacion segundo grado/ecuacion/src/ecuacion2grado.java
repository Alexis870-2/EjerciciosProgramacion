import java.util.Scanner;

public class ecuacion2grado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = leer(sc, "a (≠ 0)");
        while (a == 0) a = leer(sc, "a (≠ 0)");
        double b = leer(sc, "b");
        double c = leer(sc, "c");

        resolver(a, b, c);
        sc.close();
    }

    static double leer(Scanner sc, String texto) {
        System.out.print("Ingrese " + texto + ": ");
        return sc.nextDouble();
    }

    static void resolver(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("No hay soluciones reales.");
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Soluciones reales:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
