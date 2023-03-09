package com.github.zipcodewilmington;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Uyen Le
 * @version 1.0.0
 * @date 3.6.23
 */
public class Hangman {
    public static void main(String[] args) {
        String[] words = {"sushi", "fries", "tacos", "chips", "pizza"};

        int attempts = 5;
        int lengthWord;
        Scanner keyboard;
        String guess;
        String chosen = "";
        String[] currentG = new String[]{"_", "_","_","_","_"};

        System.out.println("Welcome to Hangman where the category is Takeout Foods");
//        getting random index and chooses words from word bank
        Random rand = new Random();
        Integer chosenIndex = rand.nextInt(attempts - 1);
        chosen = words[chosenIndex];

//      getting input guess
        keyboard = new Scanner(System.in);
        System.out.println("Please enter a character. You will have 5 attempts.");
        guess = keyboard.next();

        while (attempts <= 5 && attempts > 0) {
            for (int i = 0; i < chosen.length(); i++) {
                char currentChar = chosen.charAt(i);
                char guessChar = guess.charAt(0);
                if (currentChar == guessChar) {
                    currentG[i] = guess;
                }
            }
            for (String currentString : currentG) {
                System.out.print(currentString);
            }
            System.out.println("\nAttempts left: " + attempts);
            System.out.print("Enter character: ");
            guess = keyboard.next();
            attempts--;
        }
        ArrayList<String> currentList = (ArrayList<String>) Arrays.asList(currentG);
           if (currentList.contains("_")) {
            System.out.print("Incorrect guesses, all attempts used. Here are your guesses.");
            for (String currentString : currentG) {
                System.out.print(currentString);
            }
        } else {
            System.out.print("Good job! You guessed correctly!");
            for (String currentString : currentG) {
                System.out.print(currentString);
            }
        }
    }
}
