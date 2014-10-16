
/**
 * Write a description of class Phone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.text.DecimalFormat;
import java.util.Random;
public class Phone
{
    public static void main (String args [])
    {
        Random generator = new Random();
        DecimalFormat fmt = new DecimalFormat ("000");
        
        String result = "";
        
        //System.out.println ("Random Number: " + generator.nextInt(8));
        result += generator.nextInt(8);
        result += generator.nextInt(8);
        result += generator.nextInt(8);
        result += "-";
        
        result += fmt.format(generator.nextInt(742));
        result += "-";
        
        result += fmt.format(generator.nextInt(10000));
        
        System.out.println ("Here is a random phone number: " + result);
        
        
    }
}
