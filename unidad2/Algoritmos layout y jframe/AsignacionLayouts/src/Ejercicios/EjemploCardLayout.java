package Ejercicios;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public abstract class EjemploCardLayout extends JFrame implements ActionListener {

    CardLayout card;
    JButton btn1, btn2, btn3;
    Container c;

    EjemploCardLayout() {

        c = getContentPane();
        card = new CardLayout(20, 20);

        c.setLayout(card);

        btn1 = new JButton("Uno");
        btn2 = new JButton("Dos");
        btn3 = new JButton("Tres");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        c.add("a", btn1);
        c.add("b", btn2);
        c.add("c", btn3);

    }

    public void actionPerformed(ActionEvent e) {
        card.next(c);
    }

    public static void main(String[] args) {
        EjemploCardLayout cl = new EjemploCardLayout() {
        };
        cl.setSize(240, 144);
        cl.setVisible(true);
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
