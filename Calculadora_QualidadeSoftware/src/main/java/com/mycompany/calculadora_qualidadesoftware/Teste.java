package com.mycompany.calculadora_qualidadesoftware;

import org.junit.Test;
import junit.framework.TestCase;

public class CalculadoraTest extends TestCase {
    @Test
    public void test() {
        Calculadora c = new Calculadora();
        double result = c.somar(3, 4);
        assertEquals(7.0, result);
    }
}