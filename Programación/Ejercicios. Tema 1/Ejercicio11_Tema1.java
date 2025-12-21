import java.lang.*;
import java.util.*;

public class Ejercicio11_Tema1 {
    public static void main (String [] args) {
        System.out.println("Dime tu nombre:");
        String nombre = new Scanner (System.in).nextLine();
        System.out.println("Dime tu primer apellido:");
        String apellido1 = new Scanner (System.in).nextLine();
        System.out.println("Dime tu segundo apellido: ");
        String apellido2 = new Scanner (System.in).nextLine();

        System.out.println(apellido1 + " " + apellido2 + ", " + nombre);
    }
}
