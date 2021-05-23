package com.company;

class MyThreadRunnable1 implements java.lang.Runnable {
    public void run(){
        for (int i = 0; i < 10000; i++){
            System.out.println("----------------------");
        }
    }
}

class MyThreadRunnable2 implements java.lang.Runnable {
    public void run(){
        for (int i = 0; i < 10000; i++){
            System.out.println("||||||||||||||||||||||");
        }
    }
}

public class Runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 obj1 = new MyThreadRunnable1();
        Thread object1 = new Thread(obj1);

        MyThreadRunnable2 obj2 = new MyThreadRunnable2();
        Thread object2 = new Thread(obj2);

        object1.start();
        object2.start();
    }
}
