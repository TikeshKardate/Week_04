package com.junit_problems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

class PerformanceTestTest {

    private final PerformanceTest tester = new PerformanceTest();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Fails if execution takes longer than 2 sec
    void testLongRunningTask() {
        tester.longRunningTask();
    }
}