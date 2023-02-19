
package arreglo;

public class Arreglo01 {
    public static void main(String[] args) {
        //Declaron de un arreglo de entero con tamaño de 5
        int[] numeros = new int[5];
        
        //Inicializar los elementos del arreglo
        numeros[0] = 3;
        numeros[1] = 12;
        numeros[2] = 32;
        numeros[3] = 54;
        numeros[4] = 22;
        
        //Accerder valores de arreglo
        
        //System.out.println(numeros[0]);
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
    }
}
