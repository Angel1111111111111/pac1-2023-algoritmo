package herencia;

public class Recolector extends Robot {

    private int velocidad;
    private int capacidadCarga;
    private double llenar;

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public void llenarBasura(){
        System.out.println("Llenando de basura el deposito");
        for(int i = 0; i <= (this.capacidadCarga * 0.7); i++){
            try{
                Thread.sleep(100);
                System.out.print(".");
                this.llenar++;
            } catch (InterruptedException e){ 
                
            }
        }
        System.out.println("");
        this.tirarBasura();
         this.compactar();
    }
    private void compactar() {
        System.out.println("Compactando basura...");
       // this.llenarBasura();
    }
    private void tirarBasura(){
        System.out.println("Tirando basura....");
        this.llenar = 0;
        System.out.println("El deposito esta vacio.");
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    
    
    
    public Recolector() {
        //this.capacidadCarga = 100;
        //this.llenarBasura();
    }
    public Recolector(String nombre){
        setNombre(nombre);
        
    }
}
