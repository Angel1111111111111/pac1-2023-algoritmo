package amayaangel_tarea2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero de la tabla de multiplicar que desea mostrar: ");
        int num = sc.nextInt();
        System.out.println("Tabla de multiplicar del " + num);
        System.out.println("------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}




