public class Ejercicio4 {
    public static void main(String[] args) {
        double[] precioArticulos = {10, 20, 30, 40, 50};
        int[] cantidadesPorArticulo = new int[5];
        double[] recaudacionSucursal = new double[4];
        int[][] cantidades = {
            {5, 6, 3, 5, 7},
            {4, 5, 4, 6, 10},
            {10, 4, 4, 10, 2},
            {8, 3, 6, 5, 3},
        };
        double[][] recaudacion = new double[4][5];

        // 1) Cantidades totales de cada artículo
        System.out.println("Pregunta #1");
        for (int c = 0; c < cantidades[0].length; c++) {
            int suma = 0;
            for (int f = 0; f < cantidades.length; f++) {
                suma += cantidades[f][c];
            }
            cantidadesPorArticulo[c] = suma;
            System.out.println("Artículo " + (c + 1) + " = " + suma);
        }

        // 2) Cantidad de artículos en la sucursal 2
        System.out.println("\nPregunta #2");
        int totalSucursal2 = 0;
        for (int c = 0; c < cantidades[0].length; c++) {
            totalSucursal2 += cantidades[1][c];
        }
        System.out.println("Total artículos vendidos en sucursal 2 = " + totalSucursal2);

        // 3) Cantidad del artículo 3 en la sucursal 1
        System.out.println("\nPregunta #3");
        System.out.println("Cantidad del artículo 3 en sucursal 1 = " + cantidades[0][2]);

        // 4) Recaudación total por sucursal
        System.out.println("\nPregunta #4");
        for (int f = 0; f < recaudacion.length; f++) {
            double sumaSucursal = 0;
            for (int c = 0; c < recaudacion[0].length; c++) {
                recaudacion[f][c] = cantidades[f][c] * precioArticulos[c];
                sumaSucursal += recaudacion[f][c];
            }
            recaudacionSucursal[f] = sumaSucursal;
            System.out.println("Sucursal " + (f + 1) + " recaudó: $" + sumaSucursal);
        }

        // 5) Recaudación total de la empresa
        System.out.println("\nPregunta #5");
        double totalEmpresa = 0;
        for (int i = 0; i < recaudacionSucursal.length; i++) {
            totalEmpresa += recaudacionSucursal[i];
        }
        System.out.println("Recaudación total de la empresa: $" + totalEmpresa);

        // 6) Sucursal de mayor recaudación
        System.out.println("\nPregunta #6");
        double mayor = recaudacionSucursal[0];
        int posicion = 0;
        for (int i = 1; i < recaudacionSucursal.length; i++) {
            if (recaudacionSucursal[i] > mayor) {
                mayor = recaudacionSucursal[i];
                posicion = i;
            }
        }
        System.out.println("La sucursal con mayor recaudación es la sucursal " + (posicion + 1) + " con $" + mayor);
    }
}
