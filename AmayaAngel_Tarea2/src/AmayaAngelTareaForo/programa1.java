package AmayaAngelTareaForo;

import java.util.Scanner;

/**Es un programa que calcula el promedio de las calificaciones 
 * de los estudiantes en un curso utilizando arreglos y los carga en una matriz.
 * El programa solicita al usuario la cantidad de estudiantes y la cantidad
 * de calificaciones
 */
public class programa1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese la cantidad de estudiantes: ");
            int numEstudiantes = sc.nextInt();
            System.out.print("Ingrese la cantidad de calificaciones: ");
            int numCalificaciones = sc.nextInt();

            String[] nombres = new String[numEstudiantes];
            double[][] cals = new double[numEstudiantes][numCalificaciones + 1];

            for (int i = 0; i < numEstudiantes; i++) {
                System.out.print(
                        "Ingrese el nombre del estudiante " + (i + 1) + ": ");
                String nombre = sc.next();
                nombres[i] = nombre;
                double sum = 0;
                for (int j = 0; j < numCalificaciones; j++) {
                    System.out.print("Nota " + (j + 1) + ": ");
                    double nota = sc.nextDouble();
                    cals[i][j] = nota;
                    sum += nota;
                }
                double promedio = sum / numCalificaciones;
                cals[i][numCalificaciones] = promedio;
            }

            System.out.println("Datos de los estudiantes");
            System.out.println("----------------------------------------------");
            System.out.print("Nombre\t");
            for (int i = 0; i < numCalificaciones; i++) {
                System.out.print("nota" + (i + 1) + "    ");
            }
            System.out.println("Promedio");
            System.out.println("-----------------------------------------------");
            for (int i = 0; i < numEstudiantes; i++) {
                System.out.print(nombres[i] + "\t");
                for (int j = 0; j < numCalificaciones + 1; j++) {
                    System.out.print(cals[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("Desea continuar (s/n)");
            String respuesta = sc.next();
            continuar = respuesta.equals("s");
        }
    }
}
