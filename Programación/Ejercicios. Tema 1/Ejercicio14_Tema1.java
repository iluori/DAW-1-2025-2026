import java.lang.*;
import java.util.*;

public class Ejercicio14_Tema1 {
    public static void main (String [] args) {
        System.out.println("Dime un número de euros: ");
        int euros = new Scanner (System.in).nextInt();

        double dolares = euros*1.42;
        double libras = euros*0.8713;
        double yens = euros*113.86;
        double pesetas = euros*166.386;

        System.out.println("El cambio de " + euros + " euros es: \n" + "Dolares - " + dolares
        + "\n" + "Libras - " + libras + "\n" + "Yens - " + yens + "\n" + "Pesetas - " + pesetas);

    }
}
