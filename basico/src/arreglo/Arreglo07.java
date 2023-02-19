package arreglo;

import java.util.Scanner;

/**
 * Crear un programa en el cual se ingrese un numero de una tabla que se quiera
 * visualizar y ingresar otro numero para la cantidad de multiplos a generar
 * almacenar los valores en una matriz y mostrar los datos al finalizar el
 * proceso.
 */
public class Arreglo07 {

    public static void main(String[] args) {
        boolean continuar = true;
        
        while(continuar){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero de la tabla: ");
        int numx = sc.nextInt();
        System.out.print("Ingrese el numero hasta donde desee multiplicar: ");
        int numy = sc.nextInt();
        System.out.println("Tabla de multiplicar del " + numx);
        System.out.println("--------------------------");
       
        int[][] tabla = new int[numy][3];
        for (int i = 0; i < numy; i++) {
            tabla[i][2] = numx * (1 + i);
            tabla[i][1] = i + 1;
            tabla[i][0] = numx;
        }
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(
                    tabla[i][0] + " x " + tabla[i][1] + " = " + tabla[i][2]);
            
        }
            System.out.print("Desea contunuar? (s/n): ");
            String respuesta = sc.next();
            continuar = respuesta.equals("s");
        } 
    }
}
