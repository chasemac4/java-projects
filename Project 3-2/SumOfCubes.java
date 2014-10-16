
/**
 * Write a description of class SumOfCubes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SumOfCubes
{
    public static void main (String ars [])
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.print ("Please enter an integer: ");
        int number1 = scan.nextInt();
        
        System.out.print ("Please enter another integer: ");
        int number2 = scan.nextInt();
        
        System.out.println ((Math.pow(number1, 3)) + (Math.pow(number2, 3)) + "is the sum of the numbers you entered cubed");
        
    }
}
