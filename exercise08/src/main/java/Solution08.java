/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Randall Roberts
 */

// Write a program that takes in 3 integers to represent people and pizza slices, and splits
// each pizza slice evenly to give everyone an equal amount of pizza, and prints the results.

import java.util.Scanner;

public class Solution08
{
    public static final Scanner reader = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("How many people? ");
        int numPeople = reader.nextInt();

        System.out.print("How many pizzas do you have? ");
        int numPizzas = reader.nextInt();

        System.out.print("How many slices per pizza? ");
        int numPizzaSlices = reader.nextInt();

        processOutput(numPeople, numPizzas, numPizzaSlices);
    }
    private static void processOutput(int numPeople, int numPizzas, int numPizzaSlices)
    {
        System.out.println(numPeople + " people with " + numPizzas + " pizzas (" + (numPizzas * numPizzaSlices) + " slices)");

        int numPizzasLeftover = (numPizzas * numPizzaSlices) % numPeople;
        int numPizzasPerPerson = (numPizzas * numPizzaSlices) / numPeople;

        System.out.println("Each person gets " + numPizzasPerPerson + " pieces of pizza.");
        System.out.print("There are " + numPizzasLeftover + " leftover pieces.");
    }
}
