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

        int area = length * width;
        System.out.println("You entered the dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is\n" + area + " square feet");

        float squareMeterArea = area * conversionFactor;
        System.out.printf("%1.3f square meters", squareMeterArea);
    }
}