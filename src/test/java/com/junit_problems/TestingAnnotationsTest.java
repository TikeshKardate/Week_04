package com.junit_problems;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingAnnotationsTest {

    private TestingAnnotations dbConnection;

    @BeforeEach
    void setUp() {
        dbConnection = new TestingAnnotations();
        dbConnection.connect();
    }

    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
    }

    @Test
    void testConnectionIsEstablished() {
        assertTrue(dbConnection.isConnected(), "Connection should be established.");
    }

    @Test
    void testConnectionIsClosedAfterTest() {
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected(), "Connection should be closed.");
    }
}