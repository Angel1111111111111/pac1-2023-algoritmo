/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class FlowLayoutEjemplo extends JFrame implements ActionListener{
    
    JButton btnCierra = new JButton("Cerrar");
    JButton btnFullScreen = new JButton("Pantalla Completa");
    
    public FlowLayoutEjemplo() {
        super("Ejemplo de FlowLayout");
        setSize(480, 360);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        btnCierra.addActionListener(this);
        btnFullScreen.addActionListener(this);
                
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        
        
        add(btnCierra);
        add(btnFullScreen);
        
        pack();
        
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        FlowLayoutEjemplo app = new FlowLayoutEjemplo();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            
        Object fuente = e.getSource();
        if (fuente == btnCierra) {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        if (fuente == btnFullScreen) {
            setMaximumSize(getMaximumSize());
        }
    }
}
