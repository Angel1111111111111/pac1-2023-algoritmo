package estructuraControl;

import java.util.Scanner;

public class Vocales {

    public static void main(String[] args) {
        //switch(variable) {caso1,caso2,caso3,...}
        Scanner sc = new Scanner(System.in);
        System.out.println("Mostrar furtas por vocales");
        System.out.println("-------------------------------\n");

        System.out.print("Ingrese una vocal: ");
        char vocal = sc.next().charAt(0);
                
        switch (vocal) {
            case 'a' -> System.out.println(
                        "Arandano, Annona, Aguacate, Albaricoqu, Almendra");
            case 'e' -> System.out.println("Elote, Ejote");
            case 'i' -> System.out.println("Icaco, Ilama, Imbe");
            case 'o' -> System.out.println("Olivas, Oroblanco");
            case 'u' -> System.out.println("Uva, ...");
            default -> System.out.println("No es una vocal valida");
        }
    }
}
