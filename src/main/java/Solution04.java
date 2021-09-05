/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution 04
 * Copyright 2021 Tyler King
 */

import java.util.Scanner;                               // Import declaration for class scanner;

public class Solution04 {
    public static void main(String[] args) {            // Main method;
        Scanner input = new Scanner(System.in);         // Enable program to read User data;
        System.out.print("Enter a noun: ");             // Prompt User for a noun;
        String noun = input.nextLine();                 // Set User input to the noun String variable;
        System.out.print("Enter a verb: ");             // Prompt User for a verb;
        String verb = input.nextLine();                 // Set User input to the verb String variable;
        System.out.print("Enter an adjective: ");       // Prompt User for an adjective;
        String adjective = input.nextLine();            // Set User input to the adjective String variable;
        System.out.print("Enter an adverb: ");          // Prompt user for an adverb;
        String adverb = input.nextLine();               // Set user input to the adverb String variable;
        System.out.print("The " + adjective + " " + noun + " is " + verb + " rather " + adverb + "."); // Printed output
    }
}
