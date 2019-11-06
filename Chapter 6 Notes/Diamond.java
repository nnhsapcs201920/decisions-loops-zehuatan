import java.util.Scanner;

public class Diamond
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int side = scan.nextInt();
        
        for (int i = 1; i <= side; i++)
        {
            //side - i = spaces
            //2i - 1 = asterisks
            for (int j = 1; j <= side - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++)
            {
                System.out.print("*");
            }
            for (int j = 1; j <= side - i; j++)
            {
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        for (int i = side - 1; i >= 1; i--)
        {
            for (int j = 1; j <= side - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++)
            {
                System.out.print("*");
            }
            for (int j = 1; j <= side - i; j++)
            {
                System.out.print(" ");
            }
            System.out.println("");
        }
        
    }
}