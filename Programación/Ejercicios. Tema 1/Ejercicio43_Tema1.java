import java.lang.*;
import java.util.*;

public class Ejercicio43_Tema1 {
    public static void main (String [] args) {
        System.out.println("Cual es el año de nacimiento?:");
        int anio_Nac = new Scanner (System.in).nextInt();
        System.out.println("Eres mujer (pulsa 1) u hombre (pulsa 2)?:");
        int mujer_Hombre = new Scanner (System.in).nextInt();
        System.out.println("Dime tu altura en metros:");
        double altura = new Scanner (System.in).nextDouble();
        System.out.println("Cual es tu peso?: ");
        double peso = new Scanner (System.in).nextDouble();

            //Defino la respuesta ante ser hombre
        int mujer = 1;
        int hombre = 2;
            //Calculo la edad
        int edad = 2025 - anio_Nac;
            //Mido al frecuencia cardiaca y muestro por pantalla
        if (mujer_Hombre == mujer) {
            int frec_Car_M = 226 - edad;
            System.out.println("Tu frecuencia cardiaca maxima: " + frec_Car_M);
        } else {
            if (mujer_Hombre == hombre) {
                int frec_Car_H = 220 - edad;
                System.out.println("Tu frecuencia cardiaca maxima: " + frec_Car_H);
            }
        }
            //Calculo el IMC
        double imc = peso/(altura*altura);
            //OMS e IMC
        if (imc<16.00) {
            System.out.println("IMC = Infrapeso: delgadez severa");
        } else {
            if (imc>=16 && imc<=16.99) {
                System.out.println("IMC = Infrapeso: delgadez moderada");
            }else{
                if (imc>=17.00 && imc<=18.49) {
                    System.out.println("IMC = Infrapeso: delgadez aceptable");
                } else {
                    if (imc>=18.50 && imc<=24.99) {
                        System.out.println("IMC = Peso normal");
                    } else {
                        if (imc>=25.00 && imc<=29.99) {
                            System.out.println("IMC = Sobrepeso");
                        } else {
                            if (imc>=30.00 && imc<=34.99) {
                                System.out.println("IMC = Sobrepeso: tipo I");
                            } else {
                                if (imc>=35.00 && imc<=40.00) {
                                    System.out.println("IMC = Sobrepeso: tipo II");
                                } else {
                                    System.out.println("IMC = Sobrepeso: tipo III");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
