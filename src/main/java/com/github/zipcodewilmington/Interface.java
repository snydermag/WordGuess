package com.github.zipcodewilmington;


public class Interface {

    public static void printMainMenu(){
        System.out.println(" Welcome to Hangman");
        System.out.println("1 - Play Game");
        System.out.println("2 - View Word Bank");
        System.out.println("3 - Add new word to Word Bank");

    }



    public static void printHanger(int guessCount) {

        if (guessCount == 0) {
            System.out.println("_______________");
            System.out.println("|             |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if (guessCount == 1){
            System.out.println("_______________");
            System.out.println("|             |");
            System.out.println("|           (-_-)");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");

        }
        else if (guessCount == 2) {
            System.out.println("_______________");
            System.out.println("|             |");
            System.out.println("|           (-_-)");
            System.out.println("|             |");
            System.out.println("|             |");
            System.out.println("|");
            System.out.println("|");
        }
        else if (guessCount == 3) {
            System.out.println("_______________");
            System.out.println("|             |");
            System.out.println("|           (-_-)");
            System.out.println("|            /|");
            System.out.println("|             |");
            System.out.println("|");
            System.out.println("|");
        }
        else if (guessCount == 4) {
            System.out.println("_______________");
            System.out.println("|             |");
            System.out.println("|           (-_-)");
            System.out.println("|            /|\\");
            System.out.println("|             |");
            System.out.println("|");
            System.out.println("|");
        }
        else if (guessCount == 5) {
            System.out.println("_______________");
            System.out.println("|             |");
            System.out.println("|           (-_-)");
            System.out.println("|            /|\\");
            System.out.println("|             |");
            System.out.println("|            /");
            System.out.println("|");
        }
        else if (guessCount == 6) {
            System.out.println("_______________");
            System.out.println("|             |");
            System.out.println("|           (x_x)");
            System.out.println("|            /|\\");
            System.out.println("|             |");
            System.out.println("|            / \\");
            System.out.println("|");
        }

    }

}
