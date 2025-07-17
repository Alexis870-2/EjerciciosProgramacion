import java.util.Scanner;

public class ejercicio_73 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        String etapa;

        System.out.print("Ingrese la edad de la persona: ");
        edad = sc.nextInt();

        etapa = determinarEtapa(edad);

        System.out.println("Etapa de la vida: " + etapa);

        sc.close();
    }

    // Subproceso que determina la etapa de vida según la edad
    public static String determinarEtapa(int edad) {
        if (edad >= 0 && edad <= 2) {
            return "Bebé";
        } else if (edad >= 3 && edad <= 5) {
            return "Niño";
        } else if (edad >= 6 && edad <= 12) {
            return "Pubertad";
        } else if (edad >= 13 && edad <= 18) {
            return "Adolescente";
        } else if (edad >= 19 && edad <= 25) {
            return "Joven";
        } else if (edad >= 26 && edad <= 60) {
            return "Adulto";
        } else if (edad > 60) {
            return "Anciano";
        } else {
            return "Edad inválida";
        }
    }
}
