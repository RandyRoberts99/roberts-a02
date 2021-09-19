/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Randall Roberts
 */

// Write a program that takes three integers and compares them to see which one is the largest, and if they are all
// similar/different. The program will then create an output according to the information it finds and print.

import java.util.Scanner;

public class Solution22
{
    private static final Scanner reader = new Scanner(System.in);

    public static void main(String[] args)
    {
        int numDifferences = 0;
        int largest;
        System.out.print("Enter the first number: ");
        int firstNum = reader.nextInt();
        largest = firstNum;

        System.out.print("Enter the second number: ");
        int secondNum = reader.nextInt();
        if (secondNum > largest)
        {
            largest = secondNum;
        }

        System.out.print("Enter the third number: ");
        int thirdNum = reader.nextInt();
        if (thirdNum > largest)
        {
            largest = thirdNum;
        }
        if (firstNum == secondNum || firstNum == thirdNum || secondNum == thirdNum)
        {
            System.exit(0);
        }
        else
        {
            System.out.print("The largest number is " + largest + ".");
        }
    }
}