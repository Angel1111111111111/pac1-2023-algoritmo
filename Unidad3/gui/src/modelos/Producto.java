/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.Collection;
import java.util.Collections;
import servicios.ProductosServicio;

/**
 *
 * @author angel
 */
public class Producto implements Comparable<Producto>{
    private int id;
    private String nombre;
    private int stock;
    private double precio;
    private double total;
    private double iva;
    private double precioVenta;

    public Producto() {
    }

    public Producto(
            int id,
            String nombre,
            int stock,
            double precio,
            double iva) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.iva = iva;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return this.precio * this.stock;
    }

    public double getIva() {
        return iva / 100;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPrecioVenta() {
        double total = getTotal() + (getTotal() * this.getIva());
        return total;
    }   
    
    @Override
    public int compareTo(Producto o){
        return Integer.compare(this.id, o.id);
        
    }

}
