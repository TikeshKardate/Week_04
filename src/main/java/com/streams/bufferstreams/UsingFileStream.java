package com.streams.bufferstreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class UsingFileStream {
    //method to read file using filestream
    public static long usingFileStream(File sourceFile , File destinationFile){
        long startTIme =System. nanoTime();
        //try catch to handle exception
        try(FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationFile)){
            byte []bytes = new byte[4096];
            int bit;
            while((bit = fis.read(bytes))!=-1){
                fos.write(bytes , 0 ,bit);
            }
            System.out.println("File Write Successfully");

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        return System.nanoTime() - startTIme;
    }
}
