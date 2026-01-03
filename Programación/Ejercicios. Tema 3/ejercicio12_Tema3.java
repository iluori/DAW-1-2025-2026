import java.lang.*;
import java.util.Scanner;

public class ejercicio12_Tema3 {
    public static void main (String [] args) {
        //Creo las dos variables con valor inicial uno y N
        double s = 1;
        double a = 1;

        //Pido introducir N
        System.out.println("Introduce un número entero positivo: ");
        double n = new Scanner(System.in).nextDouble();

        //Pongo a S la siguiente fórmula:
        s = (1.0/2) * (a + (n/a));


        while (Math.abs(s - a) >= 0.000001) {
            a=s;
            s = (1.0/2) * (a + (n/a));
        }

        System.out.println("La raiz aproximada de " + n + " es " + s);
    }
}
