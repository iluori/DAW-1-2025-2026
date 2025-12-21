import java.lang.*;

public class Ejercicio30_Tema1 {
    public static void main (String [] args) {

        //Declaro las variables de las notas de los examenes
        double examen1 = 6.5;
        double examen2 = 4.2;
        double examen3 = 5.75;
        int examen4 = 8;
        //Hago la nota media de los examenes
        double media = examen1 + examen2 + examen3 + examen4 / 4;
        //Declaro las faltas que hace el alumno
        int faltas = 10;
        //Declaro los criterios de las faltas
        boolean menos_Faltas = faltas < 10;
        boolean entre_Faltas = faltas >= 10 && faltas <= 20;
        //Declaro los criterios de la media segun las faltas menos el suspenso
        boolean media_Cinco = media >= 5;
        boolean media_Siete = media >= 7;
        //Declaro los dos criterios generales para aprobar
        boolean primer_Criterio = menos_Faltas && media_Cinco;
        boolean segundo_Criterio = entre_Faltas && media_Siete;
        //Declaro lo que se necesita para el aprobado y suspenso
        boolean aprobado = primer_Criterio || segundo_Criterio;
        boolean suspenso = faltas > 20;

        //Imprimo si el alumno ha aprobado
        System.out.println("El alumno ha aprobado? (true:si, false:no) ---> " + aprobado);
    }
}