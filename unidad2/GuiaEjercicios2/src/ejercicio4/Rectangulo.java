/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author angel
 */
public class Rectangulo {

    private int largo;
    private int ancho;

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int calcularArea() {
        return largo * ancho;
    }

    public int calcularPerimetro() {
        return 2 * (largo + ancho);
    }

    public boolean esCudrado() {
        return largo == ancho;
    }

    public Rectangulo() {

    }

}
