package com.company;
import java.util.Random;
import java.util.Scanner;

class MyEmployee{
    private int id;
    private String name;

    public void setName(String Name){
        name = Name;
    }

    public String getName(){
        return name;
    }

    public void setId(int ID){
        id = ID;
    }

    public MyEmployee(){
        id = 80;
        name = "An employee!";
    }

    public MyEmployee(String Myname){
        name = Myname;
        id = 60;
    }

    public int getId(){
        return id;
    }

    public MyEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }

    //Exercise;

    class Cylinder{
        private float radius;
        private float height;
        Scanner input = new Scanner(System.in);

        public Cylinder(int radius, int height){
            this.radius = radius;
            this.height = height;
        }

    }

}

public class Modifiers_Constructors{
    public static void main(String[] args) {


    }
}