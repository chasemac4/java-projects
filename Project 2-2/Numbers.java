
/**
 * Write a description of class Numbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Numbers
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        int number1 = 0;
        int number2;
        int number3;
        
        System.out.print ("Please enter an integer: ");
        number1 = scan.nextInt ();
        
            
        System.out.println ("Please enter another integer: ");
        number2 = scan.nextInt ();
        
        System.out.println ("Please enter one last integer: ");
        number3 = scan.nextInt ();
        
                
        System.out.println ("The average of those two numbers is: " + (double)(number1 + number2 + number3) / 3); 
       
       
    }
}
