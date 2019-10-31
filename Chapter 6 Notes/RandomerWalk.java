public class RandomerWalk
{
    public static void main (String args[])
    {
        double x = 0;
        double y = 0;
        for (int i = 0; i < 100; i++)
        {
            double direction = Math.random() * 2 * Math.PI;
            double magnitude = Math.random();
            x += (Math.cos(direction) * magnitude);
            y += (Math.sin(direction) * magnitude);
            
        }
        System.out.println("End coordinates: (" + x + ", " + y + ")");
    }
}