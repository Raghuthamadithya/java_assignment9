package controlStatements;

import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {

        Random random=new Random();
        Scanner input = new Scanner(System.in);
        int number;
        int randomNumber;
        int guess=0;

        boolean guessedNumber=false;

        randomNumber= random.nextInt(100)+1;
        while(!guessedNumber)
        {
            System.out.println("Enter your integer guess");
            number= input.nextInt();
            guess++;
            if(number>=1 && number<=100) {
                if (number == randomNumber)
                {
                    System.out.println("Congratulations! You guessed the number in "+ guess + " guesses!  Thanks for playing!");
                    guessedNumber=true;
                }
                else if (number > randomNumber) {
                    System.out.println("Your guess is too high!");

                }
                else
                {
                    System.out.println("Your guess is too low!");

                }
            }
            else
            {
                System.out.println("That was a wasted guess! You must pick a number between 1 and 100, inclusive!");
            }
        }
    }
}
