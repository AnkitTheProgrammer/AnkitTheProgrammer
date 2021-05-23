package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //String name = new String("Ankit");
        String name = "Ankit";
        System.out.println(name);

        int a = 7;
        float b = 8.766135f;
        System.out.printf("The value of a is %d and the value of b is %.2f", a, b);

        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease enter your name: ");
        String StringInput = input.nextLine();
        System.out.println("Have a nice day " +StringInput);
    }
}
