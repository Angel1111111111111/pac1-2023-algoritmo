package arreglo;

import java.util.Random;
import java.util.Scanner;

public class arreglo03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean continuar = true;

        while (continuar) {
            int[] numeros = new int[20];
            System.out.println("TAMANO ARREGLO: " + numeros.length);
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = random.nextInt(100) + 1;
                System.out.println("numeros[" + i + "] = " + numeros[i]);
            }
            System.out.print("Desea continuar (s/n): ");
            String respuesta = sc.next();
            continuar = respuesta.equals("s");
        }
    }
}
