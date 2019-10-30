public class PrimeGenerator
{
    private int number;
    
    PrimeGenerator(int limit)
    {
        this.number = limit;
    }
    
    public int nextPrime(int prime)
    {
        int counter = prime;
        while (counter < this.number)
        {
            counter++;
            if (this.isPrime(counter))
            {
                break;
            }
        }
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