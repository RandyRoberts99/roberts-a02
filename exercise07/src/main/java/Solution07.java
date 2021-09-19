/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Randall Roberts
 */

// Write a program that takes in a length and width, and calculates an area in both feet and meters, and prints both

import java.util.Scanner;

public class Solution07
{
    public static final Scanner reader = new Scanner(System.in);
    public static final float conversionFactor = 0.09290304f;

    public static void main(String[] args)
    {
        System.out.print("What is the length of the room in feet? ");
        int length = reader.nextInt();

        System.out.print("What is the width of the room in feet? ");
        int width = reader.nextInt();

        getAreas(length, width);
    }
    private static void getAreas(int length, int width)
    {
        int area = length * width;
        System.out.println("You entered the dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is\n" + area + " square feet");

        float squareMeterArea = area * conversionFactor;
        System.out.printf("%1.3f square meters", squareMeterArea);
    }
}