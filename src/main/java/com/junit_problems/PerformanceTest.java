/*
7️⃣Performance Testing Using @Timeout
Problem:
Create a method longRunningTask() that sleeps for 3 seconds before returning a result.
Use @Timeout(2) in JUnit to fail the test if the method takes more than 2 seconds.*/

package com.junit_problems;

public class PerformanceTest {
    public void longRunningTask() {
        try {
            Thread.sleep(3000); // Simulates a long-running task (3 seconds)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}