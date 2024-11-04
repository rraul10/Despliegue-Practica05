package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MainTest {
    @Test
    public void testSuma() {
        int resultado = Main.suma(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testSumaConCeros() {
        int resultado = Main.suma(0, 0);
        assertEquals(0, resultado);
    }

    @Test
    public void testSumaConNegativos() {
        int resultado = Main.suma(-2, -3);
        assertEquals(-5, resultado);
    }

    @Test
    public void testResta() {
        int resultado = Main.resta(2, 3);
        assertEquals(-1, resultado);
    }

    @Test
    public void testRestaConCeros() {
        int resultado = Main.resta(0, 0);
        assertEquals(0, resultado);
    }

    @Test
    public void testRestaConNegativos() {
        int resultado = Main.resta(-2, -3);
        assertEquals(1, resultado);
    }
}