package com.company;

class MyThread1 extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++){
            System.out.println("----------------------------");
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++){
            System.out.println("||||||||||||||||||||||||||");
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1();
        MyThread2 obj2 = new MyThread2();

        obj1.start();
        obj2.start();
    }
}
