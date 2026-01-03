import java.lang.*;
import java.util.Scanner;

public class ejercicio6_Tema3 {
    public static void main (String [] args) {
        //While lento y seguro
        boolean repetir = true;

        while (repetir) {
            System.out.println("¿Eres mayor de edad (si/no)");
            String respuesta = new Scanner(System.in).nextLine();
            //Paso la respuesta a que siempre sea en minúscula
            respuesta = respuesta.toLowerCase();

            switch (respuesta) {
                case "si":
                    System.out.println("El usuario es mayor de edad");
                    repetir = false;
                    break;

                case "no":
                    System.out.println("El usuario es menor de edad");
                    repetir = false;
                    break;

                default:
                    System.out.println("No te entiendo");
            }
        }

    }
}
