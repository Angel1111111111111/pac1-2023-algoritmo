package amayaangel_tarea2;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero de la tabla: ");
        int numx = sc.nextInt();
        System.out.print("Ingrese el el numero hasta donde desee multiplicar: ");
        int numy = sc.nextInt();
        System.out.println("Tabla de multiplicar del " + numx);
        System.out.println("--------------------------");
        int i = 1;

        while (i <= numy) {
            int resultado = numx * i;
            System.out.println(numx + " x " + i + " = " + resultado);
            i++;
        }
    }
}
