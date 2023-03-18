/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaInterfaz;

/**
 *
 * @author Eduard
 */
public class App {
    
    public static void main(String[] args) {
        
        Movil movil1 = new Movil(
                "Xiaomi", 
                "Redmi Note 7", 
                "2019", 
                "8657659675", 
                "CeltelHND");
        
        System.out.println(movil1.toString());
        
        System.out.println("------------------------");
        
        Movil movil2 = new Movil(
                "LG", 
                "Velvet", 
                "2020", 
                "768747543872", 
                "ClaroHND");
        
        System.out.println(movil2.toString());
    }
}
