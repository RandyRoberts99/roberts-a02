/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Randall Roberts
 */

//  Write a program that takes in several factors as different variables, and uses them to calculate the BAC
// of the user and print the result as a comparison.

import java.util.Scanner;

public class Solution17
{
    private static final Scanner reader = new Scanner(System.in);

    public static void main(String[] args)
    {
        int gender = getInt("Enter a 1 is you are male or a 2 if you are female: ");

        double alcoholRatio;

        if (gender == 1)
        {
            alcoholRatio = 0.73;
        }
        else
        {
            alcoholRatio = 0.66;
        }
        int alcoholAmount = getInt("How many ounces of alcohol did you have? ");

        int weight = getInt("What is your weight, in pounds? ");

        int hoursSinceLastDrink = getInt("How many hours has it been since your last drink? ");

        processBAC(alcoholAmount, weight, alcoholRatio, hoursSinceLastDrink);
    }

    private static int getInt(String input)
    {
        boolean notNumber = true;
        String userInput;
        int userInt = 0;

        while (notNumber)
        {
            System.out.print(input);
            userInput = reader.next();
            try
            {
                userInt = Integer.parseInt(userInput);
                notNumber = false;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Enter a valid number!");
                userInt = 0;
            }
        }
        return userInt;
    }
    private static void processBAC(int alcoholAmount, int weight, double alcoholRatio, int hoursSinceLastDrink)
    {
        double bac = (alcoholAmount * 5.14 / weight * alcoholRatio) - .015 * hoursSinceLastDrink;

        System.out.print("Your BAC is " + String.format("%.6f", bac));
        System.out.print(bac >= 0.08 ? "\nIt is not legal for you to drive." : "\nIt is legal for you to drive.");
    }
}