package Gui.controles;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author angel
 */
public class Arreglo extends JFrame {

    private JTextField txtTamanoArreglo;
    private JTextField txtNumero;
    private JTextArea txtSalida;

    private JLabel lblTamanoArreglo;
    private JLabel lblNumero;

    private JButton btncrear;
    private JButton btnAdd;
    private JButton btnListar;

    private JPanel pnlSuperior;
    private JPanel pnlInferior;

    private int[] arreglo;
    private int position;

    public Arreglo() {
        super("Arreglo");
        setSize(660, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        position = 0;

        txtNumero = new JTextField(10);
        txtTamanoArreglo = new JTextField(10);
        txtSalida = new JTextArea(15, 50);

        lblNumero = new JLabel("Numero");
        lblTamanoArreglo = new JLabel("Tamaño Arreglo");

        btnAdd = new JButton("Agregar");
        btnAdd.addActionListener(e -> addNumero());

        btncrear = new JButton("Crear Arreglo");
        btncrear.addActionListener(e -> crearArreglo());
        
        btnListar = new JButton("Listar");
        btnListar.addActionListener(e -> listarArreglo());

        pnlSuperior = new JPanel(new FlowLayout());
        pnlInferior = new JPanel(new FlowLayout());

        pnlSuperior.add(lblTamanoArreglo);
        pnlSuperior.add(txtTamanoArreglo);
        pnlSuperior.add(btncrear);
        pnlSuperior.add(lblNumero);
        pnlSuperior.add(txtNumero);
        pnlSuperior.add(btnAdd);
        pnlSuperior.add(btnListar);

        pnlInferior.add(txtSalida);

        add(pnlSuperior);
        add(pnlInferior);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Arreglo();
    }

    private void crearArreglo() {
        int tamArreglo = Integer.parseInt(txtTamanoArreglo.getText());
        arreglo = new int[tamArreglo];
        txtSalida.setText("\n Arreglo creado");
        position = 0;
    }

    private void addNumero() {
        int num = Integer.parseInt(txtNumero.getText());
        String salida = txtSalida.getText();
        if (position < arreglo.length) {
            arreglo[position] = num;           
            salida += "\nArreglo[" + position + "] = " + num;
            position++;
        }else{
            salida += "\nSe alcanzo el limite del arreglo";
        }
        
        txtSalida.setText(salida);
    }

    private void listarArreglo() {
        String salida = "EL ARREGLO TIENE LOS SIGUIENTE VALORES: \n";
        for (int i = 0; i < arreglo.length; i++) {
            salida += "\nArreglo[" + position + "] = " + arreglo[i];    
        }
        txtSalida.setText(salida);
    }
}
