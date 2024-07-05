package org.example;

import org.testng.annotations.Test;
import static org.example.FactorialTest.factorialCalc;
import static org.junit.Assert.assertEquals;

public class Testing {
    @Test
    public void factorilMinus() {
        int result = factorialCalc(-1);
        assertEquals(1, result);
    }

    @Test
    public void factorialZero() {
        int result = factorialCalc(0);
        assertEquals(1, result);
    }
    @Test
    public void factorialNumber() {
        int rerult = factorialCalc(3);
        assertEquals(6, rerult);
    }
    @Test
    public void factorialWrong() {
        int rerult = factorialCalc(3);
        assertEquals(8, rerult);
    }
}
