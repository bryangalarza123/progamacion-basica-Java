import java.util.Scanner;

public class JavaApplication20 {

    public static void main(String[] args) {
        
        double CafeEspresso=8.00;
        double CafeAmericano=10.00;
        double CafeLatte=8.00;
        double Cappuccino=8.00;
        
        System.out.println("Menu:");
        System.out.println("1. Cafe Espresso - s/8.00");
        System.out.println("2. Cafe Americano - s/10.00");
        System.out.println("3. Cafe Latte - s/8.00");
        System.out.println("4. Cappuccino - s/8.00");
        
        System.out.println("Seleccione el numero correspondiente al cafe que desea comprar:");
        Scanner scanner = new Scanner(System.in);
        int seleccion = scanner.nextInt();
        
        
        double precioTotal = 0.0;
        String cafeSeleccionado = "";
        switch(seleccion) {
            case 1:
                precioTotal = CafeEspresso;
                cafeSeleccionado = "Cafe Espresso";
                break;
            case 2:
                precioTotal = CafeAmericano;
                cafeSeleccionado = "Cafe Americano";
                break;
            case 3:
                precioTotal = CafeLatte;
                cafeSeleccionado = "Cafe Latte";
                break;
            case 4:
                precioTotal = Cappuccino;
                cafeSeleccionado = "Cappuccino";
                break;
            default:
                System.out.println("Seleccion no valida.");
                return;
        }
        
        System.out.println("\nFactura:");
        System.out.println("Cafe seleccionado: " + cafeSeleccionado);
        System.out.println("Precio total: $" + precioTotal);
    }
}
