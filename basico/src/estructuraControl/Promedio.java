package estructuraControl;

import java.util.Scanner;
public class Promedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nota numero 1: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese nota numero 2: ");
        int num2 = sc.nextInt();
        
        System.out.println("Ingrese nota numero 1: ");
        int num3 = sc.nextInt();
        
        int promedio = (num1 + num2 + num3)/3;
        System.out.println("Su promedio es de: " + promedio);
        
        if (promedio < 70) {
            System.out.println("Usted reprobo"); 
        }
        if (promedio >= 70 && promedio < 90){
            System.out.println("Usted aprobo, Bueno");
        }
        if(promedio >= 90){
            System.out.println("Usted aprobo, Sobresaliente");
        }
    }
    
}
