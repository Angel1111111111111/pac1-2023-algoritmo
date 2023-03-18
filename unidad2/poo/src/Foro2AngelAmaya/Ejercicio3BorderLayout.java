package Foro2AngelAmaya;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio3BorderLayout extends JFrame {
    
     //Declarar Atributos
    private JLabel lblNum1, lblNum2, lblResultado;
    private JTextField textNum1, textNum2;
    private JButton btnSumar;
    
    //Constructor
    public Ejercicio3BorderLayout() {
        super("Ejercicio 3 BorderLayout suma");
        
        //border del GUI
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        //panel para el textfiel de los label
        JPanel panelTexfield = new JPanel();
        panelTexfield.setLayout(new BorderLayout());
        //lblNum1 = new JLabel("Numero 1");
        //lblNum2 = new JLabel("Numero 2");
        textNum1 = new JTextField(10);
        textNum2 = new JTextField(10);
        //Ubicarlo en reguion especifica
        //panelTexfield.add(lblNum1, BorderLayout.WEST);
        panelTexfield.add(textNum1, BorderLayout.CENTER);
        //panelTexfield.add(lblNum2, BorderLayout.EAST);
        panelTexfield.add(textNum2, BorderLayout.SOUTH);
        
        //panel para el boton sumar
        JPanel panelboton = new JPanel();
        btnSumar = new JButton("Sumar");
        btnSumar.addActionListener(e -> Sumar());
        panelboton.add(btnSumar);
        
        //panel para el la etiqueta resultado
        JPanel panelResultado = new JPanel();
        lblResultado = new JLabel();
        panelResultado.add(lblResultado);
        
        //Agrega los paneles al frame utilizando el borderLayaout
        add(panelTexfield, BorderLayout.NORTH);
        add(panelboton, BorderLayout.CENTER);
        add(panelResultado, BorderLayout.SOUTH);

        setVisible(true);

    }

    private void Sumar() {
        String text1 = textNum1.getText();
        String text2 = textNum2.getText();

        if (!text1.isEmpty() && !text2.isEmpty()) {

            int num1 = Integer.parseInt(textNum1.getText());
            int num2 = Integer.parseInt(textNum2.getText());

            int resultado = num1 + num2;
            lblResultado.setText("Resultado: " + resultado);
        }else{
            lblResultado.setText("Debe Ingresar un numero");
        }
    }

    public static void main(String[] args) {
        new Ejercicio3BorderLayout();
    }
}
