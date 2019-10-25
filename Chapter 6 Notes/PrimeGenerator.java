public class PrimeGenerator
{
    private int number;
    
    PrimeGenerator(int limit)
    {
        this.number = limit;
    }
    
    public int nextPrime()
    {
        int counter = 1;
        // make a parameter for the prime and check if you're going over the limit
        this.isPrime(counter);
        return counter;
    }
    
    public boolean isPrime(int potentialPrime)
    {
        for (int i = 2; i < potentialPrime; i++)
        {
            if (potentialPrime % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}