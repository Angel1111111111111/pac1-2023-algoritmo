package amayaangel_tarea2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int suma,resta,mult;
        double div;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        
        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;     
        
        System.out.println("La Suma es: " + suma);
        System.out.println("La Resta es: " + resta);
        System.out.println("La Multiplicacion es: " + mult);
        System.out.println("La Divicion es: " + div);
    }
}
