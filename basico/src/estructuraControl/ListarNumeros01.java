package estructuraControl;

import java.util.Scanner;

public class ListarNumeros01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //while (condicion) {...}
        //do {...} while (code);
        System.out.println("Listar numero hasta");
        System.out.println("-------------------");
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese un numero hasta donde desea mostar: ");
            int limite = sc.nextInt();

            for (int i = 1; i <= limite; i++) {
                System.out.println(i);
            }
            //desea continuar s/n;
            System.out.print("Desea continuar (s/n): ");
            String respuesta = sc.next();
            continuar = respuesta.equalsIgnoreCase("s");
        }
    }
}
