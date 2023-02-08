package estructuraControl;

import java.util.Scanner;

public class ListarNumero04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Listar numero hata");
        System.out.println("-----------------------");
        System.out.print("Ingrese un numero: ");

        int limite = sc.nextInt();
        for (int i = 1; i <= limite; i++) {
            System.out.println(i);
        }
    }
}
