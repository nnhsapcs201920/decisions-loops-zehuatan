import java.util.Scanner;

public class PrimePrinter
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int limit = scan.nextInt();
        PrimeGenerator generator = new PrimeGenerator(limit);
        int prime = 1;
        while (generator.nextPrime(prime) != limit)
        {
            prime = generator.nextPrime(prime);
            System.out.println(prime);
        }
        if (generator.isPrime(limit))
        {
            System.out.println(limit);
        }
    }
}