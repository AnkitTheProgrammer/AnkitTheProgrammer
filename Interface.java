package com.company;

interface Bicycle{
    int a = 69;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface BicycleHorn{
    void blowHorn1();
    void blowHorn2();
}

class AvonCycle implements Bicycle, BicycleHorn{
    public void applyBrake(int decrement){
        System.out.println("Applying Brakes...");
    }

    public void speedUp(int increment){
        System.out.println("Speeding up...");
    }

    void blowHorn(){
        System.out.println("Blowing Horn...");
    }

    public void blowHorn1(){
        System.out.println("Blowing Horn 1...");
    }

    public void blowHorn2(){
        System.out.println("Blowing Horn 2...");
    }
}

interface sampleInterface{
    void method1();
    void method2();
}

interface derivedSampleInterface extends sampleInterface{
    void method3();
    void method4();
}

class MySampleClass implements derivedSampleInterface{
    public void method1(){
        System.out.println("I am method #1");
    }

    public void method2(){
        System.out.println("I am method #2");
    }

    public void method3(){
        System.out.println("I am mmethod #3");
    }

    public void method4(){
        System.out.println("I am mmethod #4");
    }
}

public class Interface {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(40);
        System.out.println(cycle.a);

        AvonCycle horn = new AvonCycle();
        horn.blowHorn();
        horn.blowHorn1();
        horn.blowHorn2();

    }
}
