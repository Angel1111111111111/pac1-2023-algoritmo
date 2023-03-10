/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class AppEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(
                "Angel Amaya", 
                21, 
                "Ingenieria en sistemas", 
                85);
                         
        estudiante.imprimirDatos();
        estudiante.aprobarCurso(65);
        System.out.println("---------------");
        estudiante.imprimirDatos();
        
    }
}
