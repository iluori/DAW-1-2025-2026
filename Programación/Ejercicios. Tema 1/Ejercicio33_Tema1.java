import java.lang.*;

public class Ejercicio33_Tema1 {
    public static void main (String [] args) {
        final int clase_Alumnos = 26;
        int aprobados = 66;
        int suspendido = (int) 19.5;

        //Nº de lumnos que han aprobado, suspendido y no se han presentado
        int num_Aprobados = (clase_Alumnos * aprobados)/100;
        int num_Suspensos = (clase_Alumnos * suspendido)/100;
        int num_resto = clase_Alumnos - (num_Aprobados + num_Suspensos);

        //Muestro por pantalla
        System.out.println("Los alumnos aprobados son: " + num_Aprobados + " personas");
        System.out.println("Los alumnos suspensos son: " + num_Suspensos + " personas");
        System.out.println("Los alumnos que no se han presentado son: " + num_resto + " personas");
    }
}
