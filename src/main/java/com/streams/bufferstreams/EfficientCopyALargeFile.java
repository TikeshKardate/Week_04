/*
2. Buffered Streams - Efficient File Copy
📌 Problem Statement:
Create a Java program that copies a large file (e.g., 100MB) from one location to another using Buffered Streams (BufferedInputStream and BufferedOutputStream). Compare the performance with normal file streams.
Requirements:
Read and write in chunks of 4 KB (4096 bytes).
Use System.nanoTime() to measure execution time.
Compare execution time with unbuffered streams.
 */

package com.streams.bufferstreams;

import java.io.*;

public class EfficientCopyALargeFile {
    public static void main(String[] args) {
        File sourcePath = new File("D:\\Week_04\\Day_03\\src\\main\\java\\com\\streams\\bufferstreams\\LargerFile_100MB.txt");
        File destinationPath = new File("D:\\Week_04\\Day_03\\src\\main\\java\\com\\streams\\bufferstreams\\CopiedTextFile.txt");

        //Total time taken by Buffer stream
        long timeTakenByBufferStream = UsingBufferStream.usingBufferStream(sourcePath,destinationPath);

        //Total time taken by File Stream
        long timeTakenByFileStream = UsingFileStream.usingFileStream(sourcePath,destinationPath);

        System.out.println("Time taken by Buffer Stream "+ timeTakenByBufferStream/1000000.0 + " MS");
        System.out.println("Time taken by File Stream "+ timeTakenByFileStream/1000000.0 + " MS");

        if(timeTakenByBufferStream  > timeTakenByFileStream){
            System.out.println("File Stream is better than BufferStream ");
        }
        else{
            System.out.println("Buffer Stream is better than FileStream");
        }
    }
}
