package org.lessons.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(5.0f, Calculator.add(2.0f, 3.0f));
        assertEquals(-5.4f, Calculator.add(-2.2f, -3.2f));
        assertEquals(0f, Calculator.add(-6.5f, 6.5f));
    }

    @Test
    void substract() {
        assertEquals(5.0f, Calculator.substract(11.0f, 6.0f));
        assertEquals(-5.0f, Calculator.substract(2.0f, 7.0f));
        assertEquals(0f, Calculator.substract(6.5f, 6.5f));
    }

    @Test
    void divide() {
        assertEquals(2.0f, Calculator.divide(6.0f, 3.0f));
        assertEquals(-7.0f, Calculator.divide(-7.0f, 1.0f));
        assertEquals(0f, Calculator.divide(0f, 9.0f));
        assertEquals(0.44444445f, Calculator.divide(4.0f, 9.0f));
    }

    @Test
    void multiply() {
        assertEquals(15.0f, Calculator.multiply(5.0f, 3.0f));
        assertEquals(-8.0f, Calculator.multiply(-2.0f, 4.0f));
        assertEquals(0f, Calculator.multiply(-8.0f, 0.0f));
        assertEquals(0f, Calculator.multiply(8.0f, 0.0f));
    }
}