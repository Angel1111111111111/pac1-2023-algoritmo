package ejercicio2;

public class Rectangulo {

    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }
    @Override
    public String toString() {
        return "La base es: " + this.base
        + "\nLa altura es: " + this.altura
        + "\nEl area del rectangulo es: " + this.calcularArea();
    }
    public Rectangulo() {
    }
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        
    }

}
