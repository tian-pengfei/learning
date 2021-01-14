package com.java.base.io;

import java.io.*;

public class SystemStream {

    public static void main(String[] args) throws FileNotFoundException {


        OutputStream output=new FileOutputStream("D:\\data\\system.out.txt");
        System.setOut(new PrintStream(output));
        System.out.println("this is system.out.data");
    }
}
