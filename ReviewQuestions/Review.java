
/**
 * Write a description of class Review here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Review
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner (System.in);
        
        
        System.out.println ("Please enter a x integer: ");
        int x = scan.nextInt();
        
        System.out.println ("Please enter a y integer: ");
        int y = scan.nextInt();
        
        System.out.println ("Please enter a z integer: ");
        int z = scan.nextInt();
        
        System.out.println ("Please enter a dx value: ");
        double dx = scan.nextDouble();
        
        System.out.println ("Please enter a dy value: ");
        double dy = scan.nextDouble();
        
        System.out.println ("Please enter a dz value: ");
        double dz = scan.nextDouble();
      
        System.out.println ( x + " * " + y + " = " + (x*y));
        
        System.out.println ( x + " / " + y + " = " + (x/y));
        
        System.out.println ( dx + " / " + dy + " = " + (dx/dy));
        
        System.out.println ( x + " * " + y + " % " + z + " = " + (x*y%z));
        
        System.out.println ( x + " % " + y + " % " + z + " = " + (x%y%z));
        
        System.out.println ( dx + " / " + dy + " * " + z + " = " + (dx%dy*z));
        
        System.out.println ( x + " / " + dy + " = " + (x/dy));
        
        System.out.println ( x + " + " + y + " % " + z + " = " + (x+y*z));
        
        System.out.println ( x + " + " + y + " % " + dz + " = " + (x+y%dz));
        
        System.out.println (" ( " + x + " + " + y + " ) " + " % " + z + " = " + ((x+y)%z));
        
        System.out.println ( x + " % " + y + " * " + dx + " * " + dy + " = " + (x%y*(dx*dy)));
        
        System.out.println (" ( " + x + " + " + y + " ) " + " * " + " ( " + dx + " / " + dz + " ) " + " = " + ((x+y)*(dx/dz)));
    }
   }
