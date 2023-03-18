package Foro2AngelAmaya;

import java.awt.ComponentOrientation;
import java.awt.Panel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio2BoxLayaout extends JFrame {
    
    //Declarar Atributos
    private JLabel lblNum1, lblNum2, lblResultado;
    private JTextField textNum1, textNum2, textResultado;
    private JButton btnSumar;
    
     //Constructor
    public Ejercicio2BoxLayaout() {
        super("Ejercicio2 BoxLayaout Suma");

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //componentes graficos
        lblNum1 = new JLabel("Numero 1");
        lblNum2 = new JLabel("Numero 2");
        lblResultado = new JLabel("Resultado");
        textNum1 = new JTextField(10);
        textNum2 = new JTextField(10);
        textResultado = new JTextField(10);
        //desactiva el texfield para no ingresar datos
        textResultado.setEditable(false);

        btnSumar = new JButton("Sumar");
        btnSumar.addActionListener(e -> Sumar());
        
        //Se agregar al GUI
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(lblNum1);
        panel.add(textNum1);
        panel.add(lblNum2);
        panel.add(textNum2);
        panel.add(btnSumar);
        panel.add(lblResultado);
        panel.add(textResultado);
        
        //agrega el panel y lo muestra
        add(panel);
        setVisible(true);
    }
    
     //Define el metodo para el boton sumar
    private void Sumar() {
        int num1 = Integer.parseInt(textNum1.getText());
        int num2 = Integer.parseInt(textNum2.getText());
        
        int resultado = num1 + num2;
        textResultado.setText(Integer.toString(resultado));
        }
   
    public static void main(String[] args) {
        new Ejercicio2BoxLayaout();
    }
}
