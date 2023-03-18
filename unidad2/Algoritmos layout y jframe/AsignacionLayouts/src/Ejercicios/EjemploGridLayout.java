/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class EjemploGridLayout extends JFrame{    
    JFrame ventana;
    
    JButton btn1 = new JButton("Boton 1");
    JButton btn2 = new JButton("Boton 2");
    JButton btn3 = new JButton("Boton 3");
    JButton btn4 = new JButton("Boton 4");
    JButton btn5 = new JButton("Boton 5");
    JButton btn6 = new JButton("Boton 6");
    JButton btn7 = new JButton("Boton 7");
    JButton btn8 = new JButton("Boton 8");
    JButton btn9 = new JButton("Boton 9");
    
    public EjemploGridLayout () {
        ventana = new JFrame();
        
        ventana.add(btn1); ventana.add(btn2); ventana.add(btn3);  
        ventana.add(btn4); ventana.add(btn5); ventana.add(btn6);  
        ventana.add(btn7); ventana.add(btn8); ventana.add(btn9);
        
        ventana.setLayout(new GridLayout(3,3)); 
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setSize(480,360);    
        ventana.setVisible(true); 
        
    }  
        
    public static void main(String[] args) {
        EjemploGridLayout app = new EjemploGridLayout();
    }
}
