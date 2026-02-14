package ejercicio4.T5.persona.test;

import ejercicio1.T5.persona.DNI;
import ejercicio4.T5.persona.Persona;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class PersonaTest {
    @Test
    public void prueba1(){
        DNI dni1 = new DNI("12345678B");
        Persona persona = new Persona("Pepe",dni1,1500, LocalDate.of(2006,2,2));
        assertEquals("Pepe",persona.nombre);
        assertEquals(12345678, persona.dni.numero);
        assertEquals('B', persona.dni.letra);
        assertEquals(1500, persona.sueldo, 0.01);//Con margen de error
        assertEquals(LocalDate.of(2006,2,2), persona.fechaNacimiento);
    }//Este es con el segundo constructor
    @Test
    public void prueba2() {
        DNI dniPepe = new DNI(12345678,'B');
        Persona persona2 = new Persona("Pepe",dniPepe,1500,LocalDate.of(2006,2,2));
        assertEquals("Pepe", persona2.nombre);
        assertEquals(12345678, persona2.dni.numero);
        assertEquals('B', persona2.dni.letra);
        assertEquals(1500, persona2.sueldo, 0.01);
        assertEquals(LocalDate.of(2006,2,2), persona2.fechaNacimiento);
    }//Primer constuctor
    @Test
    public void prueba3(){
        DNI dniAntonio = new DNI(12345678,'X');
        Persona persona3 = new Persona("Antonio",dniAntonio);
        assertEquals("Antonio", persona3.nombre);
        assertEquals(12345678, persona3.dni.numero);
        assertEquals('X', persona3.dni.letra);
        assertEquals(900, persona3.sueldo, 0.01);
        assertEquals(LocalDate.of(2006,2,2), persona3.fechaNacimiento);
    }
    @Test
    public void prueba4(){
        Persona persona4 = new Persona("Antonio", 12345678, 'X');
        assertEquals("Antonio", persona4.nombre);
        assertEquals(12345678, persona4.dni.numero);
        assertEquals('X', persona4.dni.letra);
        assertEquals(900, persona4.sueldo, 0.01);
        assertEquals(LocalDate.of(2006,2,2), persona4.fechaNacimiento);
    }
    @Test
    //Ejericio 10
    public void prueba5() {
        DNI dniJuan = new DNI(11111111, 'H');
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
}