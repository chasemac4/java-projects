
/**
 * First.java - just does a triangle thing.
 * Find me on GitHub! https://github.com/chasemac4/java-projects
 *
 * @author Chase McIntosh, Ethan Lee
 * @version 1.0.0
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class First
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("#.###");
        
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
        
        /* Triangle Inequality Law */
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Aw shucks, this doesn't make a triangle.");
        } else {
            System.out.println("Here is the area of the triangle: "
                               + fmt.format(Math.sqrt(s * (s - a) * (s - b) * (s - c))));
        }
        
        
        
    }
}
