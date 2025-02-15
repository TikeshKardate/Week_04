/*
5️⃣ Testing @BeforeEach and @AfterEach Annotations
Problem:
Create a class DatabaseConnection with a method connect() and disconnect().
Use @BeforeEach to initialize a database connection before each test.
Use @AfterEach to close the connection after each test.
Write JUnit test cases to verify that the connection is established and closed correctly.
*/

package com.junit_problems;

public class TestingAnnotations {

    private boolean connected;

    public void connect() {
        connected = true;
        System.out.println("Database connected.");
    }

    public void disconnect() {
        connected = false;
        System.out.println("Database disconnected.");
    }

    public boolean isConnected() {
        return connected;
    }
}
