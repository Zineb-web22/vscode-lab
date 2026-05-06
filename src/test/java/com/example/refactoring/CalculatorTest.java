package com.example.refactoring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testCalc() {
        Calculator calculator = new Calculator();
        // sum = 10 + 5 = 15, product = 10 * 5 = 50, ratio = 15 / 50 = 0.3
        assertEquals(0.3, calculator.calc(10, 5), 0.001);
    }
}
