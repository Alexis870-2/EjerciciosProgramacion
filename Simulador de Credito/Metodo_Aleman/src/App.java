import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodo Aleman");
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SIMULADOR DE CRÉDITO ===");
        System.out.println("Seleccione el tipo de crédito:");
        System.out.println("1. Crédito Preciso");
        System.out.println("2. Crédito Línea Abierta");
        System.out.println("3. Crédito Hipotecario o Vivienda");
        System.out.println("   3.1 Vivienda de Interés Público");
        System.out.println("   3.2 Vivienda de Interés Social");
        System.out.println("4. Educación Superior");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        String tipoCredito = "";
        double tasaInteresAnual = 0;

        switch (opcion) {
            case 1:
                tipoCredito = "Crédito Preciso";
                tasaInteresAnual = 10.5;
                break;
            case 2:
                tipoCredito = "Crédito Línea Abierta";
                tasaInteresAnual = 12.0;
                break;
            case 3:
                System.out.println("Seleccione subcategoría:");
                System.out.println("1. Vivienda de Interés Público");
                System.out.println("2. Vivienda de Interés Social");
                int subOpcion = sc.nextInt();
                if (subOpcion == 1) {
                    tipoCredito = "Vivienda de Interés Público";
                    tasaInteresAnual = 6.5;
                } else if (subOpcion == 2) {
                    tipoCredito = "Vivienda de Interés Social";
                    tasaInteresAnual = 5.0;
                } else {
                    System.out.println("Opción no válida.");
                    return;
                }
                break;
            case 4:
                tipoCredito = "Educación Superior";
                tasaInteresAnual = 7.5;
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        System.out.print("Ingrese el monto del crédito: ");
        double monto = sc.nextDouble();

        System.out.print("Ingrese el plazo del crédito (en años): ");
        int plazoAnios = sc.nextInt();
        int plazoMeses = plazoAnios * 12;

        double tasaMensual = tasaInteresAnual / 12 / 100;

        // Fórmula de cuota fija mensual: M = P * (r(1+r)^n) / ((1+r)^n - 1)
        double cuotaMensual = (monto * tasaMensual * Math.pow(1 + tasaMensual, plazoMeses)) /
                              (Math.pow(1 + tasaMensual, plazoMeses) - 1);
        double totalPagado = cuotaMensual * plazoMeses;
        double totalIntereses = totalPagado - monto;

        System.out.println("\n--- RESULTADO DE LA SIMULACIÓN ---");
        System.out.println("Tipo de Crédito: " + tipoCredito);
        System.out.printf("Pago mensual: $%.2f\n", cuotaMensual);
        System.out.printf("Total pagado: $%.2f\n", totalPagado);
        System.out.printf("Total intereses pagados: $%.2f\n", totalIntereses);
    }
}
