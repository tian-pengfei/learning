package com.java.base.io;

import java.io.*;
import java.util.zip.ZipOutputStream;

public class MyClass {

    public static void main(String[] args) throws IOException {

        ByteArrayOutputStream output=new ByteArrayOutputStream();
        output.write("hello world".getBytes());
        ByteArrayInputStream input = new ByteArrayInputStream(output.toByteArray());

        int data =input.read();
        while (data!=-1){
            System.out.print((char) data);
            data =input.read();

        }
        FileInputStream
//        FileOutputStream
                BufferedOutputStream
//        ByteArrayInputStream

    }
}
