import java.util.Scanner;

public class EjerciciosConMetodos {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        do {
            System.out.println("\n===== MENÚ DE EJERCICIOS =====");
            System.out.println("1. Calcular factorial");
            System.out.println("2. Sumar 5 números");
            System.out.println("3. Promedios en un rango");
            System.out.println("4. Análisis de frase");
            System.out.println("5. Promedio de dos notas mayores");
            System.out.println("6. Suma de dígitos pares e impares");
            System.out.println("7. Verificar palíndromo");
            System.out.println("8. Cálculos de un cono");
            System.out.println("9. Datos de una esfera");
            System.out.println("10. Datos de un hexaedro");
            System.out.println("11. Área de un triángulo");
            System.out.println("12. Área de un prisma pentagonal");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> calcularFactorial();
                case 2 -> sumarCincoNumeros();
                case 3 -> promediosRango();
                case 4 -> analizarFrase();
                case 5 -> promedioNotasMayores();
                case 6 -> sumaDigitosParesImpares();
                case 7 -> verificarPalindromo();
                case 8 -> datosCono();
                case 9 -> datosEsfera();
                case 10 -> datosHexaedro();
                case 11 -> areaTriangulo();
                case 12 -> areaPrismaPentagonal();
                case 0 -> System.out.println("Saliendo");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    // Ejercicio 1
    public static void calcularFactorial() {
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();
        long factorial = 1;
        for (int i = 2; i <= n; i++) factorial *= i;
        System.out.println("El factorial de " + n + " es: " + factorial);
    }

    // Ejercicio 2
    public static void sumarCincoNumeros() {
        int suma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            suma += scanner.nextInt();
        }
        System.out.println("La suma es: " + suma);
    }

    // Ejercicio 3
    public static void promediosRango() {
        System.out.print("Inicio del rango: ");
        int ini = scanner.nextInt();
        System.out.print("Fin del rango: ");
        int fin = scanner.nextInt();
        int total = 0, pares = 0, impares = 0, primos = 0;
        int cTotal = 0, cPares = 0, cImpares = 0, cPrimos = 0;

        for (int i = ini; i <= fin; i++) {
            total += i; cTotal++;
            if (i % 2 == 0) { pares += i; cPares++; }
            else { impares += i; cImpares++; }
            if (esPrimo(i)) { primos += i; cPrimos++; }
        }

        System.out.println("Promedio total: " + (double) total / cTotal);
        System.out.println("Promedio pares: " + (cPares > 0 ? (double) pares / cPares : 0));
        System.out.println("Promedio impares: " + (cImpares > 0 ? (double) impares / cImpares : 0));
        System.out.println("Promedio primos: " + (cPrimos > 0 ? (double) primos / cPrimos : 0));
    }

    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    // Ejercicio 4
    public static void analizarFrase() {
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        int letras = 0, vocales = 0;
        for (char c : frase.toCharArray()) {
            if (Character.isLetter(c)) {
                letras++;
                if ("aeiouAEIOU".contains(c + "")) vocales++;
            }
        }
        String[] palabras = frase.trim().split("\\s+");
        System.out.println("Cantidad de palabras: " + palabras.length);
        System.out.println("Cantidad de letras: " + letras);
        System.out.println("Cantidad de vocales: " + vocales);
    }

    // Ejercicio 5
    public static void promedioNotasMayores() {
        System.out.print("Nota 1: ");
        double n1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = scanner.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = scanner.nextDouble();
        double menor = Math.min(n1, Math.min(n2, n3));
        double suma = n1 + n2 + n3 - menor;
        System.out.println("Promedio de las dos notas mayores: " + (suma / 2));
    }

    // Ejercicio 6
    public static void sumaDigitosParesImpares() {
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        int pares = 0, impares = 0;
        while (num > 0) {
            int dig = num % 10;
            if (dig % 2 == 0) pares += dig;
            else impares += dig;
            num /= 10;
        }
        System.out.println("Suma de dígitos pares: " + pares);
        System.out.println("Suma de dígitos impares: " + impares);
    }

    // Ejercicio 7
    public static void verificarPalindromo() {
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine().toLowerCase();
        String invertida = new StringBuilder(palabra).reverse().toString();
        if (palabra.equals(invertida))
            System.out.println("Es palíndromo.");
        else
            System.out.println("No es palíndromo.");
    }

    // Ejercicio 8
    public static void datosCono() {
        System.out.print("Radio: ");
        double r = scanner.nextDouble();
        System.out.print("Generatriz: ");
        double g = scanner.nextDouble();
        System.out.print("Altura: ");
        double h = scanner.nextDouble();
        double areaBase = Math.PI * r * r;
        double areaLateral = Math.PI * r * g;
        double areaTotal = areaBase + areaLateral;
        double volumen = (1.0 / 3) * areaBase * h;
        System.out.println("Área base: " + areaBase);
        System.out.println("Área lateral: " + areaLateral);
        System.out.println("Área total: " + areaTotal);
        System.out.println("Volumen: " + volumen);
    }

    // Ejercicio 9
    public static void datosEsfera() {
        System.out.print("Radio: ");
        double r = scanner.nextDouble();
        double area = 4 * Math.PI * r * r;
        double volumen = (4.0 / 3) * Math.PI * Math.pow(r, 3);
        System.out.println("Área: " + area);
        System.out.println("Volumen: " + volumen);
    }

    // Ejercicio 10
    public static void datosHexaedro() {
        System.out.print("Lado: ");
        double l = scanner.nextDouble();
        double areaCara = l * l;
        double areaTotal = 6 * areaCara;
        double volumen = Math.pow(l, 3);
        System.out.println("Área base: " + areaCara);
        System.out.println("Área total: " + areaTotal);
        System.out.println("Volumen: " + volumen);
    }

    // Ejercicio 11
    public static void areaTriangulo() {
        System.out.print("x1: "); double x1 = scanner.nextDouble();
        System.out.print("y1: "); double y1 = scanner.nextDouble();
        System.out.print("x2: "); double x2 = scanner.nextDouble();
        System.out.print("y2: "); double y2 = scanner.nextDouble();
        System.out.print("x3: "); double x3 = scanner.nextDouble();
        System.out.print("y3: "); double y3 = scanner.nextDouble();
        double area = Math.abs((x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2)) / 2);
        System.out.println("Área del triángulo: " + area);
    }

    // Ejercicio 12
    public static void areaPrismaPentagonal() {
        System.out.print("Perímetro de la base: ");
        double p = scanner.nextDouble();
        System.out.print("Apotema: ");
        double a = scanner.nextDouble();
        System.out.print("Altura: ");
        double h = scanner.nextDouble();
        double areaBase = (p * a) / 2;
        double areaLateral = p * h;
        double areaTotal = 2 * areaBase + areaLateral;
        System.out.println("Área de la base: " + areaBase);
        System.out.println("Área lateral: " + areaLateral);
        System.out.println("Área total: " + areaTotal);
    }
}
