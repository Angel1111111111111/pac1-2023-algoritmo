/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Eduard
 */
public class EjercicioPrestamo extends JFrame implements ActionListener{
    
        JTextField txtMonto;
        JTextField txtTasaInteres;
        JTextField txtPlazo;
        JTextField txtFecha;
        JTextField txtNombre;

        
        JLabel lblValorPago;
        JLabel lblInteresesCorrientes;
        JLabel lblPlazo;
        
        JButton btnCalcular = new JButton("Calcular");
        JButton btnLimpiar = new JButton("Limpiar");
        
        JTable tblDatos;
        DefaultTableModel modelo;
    
        JPanel pnlEditar;
        JPanel pnlGridDatos;
        
    
    public EjercicioPrestamo() {
        super("Calculo de Amortizacion Prestamo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(950, 600);
        
        pnlEditar = new JPanel(new FlowLayout());
        pnlEditar.setBackground(Color.white);
        
        pnlGridDatos = new JPanel(new FlowLayout());
        pnlGridDatos.setBackground(Color.LIGHT_GRAY);
        
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
         
        lblValorPago = new JLabel("Monto:");
        lblInteresesCorrientes = new JLabel ("Tasa de Intereses:");
        lblPlazo = new JLabel("Plazo Meses");
        
        txtMonto = new JTextField(20);
        txtTasaInteres = new JTextField(20);
        txtPlazo = new JTextField(10);
        txtFecha = new JTextField(10);
        txtNombre = new JTextField(30);
        
        add(btnCalcular);
        add(btnLimpiar);
        

        pnlEditar.add(lblValorPago);
        pnlEditar.add(txtMonto);        
        pnlEditar.add(lblInteresesCorrientes); 
        pnlEditar.add(txtTasaInteres);        
        pnlEditar.add(lblPlazo);
        pnlEditar.add(txtPlazo);
        pnlEditar.add(btnCalcular); 
        pnlEditar.add(btnLimpiar);
        
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Fecha De Pago");
        modelo.addColumn("Valor De Pago");
        modelo.addColumn("Abono a Capital");
        modelo.addColumn("Intereses Corrientes");
        modelo.addColumn("Saldo De Prestamo");
        
        tblDatos = new JTable();
        tblDatos.setModel(modelo);
        
        tblDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                tblDatosAgregar(evt);
                }
    });
        
        pnlGridDatos.add(new JScrollPane(tblDatos));
        
        add(pnlEditar, BorderLayout.NORTH);
        add(pnlGridDatos, BorderLayout.CENTER);
        setVisible(true);
        }
    
        private void tblDatosAgregar(MouseEvent evt) {
            DefaultTableModel model = (DefaultTableModel)tblDatos.getModel();
            txtMonto.setText((String) model.getValueAt(tblDatos.getSelectedRow(), 0) );
            txtTasaInteres.setText((String) model.getValueAt(tblDatos.getSelectedRow(), 1) );
            txtPlazo.setText((String) model.getValueAt(tblDatos.getSelectedRow(), 2) );
            txtFecha.setText((String) model.getValueAt(tblDatos.getSelectedRow(), 3) );
            txtNombre.setText((String) model.getValueAt(tblDatos.getSelectedRow(), 4) );
            
        }
        
        
    public static void main(String[] args) {
        EjercicioPrestamo app = new EjercicioPrestamo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
        // obtener los valores ingresados por el usuario
        String monto = txtMonto.getText();
        String tasaInteres = txtTasaInteres.getText();
        String plazo = txtPlazo.getText();

        // realizar los cálculos necesarios y agregar los datos a la tabla
        for (int i = 1; i <= Integer.parseInt(plazo); i++) {
            double cuota = calcularCuota(Double.parseDouble(monto), Double.parseDouble(tasaInteres), Integer.parseInt(plazo));
            double interesesCorrientes = calcularInteresesCorrientes(Double.parseDouble(monto), Double.parseDouble(tasaInteres), Integer.parseInt(plazo), i);
            double abonoCapital = cuota - interesesCorrientes;
            double saldo = Double.parseDouble(monto) - abonoCapital;

            // agregar los datos a la tabla
            modelo.addRow(new Object[] {i, "", cuota, abonoCapital, interesesCorrientes, saldo});

            // actualizar el valor de monto para el próximo ciclo
            monto = String.valueOf(saldo);
        }
    } else if (e.getSource() == btnLimpiar) {
        // limpiar los campos de texto y la tabla
        txtMonto.setText("");
        txtTasaInteres.setText("");
        txtPlazo.setText("");
        txtFecha.setText("");
        txtNombre.setText("");
        modelo.setRowCount(0);
    }
        
    } 
}
