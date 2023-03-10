package ejercicio1;

import java.util.Scanner;

public class AppCalculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.print("Ingrese el primer numero: ");
        double num1 = sc.nextDouble();
        calculadora.setNum1(num1);
        System.out.print("Ingrese el segundo numero: ");
        double num2 = sc.nextDouble();
        calculadora.setNum2(num2);

        double resultadoSuma = calculadora.getSumar();
        resultadoSuma = num1 + num2;
        System.out.println("La suma es: " + resultadoSuma);

        double resultadoResta = calculadora.getRestar();
        resultadoResta = num1 - num2;
        System.out.println("La resta es: " + resultadoResta);

        double resultadoMulti = calculadora.getMultiplicar();
        resultadoMulti = num1 * num2;
        System.out.println("La multiplicacion es: " + resultadoMulti);

        double resultadodivicion = calculadora.getDividir();
        resultadodivicion = num1 / num2;
        System.out.println("La divicion es: " + resultadodivicion);
        if(num2 == 0){
            System.out.println("No se puede dividir entre 0");
        }
    }
}
