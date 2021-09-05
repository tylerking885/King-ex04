/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Tyler King
 */

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();
        System.out.print("Enter a verb: ");
        String verb = input.nextLine();
        System.out.print("Enter a adjective: ");
        String adjective = input.nextLine();
        System.out.print("Enter a adverb: ");
        String adverb = input.nextLine();
        System.out.print("The " + adjective + " " + noun + " is " + verb + " rather " + adverb + ".");
    }
}
