package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test 
    public void testSuma() {
        App calculadora = new App();
        int resultado = calculadora.suma(10,5);
        assertEquals(15, resultado);
    }

      @Test 
    public void testResta() {
        App calculadora = new App();
        int resultado = calculadora.resta(10,5);
        assertEquals(5, resultado);
    }

      @Test 
    public void testMultlipica() {
        App calculadora = new App();
        int resultado = calculadora.multiplica(10,5);
        assertEquals(50, resultado);
    }

      @Test 
    public void testDivide() {
        App calculadora = new App();
        int resultado = calculadora.divide(10,5);
        assertEquals(2, resultado);
    }
}
