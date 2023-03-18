/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaInterfaz;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Eduard
 */
public class Interfaz extends JFrame implements ItemListener{
    
    String[] moviles = {
        "(Elija un movil para ver sus caracteristicas)",
        "Redmi Note 7",
        "LG Velvet"    
    }; 
    
    String[] caracteristicas = {
        "Marca: Xiaomi "
            + "Modelo: Redmi Note 7 "
            + " Lanzamiento: 2019 "
            + " IMEI: 8657659675 "
            + " Distribuidora: CELTEL HND",
        "Marca: LG "
            + " Modelo: Velvet "
            + " Lanzamiento: 2020 "
            + " IMEI: 768747543872 "
            + " Distribuidora: Claro HND"
        
    };
    
    JComboBox cmbElegirMovil = new JComboBox();
    JLabel lblMovil = new JLabel("");
    
    public Interfaz() {
        super("Caracteristicas de Moviles");
        setSize(480, 360);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        for (String movil : moviles) {
            cmbElegirMovil.addItem(movil);
        }
        
        cmbElegirMovil.addItemListener(this);
        
        add(BorderLayout.NORTH, cmbElegirMovil);
        add(BorderLayout.CENTER, lblMovil);
        
        setVisible(true);
    }  

    @Override
    public void itemStateChanged(ItemEvent e) {
        int seleccionado = cmbElegirMovil.getSelectedIndex();
        if (seleccionado > 0) {
            lblMovil.setText(caracteristicas[seleccionado - 1]);
        }
    }
    
    public static void main(String[] args) {
        Interfaz app = new Interfaz();
    }
    }