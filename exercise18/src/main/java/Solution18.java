import java.util.Scanner;

public class Solution18
{
    private static final Scanner reader = new Scanner(System.in);

    public static void main(String[] args)
    {
        int temperature;
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        String choice = reader.next();
        if (choice.equals("C") || choice.equals("c"))
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