
/**
 * Write a description of class First here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class First
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner (System.in);
        DecimalFormat fmt = new DecimalFormat ("###");
        
        double a;
        double b;
        double c;
        double s;
        
        System.out.println("Please enter in the first triangle length: ");
        a = scan.nextDouble();
        
        System.out.println("Please enter in the second triangle length: ");
        b = scan.nextDouble();
        
        System.out.println("Please enter in the third triangle length: ");
        c = scan.nextDouble();
        
        s = (a + b + c) / 2;
        System.out.println("Here is the area of the triangle: "
            + Math.sqrt(s * (s - a) * (s - b) * (s - c)));  
        
        
        
        
    }
}
