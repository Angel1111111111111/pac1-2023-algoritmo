/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class AppRectangulo {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    Rectangulo rectangulo = new Rectangulo();
    
        System.out.print("Ingrese el largo del rectangulo: ");
        int largo = sc.nextInt();
        rectangulo.setLargo(largo);
        System.out.print("Ingrese el ancho del rectangulo: ");
        int ancho = sc.nextInt();
        rectangulo.setAncho(ancho);
        System.out.println("-------------------------------------");
        
        System.out.println("El largo es: " + largo);
        System.out.println("El ancho es: " + ancho);
        System.out.println(
                "El area es: " + rectangulo.calcularArea());
        System.out.println(
          "El perimetro es: " + rectangulo.calcularPerimetro());
        System.out.println(
                "El rectangulo es un cadrado?: " + rectangulo.esCudrado());
    }  
}
