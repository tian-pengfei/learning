package com.base;

class OuterClass {
    int x = 10;

    public void printSomething(int z){
      int z=11;
        class InnerClass {
            int y = 5;
            public void printSomething(){
                System.out.println(x+z);
            }
        }
        InnerClass innerClass=new InnerClass();
        innerClass.printSomething();

    }

}

public class MyMainClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        myOuter.printSomething(10);
    }
}