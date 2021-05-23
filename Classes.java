package com.company;
import java.util.Random;
import java.util.Scanner;

//Exercise;

class Game{
    Random rand = new Random();
    int userInput;
    int numberOfGuesses = 1;
    int correctNumber = rand.nextInt(201);
    Scanner input = new Scanner(System.in);

    public void greet(){
        System.out.println("Hey! Welcome to Guess the Number Game!");
        System.out.println("The range is from 0 to 200.");
    }


    public void takeUserInput(){
        System.out.print("\nEnter your guessed number: ");
        userInput = input.nextInt();
    }

    public void isCorrectNumber(){
        for (int i = 1; i > 0; i++){

            takeUserInput();
            if (correctNumber > userInput){
                System.out.println(userInput+ " is a smaller number. Try a bigger one!");
                numberOfGuesses++;
                isCorrectNumber();
            }
            else if (correctNumber < userInput){
                System.out.println(userInput+ " is a bigger number. Try a smaller number!");
                numberOfGuesses++;
                isCorrectNumber();

            }
            else if (correctNumber == userInput){
                System.out.println("Woah! You guessed it correctly. Congratulations!");
                System.out.println("\nYou took " +numberOfGuesses+ " tries to guess the number which was " +correctNumber);

            }
            break;
        }
    }

    public void play(){
        greet();
        isCorrectNumber();
    }

}

public class Classes {
    public static void main(String[] args) {

        Game game = new Game();
        game.play();

    }
}
