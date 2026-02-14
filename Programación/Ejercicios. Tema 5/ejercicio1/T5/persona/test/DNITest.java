package ejercicio1.T5.persona.test;

import ejercicio1.T5.persona.DNI;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DNITest {
    @Test
    public void prueba1() {
        DNI dni = new DNI(12345678, 'Z');
        assertEquals(12345678,dni.numero);
        assertEquals('Z',dni.letra);
    }
    @Test
    public void prueba2() {
        DNI dni = new DNI("12345678X");
        assertEquals(12345678,dni.numero);
    }
}