import java.lang.*;
import java.util.*;

public class Ejercicio23_Tema1 {
    public static void main (String [] args) {
        System.out.println("Dime las tres notas de tus examenes");
        double examen1 = new Scanner (System.in).nextDouble();
        double examen2 = new Scanner (System.in).nextDouble();
        double examen3 = new Scanner (System.in).nextDouble();

        double media = examen1 + examen2 + examen3 / 3;

        boolean aprobado = media >= 5;

        System.out.println("La media te sale aprobado? (true: si, false: no) --> " + aprobado);
    }
}