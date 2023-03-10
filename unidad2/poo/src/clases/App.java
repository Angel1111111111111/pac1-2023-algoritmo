package clases;

/**
 *
 * @author angel
 */
public class App {
    public static void main(String[] args) {
        
        Producto p = new Producto();
        p.setnombre("Semitas");
        System.out.println("Codigo: " + p.getCodigo());
        System.out.println("Producto Nombre: " + p.getnombre());  
         
    }
}
