/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

/**
 *
 * @author Usuario
 */
public class EjemploSpringLayout {
     private static void createAndShowGUI() {  
            JFrame frame = new JFrame("Ejemplo de Spring");  
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  
            Container contentPane = frame.getContentPane();  
            SpringLayout layout = new SpringLayout();  
            contentPane.setLayout(layout);  
  
            JLabel lbl = new JLabel("Escribir: ");  
            JTextField texto = new JTextField("Espacio para texto", 15);  
            contentPane.add(lbl);  
            contentPane.add(texto);  
       
            layout.putConstraint(SpringLayout.WEST, lbl,6,SpringLayout.WEST, contentPane);  
            layout.putConstraint(SpringLayout.NORTH, lbl,6,SpringLayout.NORTH, contentPane);  
            layout.putConstraint(SpringLayout.WEST, texto,6,SpringLayout.EAST, lbl);  
            layout.putConstraint(SpringLayout.NORTH, texto,6,SpringLayout.NORTH, contentPane);  
            layout.putConstraint(SpringLayout.EAST, contentPane,6,SpringLayout.EAST, texto);  
            layout.putConstraint(SpringLayout.SOUTH, contentPane,6,SpringLayout.SOUTH, texto);  
  
            frame.pack();  
            frame.setVisible(true);  
        }  
        public static void main(String[] args) {  
            javax.swing.SwingUtilities.invokeLater(EjemploSpringLayout::createAndShowGUI);  
        }  
}
