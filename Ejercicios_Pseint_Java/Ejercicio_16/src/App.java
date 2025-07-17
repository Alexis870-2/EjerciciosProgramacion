import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Pedir dos fechasy mostrar la diferencia de dias");
        Scanner scanner = new Scanner(System.in);

        // Pedir la primera fecha
        System.out.println("Ingrese la primera fecha:");
        System.out.print("Día: ");
        int dia1 = scanner.nextInt();
        System.out.print("Mes: ");
        int mes1 = scanner.nextInt();
        System.out.print("Año: ");
        int anio1 = scanner.nextInt();

        // Pedir la segunda fecha
        System.out.println("Ingrese la segunda fecha:");
        System.out.print("Día: ");
        int dia2 = scanner.nextInt();
        System.out.print("Mes: ");
        int mes2 = scanner.nextInt();
        System.out.print("Año: ");
        int anio2 = scanner.nextInt();

        // Convertir ambas fechas a "días totales"
        // Suponiendo: cada mes tiene 30 días y cada año 360 días
        int totalDias1 = anio1 * 360 + mes1 * 30 + dia1;
        int totalDias2 = anio2 * 360 + mes2 * 30 + dia2;

        // Calcular la diferencia absoluta
        int diferencia = Math.abs(totalDias1 - totalDias2);

        // Mostrar el resultado
        System.out.println("La diferencia entre las fechas es de " + diferencia + " día(s).");
    }
}
