/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

import java.util.ArrayList;
import modelos.Cliente;
import modelos.Empresa;
import modelos.Factura;
import modelos.FacturaDetalles;
import modelos.Producto;

/**
 *
 * @author angel
 */
public class App {
    public static void main(String[] args) {
        Cliente cliente = 
                new Cliente(1,
                "Juan Perez",
                "041120343245",
                "Por el burro",
                "9999-9999",
                "Jperez@me.com");
        
        Empresa empresa = 
                new Empresa(1,
                "Empresa la fabulosa",
                "Barrio el progreso",
                "9999-0001",
                "info@lafobulosa.com");
        
        Producto producto01 = 
               new Producto(1, "Semitas", 30, 25, 0.15);
        
        Producto producto02 = 
               new Producto(2, "Cafe", 25, 130, 0.15);
               
        FacturaDetalles linea01 = 
                new FacturaDetalles(1, producto01, 2);
        
        FacturaDetalles linea02 = 
                new FacturaDetalles(2, producto02, 1);
        
        ArrayList<FacturaDetalles> facturaDetalleses = new ArrayList<>();
        
        facturaDetalleses.add(linea01);
        facturaDetalleses.add(linea02);
        
        Factura factura01 = 
                new Factura(1,
                        empresa,
                        cliente,
                        facturaDetalleses
                        );
        
        System.out.println("------------------------------------");
        System.out.println("\nFactura No." + factura01.getNumeroFactura());
        System.out.println("Total a pagar: " + factura01.getTotalPargar());
        
    }
}
