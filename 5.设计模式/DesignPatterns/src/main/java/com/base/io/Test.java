package com.base.io;

import java.io.*;

public class Test {



    public static void main(String[] args) throws IOException {

        File file = new File("d:\\data\\1\\2\\3\\file.txt");// data后面的目录没有创建

        boolean dirCreated = file.mkdirs();
        System.out.println(dirCreated);
    }
}
