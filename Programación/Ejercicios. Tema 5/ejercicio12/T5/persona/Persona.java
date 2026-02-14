package ejercicio12.T5.persona;

import ejercicio1.T5.persona.CuentaCorriente;
import ejercicio121.T5.dniMejorado.DNIMejorado;
import java.time.LocalDate;

public class Persona {
    //PROPIEDADES
    private String nombre;
    private DNIMejorado dni;
    private double sueldo;
    private LocalDate fechaNacimiento;
    //ejercicio 10
    public CuentaCorriente cuenta;
    //MÉTODOS
    public Persona(String nombre, int numDNI, double sueldo, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.dni = new DNIMejorado(numDNI);
        this.sueldo = sueldo;
        this.fechaNacimiento = fechaNacimiento;
        this.cuenta = new CuentaCorriente();
    }//Segundo constructor
    public Persona(String nombre, DNIMejorado dni, double sueldo, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.fechaNacimiento = fechaNacimiento;
        this.cuenta = new CuentaCorriente();
    }//Primer constructor
    public Persona(String nombre, DNIMejorado dni){
        this(nombre,dni,900.0,LocalDate.of(2006,2,2));
        this.cuenta = new CuentaCorriente();
    }//Tercer constructor
    public Persona(String nombre, int numDNI){
        this(nombre,numDNI,900.0,LocalDate.of(2006,2,2));
        this.cuenta = new CuentaCorriente();
    }//Cuarto constructor
    //ejercicio 10
    public void aumentarSueldo (int porcentaje){
        this.sueldo += (sueldo*porcentaje)/100;
    }
    public void cobrarSueldo(){
        cuenta.añadirDinero((int)sueldo);
    }
    //Ejercicio 12
    public String getNombre(){
        return this.nombre;
    }
    public DNIMejorado getDni(){
        return this.dni;
    }
    public double getSueldo(){
        return this.sueldo;
    }
    public LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    public CuentaCorriente getCuentaCorriente(){
        return this.cuenta;
    }
    public boolean esMayorEdad(){
        int anoPersona = fechaNacimiento.getYear();
        int anoActual = LocalDate.now().getYear();
        boolean mayor = false;
        if ((anoActual - anoPersona) >= 18){
            mayor = true;
        }
        return mayor;
    }
    public boolean tieneDinero(){
        boolean es = false;
        if (this.cuenta.saldo > 0){
            es = true;
        }
        return es;
    }
    public boolean esMileurista(){
        boolean es = false;
        if (this.sueldo < 1200){
            es = true;
        }
        return es;
    }
}
