public class FactorGenerator
{
    private int number;
    
    FactorGenerator(int numberToFactor)
    {
        this.number = numberToFactor;
    }
    
    public int nextFactor()
    {
        int factor = 2;
        
        while (this.number % factor != 0)
        {
            factor++;
        }
        
        this.number /= factor;
        return factor;
    }
    
    public boolean hasMoreFactors()
    {
        if (this.number == 1 && this.number > 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}