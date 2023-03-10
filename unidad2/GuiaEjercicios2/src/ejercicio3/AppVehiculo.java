package ejercicio3;

import java.util.Scanner;

public class AppVehiculo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Vehiculo v = new Vehiculo();
        Coche c = new Coche();
        System.out.print("Ingrese la marca del veiculo: ");
        String marca = sc.next();
        v.setMarca(marca);
        System.out.print("Ingrese el modelo del veiculo: ");
        String modelo = sc.next();
        v.setModelo(modelo);
        System.out.println("-----------------------------------");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: "+ modelo);
        v.arrancar();
        c.acelerar(50);
        c.frenar(40);
        v.detener();
    
    }
}
