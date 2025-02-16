/*
3️⃣ Create an Annotation for Logging Method Execution Time
✅ Problem Statement:
Define an annotation @LogExecutionTime to measure method execution time.
🔹 Requirements:
Apply @LogExecutionTime to a method.
Use System.nanoTime() before and after execution.
Print execution time.
Apply it on different methods and compare the time taken.
*/

package com.annotation_problems.intermediateproblems;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

// Step 1: Define the Custom Annotation
@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@Target(ElementType.METHOD) // Can be applied to methods
@interface LogExecutionTime {
}

// Step 2: Apply the Annotation to Methods
class PerformanceTest {

    @LogExecutionTime
    public void fastMethod() {
        System.out.println("Executing fast method...");
        for (int i = 0; i < 1000; i++); // Quick loop
    }

    @LogExecutionTime
    public void slowMethod() {
        System.out.println("Executing slow method...");
        for (int i = 0; i < 1_000_000; i++); // Longer loop
    }
}

// Step 3: Use Reflection to Measure Execution Time
public class Problem1 {
    public static void main(String[] args) throws Exception {
        PerformanceTest test = new PerformanceTest();
        Class<?> clazz = test.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();
                method.invoke(test); // Execute the method
                long endTime = System.nanoTime();

                long executionTime = endTime - startTime;
                System.out.println("Execution time of " + method.getName() + ": " + executionTime + " ns");
                System.out.println("-----------------------------------");
            }
        }
    }
}
