package amayaangel_tarea2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int total;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre producto: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese la Cantidad del producto: ");
        int cantidad = scanner.nextInt();
        
        System.out.print("Ingrese el Precio del producto: ");
        int precio = scanner.nextInt();
        
        total = cantidad * precio;
        
        System.out.println("El total a pagar es: " + total);
    }
}
