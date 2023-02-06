package amayaangel_tarea2;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio5 {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        Random rand = new Random();
        boolean jugarDeNuevo = true;
        
        while (jugarDeNuevo) {
            int numeroAleatorio = rand.nextInt(20) + 1;
            int intentos = 0;
            int adivinanza;
            
            System.out.println("Adivina un numero entre 1 y 20");
            while (intentos < 3) {
                System.out.print("Ingresa el numero a adivinar: ");
                adivinanza = sc.nextInt();
                if (adivinanza == numeroAleatorio) {
                    System.out.println("Correcto! Adivinaste el numero en " + (intentos + 1) + " intentos.");
                    break;
                } else if (adivinanza < numeroAleatorio) {
                    System.out.println("El numero es mas alto.");
                } else {
                    System.out.println("El numero es mas bajo.");
                }
                intentos++;
            }
            if (intentos == 3) {
                System.out.println("Lo siento, has agotado tus tres intentos. El numero era " + numeroAleatorio + ".");
            }
            System.out.print("Quieres jugar de nuevo? (s/n): ");
            String respuesta = sc.next();
            jugarDeNuevo = respuesta.equals("s");
        }
    }
  }
}