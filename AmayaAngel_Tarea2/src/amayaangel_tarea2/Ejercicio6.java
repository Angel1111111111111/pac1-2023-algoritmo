package amayaangel_tarea2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();
        String diaSemana;
        
        diaSemana = switch (num) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Dia inexistente";
        };
        System.out.println("El numero corresponde al dia: " + diaSemana);
    }
}
