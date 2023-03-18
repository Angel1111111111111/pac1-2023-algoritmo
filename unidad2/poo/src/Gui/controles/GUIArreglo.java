package Gui.controles;

import java.awt.FlowLayout;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author angel
 */
public class GUIArreglo extends JFrame {
    int[] cantidad;
    int contador = 0;
    String mensaje;

    JTextField txtcantidad;
    JTextField txtNumero;
    JButton btnCrear;
    JButton btnAgregar;
    JButton btnMostrar;
    JTextArea txtlista;

    public GUIArreglo() {
        
        super("Tabla");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        
        JLabel lblCantidad = new JLabel("Cantidad: ");
        JLabel lblNumero = new JLabel("Numero: ");
        
        txtlista = new JTextArea(20, 20);
        txtNumero = new JTextField(10);
        txtcantidad = new JTextField(10);
        btnCrear = new JButton("Crear");
        btnAgregar = new JButton("Add");
        btnMostrar = new JButton("Mostrar");

        add(lblCantidad);
        add(txtcantidad);
        add(btnCrear);
        add(lblNumero);
        add(txtNumero);
        add(btnAgregar);
        add(btnMostrar);
        add(txtlista);
        
        btnCrear.addActionListener(e -> crearArreglo());

        btnAgregar.addActionListener(e -> agregarArreglo());

        btnMostrar.addActionListener(e -> mostarArreglo());
        
        setVisible(true);
        
        
        
    }

    public static void main(String[] args) {
        new GUIArreglo();
    }

    public void crearArreglo() {
        cantidad = new int[Integer.parseInt(txtcantidad.getText())];  
    }

    public void agregarArreglo() { 
        cantidad[contador] = Integer.parseInt(txtNumero.getText());
        contador++;
        
        if (contador >= Integer.parseInt(txtcantidad.getText())) {
            mensaje = "El arreglo está lleno";
            txtlista.append(mensaje);
        }
    }

    public void mostarArreglo() {
        txtlista.setText("");
        for (int i = 0; i < Integer.parseInt(txtcantidad.getText()) ; i++) {
            mensaje = (i + 1) + ") " + cantidad[i] + "\n"; 
            txtlista.append(mensaje);
        }
    }

}
