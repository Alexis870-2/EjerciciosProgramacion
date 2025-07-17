import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Validar fecha teniendo en cuenta que los meses tienen 30 dias");
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el día, mes y año
        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();

        // Verificar si la fecha es válida con la condición dada (todos los meses tienen 30 días)
        if (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12 && anio > 0) {
            System.out.println("La fecha es correcta: " + dia + "/" + mes + "/" + anio);
        } else {
            System.out.println("La fecha es incorrecta.");
        
      }
    }
}
