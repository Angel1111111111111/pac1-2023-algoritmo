package Ejercicios;

import java.awt.Button;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EjemploBoxLayout extends JFrame{
    Button botones[];
    
    public EjemploBoxLayout() {
        
        JFrame ventana = new JFrame();
        JPanel pnl = new JPanel();
        botones = new Button[5];
        GridBagConstraints construcObj = new GridBagConstraints(); 
        
        construcObj.fill = GridBagConstraints.VERTICAL;
        for (int i = 0; i < 5; i++) {
            botones[i] = new Button ("Button " + (i + 1)); 
            add(botones[i]); 
        }
        
        ventana.setTitle("Ejemplo de BoxLayout");
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setSize(400, 400);    
        ventana.setVisible(true); 
    }
    
    public static void main(String[] args) {
        EjemploBoxLayout obj = new EjemploBoxLayout();
    }
}
