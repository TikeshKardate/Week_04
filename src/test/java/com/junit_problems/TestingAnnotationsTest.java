package com.junit_problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingAnnotationsTest {

    private DatabaseConnection dbConnection;

    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
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