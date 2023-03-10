package Gui.jframe;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculadora extends JFrame{

    public Calculadora() {

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout fl = new FlowLayout();
        setLayout(fl);

        JTextField txtNum1 = new JTextField(10);
        JTextField txtNum2 = new JTextField(10);

        add(txtNum1);
        add(txtNum2);

        JButton btnSumar = new JButton("Sumar");
        add(btnSumar);
        JButton btnRestar = new JButton("Resta");
        add(btnRestar);
        JButton btnMultiplicacion = new JButton("Multiplicacion");
        add(btnMultiplicacion);
        JButton btnDivicion = new JButton("Divicion");
        add(btnDivicion);
        JLabel lblResultado = new JLabel("Resultado");
        add(lblResultado);

        btnSumar.addActionListener(e -> {
            int n1 = Integer.parseInt(txtNum1.getText());
            int n2 = Integer.parseInt(txtNum2.getText());
            lblResultado.setText("Resultado Suma: " + (n1 + n2));
        });
        btnRestar.addActionListener(e -> {
            int n1 = Integer.parseInt(txtNum1.getText());
            int n2 = Integer.parseInt(txtNum2.getText());
            lblResultado.setText("Resultado Resta: " + (n1 - n2));
        });
        btnMultiplicacion.addActionListener(e -> {
            int n1 = Integer.parseInt(txtNum1.getText());
            int n2 = Integer.parseInt(txtNum2.getText());
            lblResultado.setText("Resultado Multiplicacion: " + (n1 * n2));
        });
        btnDivicion.addActionListener(e -> {
            DecimalFormat formato = new DecimalFormat("#.00");
            String numeroFormato = formato.format(00);
            double n1 = Integer.parseInt(txtNum1.getText());
            double n2 = Integer.parseInt(txtNum2.getText());
            lblResultado.setText("Resultado Divicion: " + (n1 / n2));
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculadora();
    }

}
