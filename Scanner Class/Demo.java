
/**
 * Write a description of class Demo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Demo

{
   
   public static void main (String [] args)
   {
    Scanner scan = new Scanner (System.in);
    int number1 = 0;
    int number2;
 
    System.out.print ("Please enter a integer: ");
    number1 = scan.nextInt ();
    
    System.out.println ("The integer you entered was " + (number1));
    
    System.out.print ("Would you be so kind to enter another non-zero integer: ");
    number2 = scan.nextInt ();
    
    System.out.println ("The integer you entered was " + (number2));
    
    System.out.println ("The sum of the integers that you entered is " + (number1 + number2));
    
    System.out.println ("The difference of these integers is " + (number1 - number2));
    
    System.out.println ("The product of the integers you gave me is " + (number1 * number2));
    
    System.out.println ("The quotient of those integers is " + (number1 / number2));
    
    
    
    
}
}