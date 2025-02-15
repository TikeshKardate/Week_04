/*
4️⃣ Testing Date Formatter
📌 Problem:
Create a DateFormatter class with:
formatDate(String inputDate): Converts yyyy-MM-dd format to dd-MM-yyyy.
✅ Write JUnit test cases for valid and invalid dates.
*/

package com.junit_problems.advanceproblems;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TestingDateFormatter {

    public static String formatDate(String inputDate) {
        try {
            LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Expected yyyy-MM-dd.");
        }
    }
}
