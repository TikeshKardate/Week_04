/*
Exercise 2: Use @Deprecated to Mark an Old Method
✅ Problem Statement:
Create a class LegacyAPI with an old method oldFeature(), which should not be used anymore. Instead, introduce a new method newFeature().
🔹 Steps to Follow:
Define a class LegacyAPI.
Mark oldFeature() as @Deprecated.
Call both methods and observe the warning.
*/

package com.annotation_problems.exerciseproblems;

// Step 1: Define LegacyAPI Class
class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("Warning: oldFeature() is deprecated. Use newFeature() instead.");
    }

    public void newFeature() {
        System.out.println("This is the new and improved feature.");
    }
}

// Step 2: Test the Methods
public class Problem2 {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        // Calling deprecated method (should show a warning)
        api.oldFeature();

        // Calling new method
        api.newFeature();
    }
}