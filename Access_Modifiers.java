package com.company;

class Modifiers{
    public int x = 5;
    protected int y = 69;
    int z = 9;
    private int a = 40;

    public void method1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class Access_Modifiers {
    public static void main(String[] args) {
        Modifiers obj = new Modifiers();
        obj.method1();

        System.out.println();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
        //System.out.println(obj.a);
    }
}
