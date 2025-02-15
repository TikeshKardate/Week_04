package com.junit_problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingExceptionHandlingTest {

    private final MathOperations mathOperations = new MathOperations();

    @Test
    void testDivideByNonZero() {
        assertEquals(5, mathOperations.divide(10, 2));
        assertEquals(-3, mathOperations.divide(-9, 3));
    }

    @Test
    void testDivideByZeroThrowsException() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            mathOperations.divide(10, 0);
        });

        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}