package sobreescritura.personas;

public class AppPersona {
//crear un arreglo y ponerle un cliclo for y escanar P[0]

    public static void main(String[] args) {
        Persona p = new Persona(
                "Juan Perez",
                'M',
                22,
                "Hondureno",
                1.65,
                255);
        Persona p2 = new Persona(
                "Maria Mejia",
                'F',
                22);
        
        System.out.println(p.toString());
        System.out.println(p2.toString());
    }
    

}


