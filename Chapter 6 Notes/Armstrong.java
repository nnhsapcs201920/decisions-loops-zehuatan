public class Armstrong
{
    public static void main (String[] args)
    {
        
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                for (int k = 0; k < 10; k++)
                {
                    if (i * i * i + j * j * j + k * k * k == 100 * i + 10 * j + k)
                    {
                        System.out.println("" + i + j + k);
                    }
                }
            }
        }
        
        
        for (long i = 1; ; i++)
        {
            String length = "" + i;
            long cube = 0;
            
            for (int j = 0; j < length.length(); j++)
            {
                
                long digit = i / (long) Math.pow(10, j) % 10;
                
                
                cube += Math.pow(digit, length.length());
            }
            
            if (i == cube)
            {
                System.out.println(i);
            }
        }
        
    }
}