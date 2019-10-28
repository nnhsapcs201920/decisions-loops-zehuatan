import java.util.Scanner;
/**
 * Notes on loops.
 * 
 * @author ztan
 * @version 24 October 2019
 */
public class Notes
{
    public static void whileExample()
    {
        /*
         * while loop:
         *      evaluates a boolean expression
         *          if true, executes the body of the loop and then re-evaluates the condition.
         *          if false, skips the body of the loop and continues sequentially
         */
        int count = 1;                              //initialization
        
        while (count <= 5)                          //condition
        {
            System.out.println(count);              //body
            count++;                                //update the condition variable
        }
        
        System.out.println("done");
        
        
        
    }
    
    public static void whileExample2()
    {
        /*
         * This is an example of an infinite loop!
         */
        int count = 1;                              //initialization
        
        while (count != 50)                         //condition
        {
            System.out.println(count);              //body
            count += 2;                             //updating the loop variable
        }
        System.out.println("done");
    }
    
    public static void forExample()
    {
        /*
         * for loop:
         * three parts of the statement:
         *  1. initialization - executed once
         *  2. boolean exrpession - tested at the start of each iteration
         *  3. updating the condition variable - executed at the end
         *          of each iteration before testing the condition again
         */
        
        for (int count = 1;                         //initialization
             count <= 5;                            //boolean expression (loop condition)
             count++)                               //update the condition variable
        {
            System.out.println(count);              //body
        }
        System.out.println("done");
        
        /*
         * variables declared within the for statement are scoped to the for statement and its body
         */
        //System.out.println("final value of count: " + count);
    }
    
    public static void offByOne()
    {
        /*
         * The classic off-by-one error is common with for loops eecuting
         *      one too many or one too few times.
         *      
         *      Carefully stop and ask: should the initial value start at 0 or 1?
         *                              should the condition be < or <= ?
         *                              
         *      Do not just try at random.
         */
        // we want to print five "*"
        for (int i = 0;
            i <= 5;         //should be i < 5 instead of i <= 5 to fix error
            i++)
            {
                System.out.println("*");
            }
        System.out.println("done");
    }
    
    public static void doExample()
    {
        /*
         * do loop (do-while loop)
         * 
         *      1. executes the body of the loop
         *      2. evaluates the loop condition
         *          if true, executes body of loop again
         *          if false, continues after the loop
         */
        
        int count = 1;
        
        do
        {
            System.out.println(count);
            
            count++;
        }
        while (count<=5);
        
        System.out.println("done");
    }
}

