package estructurasControl;

import java.util.Scanner;
public class CondicionalIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        if (edad>=18) {
            System.out.println("Es mayor de edad"); 
        }
        if (edad >= 16 && edad <= 18){
            System.out.println("Puede participar con la sub-18");
        }else{
            System.out.println("No puede participar con la sub-18");
        }
    }
    
}


