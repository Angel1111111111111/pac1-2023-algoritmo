package Foro2AngelAmaya;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio4CardLayout extends JFrame implements ActionListener {

    JPanel pnlContenedor;
    JPanel pnlBotones;
    JPanel pnl1, pnl2, pnl3, pnl4;
    JButton btnP1, btnP2, btnP3, btnP4;
    CardLayout cardLayout;

    public Ejercicio4CardLayout() {
        super("Ejercicio4 Cardlayout colores");

        setMinimumSize(new Dimension(500, 300));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlContenedor = new JPanel();
        cardLayout = new CardLayout();
        pnlContenedor.setLayout(cardLayout);

        pnl1 = new JPanel();
        pnl1.setBackground(Color.ORANGE);
        pnl1.add(new JLabel("Naranja"));
        pnlContenedor.add(pnl1, "Naranja");

        pnl2 = new JPanel();
        pnl2.setBackground(Color.BLUE);
        pnl2.add(new JLabel("Azul"));
        pnlContenedor.add(pnl2, "Azul");

        pnl3 = new JPanel();
        pnl3.setBackground(Color.YELLOW);
        pnl3.add(new JLabel("Amarillo"));
        pnlContenedor.add(pnl3, "Amarillo");

        pnl4 = new JPanel();
        pnl4.setBackground(Color.BLACK);
        pnl4.add(new JLabel("Negro"));
        pnlContenedor.add(pnl4, "Negro");

        pnlBotones = new JPanel();

        btnP1 = new JButton("Panel 1");
        btnP1.addActionListener(e -> Boton1());
        pnlBotones.add(btnP1);

        btnP2 = new JButton("Panel 2");
        btnP2.addActionListener(e -> Boton2());
        pnlBotones.add(btnP2);

        btnP3 = new JButton("Panel 3");
        btnP3.addActionListener(e -> Boton3());
        pnlBotones.add(btnP3);

        btnP4 = new JButton("Panel 4");
        btnP4.addActionListener(e -> Boton4());
        pnlBotones.add(btnP4);

        add(pnlBotones, BorderLayout.NORTH);
        add(pnlContenedor, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        cardLayout.show(pnlContenedor, e.getActionCommand());

    }

    public static void main(String[] args) {
        new Ejercicio4CardLayout();
    }

    private void Boton1() {
       cardLayout.show(pnlContenedor, "Naranja");
    }

    private void Boton2() {
        cardLayout.show(pnlContenedor, "Azul");
    }

    private void Boton3() {
        cardLayout.show(pnlContenedor, "Amarillo");
    }

    private void Boton4() {
        cardLayout.show(pnlContenedor, "Negro");
    }
}
