
/**
 * Write a description of class MoneyValue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MoneyValue
{
    public static void main (String [] args)
    {
     Scanner scan = new Scanner (System.in);
        System.out.print ("Please enter a dollar value: ");
     double amount = scan.nextDouble ();
     
     amount = amount * 100; 
     
     int numberOfTens = (int) amount / 1000; 
     
     amount = amount % 1000;
     
     int numberOfFives = (int) amount / 500;
     
     amount = amount % 500;
     
     int numberOfOnes = (int) amount / 100;
     
     amount = amount % 100;
     
     int numberOfQuarters = (int) amount / 25;
     
     amount = amount % 25;
     
     int numberOfDimes = (int) amount / 10;
     
     amount = amount % 10;
     
     int numberOfNickles = (int) amount / 5;
     
     amount = amount % 5;
     
     int numberOfPennies = (int) amount / 1;
     
     amount = amount % 1;
     
     System.out.println ("Number of Tens: " + numberOfTens);
     
     System.out.println ("Number of FIves: " + numberOfFives);
     
     System.out.println ("Number of Ones: " + numberOfOnes);
     
     System.out.println ("Number of Quarters: " + numberOfQuarters);
     
     System.out.println ("Numer of Dimes: " + numberOfDimes);
     
     System.out.println ("Number of Nickles: " + numberOfNickles);
     
     System.out.print ("Number of Pennies: " + numberOfPennies);
     
     
    }
}

