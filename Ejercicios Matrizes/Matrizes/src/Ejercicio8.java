import java.util.Scanner;

public class Ejercicio8 {
    public static void SistemaEcuacionesCramer(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingreso de coeficientes
        System.out.println("Resolviendo el sistema:");
        System.out.println("a1*x + b1*y = c1");
        System.out.println("a2*x + b2*y = c2\n");

        System.out.print("Ingrese a1: ");
        double a1 = sc.nextDouble();
        System.out.print("Ingrese b1: ");
        double b1 = sc.nextDouble();
        System.out.print("Ingrese c1: ");
        double c1 = sc.nextDouble();

        System.out.print("Ingrese a2: ");
        double a2 = sc.nextDouble();
        System.out.print("Ingrese b2: ");
        double b2 = sc.nextDouble();
        System.out.print("Ingrese c2: ");
        double c2 = sc.nextDouble();

        // Determinantes
        double D = a1 * b2 - b1 * a2;
        double Dx = c1 * b2 - b1 * c2;
        double Dy = a1 * c2 - c1 * a2;

        // Verificación del sistema
        if (D == 0) {
            if (Dx == 0 && Dy == 0) {
                System.out.println("El sistema tiene infinitas soluciones.");
            } else {
                System.out.println("El sistema no tiene solución.");
            }
        } else {
            double x = Dx / D;
            double y = Dy / D;
            System.out.printf("La solución es: x = %.2f, y = %.2f\n", x, y);
        }

        sc.close();
    }
}

