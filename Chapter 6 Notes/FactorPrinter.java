import java.util.Scanner;

public class FactorPrinter
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int n = scan.nextInt();
        
        FactorGenerator generator = new FactorGenerator(n);
        while (generator.hasMoreFactors() == true)
        {
            System.out.println(generator.nextFactor());
        }
        
        
    }
}