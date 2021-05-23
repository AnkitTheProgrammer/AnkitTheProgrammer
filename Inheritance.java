package com.company;

class Circle{
    double area;
    double volume;

    public void area(double radius){
        area = Math.PI * radius * radius;
    }

    public void volume(double radius){
        //volume = Math;
    }
}

class Cylinder extends Circle{

}

class Base{
    int x;

    public void setX(int x){
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
    public int getX(){
        return x;
    }

    public void print(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY(){
        return y;
    }

    public void setY(int y){
        System.out.println("I am in Derived and setting x now");
        this.y = y;
    }

}

class Base1{
    Base1(){
        System.out.println("I am a constructor of base 1.");
    }

    Base1(int x){
        System.out.println("The value of x is " +x);
    }

}
/*
class Derived1 extends Base1{
    Derived1(){
        //super(0);
        System.out.println("I am a constructor of derived 1.");
    }

    Derived1 (int x, int y){
        super(x);
        System.out.println("The value of y is " +y);
    }
}

class DerivedByDerived1 extends Derived1{
    DerivedByDerived1(){
        System.out.println("I am a constructor of DerivedByDerived1");
    }

    DerivedByDerived1(int x, int y, int z){
        super(x,y);
        System.out.println("The value of z is " +z);
    }

}

// Method Over-riding;

class A{
    public void method(){
        System.out.println("I am method of Class A");
    }
}

class B extends A{
    //@Override
    public void method(){
        System.out.println("I am method of class B");
    }
}

public class Inheritance {
    public static void main(String[] args) {

       // Derived b = new Derived();
       // b.setX(4);
       // System.out.println(b.getX());

        //Derived a = new Derived();
        //a.setY(6);
        //System.out.println(a.getY());

        //Base1 x = new Base1();
        //Derived1 y =  new Derived1();
        //Derived1 z = new Derived1(2, 8);
        DerivedByDerived1 x = new DerivedByDerived1(23,15,7);

        //When constructors for both base and derived class are created,
        //first base class' constructor will run and then derived one's will run

        System.out.println();

        A a = new A();
        a.method();

        B b = new B();
        b.method();



    }
}


 */
