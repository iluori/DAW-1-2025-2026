
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.lang.*;
import java.util.Scanner;

public class ejercicio14_Tema3 {
    public static void main (String [] args) {
        boolean repetir = true;

        while (repetir) {
            System.out.println("1. Añadir nuevo alumno");
            System.out.println("2. Ver los datos de un alumno");
            System.out.println("3. Salir");

            int respuesta = new Scanner(System.in).nextInt();

            switch (respuesta) {
                case 1:
                    System.out.println("Escribe tu DNI:");
                    String dni = new Scanner(System.in).nextLine();
                    System.out.println("Escribe tu nombre:");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.println("Escribe tu dirección:");
                    String direccion = new Scanner(System.in).nextLine();
                    System.out.println("Por último, escribe tu teléfono:");
                    String telefono = new Scanner(System.in).nextLine();

                    try {
                        String ruta = dni+".txt";
                        PrintWriter printWriter = new PrintWriter(ruta);
                        printWriter.println(nombre);
                        printWriter.println(direccion);
                        printWriter.println(telefono);
                        printWriter.close();
                        System.out.println("Alumno añadido con éxito");
                    } catch (Exception e) {
                        System.out.println("Algo pasa en la opción 1");
                    }
                    break;

                case 2:
                    System.out.println("¿Cuál es tu DNI?:");
                    String dni2 = new Scanner(System.in).nextLine();
                    String ruta2 = dni2 +".txt";

                    //Guardo la ruta en un file para comprobar despues si el archivo existe o no
                    //Si no existe termino el case y ya
                    File archivo = new File(ruta2);
                    if (!archivo.exists()) {
                        System.out.println("El archivo no existe.");

                    }else{
                        try {
                            FileReader fileReader = new FileReader(archivo);
                            BufferedReader bufferedReader = new BufferedReader(fileReader);

                            //Leo línea por línea
                            String leer = bufferedReader.readLine();
                            //Controlo las líneas vacías
                            if (leer != null) {
                                System.out.println(leer);
                            }

                            //Cierro
                            bufferedReader.close();
                        } catch (Exception e) {
                            System.out.println("Algo pasa en la opción 2");
                        }
                    }
                    break;
                case 3: repetir = false;
            }
        }
    }
}
