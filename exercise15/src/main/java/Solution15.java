/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Randall Roberts
 */

// Write a program that takes in a password, and compares it to the actual password,
// and prints an outcome based on the comparison.

import java.util.Scanner;

public class Solution15
{
    private static final Scanner reader = new Scanner(System.in);
    private static final String password = "abc$123";

    public static void main(String[] args)
    {
        System.out.print("What's the password: ");
        String userPassword = reader.next();

        checkAndPrintOutcome(userPassword);
    }
    private static void checkAndPrintOutcome(String userPassword)
    {
        userPassword = userPassword.toLowerCase();

        if (userPassword.equals(password))
        {
            System.out.print("Welcome!");
        }
        else
        {
            System.out.print("I don’t know you.");
        }
    }
}
