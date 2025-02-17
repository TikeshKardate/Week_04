package com.junit_problems.advanceproblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingPasswordStrengthValidatorTest {

    @Test
    void testValidPasswords() {
        assertTrue(TestingPasswordStrengthValidator.isValid("StrongPass1"), "Valid password should pass");
        assertTrue(TestingPasswordStrengthValidator.isValid("HelloWorld9"), "Valid password should pass");
        assertTrue(TestingPasswordStrengthValidator.isValid("A1b2c3d4"), "Valid password should pass");
    }

    @Test
    void testTooShortPassword() {
        assertFalse(TestingPasswordStrengthValidator.isValid("Ab1"), "Password too short should fail");
        assertFalse(TestingPasswordStrengthValidator.isValid("A2b3"), "Password too short should fail");
    }

    @Test
    void testMissingUppercase() {
        assertFalse(TestingPasswordStrengthValidator.isValid("strongpass1"), "Missing uppercase letter should fail");
        assertFalse(TestingPasswordStrengthValidator.isValid("password9"), "Missing uppercase letter should fail");
    }

    @Test
    void testMissingDigit() {
        assertFalse(TestingPasswordStrengthValidator.isValid("StrongPass"), "Missing digit should fail");
        assertFalse(TestingPasswordStrengthValidator.isValid("HelloWorld"), "Missing digit should fail");
    }

    @Test
    void testNullPassword() {
        assertFalse(TestingPasswordStrengthValidator.isValid(null), "Null password should fail");
    }
}
