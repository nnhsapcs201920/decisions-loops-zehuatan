public class RandomererWalk
{
    public static void main (String args[])
    {
        double x = 0;
        double y = 0;
        double z = 0;
        
        double totalAvgX = 0;
        double totalAvgY = 0;
        double totalAvgZ = 0;
        
        /*
         * Goal: use a 3-D random walk to find pi. 
         * Find relationship between distance and number of steps in 3D.
         */
        
        for (int j = 0; j < 100; j++)
        {
            for (int i = 0; i < 100; i++)
            {
                double a = 2 * Math.random() - 1;
                double b = 2 * Math.random() - 1;
                double c = 2 * Math.random() - 1;

                x += a / Math.pow(a * a + b * b + c * c, .5);
                y += b / Math.pow(a * a + b * b + c * c, .5);
                z += c / Math.pow(a * a + b * b + c * c, .5);

            }
            
            totalAvgX += x;
            totalAvgY += y;
            totalAvgZ += z;
            
            x = 0;
            y = 0;
            z = 0;
        }
        
        System.out.println(Math.pow(x * x + y * y + z * z, .5));

    }
}