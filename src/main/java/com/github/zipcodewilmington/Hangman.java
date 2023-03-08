package com.github.zipcodewilmington;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Uyen Le
 * @version 1.0.0
 * @date 3.6.23
 */
public class Hangman {
    public static void main(String[] args){
        String[] words = {"sushi", "fries", "tacos", "chips", "pizza"};

        int attempts = 10;
        int lengthWord;
        boolean solved;
        Scanner keyboard;
        String guess;

        System.out.println("Welcome to Hangman where the category is Takeout Foods");
//        getting random index
//        Random rand = new Random();
//        Integer correct = rand.nextInt(4);

//      getting input guess
        keyboard = new Scanner(System.in);
        System.out.println("Please enter a letter. You will have 8 attempts");
        guess = keyboard.next();

        for (int i =1; i<=5; i++){
//            word length
            for (int j =0; j < 5; j++) {


            }
//            attempts left
            while (attempts <=10 && attempts > 0) {
                System.out.println("\nAttempts left: " + attempts);
                System.out.print("Enter letter: ");

                attempts--;
            }
        }

    }
}
