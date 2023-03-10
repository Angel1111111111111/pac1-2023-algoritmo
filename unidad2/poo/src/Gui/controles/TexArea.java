/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui.controles;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author angel
 */
public class TexArea extends JFrame {

    JTextField txtNumero;
    JTextField txtLimite;
    JButton btnMostar;
    JTextArea textaMensaje;

    public TexArea() {
        super("Tabla");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblNumero = new JLabel("Tabla del: ");
        JLabel lblLimite = new JLabel("Limite: ");

        txtNumero = new JTextField(10);
        txtLimite = new JTextField(10);
        JButton btnMostar = new JButton("Mostrar");
        textaMensaje = new JTextArea(10, 40);

        btnMostar.addActionListener(e -> generarTabla());

        setLayout(new FlowLayout());
        add(lblNumero);
        add(txtNumero);
        add(lblLimite);
        add(txtLimite);
        add(textaMensaje);
        add(btnMostar);

        setVisible(true);

    }

    public static void main(String[] args) {
        new TexArea();
    }

    private void generarTabla() {
        String mensaje;
        if (textaMensaje.getText().length() == 0
                || txtNumero.getText().length() == 0) {
            mensaje = "Esta vacion";
            textaMensaje.setText(mensaje);
        } else {
            int limite = Integer.parseInt(txtLimite.getText());
            int numero = Integer.parseInt(txtNumero.getText());

            mensaje = "Tabla del: " + numero + "\n";
            for (int i = 1; i <= limite; i++) {
                mensaje += numero + " x " + (i + 1) + " = " + (numero * (i + 1)) + "\n";
            }
        }

        textaMensaje.setText(mensaje);
    }
}
