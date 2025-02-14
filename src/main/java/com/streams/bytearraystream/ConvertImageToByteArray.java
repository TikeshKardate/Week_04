package com.streams.bytearraystream;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class ConvertImageToByteArray {


    public static byte[] convertImageToByteArray(File sourceImage){

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        //Exception handling
        try(FileInputStream fi = new FileInputStream(sourceImage)){
            byte[] buffer = new byte[1024];
            int byteRead;
            //write data on file
            while((byteRead = fi.read(buffer))!=-1){
                bos.write(buffer , 0 , byteRead);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        return bos.toByteArray();
    }
}
