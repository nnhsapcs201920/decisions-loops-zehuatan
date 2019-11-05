import java.util.Scanner;

public class Substrings
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = scan.next();
        
        // i represents the length of the word; j represents the starting index
        for (int i = 0; i <= word.length(); i++)
        {
            for (int j = 0; i + j <= word.length(); j++) 
            {
                System.out.println(word.substring(j, j + i));
                
            }
        }

    }
}