package com.junit_problems.advanceproblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingUserRegistrationTest {

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> TestingUserRegistration.registerUser("Abhay", "abhay@example.com", "Password1"), "Valid registration should not throw an exception.");
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> TestingUserRegistration.registerUser("", "test@example.com", "Password1"), "Empty username should throw an exception.");
        assertThrows(IllegalArgumentException.class, () -> TestingUserRegistration.registerUser("ab", "test@example.com", "Password1"), "Short username should throw an exception.");
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> TestingUserRegistration.registerUser("User", "invalid-email", "Password1"), "Invalid email should throw an exception.");
        assertThrows(IllegalArgumentException.class, () -> TestingUserRegistration.registerUser("User", "user@.com", "Password1"), "Invalid email should throw an exception.");
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> TestingUserRegistration.registerUser("User", "test@example.com", "short"), "Short password should throw an exception.");
        assertThrows(IllegalArgumentException.class, () -> TestingUserRegistration.registerUser("User", "test@example.com", "nouppercase1"), "Password without uppercase should throw an exception.");
        assertThrows(IllegalArgumentException.class, () -> TestingUserRegistration.registerUser("User", "test@example.com", "NoNumber"), "Password without a number should throw an exception.");
    }
}
