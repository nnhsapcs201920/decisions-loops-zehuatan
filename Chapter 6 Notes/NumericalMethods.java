import java.util.Scanner;
public class NumericalMethods
{
    public static void fibonacciNumber()
    {
        Scanner scan = new Scanner(System.in);
        int fold1 = 1;
        int fold2 = 1;
        int fnew = 1;
        
        System.out.println("Please enter an integer: ");
        int n = scan.nextInt();
        for (int i = 0; i < n - 2; i++)
        {
            fnew = fold1 + fold2;
            fold2 = fold1;
            fold1 = fnew;
        
        }
        System.out.println("The " + n + "th Fibonacci number is: " + fnew);
    }
}