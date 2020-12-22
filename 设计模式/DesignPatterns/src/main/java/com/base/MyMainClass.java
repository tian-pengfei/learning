package com.base;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class OuterClass {
    int x = 10;

    public void printSomething(int z){

        class InnerClass implements ActionListener {
            int y = 5;
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(x+z);
            }
        }
        InnerClass innerClass=new InnerClass();
        Timer t = new Timer(1000, innerClass);

        t.start();

    }

}

public class MyMainClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        myOuter.printSomething(10);
    }
}