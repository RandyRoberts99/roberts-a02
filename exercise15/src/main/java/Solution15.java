import java.util.Scanner;

public class Solution15
{
    private static final Scanner reader = new Scanner(System.in);
    private static final String password = "abc$123";

    public static void main(String[] args)
    {
        System.out.print("What's the password: ");
        String userPassword = reader.next();

        userPassword = userPassword.toLowerCase();

        if (userPassword.equals(password))
        {
            System.out.print("Welcome!");
        }
        else
        {
            System.out.print("I don’t know you.");
        }
    }
}
