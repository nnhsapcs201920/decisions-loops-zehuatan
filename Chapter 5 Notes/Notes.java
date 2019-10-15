import java.util.Scanner;

/**
 * Chapter 5 Notes - decisions
 *
 * @author ztan
 * @version 14 Oct 2019
 */
public class Notes
{
    public static void ifExample()
    {
        // model a coin flip; 1: heads, 0: tails
        int coinFlip = (int) ( Math.random() * 2 );
        
        /*
         * if statement
         *      statements that are executed if the conditional expression is true
         *      conditional expression must go inside the parentheses
         *      statements are grouped by blocks (i.e. {} )
         *          not indented like in Python
         *      no colon after the conditional expression in Java, unlike Python
         */
        if (coinFlip == 1)
        {
            System.out.println("Coin is heads!");
        }
        
        /*
         * { } are not required if it's a single statement
         *      However, they are always a good idea.
         *      Leaving them out can lead to bugs like this:
         */
        
        if (coinFlip == 0)
            System.out.println("Coin is tails!"); // in the if block
            System.out.println("Better luck next time!"); // not in if block
            
        /*
         * if-else statement 
         *      else block will execute if the condition is false
         */
        
        if (coinFlip == 1)
        {
            System.out.println("Coin is heads!");
        }
        else 
        {
            System.out.println("Coin is tails!");
        }
        
        // challenge: roll a 4-sided die and print the value that came up.
        
        int dieRoll = (int) ((Math.random() * 4) + 1);
        System.out.println(dieRoll);
        /*
        * if (dieRoll == 1)
        * {
        *     System.out.println("rolled a 1");
        * }
        * else if (dieRoll == 2)
        * {
        *     System.out.println("rolled a 2");
        * }
        *       ... continue until 4
        * 
        */
    }
    
    public static boolean doublesAreEqual( double num1, double num2 )
    {
        /*
         *  If using the (==) operator four doubles, every binary digit must match.
         *  For "equal" numbers, this usually is not true due to floating point rounding, which is not what we want.
         *  Instead, check if they are "close enough" (i.e. using an epsilon value).
         */
        final double EPSILON = 1e-14;
        if ( Math.abs( num1 - num2 ) < EPSILON )
        {
            return true;
        }
        else
        {
            return false;
        }
        
        // don't have to use an if statement when working with a boolean
        // return ( Math.abs( num1 - num2 ) < EPSILON );
    }
    
    public static void stringExample()
    {
        Scanner s = new Scanner( System.in );
        System.out.println( "Enter two strings" );
        String str1 = s.next();
        String str2 = s.next();
        
        /*
         * The equality operator (==) returns true if the two values contain the same value.
         *      For objects, including Strings, this means that they contain the same reference. That is,
         *      they contain the same object in the computer's memory, not that they have the same
         *      sequence of characters.
         */
        if (str1 == str2)
        {
            System.out.println("string references are equal.");
        }
        else
        {
            System.out.println("strings references are not equal.");
        }
        
        if (str1.equals( str2 ))
        {
            System.out.println("strings are equal.");
        }
        else
        {
            System.out.println("strings are not equal.");
        }
        
        /*
         * We will determine which string comes first lexographically using the compareTo method
         *      of the String class.
         *      
         * compareTo returns an int:
         *      0: if the strings are equal (same sequence of characters)
         *      <0: if str1 < str2 lexographically
         *      >0: if str1 > str2 lexographically
         */
        
        int result = str1.compareTo(str2);
        String firstStr = null;
        
        if (result < 0)
        {
            firstStr = str1;
        }
        else if (result > 0)
        {
            firstStr = str2;
        }
        
        if (firstStr != null)
        {
            System.out.println("The first String is: " + firstStr );
            
            System.out.println("Its length is: " + firstStr.length());
        }
        else
        {
            System.out.println("Strings are equal.");
        }
    }
    
}