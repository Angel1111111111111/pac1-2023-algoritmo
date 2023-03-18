package Ejercicios;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class EjemploBorderLayout extends JFrame{
    JFrame ventana;
    
    JButton btn1 = new JButton("Arriba");
    JButton btn2 = new JButton("Abajo");
    JButton btn3 = new JButton("Derecha");
    JButton btn4 = new JButton("Izquierda");
    JButton btn5 = new JButton("Centro");
    
    public EjemploBorderLayout() {
        ventana = new JFrame();
        
        ventana.add(btn1, BorderLayout.NORTH);
        ventana.add(btn2, BorderLayout.SOUTH);
        ventana.add(btn3, BorderLayout.EAST);
        ventana.add(btn4, BorderLayout.WEST);
        ventana.add(btn5, BorderLayout.CENTER);
        
        ventana.setSize(480, 360);
        ventana.setTitle("Ejemplo de BorderLayout");
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    
    public static void main(String[] args) {
        EjemploBorderLayout app = new EjemploBorderLayout();
    }
}
