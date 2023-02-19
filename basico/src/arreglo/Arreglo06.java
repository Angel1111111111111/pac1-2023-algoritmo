package arreglo;

import java.util.Scanner;

/*
*Escribir un programa de una matris de nxn
*definida por el usuario, se suma la diagonal de izquierda a derecha
*despues que el usuario ingrese los datos de la matriz*/
public class Arreglo06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: ");
        int filas = sc.nextInt();

        System.out.print("Ingrese el numero de columnas: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        System.out.println("Ingrese los valores de la matriz: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(
                        "Valor para la fila " + i + " columna " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                //matriz[f][c] = f + c;
                System.out.print(matriz[f][c] + "\t");

            }
            System.out.println("");
        }
        int suma = 0;
        int total = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
            }
        System.out.println("la suma de la diagonal es: " + suma);

    }
}
