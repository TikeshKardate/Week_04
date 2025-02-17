package com.junit_problems.advanceproblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingDateFormatterTest {

    @Test
    void testValidDateFormat() {
        assertEquals("15-08-2024", TestingDateFormatter.formatDate("2024-08-15"), "Date should be formatted correctly.");
        assertEquals("01-01-2023", TestingDateFormatter.formatDate("2023-01-01"), "Date should be formatted correctly.");
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> TestingDateFormatter.formatDate("15/08/2024"), "Invalid format should throw an exception.");
        assertThrows(IllegalArgumentException.class, () -> TestingDateFormatter.formatDate("2024-15-08"), "Invalid format should throw an exception.");
        assertThrows(IllegalArgumentException.class, () -> TestingDateFormatter.formatDate("abcd-ef-gh"), "Invalid characters should throw an exception.");
    }
}