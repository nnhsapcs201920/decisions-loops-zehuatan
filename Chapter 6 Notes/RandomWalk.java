
public class RandomWalk
{
    public static void main (String args[])
    {
        int x = 0;
        int y = 0;
        for (int i = 0; i < 100; i++)
        {
            double random = Math.random();
            if (random < .25)
            {
                x++;
            }
            else if (random < .5)
            {
                x--;
            }
            else if (random < .75)
            {
                y++;
            }
            else if (random < 1.0)
            {
                y--;
            }
        }
        System.out.println("End coordinates: (" + x + ", " + y + ")");
    }
}