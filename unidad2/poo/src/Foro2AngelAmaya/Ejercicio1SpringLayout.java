package Foro2AngelAmaya;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Ejercicio1SpringLayout extends JFrame {

    JFrame frame = new JFrame("Ejemplo SpringLayaout");
    //Declarar Atributos
    private JLabel lblNombre;
    private JButton btnEnviar;
    private JTextField textField;
    private SpringLayout layaout;
    private JLabel lblResultado;

    //Constructor
    public Ejercicio1SpringLayout() {
        setSize(450, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        //componentes graficos
        lblNombre = new JLabel("Introducir el nombre");
        textField = new JTextField(20);

        lblResultado = new JLabel();

        btnEnviar = new JButton("Enviar");
        btnEnviar.addActionListener(e -> eviarDato());

        //Se crea el SpringLayout 
        layaout = new SpringLayout();

        //Se agregar al GUI
        add(lblNombre);
        add(textField);
        add(btnEnviar);
        add(lblResultado);
        
        //restricciones para la etiqueta nombre
        layaout.putConstraint(SpringLayout.WEST, lblNombre, 5,
                SpringLayout.WEST, frame.getContentPane());
        layaout.putConstraint(SpringLayout.NORTH, lblNombre, 5,
                SpringLayout.NORTH, frame.getContentPane());
        
        //restricciones para el campo texfield
        layaout.putConstraint(SpringLayout.WEST, textField, 5,
                SpringLayout.EAST, lblNombre);
        layaout.putConstraint(SpringLayout.NORTH, textField, 5,
                SpringLayout.NORTH, frame.getContentPane());
        layaout.putConstraint(SpringLayout.EAST, textField, -5,
                SpringLayout.WEST, btnEnviar);
        
        //restricciones para el boton enviar
        layaout.putConstraint(SpringLayout.EAST, btnEnviar, -5,
                SpringLayout.EAST, frame.getContentPane());
        layaout.putConstraint(SpringLayout.NORTH, btnEnviar, 5,
                SpringLayout.NORTH, frame.getContentPane());
        
        //restricciones para el la etiqueta resultado
        layaout.putConstraint(SpringLayout.WEST, lblResultado, 5,
                SpringLayout.WEST, frame.getContentPane());
        layaout.putConstraint(SpringLayout.NORTH, lblResultado, 5,
                SpringLayout.SOUTH, lblNombre);
        
        //Se empaqueta y se muestran en el GUI
        frame.pack();
        setVisible(true);

    }

    public static void main(String[] args) {
        new Ejercicio1SpringLayout();
    }
    
    //Define el metodo para el boton enviar
    private void eviarDato() {
        String nombre = textField.getText();
        lblResultado.setText("El nombre es: " + nombre);

    }

}
