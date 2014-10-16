
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Circle
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner (System.in);
        
        DecimalFormat fmt = new DecimalFormat ("0.####");
        
        int radius;
        double surfacearea, volume;
        
        System.out.print ("Please enter in a radius for your circle: ");
        radius = scan.nextInt();
        
        volume = (4.0/3) * Math.PI * Math.pow(radius, 3);
        surfacearea = 4 * Math.PI * Math.pow(radius,2);
                      
        System.out.println ("The circle's volume is: " + fmt.format(volume));
        System.out.println ("The circles surface area is: " + fmt.format(surfacearea));
    }
}
