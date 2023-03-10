package clases;

import java.util.UUID;

/**
 *
 * @author angel
 */
public class Producto {
    // Atributos o propiedades => Varibles de clases
    
    private String codigo; //por hacer: generar codigo de forma automatica
    private String nombre;
    private double precio;
    private int stock;
    private String color;
    private String marca;
    private String descripcion;
    
    //metodo constructor
    public Producto(){
        UUID uuid = UUID.randomUUID();
        this.codigo = uuid.toString();
    }
    
    // Metodos o Mothods (Funciones)
    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getStock(){
        return this.stock;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public double getprecio(){
        return this.precio;
    }
    public void serprecio(double precio){
        this.precio = precio;
    }
    public String getCodigo(){
        return this.codigo;
    }
    
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public String getnombre(){
        return this.nombre;
    }
    
}
