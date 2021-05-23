package com.company;

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class fountainPen extends Pen{
    public void write(){
        System.out.println("Writing...");
    }

    public void refill(){
        System.out.println("Refilling...");
    }

    void changeNib(){
        System.out.println("Changing nib...");
    }
}

class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }

    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("Eating...");
    }

    @Override
    public void sleep(){
        System.out.println("Sleeping...");
    }

    void speak(){
        System.out.println("Speaking...");
    }
}

interface Telephone{
    void lift();
    void disconnected();
}

class smartPhone implements Telephone{
    public void lift(){
        System.out.println("Lifting...");
    }

    public void disconnected(){
        System.out.println("Disconnecting...");
    }
}

public class Practise_Abstract_Interfaces {
    public static void main(String[] args) {

    }
}
