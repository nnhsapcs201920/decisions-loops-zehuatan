import java.util.Scanner;

public class CommonLoopAlgorithms
{
   /*
    * Loop Algorithm #1: Average
    * reads a series of numbers (ends with a letter)
    * calculates the average of the numbers
    * @return the average of the numbers
    */
  public static double average()
  {
      Scanner scan = new Scanner(System.in);
      double average = 0;
      double add;
      int counter = 0;
      do
      {
          add = scan.nextDouble();
          average *= counter;
          average += add;
          counter++;
          average /= counter;
      }
      while (scan.hasNextDouble() == true);
      
      return average;
  }

   /*
    * Loop Algorithm #2: Counting Matches
    * reads a series of numbers (ends with a letter)
    * counts the number of numbers that are greater than 100
    * @return the number of numbers that are greater than 100
    */
   public static int countMatches()
   {
       Scanner scan = new Scanner(System.in);
       
       int counter = 0;
       do
       {
           if (scan.nextDouble() > 100)
           {
               counter++;
           }
       }
       while (scan.hasNextDouble() == true);
       
       return counter;
   }

   /*
    * Loop Algorithm #3: Finding the First Match
    * reads a series of words separated by whitespace
    * continues to read and count words until a word is longer than five characters
    * @return the number of words read before the match
    */
   public static int findFirstMatch()
   {
       Scanner scan = new Scanner(System.in);
       String word = "";
       int counter = 0;
       while (word.length() <= 5)
       {
           word = scan.next();
           if (word.length() > 5)
           {
               break;
           }
           counter++;
       }
       return counter;
   }

   /*
    * Loop Algorithm #4: Prompting until a Match Is Found
    * prompts the user to enter a positive integer less than 100
    * reads the number
    * continues to prompt the user until the number matches the criteria
    * @return the number that matched the criteria
    */
   public static int promptUntilMatch()
   {
       Scanner scan = new Scanner(System.in);
       
       
       return 0;
   }

   /*
    * Loop Algorithm #5.1: findMax
    * reads a series of numbers (ends with a letter)
    * @return the greatest number
    */
   public static int findMax() 
   {
       return 0;
   }

   /*
    * Loop Algorithm #5.2: findMin
    * reads a series of numbers (ends with a letter)
    * @return the least number
    */
   public static int findMin()
   {
       return 0;
   }

   /*
    * Loop Algorithm #6: Compare Adjacent Values
     * reads a series of numbers until an adjacent duplicate
     * number is entered
    * @return the adjacent duplicate number that was entered
    */
   public static int compareAdjacent()
   {
       return 0;
   }
}