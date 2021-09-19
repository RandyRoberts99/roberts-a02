import java.util.Scanner;

public class Solution19
{
    private static final Scanner reader = new Scanner(System.in);

    public static void main(String[] args)
    {
        double weight = getDouble("What is your weight? ");

        double height = getDouble("What is your height? (In Inches) ");

        double bmi = (weight / (height * height)) * 703;

        System.out.print("Your BMI is " + String.format("%.1f", bmi));
        if (bmi > 25)
        {
            System.out.print("\nYou are overweight. You should see your doctor.");
        }
        else if (bmi < 18.5)
        {
            System.out.print("\nYou are underweight. You should see your doctor.");
        }
        else
        {
            System.out.print("\nYou are within the ideal weight range.");
        }
    }
    private static double getDouble(String input)
    {
        boolean notNumber = true;
        String userInput;
        double userDouble = 0;

        while (notNumber)
        {
            System.out.print(input);
            userInput = reader.next();
            try
            {
                userDouble = Double.parseDouble(userInput);
                notNumber = false;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Enter a valid number!");
                userDouble = 0;
            }
        }
        return userDouble;
    }
}