import java.lang.*;

public class Ejercicio34_Tema1 {
    public static void main (String [] args) {
        String n1 = "125";
        String n2 = "456";
        //convertir en int
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        //suma
        int suma = num1 + num2;
        //producto
        int producto = num1*num2;

        System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + suma);
        System.out.println("La multiplicación de " + num1 + " por " + num2 + " es igual a " + producto);
    }
}
