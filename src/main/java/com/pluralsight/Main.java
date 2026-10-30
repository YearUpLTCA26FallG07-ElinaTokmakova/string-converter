package com.pluralsight;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu() {
        String originalText = Console.promptForString("Enter text you want to edit: ");
        int selectedOption;

        do {
            System.out.println("""
                    \n=== Text edit options ===
                    1 - remove whitespace from both ends
                    2 - change to upper case
                    3 - change to lower case
                    4 - replace a word
                    5 - add words
                    6 - exit an app
                    
                    """);

            selectedOption = Console.promptForInt("Select an option: ");

            switch (selectedOption) {
                case 1 -> {
                    String trimmedText = originalText.trim();
                    System.out.println("\nOriginal text: " + originalText);
                    System.out.println("Edited text: " + trimmedText);
                }
                case 2 -> {
                    String upperCaseText = originalText.toUpperCase();
                    System.out.println("\nOriginal text: " + originalText);
                    System.out.println("Upper case text: " + upperCaseText);
                }
                case 3 -> {
                    String lowerCaseText = originalText.toUpperCase();
                    System.out.println("\nOriginal text: " + originalText);
                    System.out.println("Lower case text: " + lowerCaseText);
                }
                case 4 -> {
                    String wordToReplace = Console.promptForString("Enter a word to find and replace: ");
                }
            }
        } while (selectedOption != 6);
    }
}
