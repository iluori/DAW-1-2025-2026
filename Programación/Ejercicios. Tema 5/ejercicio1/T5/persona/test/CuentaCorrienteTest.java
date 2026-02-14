package ejercicio1.T5.persona.test;
//Ejercicio 7
import ejercicio1.T5.persona.CuentaCorriente;
import org.junit.Test;

import static org.junit.Assert.*;

public class CuentaCorrienteTest {
    @Test
    public void prueba1() {
        CuentaCorriente cuenta = new CuentaCorriente(1253,850);
        assertEquals(1253, cuenta.numero);
        assertEquals(850, cuenta.saldo, 0.01);
    }
    @Test
    public void prueba2() {
        CuentaCorriente cuenta = new CuentaCorriente(1253,850);
        assertEquals(1253, cuenta.numero);
        cuenta.añadirDinero(100);
        assertEquals(950, cuenta.saldo, 0.01);
        cuenta.retirarDinero(200);
        assertEquals(750, cuenta.saldo, 0.01);
        cuenta.retirarDinero(1000);
        assertEquals(750, cuenta.saldo, 0.01);
    }
}