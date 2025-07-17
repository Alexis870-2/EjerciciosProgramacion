import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Calcular la fecha con meses de 28,30,31 dias");
        Scanner scanner = new Scanner(System.in);

        // Pedir día, mes y año al usuario
        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();

        boolean fechaValida = true;

        // Verificamos primero que mes y año estén en rangos válidos
        if (mes < 1 || mes > 12 || anio < 1) {
            fechaValida = false;
        } else {
            // Determinamos cuántos días tiene el mes ingresado
            int diasDelMes;

            switch (mes) {
                case 2:
                    diasDelMes = 28; // Febrero, sin años bisiestos
                    break;
                case 4: case 6: case 9: case 11:
                    diasDelMes = 30; // Abril, junio, septiembre, noviembre
                    break;
                default:
                    diasDelMes = 31; // El resto de los meses
                    break;
            }

            // Validar si el día está dentro del rango permitido
            if (dia < 1 || dia > diasDelMes) {
                fechaValida = false;
            }
        }

        // Mostrar resultado
        if (fechaValida) {
            System.out.println("La fecha es correcta: " + dia + "/" + mes + "/" + anio);
        } else {
            System.out.println("La fecha es incorrecta.");
        }
    }
}
