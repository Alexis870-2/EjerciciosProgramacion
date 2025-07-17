public class Ejercicio5 {
    public static void InventarioTiendas(String[] args) {
        // Precios de los productos p1 a p8
        double[] precios = {100, 200, 50, 40, 80, 100, 60, 50};

        // stock[almacén][producto]
        int[][] stock = {
            {10, 15, 20, 12, 8, 25, 14, 9},   // Almacén 1
            {5, 10, 12, 8, 20, 15, 10, 11},   // Almacén 2
            {7, 18, 10, 10, 12, 30, 9, 10}    // Almacén 3
        };

        // 1. Inventario total por producto
        System.out.println(" Inventario total por producto:");
        for (int p = 0; p < 8; p++) {
            int totalProducto = 0;
            for (int a = 0; a < 3; a++) {
                totalProducto += stock[a][p];
            }
            System.out.println("Producto " + (p + 1) + ": " + totalProducto + " unidades");
        }

        // 2. Inventario total del almacén 1
        int totalAlmacen1 = 0;
        for (int p = 0; p < 8; p++) {
            totalAlmacen1 += stock[0][p];
        }
        System.out.println("\n Inventario total en el almacén 1: " + totalAlmacen1 + " unidades");

        // 3. Stock del producto 4 en el almacén 2
        int stockProd4Alm2 = stock[1][3];
        System.out.println("\n Stock del producto 4 en el almacén 2: " + stockProd4Alm2 + " unidades");

        // 4. Valor total del inventario de la cadena
        double valorTotal = 0;
        for (int a = 0; a < 3; a++) {
            for (int p = 0; p < 8; p++) {
                valorTotal += stock[a][p] * precios[p];
            }
        }
        System.out.println("\n Valor total del inventario: $" + valorTotal);

        // 5. Determinar el almacén con mayor cantidad de productos
        int mayorCantidad = 0;
        int almacenMayor = 0;
        for (int a = 0; a < 3; a++) {
            int totalAlmacen = 0;
            for (int p = 0; p < 8; p++) {
                totalAlmacen += stock[a][p];
            }
            if (totalAlmacen > mayorCantidad) {
                mayorCantidad = totalAlmacen;
                almacenMayor = a;
            }
        }
        System.out.println("\n El almacén con mayor cantidad de productos es el Almacén " + (almacenMayor + 1) + " con " + mayorCantidad + " unidades");
    }
}
