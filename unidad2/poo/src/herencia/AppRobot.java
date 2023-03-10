package herencia;

public class AppRobot {

    public static void main(String[] args) {

        Recolector r = new Recolector("Wall-e");
        r.setCapacidadCarga(100);
        r.llenarBasura();
        Recolector t = new Recolector("Terminator");
        System.out.println(r.getNombre());
        System.out.println(t.getNombre());
        
    }
}
