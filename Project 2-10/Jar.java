
/**
 * Write a description of class Jar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Jar
{
   public static void main (String [] args)
   {
       // Read the number of coins
       
        // ask for the number of pennies 
            // print prompt message
            // read integer value
        // same for dimes, nickels and quarters
        
       // Compute the value of the coins in jar
        // number of pennies * value of pennies, etc.
        
       // Print out results
       Scanner scan = new Scanner (System.in);
       
       int number1 = 0;
       int number2;
       int number3;
       int number4;
       
       System.out.println ("Enter a number of pennies: ");
       number1 = scan.nextInt();
       
       System.out.println ("The value you entered is: $" + number1 * (double)(0.01));
       
       System.out.println ("Enter a number of nickels: ");
       number2 = scan.nextInt();
       
       System.out.println ("The value you entered is: $" + number2 * (double)(0.05));
       
       System.out.println ("Enter a number of dimes: ");
       number3 = scan.nextInt();
       
       System.out.println ("The value you entered is: $" + number3 * (double)(0.10));
       
       System.out.println ("Enter a number of quarters: ");
       number4 = scan.nextInt();
       
       System.out.println ("The value you entered is: $" + number4 * (double)(0.25));
     
       
       

       
    }
}
