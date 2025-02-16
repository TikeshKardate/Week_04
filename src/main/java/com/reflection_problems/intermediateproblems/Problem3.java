/*
Access and Modify Static Fields:
Create a Configuration class with a private static field API_KEY. Use Reflection to modify its value and print it.
*/

package com.reflection_problems.intermediateproblems;

import java.lang.reflect.Field;

class Configuration {
    // Private static field
    private static String API_KEY = "OriginalAPIKey";

    // Public method to get API_KEY (for verification)
    public static String getApiKey() {
        return API_KEY;
    }
}

public class Problem3 {
    public static void main(String[] args) {
        try {
            // Get the Class object
            Class<?> clazz = Configuration.class;

            // Get the private static field
            Field field = clazz.getDeclaredField("API_KEY");

            // Make the field accessible
            field.setAccessible(true);

            // Modify the static field value
            field.set(null, "UpdatedAPIKey123");  // Since it's static, we pass null as the instance

            // Print the updated value
            System.out.println("Modified API_KEY: " + Configuration.getApiKey());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}