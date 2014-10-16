
/**
 * Write a description of class CastDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class CastDemo
{
    public static void main (String [] args)
    {
       Scanner scan = new Scanner (System.in);
       int number1 = 0;
       int number2;
       
       System.out.print ("Please enter an integer: ");
       number1 = scan.nextInt();
       
       System.out.println ("The number you entered was " + number1);
       
       System.out.print ("Please enter another integer: ");
       number2 = scan.nextInt();
       
       System.out.println ("The number you entered was " + number2);
       System.out.println ("The sum of the numbers you entered was " + (number1 + number2));      
       
       
    }
}
