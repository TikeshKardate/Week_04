/*
2️⃣ Testing Password Strength Validator
📌 Problem:
Create a PasswordValidator class with:
Password must have at least 8 characters, one uppercase letter, and one digit.
✅ Write JUnit tests for valid and invalid passwords.
*/

package com.junit_problems.advanceproblems;
import java.util.regex.Pattern;

public class TestingPasswordStrengthValidator {

    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public static boolean isValid(String password) {
        if (password == null) {
            return false;
        }
        return pattern.matcher(password).matches();
    }
}
