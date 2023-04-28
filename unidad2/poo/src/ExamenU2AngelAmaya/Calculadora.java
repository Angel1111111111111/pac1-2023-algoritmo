package ExamenU2AngelAmaya;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.PLAIN;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Calculadora extends JFrame {

    JLabel display;

    int numBotones = 17;

    JButton botones[] = new JButton[numBotones];

    String textoBotones[] = {"=", "7", "8", "9", "/", "4", "5", "6", "*", "1",
        "2", "3", "-", "Cos", "0", ".", "+"};

    int btnX[] = {15, 15, 80, 145, 210, 15, 80, 145, 210, 15, 80, 145, 210,
        15, 80, 145, 210};
    int btnY[] = {90, 155, 155, 155, 155, 220, 220, 220, 220, 285, 285, 285,
        285, 350, 350, 350, 350};
    int btnNumeros[] = {14, 9, 10, 11, 5, 6, 7, 1, 2, 3};
    int[] btnOperacion = {16, 12, 8, 4};
    int btnAncho = 50;
    int btnLarcho = 50;
    boolean numNuevo = true;
    boolean puntoDecimal = false;
    double operando1 = 0;
    double operando2 = 0;
    double resultado = 0;
    String operacion = "";

    public Calculadora() {

        iniciarBotones();
        iniciarPantalla();
        Numeros();
        Decimal();
        Operaciones();
        Resultado();
        Limpiar();
    }

    private void iniciarBotones() {
        
        for (int i = 0; i < numBotones; i++) {
            botones[i] = new JButton(textoBotones[i]);
            int size = (i == 0) ? 24 : 16;
            int ancho = (i == 0) ? 245 : btnLarcho;

            botones[i].setBounds(btnX[i], btnY[i], ancho, btnLarcho);
            botones[i].setFont(new Font("MONOSPACED", PLAIN, size));
            botones[i].setOpaque(true);
            botones[i].setFocusPainted(false);
            botones[i].setBackground(Color.WHITE);
            botones[i].setForeground(Color.BLACK);
            botones[i].setBorder(new LineBorder(Color.WHITE));
            add(botones[i]);
        }
    }

    private void iniciarPantalla() {

        setLayout(null); 
        setTitle("Calculadora"); 
        setSize(290, 455); 
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        getContentPane().setBackground(Color.BLACK);
        setVisible(true); 
    }

    private void Numeros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void Decimal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void Operaciones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void Resultado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void Limpiar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main(String[] args) {
        new Calculadora();
    }

}
