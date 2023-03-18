/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaInterfaz;

/**
 *
 * @author Eduard
 */
public class Movil {
    
    private String marca;
    private String modelo;
    private String fechaLanzamiento;
    private String numeroImei;
    private String distribuidora;
    
    
    public Movil(
            String marca, 
            String modelo, 
            String fechaLanzamiento,
            String numeroImei,
            String distribuidora) {
        
        this.marca = marca;
        this.modelo = modelo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.numeroImei = numeroImei;
        this.distribuidora = distribuidora;        
    }
    
    public void setMarca (String marca) {
        this.marca = marca;
    }
    
    public String getMarca() {
        
        return this.marca;        
    }
    
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
    
    public String getModelo() {
        
        return this.modelo;        
    }
    
    public String getMovilCompleto() {
        return this.getMarca() + " " + this.getModelo();
    }
    
    public void setFechaLanzamiento (String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
    
    public String getFechaLanzamiento() {
        
        return this.fechaLanzamiento;        
    }
    
    public void setNumeroImei (String numeroImei) {
        this.numeroImei = numeroImei;
    }
    
    public String getNumeroImei() {
        
        return this.numeroImei;        
    }
    
    public void setDistribuidora (String distribuidora) {
        this.distribuidora = distribuidora;
    }
    
    public String getDistribuidora() {
        return this.distribuidora;
    }
    
    @Override
    public String toString() {
        
        return "Movil : " + this.marca +" "+ this.modelo +
                "\nMarca : " + this.marca +
                "\nModelo : " + this.modelo +
                "\nFehca de Lanzamiento : " +this.fechaLanzamiento +
                "\nNumero Imei : " +this.numeroImei +
                "\nDistribuidora : " +this.distribuidora;
        
        
    }
    
    
}
