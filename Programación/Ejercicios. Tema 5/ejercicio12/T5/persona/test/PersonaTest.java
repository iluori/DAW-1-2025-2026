package ejercicio12.T5.persona.test;

import ejercicio121.T5.dniMejorado.DNIMejorado;
import ejercicio12.T5.persona.Persona;
import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;

public class PersonaTest { @Test
    public void prueba1(){
        DNIMejorado dni1 = new DNIMejorado(12345678);
        Persona persona = new Persona("Pepe",dni1,1500, LocalDate.of(2006,2,2));
        assertEquals("Pepe",persona.getNombre());
        assertEquals(12345678, persona.getDni().getNumero());
        assertEquals(1500, persona.getSueldo(), 0.01);//Con margen de error
        assertEquals(LocalDate.of(2006,2,2), persona.getFechaNacimiento());
    }//Este es con el segundo constructor
    @Test
    public void prueba2() {
        DNIMejorado dniPepe = new DNIMejorado(12345678);
        Persona persona2 = new Persona("Pepe",dniPepe,1500,LocalDate.of(2006,2,2));
        assertEquals("Pepe", persona2.getNombre());
        assertEquals(12345678, persona2.getDni().getNumero());
        assertEquals(1500, persona2.getSueldo(), 0.01);
        assertEquals(LocalDate.of(2006,2,2), persona2.getFechaNacimiento());
    }//Primer constuctor
    @Test
    public void prueba3(){
        DNIMejorado dniAntonio = new DNIMejorado(12345678);
        Persona persona3 = new Persona("Antonio",dniAntonio);
        assertEquals("Antonio", persona3.getNombre());
        assertEquals(12345678, persona3.getDni().getNumero());
        assertEquals(900, persona3.getSueldo(), 0.01);
        assertEquals(LocalDate.of(2006,2,2), persona3.getFechaNacimiento());
    }
    @Test
    public void prueba4(){
        Persona persona4 = new Persona("Antonio", 12345678);
        assertEquals("Antonio", persona4.getNombre());
        assertEquals(12345678, persona4.getDni().getNumero());
        assertEquals(900, persona4.getSueldo(), 0.01);
        assertEquals(LocalDate.of(2006,2,2), persona4.getFechaNacimiento());
    }
    @Test
    //Ejericio 10
    public void prueba5() {
        DNIMejorado dniJuan = new DNIMejorado(11111111);
        Persona persona5 = new Persona("Juan", dniJuan, 1500, LocalDate.of(2006, 2, 2));
        assertEquals(0, persona5.cuenta.saldo, 0.01);
        for (int i = 0; i < 3; i++) {
            persona5.cobrarSueldo();
        }
        assertEquals(4500, persona5.cuenta.saldo, 0.01);
        persona5.aumentarSueldo(25);
        persona5.cobrarSueldo();
        assertEquals(6375, persona5.cuenta.saldo, 0.01);
    }
    //Ejercicio12
    @Test
    public void prueba6(){
        DNIMejorado dni = new DNIMejorado(11111112);
        Persona quince = new Persona("Lourdes",dni,2000,LocalDate.of(2021,12,12));
        assertEquals(false,quince.esMayorEdad());
    }
    @Test
    public void prueba7(){
        DNIMejorado dni = new DNIMejorado(11111112);
        Persona mayor = new Persona("Miriam",dni,2000,LocalDate.of(1999,12,12));
        assertEquals(true,mayor.esMayorEdad());
    }
    @Test
    public void prueba8(){
        DNIMejorado dni = new DNIMejorado(11111112);
        Persona persona = new Persona("Pablo",dni,2000,LocalDate.of(1999,12,12));
        assertEquals(false,persona.tieneDinero());
    }
    @Test
    public void prueba9(){
        DNIMejorado dni = new DNIMejorado(11111112);
        Persona persona = new Persona("Esther",dni,900,LocalDate.of(1999,12,12));
        assertEquals(true,persona.esMileurista());
    }
    @Test
    public void prueba10(){
        DNIMejorado dni = new DNIMejorado(11111112);
        Persona persona = new Persona("Roberto",dni,1800,LocalDate.of(1999,12,12));
        assertEquals(false,persona.esMileurista());
    }
}