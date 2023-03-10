/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author angel
 */
public class Coche extends Vehiculo {

    private int velocidad;

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Coche() {
        velocidad = 0;
    }

    public void acelerar(int incremento) {
        velocidad += incremento;
        System.out.println(
           "El coche ha acelerado. Velocidad actual: " + velocidad + " km/h.");
    }

    public void frenar(int decremento) {
        velocidad -= decremento;
        System.out.println(
             "Frenado... Velocidad actual: " + velocidad + " km/h.");
    }

}
