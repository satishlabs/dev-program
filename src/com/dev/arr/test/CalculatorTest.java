package com.dev.arr.test;


import com.dev.arr.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(8.0, calculator.add(5, 3), 0.01);
    }

    public void testSubtraction() {
        assertEquals(2.0, calculator.subtract(5, 3), 0.01);
    }

    public void testestMultiplication() {
        assertEquals(15.0, calculator.multiply(5, 3), 0.01);
    }

    public void testDivision() {
        assertEquals(2.0, calculator.divide(6, 3), 0.01);
    }

    public void testDivisionByZero() {
        try {
            calculator.divide(6, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    }

    public void testNegativeNumbers() {
        assertEquals(-2.0, calculator.add(-5, 3), 0.01);
        assertEquals(-8.0, calculator.subtract(-5, 3), 0.01);
        assertEquals(-15.0, calculator.multiply(-5, 3), 0.01);
        assertEquals(-2.0, calculator.divide(-6, 3), 0.01);
    }

    public void testLargeNumbers() {
        assertEquals(2000000000.0, calculator.add(1000000000, 1000000000), 0.01);
        assertEquals(0.0, calculator.subtract(1000000000, 1000000000), 0.01);
        assertEquals(1000000000000000000.0, calculator.multiply(1000000000, 1000000000), 0.01);
        assertEquals(1.0, calculator.divide(1000000000, 1000000000), 0.01);
    }

    public void testDecimalNumbers() {
        assertEquals(8.7, calculator.add(5.2, 3.5), 0.01);
        assertEquals(2.3, calculator.subtract(5.5, 3.2), 0.01);
        assertEquals(16.8, calculator.multiply(5.2, 3.5), 0.01);
        assertEquals(1.7, calculator.divide(5.5, 3.2), 0.01);
    }
}