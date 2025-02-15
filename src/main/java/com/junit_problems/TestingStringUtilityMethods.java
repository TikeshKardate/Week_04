/*
2️⃣ Testing String Utility Methods
Problem:
Create a StringUtils class with the following methods:
reverse(String str): Returns the reverse of a given string.
isPalindrome(String str): Returns true if the string is a palindrome.
toUpperCase(String str): Converts a string to uppercase.
Write JUnit test cases to verify that these methods work correctly.
*/

package com.junit_problems;

public class TestingStringUtilityMethods {

    // Method to reverse a string
    public String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    // Method to check if a string is a palindrome
    public boolean isPalindrome(String str) {
        if (str == null) return false;
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }

    // Method to convert a string to uppercase
    public String toUpperCase(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }
}