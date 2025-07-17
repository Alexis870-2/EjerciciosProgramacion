import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ecuacion de Segundo Grado");
        Scanner scanner = new Scanner(System.in);

        // Solicitar los coeficientes
        System.out.print("Ingrese el coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el coeficiente c: ");
        double c = scanner.nextDouble();

        // Verificar que a no sea 0 (porque si no, no sería una ecuación de segundo grado)
        if (a == 0) {
            System.out.println("No es una ecuación de segundo grado. El coeficiente 'a' no puede ser 0.");
        } else {
            // Calcular el discriminante
            double discriminante = b * b - 4 * a * c;

            // Evaluar las soluciones
            if (discriminante > 0) {
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("La ecuación tiene dos soluciones reales:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (discriminante == 0) {
                double x = -b / (2 * a);
                System.out.println("La ecuación tiene una única solución real:");
                System.out.println("x = " + x);
            } else {
                System.out.println("La ecuación no tiene soluciones reales.");
            }
        }
        
    }
}
