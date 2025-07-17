    public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Calcular radio de una circunferencia y calcular su longitud");
        Scanner scanner = new Scanner(System.in);
        
                // Solicitar el radio al usuario
                System.out.print("Ingrese el radio de la circunferencia: ");
                double radio = scanner.nextDouble();
        
                // Calcular la longitud
                double longitud = 2 * Math.PI * radio;
        
                // Mostrar el resultado
                System.out.println("La longitud de la circunferencia con radio " + radio + " es: " + longitud);
            
    }
}
