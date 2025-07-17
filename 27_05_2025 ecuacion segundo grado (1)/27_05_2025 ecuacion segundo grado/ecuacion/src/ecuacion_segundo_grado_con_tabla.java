import java.util.Scanner;

public class ecuacion_segundo_grado_con_tabla {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = leer(sc, "a (≠ 0)");
        while (a == 0) a = leer(sc, "a (≠ 0)");
        double b = leer(sc, "b");
        double c = leer(sc, "c");

        calcularRaices(a, b, c);

        int xi = leerEntero(sc, "x mínimo");
        int xf = leerEntero(sc, "x máximo");
        mostrarTabla(a, b, c, xi, xf);

        sc.close();
    }

    static double leer(Scanner sc, String txt) {
        System.out.print("Ingrese " + txt + ": ");
        return sc.nextDouble();
    }

    static int leerEntero(Scanner sc, String txt) {
        System.out.print("Ingrese " + txt + ": ");
        return sc.nextInt();
    }

    static void calcularRaices(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("No hay soluciones reales.");
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }

    static void mostrarTabla(double a, double b, double c, int xi, int xf) {
        System.out.println("\nTabla de valores:");
        for (int x = xi; x <= xf; x++) {
            double y = a * x * x + b * x + c;
            System.out.printf("x = %2d | y = %.2f\n", x, y);
        }
    }
}
