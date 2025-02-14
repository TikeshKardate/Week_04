package com.streams.bytearraystream;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConvertingByteArrayToImage {
    public static void writeByteToImageArray(byte[] imageBytes, File destinationPath) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(destinationPath)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Image written successfully to " + destinationPath.getName());

        } catch (IOException e) {
            System.err.println("Error writing image file: " + e.getMessage());
        }
    }
}
