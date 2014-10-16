
/**
 * Write a description of class Coordinates here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Coordinates
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.print ("Please enter a x coordinate: ");
        double x1 = scan.nextDouble();
                
        System.out.print ("Please enter a y coordinate: ");
        double y1 = scan.nextDouble();
        
        System.out.print ("Please enter a x coordinate: ");
        double x2 = scan.nextDouble();
        
        System.out.print ("Please enter a y coordinate: ");
        double y2 = scan.nextDouble();
        
        double xdiff = x2 - x1;
        
        double ydiff = y2 - y1;
        
        System.out.println ("The distance between those two points are: " + (Math.sqrt(xdiff*xdiff)+(ydiff*ydiff)));
    }
}
