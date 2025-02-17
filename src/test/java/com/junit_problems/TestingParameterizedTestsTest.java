package com.junit_problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestingParameterizedTestsTest {

    private final TestingParameterizedTests testing = new TestingParameterizedTests();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6}) // Provide even numbers to test
    void testIsEvenWithEvenNumbers(int number) {
        // Test the isEven method with even numbers
        Assertions.assertTrue(testing.isEven(number), "The number " + number + " should be even");
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9}) // Provide odd numbers to test
    void testIsEvenWithOddNumbers(int number) {
        // Test the isEven method with odd numbers
        Assertions.assertFalse(testing.isEven(number), "The number " + number + " should not be even");
    }
}
