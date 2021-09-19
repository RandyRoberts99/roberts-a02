import java.util.Scanner;

public class Solution21
{
    private static final Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Please enter the number of the month: ");
        int monthNum = reader.nextInt();
        String monthString;
        switch (monthNum)
        {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid";
                break;
        }
        System.out.print("The name of the month is " + monthString + ".");
    }
}