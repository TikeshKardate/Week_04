package com.streams.bufferstreams;

import java.io.*;

public class UsingBufferStream {
    //Read file using buffer stream
    public static long usingBufferStream( File sourceFile ,File destinationFile){
        long startTime = System.nanoTime();
        //try catch to handle exception
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile))) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully!");

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }

        return System.nanoTime() - startTime;
    }
}
