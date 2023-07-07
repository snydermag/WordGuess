package com.github.zipcodewilmington;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 *
 * Additional code by: Maggie Snyder
 *
 */
public class Hangman {

    public static void main(String[] args){
        StringBuilder tempWord = new StringBuilder();
        boolean currGame = true;
        boolean runGame = true;
        char contPlay;

        // Print game name
        System.out.println("Let's play Wordguess Version 2.0");

        // Game is currently running
        while (runGame){
            String word = getRandom();
            char[] correctWord = new char[word.length()];
            char[] guessWord = new char[word.length()];
            int numGuesses = word.length();

            // Build character array of the word to be guessed
            for (int i = 0; i < word.length(); i++){
                correctWord[i] = word.charAt(i);
            }

            // Build character array for the current guess
            for (int i = 0; i < word.length(); i++){
                guessWord[i] = '_';
            }

            // Current word is being guessed
            while (currGame) {
                char guess;
                System.out.println("\nCurrent Guesses:");

                // Print out the current guess
                for (int i = 0; i < word.length(); i++) {
                    if (i == word.length() - 1) {
                        System.out.println(guessWord[i]);
                    } else {
                        System.out.print(guessWord[i] + " ");
                    }
                }

                System.out.printf("You have %d guesses remaining.\n\n", numGuesses);

                // User Guess Input
                guess = Console.getCharInput("Enter a single character (enter '-' to stop the current game):");

                // If user enters '-', quit the current game.
                if (guess == '-'){
                    break;
                }

                // Test to see if guess is in word
                // If so, replace the character
                for (int i = 0; i < word.length(); i++) {
                    if (correctWord[i] == guess) {
                        guessWord[i] = guess;
                    }
                }

                // Reduce number of guesses by 1
                numGuesses--;

                // If the word has been guessed, end game
                tempWord.setLength(0);  // Resets tempWord to 0

                for (int i = 0; i < word.length(); i++){    // Builds tempWord to be the current guess
                    tempWord.append(guessWord[i]);
                }

                int index = tempWord.indexOf("_");  // Searches for _ within the guessing word

                // If user has guessed the word, end the game
                if (index == -1) {
                    System.out.println("Congrats! You guessed the word. It was " + word + ".");
                    currGame = false;
                }

                // If user has run out of guesses without guessing the word
                if ((numGuesses == 0) && (index >= 0)) {
                    System.out.println("\nThe word was " + word + ".");
                    System.out.println("You didn't guess the word. You have failed.");
                    break;
                }
            }

            // See if the player would like to play again
            System.out.println("\nWould you like to play again?");
            contPlay = Console.getCharInput("Enter 'y' to play again. Enter any other character to quit.");

            if (contPlay == 'y'){
                currGame = true;
            }
            else {
                runGame = false;
            }
        }
    }

    public static String getRandom(){
        Random rand = new Random();
        ArrayList<String> words = new ArrayList<>();

        words.add("easy");
        words.add("thorough");
        words.add("penguin");
        words.add("puddle");
        words.add("heaven");
        words.add("zoology");
        words.add("spirit");
        words.add("balance");
        words.add("mundane");
        words.add("network");
        words.add("parallel");
        words.add("juice");
        words.add("application");
        words.add("calculator");

        int x = rand.nextInt(words.size() - 1);

        return words.get(x);
    }


}
