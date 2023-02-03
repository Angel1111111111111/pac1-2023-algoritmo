package estructurasControl;

import java.util.Scanner;

public class ListarNumeros01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //while (condicion) {...}
        //do {...} while (code);
        System.out.println("Listar numero hasta");
        System.out.println("-------------------");
        
        System.out.print("Ingrese un numero: ");
        int limite = sc.nextInt();
        int i = 1;
        while (i <= limite) {    
            System.out.println(i);
            i++;
            //desea continuar s/n;
        }
    }
}