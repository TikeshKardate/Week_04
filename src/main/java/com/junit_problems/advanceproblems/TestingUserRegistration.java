/*
5️⃣ Testing User Registration
📌 Problem:
Create a UserRegistration class with:
registerUser(String username, String email, String password).
Throws IllegalArgumentException for invalid inputs.
✅ Write JUnit tests to verify valid and invalid user registrations.
*/

package com.junit_problems.advanceproblems;

import java.util.regex.Pattern;

public class TestingUserRegistration
{

    public static void registerUser(String username, String email, String password) {
        if (username == null || username.isEmpty() || username.length() < 3) {
            throw new IllegalArgumentException("Username must be at least 3 characters long.");
        }

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (email == null || !Pattern.matches(emailRegex, email)) {
            throw new IllegalArgumentException("Invalid email format.");
        }

        String passwordRegex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
        if (password == null || !Pattern.matches(passwordRegex, password)) {
            throw new IllegalArgumentException("Password must be at least 8 characters, contain one uppercase letter and one digit.");
        }
    }
}