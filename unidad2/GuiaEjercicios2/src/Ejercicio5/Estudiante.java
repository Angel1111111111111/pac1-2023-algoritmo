/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author angel
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String carrara;
    private double promedio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrara() {
        return carrara;
    }

    public void setCarrara(String carrara) {
        this.carrara = carrara;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrara);
        System.out.println("Promedio: " + promedio);
    }
    public void aprobarCurso(double calificacion){
        double nuevoPromedio = (promedio + calificacion) / 2;
        promedio = nuevoPromedio;   
    }

    public Estudiante() {
    }
    

    public Estudiante(String nombre, int edad, String carrera, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrara = carrera;
        this.promedio = promedio;
    }
    
}
