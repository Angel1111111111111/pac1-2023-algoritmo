package amayaangel_tarea2;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x, y;
    double a, b, c, d, e, f, g, h, j, m, n, p, q, r, s;
    
    System.out.print("Ingrese el valor de x: ");
    x = sc.nextDouble();
    System.out.print("Ingrese el valor de y: ");
    y = sc.nextDouble();
    System.out.print("Ingrese el valor de a: ");
    a = sc.nextDouble();
    System.out.print("Ingrese el valor de b: ");
    b = sc.nextDouble();
    System.out.print("Ingrese el valor de c: ");
    c = sc.nextDouble();
    System.out.print("Ingrese el valor de d: ");
    d = sc.nextDouble();
    System.out.print("Ingrese el valor de e: ");
    e = sc.nextDouble();
    System.out.print("Ingrese el valor de f: ");
    f = sc.nextDouble();
    System.out.print("Ingrese el valor de g: ");
    g = sc.nextDouble();
    System.out.print("Ingrese el valor de h: ");
    h = sc.nextDouble();
    System.out.print("Ingrese el valor de j: ");
    j = sc.nextDouble();
    System.out.print("Ingrese el valor de m: ");
    m = sc.nextDouble();
    System.out.print("Ingrese el valor de n: ");
    n = sc.nextDouble();
    System.out.print("Ingrese el valor de p: ");
    p = sc.nextDouble();
    System.out.print("Ingrese el valor de q: ");
    q = sc.nextDouble();
    System.out.print("Ingrese el valor de r: ");
    r = sc.nextDouble();
    System.out.print("Ingrese el valor de s: ");
    s = sc.nextDouble();
    
    System.out.println("--------------------------------");
    System.out.println("La expresion a es: 3/2 + 4/3");
    System.out.println("El resultado es:" + (3.0/2 + 4.0/3));
    
    System.out.println("--------------------------------");
    System.out.println("La expresion b es: 1/(x - 5) - 3 * x * y / 4");
    System.out.println("El resultado es: " + (1 / (x - 5) - 3 * x * y / 4));
    
    System.out.println("--------------------------------");
    System.out.println("La expresion c es: 1/2 + 7");
    System.out.println("El resultado es: " + (1/2 + 7));
    
    System.out.println("--------------------------------");
    System.out.println("La expresion d es: 7 + 1/2");
    System.out.println("El resultado es: " + (7 + 1/2));
    
    System.out.println("--------------------------------");
    System.out.println("La expresion e es: a*a/(b-c)+(d-e)/(f-g*h/j)");
    System.out.println("El resultado es: " + (a*a/(b-c)+(d-e)/(f-g*h/j)));
    
    System.out.println("--------------------------------");
    System.out.println("La expresion f es: m/n+p");
    System.out.println("El resultado es: " + (m/n+p));
    
    System.out.println("--------------------------------");
    System.out.println("La expresion g es: m+n/(p-q)");
    System.out.println("El resultado es: " + (m+n/(p-q)));
    
    System.out.println("--------------------------------");
    System.out.println("La expresion h es: a*a/(b*b)+c*c/(d*d)");
    System.out.println("El resultado es: " + (a*a/(b*b)+c*c/(d*d)));
    
    System.out.println("--------------------------------");
    System.out.println("La expresion i es: (m+n/p)/(q-r/s)");
    System.out.println("El resultado es: " + ((m+n/p)/(q-r/s)));
    
    System.out.println("--------------------------------");
    System.out.println("La expresion j es: (3*a+b)/(c-(d+5*e)/(f+g/(2*h)))");
    System.out.println("El resultado es: " + ((3*a+b)/(c-(d+5*e)/(f+g/(2*h)))));
    
    System.out.println("--------------------------------");
    System.out.println("La expresion k es: (a*a + 2*a*b + b*b)/(1/(x*x)) + 2");
    System.out.println("El resultado es: " + ((a*a + 2*a*b + b*b)/(1/(x*x)) + 2));
  }
}