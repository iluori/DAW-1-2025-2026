import java.lang.*;
import java.util.*;

public class Ejercicio39_Tema1 {
    public static void main (String [] args) {
        System.out.println("Dime tu nota numerica:");
        double nota = new Scanner (System.in).nextDouble();

        if (nota<5.0) {
            System.out.println("Calificacion: suspenso");
        }else{
            if (nota>=5 && nota<6) {
                System.out.println("Calificacion: suficiente");
            }else{
                if (nota>=6 && nota<7) {
                    System.out.println("Calificacion: bien");
                }else{
                    if (nota>=7 && nota<9) {
                        System.out.println("Calificacion: notable");
                    }else{
                        if (nota>=9 && nota<10) {
                            System.out.println("Calificacion: sobresaliente");
                        }else{
                            System.out.println("Calificacion: matricula");
                        }
                    }
                }
            }
        }
    }
}
