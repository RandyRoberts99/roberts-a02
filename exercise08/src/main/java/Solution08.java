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

        System.out.println(numPeople + " people with " + numPizzas + " pizzas (" + (numPizzas * numPizzaSlices) + " slices)");

        int numPizzasLeftover = (numPizzas * numPizzaSlices) % numPeople;
        int numPizzasPerPerson = (numPizzas * numPizzaSlices) / numPeople;

        System.out.println("Each person gets " + numPizzasPerPerson + " pieces of pizza.");
        System.out.print("There are " + numPizzasLeftover + " leftover pieces.");
    }
}
