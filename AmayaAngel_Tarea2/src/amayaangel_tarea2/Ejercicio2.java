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
public class Ejercicio2 {
    public static void main(String[] args) {
        
        int multi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int a = scanner.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int b = scanner.nextInt();
        
        multi = (a + b)*(a - b);
        
        System.out.println("La Operacion es: " + multi);
    }
}
