/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Randall Roberts
 */

// Write a program that has the user enter a character that decides whether the program calculates
// celsius -> fahrenheit, or fahrenheit -> celsius, and print the output

import java.util.Scanner;

public class Solution18
{
    private static final Scanner reader = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        String choice = reader.next();

        processChoice(choice);
    }
    private static void processChoice(String choice)
    {
        int temperature;

        if (choice.equalsIgnoreCase("c"))
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            temperature = reader.nextInt();
            temperature = (temperature - 32) * 5 / 9;
            System.out.print("The temperature in Celsius is " + temperature + ".");
        }
        else
        {
            System.out.print("Please enter the temperature in Celsius: ");
            temperature = reader.nextInt();
            temperature = (temperature * 9 / 5) + 32;
            System.out.print("The temperature in Fahrenheit is " + temperature + ".");
        }
    }
}