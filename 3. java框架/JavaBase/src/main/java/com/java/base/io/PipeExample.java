package com.java.base.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipeExample {



    public static void main(String[] args) throws IOException {
        final PipedInputStream input =new PipedInputStream();
        final PipedOutputStream output= new PipedOutputStream(input);

//        final PipedOutputStream output= new PipedOutputStream();
//        final PipedInputStream input =new PipedInputStream(output);
        Thread thread1=new Thread(()->{
            try {
                output.write("hello piped".getBytes());

            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if(output!=null)
                        output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });

        Thread thread2=new Thread(()->{
            try {
                int data=input.read();
                while (data!=-1){
                    System.out.print((char)data);
                    data=input.read();
                }


            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                  if(input!=null) {
                    input.close();
                    }
                }catch (IOException e) {
                        e.printStackTrace();
                }
            }

        });
        thread1.start();
        thread2.start();

    }
}
