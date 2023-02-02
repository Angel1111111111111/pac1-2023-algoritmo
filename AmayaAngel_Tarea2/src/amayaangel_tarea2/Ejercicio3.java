/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amayaangel_tarea2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int total;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre producto: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese la Cantidad: ");
        int cantidad = scanner.nextInt();
        
        System.out.println("Ingrese el Precio: ");
        int precio = scanner.nextInt();
        
        total = cantidad * precio;
        
        System.out.println("El total a pagar es: " + total);
    }
}
