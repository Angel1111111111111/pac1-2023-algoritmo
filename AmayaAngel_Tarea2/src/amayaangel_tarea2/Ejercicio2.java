package amayaangel_tarea2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int a = scanner.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        int b = scanner.nextInt();
        
        int resultado = (a + b)*(a - b);
        
        System.out.println("La Operacion es: " + resultado);
    }
}
