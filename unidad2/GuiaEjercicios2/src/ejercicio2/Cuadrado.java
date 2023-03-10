package ejercicio2;

import java.util.Scanner;

public class Cuadrado extends Rectangulo{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();

        System.out.print("Ingrese la base del cuadrado: ");
        double base = sc.nextDouble();
        rectangulo.setBase(base);
        System.out.print("Ingrese la altura del cuadrado: ");
        double altura = sc.nextDouble();
        rectangulo.setAltura(altura);

        rectangulo = new Rectangulo(base,altura);

        System.out.println("Calculo del area del rectangulo" );
        System.out.println("---------------------------------");
        System.out.println(rectangulo.toString());
    }
}
