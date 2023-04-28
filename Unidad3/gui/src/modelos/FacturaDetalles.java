package modelos;

/**
 *
 * @author angel
 */
public class FacturaDetalles {
    private int Numero;
    private Producto producto;
    private int unidades;
    private double total;

    public FacturaDetalles() {
    }

    public FacturaDetalles(int Numero, Producto producto, int unidades) {
        this.Numero = Numero;
        this.producto = producto;
        this.unidades = unidades;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getTotal() {
        return this.unidades 
                * (this.producto.getPrecio() 
                + (this.producto.getPrecio() * this.producto.getIva()));
    }
   
}
