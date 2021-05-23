package com.company;

import java.util.Scanner;
//import org.apache.commons.lang3.ArrayUtils;

class One{
    public void greet(){
        System.out.println("Hello, how are you?");
    }

    public void name(){
        System.out.println("This is class One method");
    }
}

class Two extends One{
    public void welcome(){
        System.out.println("Hey, how are you doing?");
    }

    @Override
    public void name(){
        System.out.println("This is class two method");
    }
}


public class Methods {
    static void greet(){
        System.out.println("Hello, how are you?");
    }

    static void greet(int a){
        System.out.println("Hey, how are you?");
    }

    static void greet(int x, int y){
        System.out.println("How are you doing today? ");
    }

    static int logic(int x, int y){
        int c;
        if (x > y){
            c = x - y;
        }
        else{
            c = x * y;
        }
        return c;
    }

    static int sum(int ...arr){
        int answer = 0;
        for (int a: arr){
            answer += a;
        }
        return answer;
    }

    //Compulsary arguments;
    static int add(int x, int y, int ...arr){
        int result = x + y;
        for (int a: arr){
            result += a;
        }
        return result;
    }

    static void change(int [] arr){
        arr[0] = 10;
    }

    static int factorial (int n){
        //factorial(n) = n * factorial(n-1);
        if (n == 0 || n == 1){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }

    //Practise questions;

    static int fibonacci (int n){
        if (n == 1){
            return 0;
        }
        if (n == 2){
            return 1;
        }
        else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    static void multiplication(int n){
        for (int i = 1; i <= 10; i++){
            System.out.println(n+ " x " +i+ " = " +(n * i));
        }
    }

    static void starsAscending (int n){
        for (int i = 1; i <= n ; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static int sumOfNaturalNumbers (int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    static void starsDescending (int n){
        for (int i = n; i > 0 ; i--){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static float average (int ...arr){
        float answer = 0;
        for (int a: arr){
            answer += a;
        }
        answer = answer/arr.length;
        return answer;
    }

    static float celciusToFarheniet(float celcius){
        float farheniet = (((9 * celcius)/5)+32);
        return farheniet;
    }

    static void multiply (int n){
        for (int i = 1; i <= 10; i++){
            System.out.format("%d x %d = %d\n",n,i,(n*i));
        }
    }

    public static void main(String[] args) {
        greet();
        int a = 7;
        int b = 8;
        int f = logic(a,b);
        System.out.println(f);

        int x = 20;
        int y = 19;
        int z = logic(x,y);
        System.out.println(z);

        greet();

        int [] array = {12,71,90,46,88};
        change(array);
        System.out.println(array[0]);

        greet();
        greet(2);
        greet(1,2);

        System.out.println(sum(1,3,9,8));
        System.out.println(sum(9,6,2,7,1,10,3,6));
        System.out.println(sum());

        System.out.println(add(2,5));
        System.out.println(add(7,2,9,1,4,8,3,2,7));

        int n = 4;
        System.out.println(factorial(n));

        System.out.println(fibonacci(9));
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));

        multiplication(5);

        starsAscending(5);

        System.out.println(sumOfNaturalNumbers(10));

        starsDescending(5);

        System.out.println("The average is " +average(10,20,30,40,10));

        System.out.println(celciusToFarheniet(0)+ "F");

        multiply(5);

        One object = new Two();
        //Two obj = new One();

    }
}
