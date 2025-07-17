import java.util.Scanner;

public class ejercicio_72 {

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, promedio;

        System.out.print("Ingrese la primera nota: ");
        n1 = sc.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        n2 = sc.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        n3 = sc.nextDouble();

        promedio = calcularPromedioDosMayores(n1, n2, n3);

        System.out.println("El promedio de las dos notas mayores es: " + promedio);
        sc.close();
    }

    // Subproceso para calcular el promedio de las dos notas mayores
    public static double calcularPromedioDosMayores(double n1, double n2, double n3) {
        double suma = sumaDosMayores(n1, n2, n3);
        return suma / 2;
    }

    // Subproceso que devuelve la suma de las dos notas mayores
    public static double sumaDosMayores(double a, double b, double c) {
        double menor;

        // Encontrar la menor de las tres
        if (a <= b && a <= c) {
            menor = a;
        } else if (b <= a && b <= c) {
            menor = b;
        } else {
            menor = c;
        }

        // La suma de las dos mayores es la suma total menos la menor
        return a + b + c - menor;
    }
}
