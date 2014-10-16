
/**
 * Write a description of class StringDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class StringDemo
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner (System.in);
        String title;
              
        System.out.println ("Please enter your first name: ");
        String firstName = scan.next();
                
                       
       System.out.println ("Please enter your last name: ");
        String lastName = scan.next();
                
        System.out.println (firstName.substring(0,1) + (lastName.substring(0,5)));
        
        Random generator = new Random();
        
        int num1;
        
               
        num1 = generator.nextInt(100);
        System.out.println ("From 10 to 99: " + num1);
    }
}
