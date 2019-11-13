public class IntegralCalculator
{
    
    public double calculateIntegral(double a, double b, double d, int n)
    {
        int points = 0;
        
        for (int i = 1; i <= n; i++)
        {
            double x = Math.random() * (b - a) + a;
            double y = Math.random() * d;
            // only works for positive y values
            
            if (Math.sin(x) > y)
            {
                points++;
            }
            
            
        }
        return ((double) points / n) * d * (b - a);
        
    }
    
    public static void main (String[] args)
    {
        
        
        
        
    }
}