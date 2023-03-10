package Gui.jframe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Minicalc extends JFrame implements ActionListener {

    private JTextField txtn1, txtn2;
    private JLabel lblResultado;
    private JButton btnSumar, btnRestar, btnMultiplicar, btnDividir;

    public Minicalc() {
        super("Mini Calculadora");
        setLayout(new FlowLayout());

        txtn1 = new JTextField(10);
        txtn2 = new JTextField(10);
        lblResultado = new JLabel("Resultado: ");

        btnSumar = new JButton("Sumar");
        btnRestar = new JButton("Restar");
        btnMultiplicar = new JButton("Multiplicar");
        btnDividir = new JButton("Dividir");

        add(txtn1);
        add(txtn2);
        add(lblResultado);
        add(btnSumar);
        add(btnRestar);
        add(btnMultiplicar);
        add(btnDividir);

        btnSumar.addActionListener(this);
        btnRestar.addActionListener(this);
        btnMultiplicar.addActionListener(this);
        btnDividir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double numero1 = Double.parseDouble(txtn1.getText());
        double numero2 = Double.parseDouble(txtn2.getText());
        DecimalFormat formato = new DecimalFormat("#.00");

        if (e.getSource() == btnSumar) {
            lblResultado.setText("Resultado: "
                    + formato.format(numero1 + numero2)
            );
        } else if (e.getSource() == btnRestar) {
            lblResultado.setText("Resultado: "
                    + formato.format(numero1 - numero2)
            );
        } else if (e.getSource() == btnMultiplicar) {
            lblResultado.setText("Resultado: "
                    + formato.format(numero1 * numero2)
            );
        }else if (e.getSource() == btnDividir) {
            lblResultado.setText("Resultado: " + 
                    formato.format(numero1 / numero2)
            );
        }
    }

    public static void main(String[] args) {
        Minicalc app = new Minicalc();
        app.setSize(300, 150);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);

    }
}
