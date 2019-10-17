import java.util.Scanner;

public class Year
{
    public static void isLeapyear()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year = scan.nextInt();
        
        if ((year % 400 == 0) || ((year % 4 == 0) && !(year % 100 == 0)))
        {
            System.out.println("This year is a leap year.");
        }
        else
        {
            System.out.println("This year is not a leap year.");
        }
    }
}