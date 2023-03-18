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
public class EjemploFlowLayout extends JFrame implements ActionListener{
    JButton btn1 = new JButton("Boton 1");
    JButton btn2 = new JButton("Boton 2");
    JButton btn3 = new JButton("Boton 3");
    JButton btn4 = new JButton("Boton 4");
    JButton btn5 = new JButton("Boton 5");
    
    public EjemploFlowLayout() {
        super("Ejemplo de FlowLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        
        pack();
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        EjemploFlowLayout app = new EjemploFlowLayout();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object fuente = e.getSource();
        if (fuente == btn1) {
            System.out.println("Boton 1");;
        }
        
        if (fuente == btn2) {
            System.out.println("Boton 2");;
        }
        
        if (fuente == btn3) {
            System.out.println("Boton 3");;
        }
        
        if (fuente == btn4) {
            System.out.println("Boton 4");;
        }
        
        if (fuente == btn5) {
            System.out.println("Boton 5");;
        }
    }
}
