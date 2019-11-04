
import java.util.Scanner;
public class Rewrite
{
    public int forMethod()
    {
        int s = 0;
        for (int i = 1; i <= 10; i++)
        {
            s = s + i;
        }
        return s;
    }

    public int whileMethod()
    {
        int s = 0;
        int counter = 1;
        while (counter <= 10)
        {
            s += counter;
            counter++;
        }
        return s;
    }

    public double doMethod2()
    {
        Scanner in = new Scanner( System.in );
        System.out.print("Enter an integer: ");
        int n = in.nextInt();
        double x = 0;
        double s;
        do
        {
            s = 1.0 / (1 + n * n);
            n++;
            x = x + s;
        }
        while (s > 0.01);
        return x;
    }
    
    public double whileMethod2()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = in.nextInt();
        double x = 0;
        double s = 1;
        while (s > 0.01)
        {
            s = 1.0 / (1 + n * n);
            n++;
            x = x + s;
        }
        return x;
    }
}