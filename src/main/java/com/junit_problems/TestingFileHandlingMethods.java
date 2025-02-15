/*
8️⃣ Testing File Handling Methods
Problem:
Create a class FileProcessor with the following methods:
writeToFile(String filename, String content): Writes content to a file.
readFromFile(String filename): Reads content from a file.
Write JUnit tests to check if:
✅ The content is written and read correctly.
✅ The file exists after writing.
✅ Handling of IOException when the file does not exist.
*/

package com.junit_problems;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class TestingFileHandlingMethods {

    public void writeToFile(String filename, String content) throws IOException {
        Files.write(Path.of(filename), content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    public String readFromFile(String filename) throws IOException {
        return Files.readString(Path.of(filename));
    }
}