package sobreescritura.personas;

import java.util.Scanner;

public class AppPersonaArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas: ");
        int cantidad = sc.nextInt();

        //int[] numeros = new int[cantidad];
        Persona[] personas = new Persona[cantidad];
        
        for (int i = 0; i < personas.length; i++) {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            sc.nextLine();
            System.out.print("Genero: ");
            char genero = sc.next().charAt(0);
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            System.out.print("Nacionalidad: ");
            String nacionalidad = sc.next();
            System.out.print("Estatura: ");
            double estatura = sc.nextDouble();
            System.out.print("Peso: ");
            int peso = sc.nextInt();
            
            personas[i] = new Persona(
                    nombre, genero, edad, 
                    nacionalidad, estatura, peso);
            System.out.println("Ingresadad");
            System.out.println(personas[i].toString());
            

        }
        int contador = 1;
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Personas" + contador);
            personas[i].toString();
        }
    }
}
