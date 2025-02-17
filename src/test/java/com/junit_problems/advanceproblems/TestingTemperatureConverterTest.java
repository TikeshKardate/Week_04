package com.junit_problems.advanceproblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingTemperatureConverterTest {

    private static final double DELTA = 0.01; // Tolerance for floating-point comparison

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, TestingTemperatureConverter.celsiusToFahrenheit(0), DELTA, "0°C should be 32°F");
        assertEquals(212.0, TestingTemperatureConverter.celsiusToFahrenheit(100), DELTA, "100°C should be 212°F");
        assertEquals(-40.0, TestingTemperatureConverter.celsiusToFahrenheit(-40), DELTA, "-40°C should be -40°F");
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, TestingTemperatureConverter.fahrenheitToCelsius(32), DELTA, "32°F should be 0°C");
        assertEquals(100.0, TestingTemperatureConverter.fahrenheitToCelsius(212), DELTA, "212°F should be 100°C");
        assertEquals(-40.0, TestingTemperatureConverter.fahrenheitToCelsius(-40), DELTA, "-40°F should be -40°C");
    }
}