
/**
 * Write a description of class Triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Triangle
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner (System.in);
        DecimalFormat fmt = new DecimalFormat ("000");
        
        int a;
        int b;
        int c;
        
        System.out.print ("Please enter in the first triangle length: ");
        a = scan.nextInt();
        
        System.out.print ("Please enter in the second triangle length: ");
        b = scan.nextInt();
        
        System.out.print ("Please enter in the third triangle length: ");
        c = scan.nextInt();
        
        
    }
}
