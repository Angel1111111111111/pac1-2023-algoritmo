package sobreescritura.personas;

public class Persona {

    private String nombre;
    private char genero;
    private int edad;
    private String nacionalidad;
    private double estatura;
    private double peso;

    Persona(String juan_Perez, char c, int i, String hondureno, double d, int i0) {
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        if(this.genero == 'M'){
             return "Hombre";
        }else{
            return "Mujer";
        }  
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre()
             + "\nEdad: " + this.edad
             + "\nGenero: " + this.getGenero()
             + "\nNacionalidad: " + this.getNacionalidad()
             + "\nEstatura: " + this.estatura
             + "\nPeso: " + this.peso;
    }

    public Persona() {
        
    }

    public Persona(String nombre, char genero, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }
}
