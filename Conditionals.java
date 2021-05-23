package com.company;

public class Conditionals {
    public static void main(String[] args) {
        int age = 18;

        if (age >= 18){
            System.out.println("You are eligible to drive!");
        }

        else{
            System.out.println("You are not eligible to drive yet!");
        }

        String string = "Hardik";
        /*This is a regular switch

        switch(string){
            case "Ankit":
                System.out.println("Hey Ankit, wassup?");
                break;

            case "Harry":
                System.out.println("Hey Harry, how are you?");
                break;

            case "Rohit":
                System.out.println("Hey Rohit, how you doin'?");
                break;

            default:
                System.out.println("Oh hello Stranger!");
                break;
        }*/


        //This is an enhanced switch
        switch (string) {
            case "Ankit" -> System.out.println("Hey Ankit, wassup?");
            case "Harry" -> System.out.println("Hey Harry, how are you?");
            case "Rohit" -> System.out.println("Hey Rohit, how you doin'?");
            default -> System.out.println("Oh hello Stranger!");
        }
    }

}
