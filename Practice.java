package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Practice {
    public static void main(String[] args) {

        //Practise Set 4;
        /*
        String string = "Hello how are you?";
        System.out.println(string.toLowerCase());
        System.out.println(string.replace(" ", "_"));

        //Scanner input = new Scanner(System.in);
        //System.out.print("Please enter your name: ");
        //String name = input.nextLine();
        String Problem3 = "Dear <|name|>, thanks a lot:)";
        System.out.println(Problem3.replace("<|name|>" , "Ankit"));

        String Problem4 = "This string   contains double and  triple   spaces.";
        System.out.println(Problem4.indexOf("  "));
        System.out.println(Problem4.indexOf("   "));

        System.out.println("\"Dear Harry, this Java course is nice\"");
         */


        //Practise Set 4;
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks scored in Subject1: ");
        int MarksScoredInSubject1 = input.nextInt();
        System.out.print("Enter maximum marks in Subject1 : ");
        int MaximumMarksinSubject1 = input.nextInt();
        float PercentageinSubject1 = ((MarksScoredInSubject1 * 100)/MaximumMarksinSubject1);
        boolean PassedInSubject1 = true;
        if (PercentageinSubject1 < 33){
            PassedInSubject1 = false;
        }

        System.out.print("\nEnter marks scored in Subject2: ");
        int MarksScoredInSubject2 = input.nextInt();
        System.out.print("Enter maximum marks in Subject2 : ");
        int MaximumMarksInSubject2 = input.nextInt();
        float PercentageinSubject2 = ((MarksScoredInSubject2 * 100)/MaximumMarksInSubject2);
        boolean PassedInSubject2 = true;
        if (PercentageinSubject2 < 33) {
            PassedInSubject2 = false;
        }

        System.out.print("\nEnter marks scored in Subject3: ");
        int MarksScoredInSubject3 = input.nextInt();
        System.out.print("Enter maximum marks in Subject3 : ");
        int MaximumMarksInSubject3 = input.nextInt();
        float PercentageinSubject3 = ((MarksScoredInSubject3 * 100)/MaximumMarksInSubject3);
        boolean PassedInSubject3 = true;
        if (PercentageinSubject3 < 33){
            PassedInSubject3 = false;
        }

        System.out.println("\nPercentage scored in Subject1: " +PercentageinSubject1+ "%!");
        System.out.println("Percentage scored in Subject2: " +PercentageinSubject2+ "%!");
        System.out.println("Percentage scored in Subject3: " +PercentageinSubject3+ "%!");

        int TotalScoredMarks = MarksScoredInSubject1 + MarksScoredInSubject2 + MarksScoredInSubject3;
        int TotalMaximumMarks = MaximumMarksinSubject1 + MaximumMarksInSubject2 + MaximumMarksInSubject3;
        float TotalPercentage = ((TotalScoredMarks * 100)/TotalMaximumMarks);
        if (PassedInSubject1 && PassedInSubject2 && PassedInSubject3 && TotalPercentage > 40){
            System.out.println("\nYou have passed the examinations with " +TotalPercentage+ "%!");
        }
        else{
            System.out.println("\nYou have failed the examinations!");
        }
         */

        //Question NO 3;
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your income in rupees: ");
        float income = input.nextFloat();

        float taxPercentage = 0;
        float taxPayable;

        if (income < 250000){
            taxPercentage = 0;
        }
        if (income >= 250000 && income < 500000){
            taxPercentage = 5;
        }
        if (income >= 500000 && income < 1000000){
            taxPercentage = 20;
        }
        if (income > 1000000){
            taxPercentage = 30;
        }

        taxPayable = ((income * taxPercentage)/100);

        float netIncome = income - taxPayable;

        System.out.println("You have to pay a tax of Rs " +taxPayable);
        System.out.println("Your net income is Rs " +netIncome);
         */

        //Problem 4;
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("The day is ");

        switch (number) {
            case 1 -> System.out.println("Monday.");
            case 2 -> System.out.println("Tuesday.");
            case 3 -> System.out.println("Wednesday.");
            case 4 -> System.out.println("Thursday.");
            case 5 -> System.out.println("Friday.");
            case 6 -> System.out.println("Saturday.");
            case 7 -> System.out.println("Sunday.");
            default -> System.out.println("Dude wth! Enter a number between 1-7!");
        }


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        if (year % 4 == 0){
            System.out.println("The year entered by you is a leap year");
        }
        else{
            System.out.println("The year entered by you is not a leap year");
        }



        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the name of the website: ");
        String websiteName = input.nextLine();

        if (websiteName.endsWith(".com")){
            System.out.println("It's a commercial website!");
        }
        if (websiteName.endsWith(".org")){
            System.out.println("It's an organisaation website!");
        }
        if (websiteName.endsWith(".in")){
            System.out.println("It's an Indian website!");
        }


        Random rand = new Random();
        int computerTurn = rand.nextInt(4);
        int player = 0;

        int playerScore = 0;
        int computerScore = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.print("Please enter your move: ");
            String playerTurn = input.nextLine();

            switch (playerTurn) {
                case "R" -> player = 1;
                case "P" -> player = 2;
                case "S" -> player = 3;
            }

            //1 -> Rock
            //2 -> Paper
            //3 -> scissors

            if (computerTurn == 1){
                switch (player) {
                    case 1 -> System.out.println("Player played Rock\nComputer played Rock\nROUND TIED!!");
                    case 2 -> {
                        System.out.println("Player played Paper\nComputer played Rock\nPlAYER WINS!!");
                        ++playerScore;
                    }
                    case 3 -> {
                        System.out.println("Player played Scissors\nComputer played Rock\nCOMPUTER WINS!!");
                        ++computerScore;
                    }
                }
            }

            if (computerTurn == 2){
                switch (player) {
                    case 1 -> {
                        System.out.println("Player played Rock\nComputer played Paper\nCOMPUTER WINS!!");
                        ++computerScore;
                    }
                    case 2 -> System.out.println("Player played Paper\nComputer played Paper\nROUND TIED!!");
                    case 3 -> {
                        System.out.println("Player played Scissors\nComputer played Paper\nPLAYER WINS!!");
                        ++playerScore;
                    }
                }
            }

            if (computerTurn == 3){
                switch (player) {
                    case 1 -> {
                        System.out.println("Player played Rock\nComputer played Scissors\n");
                        ++playerScore;
                    }
                    case 2 -> {
                        System.out.println("Player played Paper\nComputer played Scissors\nCOMPUTER WINS!!");
                        ++computerScore;
                    }
                    case 3 -> System.out.println("Player played Scissors\nComputer played Scissors\nROUND TIED!!");
                }
            }

            System.out.println("PLAYER'S SCORE: " +playerScore+ "\nCOMPUTER SCORE: " +computerScore+ "\n");


        }

        if  (playerScore == computerScore){
            System.out.println("ROUND TIED! TRY AGAIN!!");
        }
        if (playerScore > computerScore){
            System.out.println("CONGRATULATIONS! YOU WIN!!");
        }
        if (computerScore > playerScore){
            System.out.println("OOPS! COMPUTER WINS! HARD LUCK!!");
        }





        int n;
        int sum = 0;

        for (int i = 1; i <= 10 ; i++){
            sum += i;
        }

        System.out.println(sum);

        n = 10;
        for (int j = 10; j >=1; j--){
            System.out.println(n+ " x " +j+ " = " +(n * j));
        }

        int factorial = 5;
        int answer = 1;
        for( int k = factorial; k >= 1; k--){
            answer *= k;
        }
        System.out.println(answer);

        int a = 9;
        int Answer = 1;

        while(a >= 1){
            Answer *= a;
            a--;
        }
        System.out.println(Answer);


        int n = 4;

        for (int i = n; i > 0 ; i--){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        int j = n;
        int k = 0;
        while (j > 0){
            while(k < j){
                System.out.print("*");
                k++;
            }
            System.out.print("\n");
            j--;
        }

        int sum = 0;

        for (int i = 1; i <= 10; i++){
            
        }



         */



        for (int i = 0; i < 100; i++){
            System.out.println("@mohitandani#5448");
        }




    }

}
