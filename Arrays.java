package com.company;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        /*int [] intArray = {23,98,71,43,88,19};
        intArray[2] = 69;
        System.out.println(intArray[2]);
        System.out.println(intArray.length);

        float [] floatArray = {12.5f, 98.7f, 10, 19, 62};
        System.out.println(floatArray[0]);

        String [] stringArray = {"Ankit", "Charlie", "Alan", "Jake", "Judith", "Berta"};
        System.out.println(stringArray[3]);

        for (int i = 0; i < floatArray.length; i++){
            System.out.println(floatArray[i]);
        }

        for (int j = 0; j < stringArray.length; j++){
            System.out.println(stringArray[j]);
        }

        for (int k = intArray.length -1; k >= 0; k--){
            System.out.println(intArray[k]);
        }

        //Multidimensional Array;
        int [][] multidimensionalArray;
        multidimensionalArray = new int [2][3];

        multidimensionalArray[0][0] = 101;
        multidimensionalArray[0][1] = 102;
        multidimensionalArray[0][2] = 103;
        multidimensionalArray[1][0] = 201;
        multidimensionalArray[1][1] = 202;
        multidimensionalArray[1][2] = 203;

        for (int i = 0; i < multidimensionalArray.length; i++){
            for (int j = 0; j<multidimensionalArray[i].length; j++){
                System.out.print(multidimensionalArray[i][j]);
                System.out.print(" ");

            }
            System.out.println();
        }



        float [] floatArray = {12.5f, 9.7f, 1.9f, 9.8f, 13.4f};
        float sum = 0;

        for (int i = 0; i < floatArray.length; i++){
            sum += floatArray[i];
        }

        System.out.println(sum);

        int [] intArray = {1,19,4,39,61,70};
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check whether it is present in the array or not: ");
        int n = input.nextInt();

        boolean isInArray = false;

        for (int element:intArray){
            if (n == element){
                isInArray = true;
                System.out.println("Yes, " +n+ " is present in the array!");
                break;
            }
            else{
                System.out.println("No, " +n+ " is not present in the array!");
                break;
            }
        }



        int [] physicsMarks = {91, 87, 90, 83,92};
        int lengthofArray = physicsMarks.length;
        float sumOfArray = 0;
        float average;

        for (int i = 0; i < lengthofArray; i++){
            sumOfArray += physicsMarks[i];
        }

        average = sumOfArray / lengthofArray;
        System.out.println("The average of " +lengthofArray+ " marks is " +average);




        int sum = 0;
        int [][] multidimensionalArray;
        multidimensionalArray = new int [2][3];
        multidimensionalArray[0][0] = 100;
        multidimensionalArray[0][1] = 200;
        multidimensionalArray[0][2] = 300;
        multidimensionalArray[1][0] = 400;
        multidimensionalArray[1][1] = 500;
        multidimensionalArray[1][2] = 600;

        for (int i = 0; i < multidimensionalArray.length; i++){
            for (int j = 0; j < multidimensionalArray[i].length; j++){
                sum += multidimensionalArray[i][j];
            }
        }

        System.out.println("The sum is " +sum);

         */

        // Practice Problem 4
        // Practice Problem 4
        int [][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                {0, 0, 0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }

    }
}
