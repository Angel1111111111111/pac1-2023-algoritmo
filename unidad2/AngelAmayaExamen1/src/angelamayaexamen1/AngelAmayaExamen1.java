package angelamayaexamen1;

import java.util.Random;
import java.util.Scanner;

/**
 * Escribir un programa que genere una matriz cuadrada de tamaño N (ingresado
 * por el usuario), donde cada elemento de la matriz sea un número aleatorio
 * entre 1 y 100. Luego, el programa deberá imprimir en la consola la suma de
 * cada una de las filas y la suma de cada una de las columnas de la matriz.
 */
public class AngelAmayaExamen1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese el numero de filas: ");
            int filas = sc.nextInt();
            System.out.print("Ingrese el numero de columnas: ");
            int columnas = sc.nextInt();

            Random rand = new Random();
            int[][] matriz = new int[filas][columnas];

            for (int i = 0; i < filas; i++) {

                for (int j = 0; j < columnas; j++) {
                    int numAleatorio = rand.nextInt(100) + 1;
                    matriz[i][j] = numAleatorio;
                }
            }
            for (int f = 0; f < matriz.length; f++) {
                for (int c = 0; c < matriz[f].length; c++) {
                    System.out.print(matriz[f][c] + "\t");

                }
                System.out.println(" ");

            }
            
            System.out.print("Quieres jugar de nuevo? (s/n): ");
            String respuesta = sc.next();
            continuar = respuesta.equals("s");
        }
        

    }
}
