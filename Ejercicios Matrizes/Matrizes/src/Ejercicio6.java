import java.util.Scanner;

public class Ejercicio6 {
    public static void RegistroAsistencia(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] asistencia = new int[4][5]; // 4 facultades × 5 materias
        int[] totalPorMateria = new int[5];
        int[] totalPorFacultad = new int[4];
        int totalGeneral = 0;

        // Ingreso de datos
        System.out.println("Ingrese la asistencia para cada materia en cada facultad:");
        for (int f = 0; f < 4; f++) {
            for (int m = 0; m < 5; m++) {
                System.out.print("Facultad " + (f + 1) + ", Materia " + (m + 1) + ": ");
                asistencia[f][m] = sc.nextInt();
            }
        }

        // 1. Asistencia total por materia
        System.out.println("\n Asistencia total por materia:");
        for (int m = 0; m < 5; m++) {
            int suma = 0;
            for (int f = 0; f < 4; f++) {
                suma += asistencia[f][m];
            }
            totalPorMateria[m] = suma;
            System.out.println("Materia " + (m + 1) + ": " + suma + " asistencias");
        }

        // 2. Asistencia total en la facultad 3
        int totalFacultad3 = 0;
        for (int m = 0; m < 5; m++) {
            totalFacultad3 += asistencia[2][m];
        }
        System.out.println("\n Asistencia total en la Facultad 3: " + totalFacultad3 + " asistencias");

        // 3. Asistencia en la materia 2 de la facultad 1
        System.out.println("\n Asistencia en la Materia 2 de la Facultad 1: " + asistencia[0][1] + " asistencias");

        // 4. Porcentaje de asistencia por facultad
        System.out.println("\n Porcentaje de asistencia por facultad:");
        for (int f = 0; f < 4; f++) {
            int suma = 0;
            for (int m = 0; m < 5; m++) {
                suma += asistencia[f][m];
            }
            totalPorFacultad[f] = suma;
            totalGeneral += suma;
        }

        for (int f = 0; f < 4; f++) {
            double porcentaje = (totalPorFacultad[f] * 100.0) / totalGeneral;
            System.out.printf("Facultad %d: %.2f%% del total\n", (f + 1), porcentaje);
        }

        // 5. Facultad con mayor asistencia
        int facultadMayor = 0;
        int mayorAsistencia = totalPorFacultad[0];
        for (int f = 1; f < 4; f++) {
            if (totalPorFacultad[f] > mayorAsistencia) {
                mayorAsistencia = totalPorFacultad[f];
                facultadMayor = f;
            }
        }
        System.out.println("\n La facultad con mayor asistencia es la Facultad " + (facultadMayor + 1) +
                " con " + mayorAsistencia + " asistencias");

        sc.close();
    }
}
