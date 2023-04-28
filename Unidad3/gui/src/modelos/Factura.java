package modelos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author angel
 */
public class Factura {
    private int numeroFactura;
    private Date fecha;
    private Empresa empresa;
    private Cliente cliente;
    private ArrayList<FacturaDetalles> facturaDetalle;
    private double totalPargar;

    public Factura() {
    }

    public Factura(
            int numeroFactura, 
            Empresa empresa,
            Cliente cliente,
            ArrayList<FacturaDetalles> facturaDetalle
            ) {
        this.numeroFactura = numeroFactura;
        this.fecha = new Date();
        this.empresa = empresa;
        this.cliente = cliente;
        this.facturaDetalle = facturaDetalle;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<FacturaDetalles> getFacturaDetalle() {
        return facturaDetalle;
    }

    public void setFacturaDetalle(ArrayList<FacturaDetalles> facturaDetalle) {
        this.facturaDetalle = facturaDetalle;
    }

    public double getTotalPargar() {
        
        this.totalPargar = 0;
        
        for (FacturaDetalles item: this.facturaDetalle) {
            this.totalPargar += item.getTotal();
        }
        
        return totalPargar;
    }
    
}
