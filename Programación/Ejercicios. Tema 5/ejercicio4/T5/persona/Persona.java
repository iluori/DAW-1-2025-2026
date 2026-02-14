package ejercicio4.T5.persona;

import ejercicio1.T5.persona.CuentaCorriente;
import ejercicio1.T5.persona.DNI;
import java.time.LocalDate;

public class Persona {
    //PROPIEDADES
    public String nombre;
    public DNI dni;
    public double sueldo;
    public LocalDate fechaNacimiento;
    //ejercicio 10
    public CuentaCorriente cuenta;
    //MÉTODOS
    public Persona(String nombre,int numDNI,char letraDNI, double sueldo, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.dni = new DNI(numDNI,letraDNI);
        this.sueldo = sueldo;
        this.fechaNacimiento = fechaNacimiento;
        this.cuenta = new CuentaCorriente();
    }//Segundo constructor
    public Persona(String nombre, DNI dni, double sueldo,LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.fechaNacimiento = fechaNacimiento;
        this.cuenta = new CuentaCorriente();
    }//Primer constructor
    public Persona(String nombre, DNI dni){
        this(nombre,dni,900.0,LocalDate.of(2006,2,2));
        this.cuenta = new CuentaCorriente();
    }//Tercer constructor
    public Persona(String nombre, int numDNI,char letraDNI){
        this(nombre,numDNI,letraDNI,900.0,LocalDate.of(2006,2,2));
        this.cuenta = new CuentaCorriente();
    }//Cuarto constructor
    //ejercicio 10
    public void aumentarSueldo (int porcentaje){
        this.sueldo += (sueldo*porcentaje)/100;
    }
    public void cobrarSueldo(){
        cuenta.añadirDinero((int)sueldo);
    }
}
