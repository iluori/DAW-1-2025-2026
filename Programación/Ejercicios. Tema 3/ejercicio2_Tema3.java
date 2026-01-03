import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class ejercicio2_Tema3 {
    public static void main (String [] args) {
        System.out.println("1) Escribir dos frases en un archivo");
        System.out.println("2) Leer dos frases del archivo");
        int resp_Usuario = new Scanner(System.in).nextInt();

        File archivo = new File("./files/frases.txt");

        switch (resp_Usuario) {
            case 1 -> {
                try {
                    if (archivo.createNewFile()) {
                        System.out.println("Archivo creado");
                    } else {
                        System.out.println("Creación de archivo denegada");
                    }
                    PrintWriter printWriter = new PrintWriter(archivo);
                    String frase1 = "Hola caracola ";
                    String frase2 = "Adios";
                    printWriter.println(frase1 + frase2);
                    printWriter.close();
                } catch (Exception e) {
                    System.out.println("Algo no funciona");
                }
            }

            case 2 -> {
                 try {
                    Scanner escaner = new Scanner(archivo);
                    System.out.println(escaner.nextLine());
                } catch (Exception e) {
                    System.out.println("No se pudo leer el archivo");
                }
            }
        }
    }
}
