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
        
        /*
         * This is an example of a 'short-circuit'.
         *      If the left operand is false, the right operand will not be evaluated
         *      because the AND operation is already false.
         */
        
        if (firstStr != null && firstStr.length() > 3)
        {
            System.out.println("The first string has more than 3 characters.");
        }
        
        System.out.print("Enter your two favorite fruits.");
        if (s.next().equals("kiwi") || s.next().equals("kiwi"))
        {
            System.out.println("Kiwi is one of my favorite fruits too!");
        }
        
        System.out.println("Enter your favorite ice cream flavor.");
        String flavor = s.next();
        System.out.println("Favorite flavor: " + flavor);
    }
    
    public static String getStudentClass(int gradeNumber)
    {
        /*
         * Switch statement
         *      another conditional statement (like if statement)
         *      preferred when evaluating *discrete* values
         *      can be used for byte, short, int, and char primitive types
         *      can also be used for enumerations and String objects
         *      the condition is evaluated and flow of execution jumps to whichever case matches
         */
        
        String studentClass = "";
        
        switch (gradeNumber)
        {
            case 9:
            {
                studentClass = "freshman";
                /*
                 * break causes the flow of execution to leave the switch
                 * 
                 *      (without a break, the flow of excecution continues into the next case.)
                 */
                break;
            }
            case 10:
            {
                studentClass = "sophomore";
                break;
            }
            case 11:
            {
                studentClass = "junior";
                break;
            }
            case 12:
            {
                studentClass = "senior";
                break;
            }
            /*
             * by leaving out the break, multiple cases can run the same code.
             */
            case 6:
            case 7:
            case 8:
            {
                studentClass = "junior high";
                break;
            }
            /*
             * default matches everything not matched by one of the cases
             */
            default:
            {
                studentClass = "elementary";
                break;
            }
        }
        
        return studentClass;
    }
    
    public static void assignmentOperatorExample()
    {
        /*
         * augmented assignment operators: +=, -=, *=, /=, %=
         *      same as in Python
         *      perform the specified operation and then assign the resulting value to a variable
         */
        
        int x = 7;
        int y = 7;
        int z = 7;
        
        x = x + 1;
        y += 1;
        z++; //most common in Java
        
        System.out.println("x = " + x + "; y = " + y + "; z = " + z);
        
        /*
         * post increment/decrement operator
         *      equivalent to adding/subtracting 1
         *      returns the value before performing the increment/decrement
         */
        
        int a = 7;
        int b = a++;
        System.out.println("a = " + a + "; b = " + b);
        
        /*
         * pre increment/decrement operator
         *      returns the value after performing the increment/decrement
         */
        int c = 7;
        int d = ++c;
        System.out.println("c = " + c + "; d = " + d);
    }
}