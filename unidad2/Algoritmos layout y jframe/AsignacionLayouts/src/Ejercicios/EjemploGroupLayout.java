/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.awt.Container;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class EjemploGroupLayout {
    public static void main(String[] args) {  
        JFrame frame = new JFrame("GroupLayoutExample");  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        Container contentPanel = frame.getContentPane();  
        GroupLayout groupLayout = new GroupLayout(contentPanel);  
  
        contentPanel.setLayout(groupLayout);  
  
        JLabel clickMe = new JLabel("Haga clic en el boton 1");  
        JButton button = new JButton("Boton 1");  
  
        groupLayout.setHorizontalGroup(  
                    groupLayout.createSequentialGroup()  
                                .addComponent(clickMe)  
                                .addGap(10, 20, 100)  
                                .addComponent(button));  
        groupLayout.setVerticalGroup(  
                     groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)  
                                .addComponent(clickMe)  
                                .addComponent(button));  
        frame.pack();  
        frame.setVisible(true);  
    }  
}
