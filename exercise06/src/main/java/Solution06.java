import java.util.Calendar;
import java.util.Calendar;
import java.util.Scanner;

public class Solution06
{
    public static final Scanner reader = new Scanner(System.in);
    public static final int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    public static void main(String[] args)
    {
        System.out.print("What is your age? ");
        String age = reader.next();

        System.out.print("When would you like to retire? ");
        String retirementAge = reader.next();

        int numAge = Integer.parseInt(age);
        int numRetirementAge = Integer.parseInt(retirementAge);
        int ageDiff = numRetirementAge - numAge;

        System.out.println("You have " + ageDiff + " years until you can retire.");
        System.out.print("The year is " + currentYear + ", so you can retire in " + (currentYear + ageDiff) + ".");
    }
}