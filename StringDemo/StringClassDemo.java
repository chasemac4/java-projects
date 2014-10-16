
/**
 * Write a description of class StringClassDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StringClassDemo
{
   public static void main (String [] args)
   {
       Scanner scan = new Scanner (System.in);
       String title;
       
       System.out.print ("Please enter a string ");
       title = scan.nextLine();
       
       int numChar = title.length();
       System.out.println ("The length of title is: " + numChar);
  
       
    }
}
