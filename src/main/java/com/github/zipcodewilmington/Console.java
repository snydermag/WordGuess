package com.github.zipcodewilmington;

import java.util.Scanner;

public class Console {
    public static Character getCharInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        char c = scanner.nextLine().charAt(0);
        return c;
    }


}
