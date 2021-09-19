/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Randall Roberts
 */

// Write a program that takes in a length and width, calculates a ceiling area and
// determines how many paint buckets will be needed for the ceiling, and prints the result.

import java.util.Scanner;

public class Solution09
{
    public static final Scanner reader = new Scanner(System.in);
    public static final int gallonAmount = 350;

    public static void main(String[] args)
    {
        System.out.print("What is the length of your ceiling? ");
        int length = reader.nextInt();

        System.out.print("What is the width of your ceiling? ");
        int width = reader.nextInt();

        printNumGallons(length, width);
    }
    private static void printNumGallons(int length, int width)
    {
        int ceilArea = length * width;
        int numGallons = ceilArea / gallonAmount;

        if (ceilArea % gallonAmount != 0)
        {
            numGallons++;
        }
        System.out.print("You will need to purchase " + numGallons + " gallons of paint to cover " + ceilArea + " square feet.");
    }
}